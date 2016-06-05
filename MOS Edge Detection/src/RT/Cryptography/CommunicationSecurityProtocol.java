package RT.Cryptography;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;

import org.bouncycastle.util.Arrays;

import MO.ManagedObject;
import RT.ByteArrayWrapper;
import RT.HSystem;

public class CommunicationSecurityProtocol 
{

	private int publicKeyLength=-1;
	
	private KeyExchangeRT[] keyExhangers;
	private HMACRT[] hMACs;
	public CipherRT[] ciphers;
	
	private byte[] otherStaticPublicKey;
	private byte[] otherTemporaryPublicKey;
	
	private int protocolName;
	private int protocolStrength;
	public int state=0; //Integer.MAX_VALUE means initialized
	private static int[] protocolHeaderLength=new int[]{32, -1, 32};
	private static int[] blockSizes=new int[]{16, -1, 16};
	
	/*
	 * Protocol 0: "ECDH/AESCBC/HMACSHA2 for Data Transmission", 128 Bit Strength
	 * Provides: Authenticated Identity, Authenticated Data, Encrypted Data, Perfect Forward Secrecy, No Key-Compromise Impersonation, Key Control, and Data Message Signing			
		 * Init:
			 * Self
			 * 1. Get other's static ECDH public key from master if other isn't master
			 * 2. Verify SHA256(static ECDH Public Key)=ID
			 * 3. Create temporary ECDH
			 * 4. Send 
				 * 90  Static ECDH Public Key 
				 * 90  |Temporary ECDH Public Key
			 * Other
			 * 5. Create temporary ECDH
			 * 6. Send 
			 	* 158 Temporary ECDH Public Key
			 * Self	
			 * 7. Create static and temporary ECDH keys, nonce, AES keys and IVs, HMAC Key
			 * 8. Initialize ciphers and hmac with the SHA-256 of keys
			 * 9. Send
				 * 32   HMAC(AESCBC(AES0 Key|AES0 IV|AES1 Key|AES1 IV|HMAC Key, SHA256(ECDH Shared Key) XOR SHA256(Temp ECDH Shared Key)), SHA256(SHA256(ECDH Shared Key) XOR SHA256(Temp ECDH Shared Key)))
				 * 80   |AESCBC(AES0 Key|AES0 IV|AES1 Key|AES1 IV|HMAC Key, SHA256(ECDH Shared Key) XOR SHA256(Temp ECDH Shared Key))
			 * Other
			 * 10. Create static shared ECDH key XOR temp ECDH shared key XOR nonce
			 * 11. Verify integrity of AESCBC(AES0 Key|AES0 IV|AES1 Key|AES1 IV|HMAC Key, ECDH Shared Key XOR Temp ECDH Shared Key XOR Nonce) with HMAC
			 * 12. Decrypt AESCBC(AES0 Key|AES0 IV|AES1 Key|AES1 IV|HMAC Key, ECDH Shared Key XOR Temp ECDH Shared Key XOR Nonce), create AESes and HMAC
			 * 13. initialize ciphers and hmac with the first 16 bits of the SHA256 of keys and IVs
		 * Transmit:
			 * Self (Use AES0 if initiator of communication, else use AES1)
			 * 1. Send 
				 * 32  HMAC(number|AES0(Message))
				 * <=Previous Multiple of 16(maxMessageLength-56)  |AES0(Message)
			 * Other
			 * 2. Verify HMAC(AES0(Message))
			 * 3. ID=SHA256(Public Key)
			 * 4. Decrypt AES0(Message)
	 * 
	 * Protocol 1: "ECDSA/AES for Data Storage" 128 Bit Strength
	 * Provides: Authenticated Data, Encrypted Data, Static Password Secrecy
	 * 	   Storing a File:
	 *         Init:
	 *         1. ECDSA Key for signing
	 *         2. AES key for Encrypting
	 *         Send Encrypted Message:
	 *         1. Return AES(sendEncrypted)
	 *         Sign Message:
	 *         1. Return ECDSA(message)|message
	 *     Restoring a File:
	 *         Check Signature:
	 *         1. Verify ECDSA signature
	 *         2. Return message if verified
	 *         Receive Encrypted Message:
	 *         1. Return decrypted message
	 *         
	 * Protocol 2: No Cryptography
	 */
	
	public CommunicationSecurityProtocol(String name, int strength) throws NoSuchAlgorithmException
	{
		switch(name)
		{
			case "ECDH/AESCBC/HMACSHA2":
				switch(strength)
				{
					case 128:
						protocolName=0;	
						protocolStrength=strength;
						publicKeyLength=91;
						break;
					default:
						throw new NoSuchAlgorithmException();
				}
				break;
			case "ECDH/AES for Data Storage":
				switch(strength)
				{
					case 128:
						protocolName=1;	
						protocolStrength=strength;
						break;
					default:
						throw new NoSuchAlgorithmException();
				}
				break;
			case "No Cryptography":
				switch(strength)
				{
					case 128:
						protocolName=2;	
						protocolStrength=strength;
						publicKeyLength=91;
						break;
					default:
						throw new NoSuchAlgorithmException();
				}
				break;
			default:
				throw new NoSuchAlgorithmException();
		}
	}
	
	public ByteArrayWrapper init(byte[] initialMessage) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException, InvalidKeyException, NoSuchPaddingException
	{
		switch(protocolName)
		{
			case 0: //"ECDH/AESCBC/HMACSHA2"
				switch(protocolStrength)
				{
					case 128: //128 Bit Strength
						byte[] staticPublicKey=new byte[publicKeyLength];
						System.arraycopy(initialMessage, 0, staticPublicKey, 0, staticPublicKey.length);
						otherStaticPublicKey=staticPublicKey;
						MessageDigest sha256=MessageDigest.getInstance("SHA-256");
						staticPublicKey=sha256.digest(staticPublicKey);
						sha256.reset();
						return new ByteArrayWrapper(staticPublicKey);
				}
				break;
			case 1: //"ECDSA/AES for Data Storage"
				switch(protocolStrength)
				{
					case 128: //128 Bit Strength
						keyExhangers=new KeyExchangeRT[1]; //ECDH init
						keyExhangers[0]=new KeyExchangeRT("ECDH", 128);
						keyExhangers[0].init();
						
						byte[] key=new byte[16]; //AES init
						byte[] IV=new byte[16];
						ciphers=new CipherRT[1];
						HSystem.cryptoPRNG.getBytes(key); 
						HSystem.cryptoPRNG.getBytes(IV);
						ciphers[0]=new CipherRT("AES/CBC/PKCS7Padding", 128);
						ciphers[0].initilize(key, IV);
						return null;
				}
				break;
			case 2: //No Cryptography
				switch(protocolStrength)
				{
					case 128: //128 Bit Strength
						byte[] staticPublicKey=new byte[publicKeyLength];
						System.arraycopy(initialMessage, 0, staticPublicKey, 0, staticPublicKey.length);
						otherStaticPublicKey=staticPublicKey;
						MessageDigest sha256=MessageDigest.getInstance("SHA-256");
						staticPublicKey=sha256.digest(staticPublicKey);
						sha256.reset();
						return new ByteArrayWrapper(staticPublicKey);
				}
				break;
		}
		return null;		
	}
	
	//sendUnencrypted=number, 4 bytes
	public byte[][] sendEncryptedMessage(byte[] sendEncrypted, byte[][] sendUnencrypted, int blockSize) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException
	{
		switch(protocolName)
		{
			case 0:
				switch(protocolStrength)
				{
					case 128: //"ECDH/AESCBC/HMACSHA2", 128 Bit Strength
						switch(state)
						{		
							case 0:
								keyExhangers=new KeyExchangeRT[1];
								keyExhangers[0]=new KeyExchangeRT("ECDH", 128);
								keyExhangers[0].init();
								byte[] message=new byte[316];
								System.arraycopy(HSystem.eCDH.getKeyPairComm().getPublic().getEncoded(), 0, message, 0, publicKeyLength);
								System.arraycopy(keyExhangers[0].getPublicInfo(), 0, message, publicKeyLength, publicKeyLength);
								state=1;
								return new byte[][]{message};
							case Integer.MAX_VALUE:
								sendEncrypted=ciphers[0].encrypt(sendEncrypted);
								byte[][] securedMessages=new byte[(int)Math.ceil(((double)sendEncrypted.length)/blockSize)][];
								byte[] messageBytes;
								byte[] hMACSHA256;
								int messageInd=0;
								for(int byteIndex=0; byteIndex<sendEncrypted.length; byteIndex+=blockSize)
					            {
					                if(sendEncrypted.length-byteIndex>blockSize)
					                {
					                	messageBytes=new byte[blockSize+4];
					                    System.arraycopy(sendEncrypted, byteIndex, messageBytes, 4, blockSize);
					                }
					                else
					                {
					                	messageBytes=new byte[sendEncrypted.length-byteIndex+4];
					                    System.arraycopy(sendEncrypted, byteIndex, messageBytes, 4, sendEncrypted.length-byteIndex);
					                }
					                System.arraycopy(sendUnencrypted[messageInd], 0, messageBytes, 0, sendUnencrypted[messageInd].length);
					                hMACSHA256=hMACs[0].HMAC(messageBytes);
					                securedMessages[messageInd]=new byte[messageBytes.length+hMACSHA256.length];
					                System.arraycopy(messageBytes, 0, securedMessages[messageInd], 0, sendUnencrypted[messageInd].length);
									System.arraycopy(hMACSHA256, 0, securedMessages[messageInd], sendUnencrypted[messageInd].length, hMACSHA256.length);
									System.arraycopy(messageBytes, sendUnencrypted[messageInd].length, securedMessages[messageInd], hMACSHA256.length+sendUnencrypted[messageInd].length, messageBytes.length-sendUnencrypted[messageInd].length);
					                messageInd++;
					            }
								return securedMessages;
						}						
				}
				break;
			case 1: //"ECDSA/AES for Data Storage"
				switch(protocolStrength)
				{
					case 128: //128 Bit Strength
						sendEncrypted=ciphers[0].encrypt(sendEncrypted);
						return new byte[][]{sendEncrypted};
				}
				break;
			case 2: //No Cryptography
				switch(protocolStrength)
				{
					case 128:
						switch(state)
						{		
							case 0:
								keyExhangers=new KeyExchangeRT[1];
								keyExhangers[0]=new KeyExchangeRT("ECDH", 128);
								keyExhangers[0].init();
								byte[] message=new byte[316];
								System.arraycopy(HSystem.eCDH.getKeyPairComm().getPublic().getEncoded(), 0, message, 0, publicKeyLength);
								System.arraycopy(keyExhangers[0].getPublicInfo(), 0, message, publicKeyLength, publicKeyLength);
								state=1;
								return new byte[][]{message};
							case Integer.MAX_VALUE:
								//sendEncrypted=ciphers[0].encrypt(sendEncrypted);
								byte[][] securedMessages=new byte[(int)Math.ceil(((double)sendEncrypted.length)/blockSize)][];
								byte[] messageBytes;
								byte[] hMACSHA256;
								int messageInd=0;
								for(int byteIndex=0; byteIndex<sendEncrypted.length; byteIndex+=blockSize)
					            {
					                if(sendEncrypted.length-byteIndex>blockSize)
					                {
					                	messageBytes=new byte[blockSize+4];
					                    System.arraycopy(sendEncrypted, byteIndex, messageBytes, 4, blockSize);
					                }
					                else
					                {
					                	messageBytes=new byte[sendEncrypted.length-byteIndex+4];
					                    System.arraycopy(sendEncrypted, byteIndex, messageBytes, 4, sendEncrypted.length-byteIndex);
					                }
					                System.arraycopy(sendUnencrypted[messageInd], 0, messageBytes, 0, sendUnencrypted[messageInd].length);
					                hMACSHA256=hMACs[0].HMAC(messageBytes);
					                securedMessages[messageInd]=new byte[messageBytes.length+hMACSHA256.length];
					                System.arraycopy(messageBytes, 0, securedMessages[messageInd], 0, sendUnencrypted[messageInd].length);
									System.arraycopy(hMACSHA256, 0, securedMessages[messageInd], sendUnencrypted[messageInd].length, hMACSHA256.length);
									System.arraycopy(messageBytes, sendUnencrypted[messageInd].length, securedMessages[messageInd], hMACSHA256.length+sendUnencrypted[messageInd].length, messageBytes.length-sendUnencrypted[messageInd].length);
					                messageInd++;
					            }
								return securedMessages;
						}						
				}
				break;
		}	
		return null;
	}
	
	public byte[] receiveEncryptedMessage(byte[][] receive) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException, InvalidKeyException, NoSuchPaddingException, IllegalStateException, InvalidKeySpecException, ShortBufferException, IllegalBlockSizeException, BadPaddingException
	{
		switch(protocolName)
		{
			case 0:
				switch(protocolStrength)
				{
					case 128: //"ECDH/AESCBC/HMACSHA2", 128 Bit Strength
						switch(state)
						{		
							case 0:
								if(receive!=null)
								{
									otherStaticPublicKey=new byte[publicKeyLength];
									System.arraycopy(receive[0], 0, otherStaticPublicKey, 0, otherStaticPublicKey.length);
									otherTemporaryPublicKey=new byte[publicKeyLength];
									System.arraycopy(receive[0], publicKeyLength, otherTemporaryPublicKey, 0, otherTemporaryPublicKey.length);
									keyExhangers=new KeyExchangeRT[1];
									keyExhangers[0]=new KeyExchangeRT("ECDH", 128);
									keyExhangers[0].init();
									state=2;
									System.out.println("secproto recv 0");
									return keyExhangers[0].getPublicInfo();
								}
								break;
							case 1:
								if(receive!=null)
								{
									byte[] keys=new byte[80]; //create AES0 Key|AES0 IV|AES1 Key|AES1 IV|HMAC Key, initialize cryptographic primitives
									byte[] key=new byte[16];
									byte[] IV=new byte[16];
									byte[] tempBy;
									MessageDigest sha256=MessageDigest.getInstance("SHA-256");
									ciphers=new CipherRT[2];
									hMACs=new HMACRT[1];
									HSystem.cryptoPRNG.getBytes(key); //AES0
									HSystem.cryptoPRNG.getBytes(IV);
									System.arraycopy(key, 0, keys, 0, key.length);
									System.arraycopy(IV, 0, keys, 16, IV.length);
									tempBy=sha256.digest(key);
									sha256.reset();
									System.arraycopy(tempBy, 0, key, 0, key.length);
									tempBy=sha256.digest(IV);
									sha256.reset();
									System.arraycopy(tempBy, 0, IV, 0, IV.length);
									ciphers[0]=new CipherRT("AES/CBC/PKCS7Padding", 128);
									ciphers[0].initilize(key, IV);
									HSystem.cryptoPRNG.getBytes(key); //AES1
									HSystem.cryptoPRNG.getBytes(IV);
									System.arraycopy(key, 0, keys, 32, key.length);
									System.arraycopy(IV, 0, keys, 48, IV.length);
									tempBy=sha256.digest(key);
									sha256.reset();
									System.arraycopy(tempBy, 0, key, 0, key.length);
									tempBy=sha256.digest(IV);
									sha256.reset();
									System.arraycopy(tempBy, 0, IV, 0, IV.length);
									ciphers[1]=new CipherRT("AES/CBC/PKCS7Padding", 128);
									ciphers[1].initilize(key, IV);
									HSystem.cryptoPRNG.getBytes(key); //HMACSHA256
									System.arraycopy(key, 0, keys, 64, key.length);
									tempBy=sha256.digest(key);
									sha256.reset();
									System.arraycopy(tempBy, 0, key, 0, key.length);
									hMACs[0]=new HMACRT("HMACSHA2", 128);
									hMACs[0].init(key);
									
									byte[] otherTempPublicKey=new byte[publicKeyLength]; //get temp key and iv
									System.arraycopy(receive[0], 0, otherTempPublicKey, 0, otherTempPublicKey.length);
									otherTempPublicKey=keyExhangers[0].createSharedSecret(otherTempPublicKey);
									byte[] staticPublicKey=HSystem.eCDH.makeShared(HSystem.eCDH.getKeyPairComm().getPrivate(), otherStaticPublicKey);
	
									otherTempPublicKey=sha256.digest(otherTempPublicKey);
									sha256.reset();
									staticPublicKey=sha256.digest(staticPublicKey);
									sha256.reset();
									for(int byteNum=0; byteNum<staticPublicKey.length; byteNum++)
									{
										staticPublicKey[byteNum]=(byte)(staticPublicKey[byteNum]^otherTempPublicKey[byteNum]); //check xor								
									}
									otherTempPublicKey=sha256.digest(staticPublicKey);
									sha256.reset();
									
									System.arraycopy(staticPublicKey, 0, key, 0, key.length); //encrypt keys
									System.arraycopy(staticPublicKey, 16, IV, 0, IV.length);
									CipherRT tempAES=new CipherRT("AES/CBC/PKCS7Padding", 128);
									tempAES.initilize(key, IV);
									keys=tempAES.encrypt(keys);
															
									HMACRT hmacSHA256=new HMACRT("HMACSHA2", 128); //HMAC AES(keys) with tempHMAC
									System.arraycopy(otherTempPublicKey, 0, key, 0, key.length);
									hmacSHA256.init(key);
									otherTempPublicKey=hmacSHA256.HMAC(keys);
									
									byte[] message=new byte[128];				
									System.arraycopy(otherTempPublicKey, 0, message, 0, otherTempPublicKey.length);
									System.arraycopy(keys, 0, message, otherTempPublicKey.length, keys.length);
									
									keyExhangers=null;
									otherStaticPublicKey=null;
									System.out.println("secproto recv 1");
									state=Integer.MAX_VALUE-1;
									return message;
								}
								break;
							case 2:
								if(receive!=null)
								{
									byte[] otherTempPublicKey=new byte[publicKeyLength];
									byte[] staticSharedKey=HSystem.eCDH.makeShared(HSystem.eCDH.getKeyPairComm().getPrivate(), otherStaticPublicKey);
									otherTempPublicKey=keyExhangers[0].createSharedSecret(otherTemporaryPublicKey);
									MessageDigest sha256=MessageDigest.getInstance("SHA-256");
									otherTempPublicKey=sha256.digest(otherTempPublicKey);
									sha256.reset();
									staticSharedKey=sha256.digest(staticSharedKey);
									sha256.reset();
									for(int byteNum=0; byteNum<staticSharedKey.length; byteNum++)
									{
										staticSharedKey[byteNum]=(byte)(staticSharedKey[byteNum]^otherTempPublicKey[byteNum]); //check xor								
									}
									otherTempPublicKey=sha256.digest(staticSharedKey);
									sha256.reset();
									HMACRT hmacSHA256=new HMACRT("HMACSHA2", 128); //check HMAC
									byte[] key=new byte[16];
									System.arraycopy(otherTempPublicKey, 0, key, 0, key.length);
									hmacSHA256.init(key);
									byte[] HMAC=new byte[32];
									System.arraycopy(receive[0], 0, HMAC, 0, HMAC.length);
									byte[] HMACed=new byte[receive[0].length-32];
									System.arraycopy(receive[0], 32, HMACed, 0, HMACed.length);
									if(hmacSHA256.checkHMAC(HMACed, HMAC))
									{
										byte[] IV=new byte[16]; //decrypt keys
										System.arraycopy(staticSharedKey, 0, key, 0, key.length); //encrypt keys
										System.arraycopy(staticSharedKey, 16, IV, 0, IV.length);
										CipherRT tempAES=new CipherRT("AES/CBC/PKCS7Padding", 128);
										tempAES.initilize(key, IV);
										byte[] keys=tempAES.decrypt(HMACed);
										
										ciphers=new CipherRT[2]; //initialize cryptographic primitives
										hMACs=new HMACRT[1];
										HSystem.cryptoPRNG.getBytes(key); //AES0
										HSystem.cryptoPRNG.getBytes(IV);
										System.arraycopy(keys, 32, key, 0, key.length);
										System.arraycopy(keys, 48, IV, 0, IV.length);
										byte[] tempBy=sha256.digest(key);
										sha256.reset();
										System.arraycopy(tempBy, 0, key, 0, key.length);
										tempBy=sha256.digest(IV);
										sha256.reset();
										System.arraycopy(tempBy, 0, IV, 0, IV.length);
										ciphers[0]=new CipherRT("AES/CBC/PKCS7Padding", 128);
										ciphers[0].initilize(key, IV);
										HSystem.cryptoPRNG.getBytes(key); //AES1
										HSystem.cryptoPRNG.getBytes(IV);
										System.arraycopy(keys, 0, key, 0, key.length);
										System.arraycopy(keys, 16, IV, 0, IV.length);
										tempBy=sha256.digest(key);
										sha256.reset();
										System.arraycopy(tempBy, 0, key, 0, key.length);
										tempBy=sha256.digest(IV);
										sha256.reset();
										System.arraycopy(tempBy, 0, IV, 0, IV.length);
										ciphers[1]=new CipherRT("AES/CBC/PKCS7Padding", 128);
										ciphers[1].initilize(key, IV);
										HSystem.cryptoPRNG.getBytes(key); //HMACSHA256
										System.arraycopy(keys, 64, key, 0, key.length);
										tempBy=sha256.digest(key);
										sha256.reset();
										System.arraycopy(tempBy, 0, key, 0, key.length);
										hMACs[0]=new HMACRT("HMACSHA2", 128);
										hMACs[0].init(key);
										
										keyExhangers[0]=null;
										otherStaticPublicKey=null;
										otherTemporaryPublicKey=null; 
										System.out.println("************************************************************************************************secproto recv 2");
										state=Integer.MAX_VALUE;
									}
									break;
								}
								break;
							case Integer.MAX_VALUE-1:
							case Integer.MAX_VALUE:
								int numBytes=0;
								for(int messageNum=0; messageNum<receive.length; messageNum++)
								{
									numBytes+=receive[messageNum].length;								
								}
								byte[] message=new byte[numBytes];
								numBytes=0;
								for(int messageNum=0; messageNum<receive.length; messageNum++)
								{
									System.arraycopy(receive[messageNum], 0, message, numBytes, receive[messageNum].length);
									numBytes+=receive[messageNum].length;
								}
								//System.out.println("secproto recv max");
								try
								{
								return ciphers[1].decrypt(message);
								}
								catch(Exception e)
								{
									Logger.getLogger(CommunicationSecurityProtocol.class.getName()).log(Level.SEVERE, null, e);
									System.out.println("decryption failure");
								}
						}
						break;	
				}
				break;
			case 1: //"ECDSA/AES for Data Storage"
				switch(protocolStrength)
				{
					case 128: //128 Bit Strength
						return ciphers[0].decrypt(receive[0]);
				}
				break;
			case 2: //No Cryptography
				switch(protocolStrength)
				{
					case 128:
						switch(state)
						{		
							case 0:
								if(receive!=null)
								{
									otherStaticPublicKey=new byte[publicKeyLength];
									System.arraycopy(receive[0], 0, otherStaticPublicKey, 0, otherStaticPublicKey.length);
									otherTemporaryPublicKey=new byte[publicKeyLength];
									System.arraycopy(receive[0], publicKeyLength, otherTemporaryPublicKey, 0, otherTemporaryPublicKey.length);
									keyExhangers=new KeyExchangeRT[1];
									keyExhangers[0]=new KeyExchangeRT("ECDH", 128);
									keyExhangers[0].init();
									state=2;
									System.out.println("secproto recv 0");
									return keyExhangers[0].getPublicInfo();
								}
								break;
							case 1:
								if(receive!=null)
								{
									byte[] keys=new byte[80]; //create AES0 Key|AES0 IV|AES1 Key|AES1 IV|HMAC Key, initialize cryptographic primitives
									byte[] key=new byte[16];
									byte[] IV=new byte[16];
									byte[] tempBy;
									MessageDigest sha256=MessageDigest.getInstance("SHA-256");
									ciphers=new CipherRT[2];
									hMACs=new HMACRT[1];
									HSystem.cryptoPRNG.getBytes(key); //AES0
									HSystem.cryptoPRNG.getBytes(IV);
									System.arraycopy(key, 0, keys, 0, key.length);
									System.arraycopy(IV, 0, keys, 16, IV.length);
									tempBy=sha256.digest(key);
									sha256.reset();
									System.arraycopy(tempBy, 0, key, 0, key.length);
									tempBy=sha256.digest(IV);
									sha256.reset();
									System.arraycopy(tempBy, 0, IV, 0, IV.length);
									ciphers[0]=new CipherRT("AES/CBC/PKCS7Padding", 128);
									ciphers[0].initilize(key, IV);
									HSystem.cryptoPRNG.getBytes(key); //AES1
									HSystem.cryptoPRNG.getBytes(IV);
									System.arraycopy(key, 0, keys, 32, key.length);
									System.arraycopy(IV, 0, keys, 48, IV.length);
									tempBy=sha256.digest(key);
									sha256.reset();
									System.arraycopy(tempBy, 0, key, 0, key.length);
									tempBy=sha256.digest(IV);
									sha256.reset();
									System.arraycopy(tempBy, 0, IV, 0, IV.length);
									ciphers[1]=new CipherRT("AES/CBC/PKCS7Padding", 128);
									ciphers[1].initilize(key, IV);
									HSystem.cryptoPRNG.getBytes(key); //HMACSHA256
									System.arraycopy(key, 0, keys, 64, key.length);
									tempBy=sha256.digest(key);
									sha256.reset();
									System.arraycopy(tempBy, 0, key, 0, key.length);
									hMACs[0]=new HMACRT("HMACSHA2", 128);
									hMACs[0].init(key);
									
									byte[] otherTempPublicKey=new byte[publicKeyLength]; //get temp key and iv
									System.arraycopy(receive[0], 0, otherTempPublicKey, 0, otherTempPublicKey.length);
									otherTempPublicKey=keyExhangers[0].createSharedSecret(otherTempPublicKey);
									byte[] staticPublicKey=HSystem.eCDH.makeShared(HSystem.eCDH.getKeyPairComm().getPrivate(), otherStaticPublicKey);
	
									otherTempPublicKey=sha256.digest(otherTempPublicKey);
									sha256.reset();
									staticPublicKey=sha256.digest(staticPublicKey);
									sha256.reset();
									for(int byteNum=0; byteNum<staticPublicKey.length; byteNum++)
									{
										staticPublicKey[byteNum]=(byte)(staticPublicKey[byteNum]^otherTempPublicKey[byteNum]); //check xor								
									}
									otherTempPublicKey=sha256.digest(staticPublicKey);
									sha256.reset();
									
									System.arraycopy(staticPublicKey, 0, key, 0, key.length); //encrypt keys
									System.arraycopy(staticPublicKey, 16, IV, 0, IV.length);
									CipherRT tempAES=new CipherRT("AES/CBC/PKCS7Padding", 128);
									tempAES.initilize(key, IV);
									keys=tempAES.encrypt(keys);
															
									HMACRT hmacSHA256=new HMACRT("HMACSHA2", 128); //HMAC AES(keys) with tempHMAC
									System.arraycopy(otherTempPublicKey, 0, key, 0, key.length);
									hmacSHA256.init(key);
									otherTempPublicKey=hmacSHA256.HMAC(keys);
									
									byte[] message=new byte[128];				
									System.arraycopy(otherTempPublicKey, 0, message, 0, otherTempPublicKey.length);
									System.arraycopy(keys, 0, message, otherTempPublicKey.length, keys.length);
									
									keyExhangers=null;
									otherStaticPublicKey=null;
									System.out.println("secproto recv 1");
									state=Integer.MAX_VALUE-1;
									return message;
								}
								break;
							case 2:
								if(receive!=null)
								{
									byte[] otherTempPublicKey=new byte[publicKeyLength];
									byte[] staticSharedKey=HSystem.eCDH.makeShared(HSystem.eCDH.getKeyPairComm().getPrivate(), otherStaticPublicKey);
									otherTempPublicKey=keyExhangers[0].createSharedSecret(otherTemporaryPublicKey);
									MessageDigest sha256=MessageDigest.getInstance("SHA-256");
									otherTempPublicKey=sha256.digest(otherTempPublicKey);
									sha256.reset();
									staticSharedKey=sha256.digest(staticSharedKey);
									sha256.reset();
									for(int byteNum=0; byteNum<staticSharedKey.length; byteNum++)
									{
										staticSharedKey[byteNum]=(byte)(staticSharedKey[byteNum]^otherTempPublicKey[byteNum]); //check xor								
									}
									otherTempPublicKey=sha256.digest(staticSharedKey);
									sha256.reset();
									HMACRT hmacSHA256=new HMACRT("HMACSHA2", 128); //check HMAC
									byte[] key=new byte[16];
									System.arraycopy(otherTempPublicKey, 0, key, 0, key.length);
									hmacSHA256.init(key);
									byte[] HMAC=new byte[32];
									System.arraycopy(receive[0], 0, HMAC, 0, HMAC.length);
									byte[] HMACed=new byte[receive[0].length-32];
									System.arraycopy(receive[0], 32, HMACed, 0, HMACed.length);
									if(hmacSHA256.checkHMAC(HMACed, HMAC))
									{
										byte[] IV=new byte[16]; //decrypt keys
										System.arraycopy(staticSharedKey, 0, key, 0, key.length); //encrypt keys
										System.arraycopy(staticSharedKey, 16, IV, 0, IV.length);
										CipherRT tempAES=new CipherRT("AES/CBC/PKCS7Padding", 128);
										tempAES.initilize(key, IV);
										byte[] keys=tempAES.decrypt(HMACed);
										
										ciphers=new CipherRT[2]; //initialize cryptographic primitives
										hMACs=new HMACRT[1];
										HSystem.cryptoPRNG.getBytes(key); //AES0
										HSystem.cryptoPRNG.getBytes(IV);
										System.arraycopy(keys, 32, key, 0, key.length);
										System.arraycopy(keys, 48, IV, 0, IV.length);
										byte[] tempBy=sha256.digest(key);
										sha256.reset();
										System.arraycopy(tempBy, 0, key, 0, key.length);
										tempBy=sha256.digest(IV);
										sha256.reset();
										System.arraycopy(tempBy, 0, IV, 0, IV.length);
										ciphers[0]=new CipherRT("AES/CBC/PKCS7Padding", 128);
										ciphers[0].initilize(key, IV);
										HSystem.cryptoPRNG.getBytes(key); //AES1
										HSystem.cryptoPRNG.getBytes(IV);
										System.arraycopy(keys, 0, key, 0, key.length);
										System.arraycopy(keys, 16, IV, 0, IV.length);
										tempBy=sha256.digest(key);
										sha256.reset();
										System.arraycopy(tempBy, 0, key, 0, key.length);
										tempBy=sha256.digest(IV);
										sha256.reset();
										System.arraycopy(tempBy, 0, IV, 0, IV.length);
										ciphers[1]=new CipherRT("AES/CBC/PKCS7Padding", 128);
										ciphers[1].initilize(key, IV);
										HSystem.cryptoPRNG.getBytes(key); //HMACSHA256
										System.arraycopy(keys, 64, key, 0, key.length);
										tempBy=sha256.digest(key);
										sha256.reset();
										System.arraycopy(tempBy, 0, key, 0, key.length);
										hMACs[0]=new HMACRT("HMACSHA2", 128);
										hMACs[0].init(key);
										
										keyExhangers[0]=null;
										otherStaticPublicKey=null;
										otherTemporaryPublicKey=null; 
										System.out.println("************************************************************************************************secproto recv 2");
										state=Integer.MAX_VALUE;
									}
									break;
								}
								break;
							case Integer.MAX_VALUE-1:
							case Integer.MAX_VALUE:
								int numBytes=0;
								for(int messageNum=0; messageNum<receive.length; messageNum++)
								{
									numBytes+=receive[messageNum].length;								
								}
								byte[] message=new byte[numBytes];
								numBytes=0;
								for(int messageNum=0; messageNum<receive.length; messageNum++)
								{
									System.arraycopy(receive[messageNum], 0, message, numBytes, receive[messageNum].length);
									numBytes+=receive[messageNum].length;
								}
								//System.out.println("secproto recv max");
								try
								{
								return message;
								}
								catch(Exception e)
								{
									Logger.getLogger(CommunicationSecurityProtocol.class.getName()).log(Level.SEVERE, null, e);
									System.out.println("decryption failure");
								}
						}
						break;	
				}
				break;
		}
		return null;
	}
	
	public byte[] verifyMessage(byte[] message)
	{
		switch(protocolName)
		{
			case 0:
				switch(protocolStrength)
				{
					case 128: //"ECDH/AESCBC/HMACSHA2", 128 Bit Strength 		
						byte[] data=new byte[message.length-32];
						System.arraycopy(message, 0, data, 0, 4);
						System.arraycopy(message, 36, data, 4, message.length-36);
						byte[] HMAC=new byte[32];
						System.arraycopy(message, 4, HMAC, 0, HMAC.length);
						if(hMACs[0].checkHMAC(data, HMAC))
						{
							return data;
						}
						return null;
				}
				break;
			case 1: //"ECDSA/AES for Data Storage"
				switch(protocolStrength)
				{
					case 128: //128 Bit Strength
						//return ciphers[0].decrypt(receive[0]);
				}
				break;
			case 2:
				switch(protocolStrength)
				{
					case 128:
						byte[] data=new byte[message.length-32];
						System.arraycopy(message, 0, data, 0, 4);
						System.arraycopy(message, 36, data, 4, message.length-36);
						byte[] HMAC=new byte[32];
						System.arraycopy(message, 4, HMAC, 0, HMAC.length);
						return data;
				}
				break;
		}
		return null;
	}
	
	public byte[] signMessage(byte[] toSign)
	{
		switch(protocolName)
		{
			case 0:
				switch(protocolStrength)
				{
					case 128: //"ECDH/AESCBC/HMACSHA2", 128 Bit Strength 		
						byte[] HMACSHA256=hMACs[0].HMAC(toSign);
						byte[] signed=new byte[toSign.length+32];
						System.arraycopy(toSign, 0, signed, 0, 12);
						System.arraycopy(HMACSHA256, 0, signed, 12, HMACSHA256.length);
						System.arraycopy(toSign, 12, signed, 12+HMACSHA256.length, toSign.length-12);
						return signed;
				}
				break;
			case 2: 
				switch(protocolStrength)
				{
					case 128:	
						/*
						byte[] HMACSHA256=hMACs[0].HMAC(toSign);
						byte[] signed=new byte[toSign.length+32];
						System.arraycopy(toSign, 0, signed, 0, 12);
						System.arraycopy(HMACSHA256, 0, signed, 12, HMACSHA256.length);
						System.arraycopy(toSign, 12, signed, 12+HMACSHA256.length, toSign.length-12);
						return signed;
						*/
						
						byte[] HMACSHA256=new byte[32];
						byte[] signed=new byte[toSign.length+32];
						System.arraycopy(toSign, 0, signed, 0, 12);
						System.arraycopy(HMACSHA256, 0, signed, 12, HMACSHA256.length);
						System.arraycopy(toSign, 12, signed, 12+HMACSHA256.length, toSign.length-12);
						return signed;
				}
				break;
		}
		return null;	
	}
	
	public boolean checkSignature(byte[] signed)
	{
		switch(protocolName)
		{
			case 0:
				switch(protocolStrength)
				{
					case 128: //"ECDH/AESCBC/HMACSHA2", 128 Bit Strength 		
						byte[] HMACSHA256=new byte[32];
						System.arraycopy(signed, 12, HMACSHA256, 0, HMACSHA256.length);
						byte[] signedData=new byte[signed.length-32];
						System.arraycopy(signed, 0, signedData, 0, 12);
						System.arraycopy(signed, 12+HMACSHA256.length, signedData, 12, signed.length-12-HMACSHA256.length);
						return hMACs[0].checkHMAC(signedData, HMACSHA256);
				}
				break;
			case 2:
				switch(protocolStrength)
				{
					case 128:
						/*
						byte[] HMACSHA256=new byte[32];
						System.arraycopy(signed, 12, HMACSHA256, 0, HMACSHA256.length);
						byte[] signedData=new byte[signed.length-32];
						System.arraycopy(signed, 0, signedData, 0, 12);
						System.arraycopy(signed, 12+HMACSHA256.length, signedData, 12, signed.length-12-HMACSHA256.length);
						return hMACs[0].checkHMAC(signedData, HMACSHA256);
						*/
						
						return true;
				}
				break;
		}
		return false;	
	}

	public int getProtocolHeaderLength()
	{
		return protocolHeaderLength[protocolName];
	}
	
	public int getBlockSize()
	{
		return blockSizes[protocolName];
	}
	
}
