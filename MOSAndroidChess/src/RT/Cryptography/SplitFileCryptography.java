package RT.Cryptography;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import RT.HSystem;

public class SplitFileCryptography 
{
	
	private int str;
	private CipherRT cipher;
	private EllipticCurveDSA[] signers;
	private EllipticCurveDSA[] fileSigners;
	public byte[] salt;
	
	public SplitFileCryptography()
	{
		
	}
	
	public byte[] initializeEncrypt(KeyPair keys, byte[] firstBlock, int strength, int numberOfPieces) throws InvalidKeyException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, IOException
	{
		str=strength;
		switch(str)
		{
			case 128:
				signers=new EllipticCurveDSA[numberOfPieces];
				for(int index=0; index<signers.length; index++)
				{
					signers[index]=new EllipticCurveDSA();
					signers[index].init(keys.getPrivate());
				}
				
				fileSigners=new EllipticCurveDSA[numberOfPieces];
				for(int index=0; index<fileSigners.length; index++)
				{
					fileSigners[index]=new EllipticCurveDSA();
					fileSigners[index].init(keys.getPrivate());
				}
				
				salt=new byte[16];
				HSystem.cryptoPRNG.getBytes(salt);
				MessageDigest sha256=MessageDigest.getInstance("SHA-256");
				byte[] privateKeyHash=sha256.digest(keys.getPrivate().getEncoded());
				sha256.reset();
				HMACRT hmac=new HMACRT("HMACSHA2", 128);
				hmac.init(privateKeyHash);
				byte[] keyBytes=hmac.HMAC(salt);
				byte[] key=new byte[16];
				System.arraycopy(keyBytes, 0, key, 0, key.length);
				byte[] IVBytes=sha256.digest(keyBytes);
				byte[] IV=new byte[16];
				System.arraycopy(IVBytes, 0, IV, 0, IV.length);
				cipher=new CipherRT("AES/CBC/PKCS7Padding", 128);
				cipher.initilize(key, IV);
				ByteArrayOutputStream bOut=new ByteArrayOutputStream();
				bOut.write(salt);
				bOut.write(cipher.encrypt(firstBlock));
				return bOut.toByteArray();
			default:
				throw new NoSuchAlgorithmException("Strength not supported");
		}
	}
	
	public byte[] initializeDecrypt(KeyPair keys, byte[] firstBlock, int strength, int numberOfPieces) throws NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException 
	{
		str=strength;
		switch(str)
		{
			case 128:
				signers=new EllipticCurveDSA[numberOfPieces];
				for(int index=0; index<signers.length; index++)
				{
					signers[index]=new EllipticCurveDSA();
					signers[index].init(keys.getPublic());
				}
				
				fileSigners=new EllipticCurveDSA[numberOfPieces];
				for(int index=0; index<fileSigners.length; index++)
				{
					fileSigners[index]=new EllipticCurveDSA();
					fileSigners[index].init(keys.getPublic());
				}
				
				salt=new byte[16];
				System.arraycopy(firstBlock, 0, salt, 0, salt.length);
				MessageDigest sha256=MessageDigest.getInstance("SHA-256");
				byte[] privateKeyHash=sha256.digest(keys.getPrivate().getEncoded());
				sha256.reset();
				HMACRT hmac=new HMACRT("HMACSHA2", 128);
				hmac.init(privateKeyHash);
				byte[] keyBytes=hmac.HMAC(salt);
				byte[] key=new byte[16];
				System.arraycopy(keyBytes, 0, key, 0, key.length);
				byte[] IVBytes=sha256.digest(keyBytes);
				byte[] IV=new byte[16];
				System.arraycopy(IVBytes, 0, IV, 0, IV.length);
				cipher=new CipherRT("AES/CBC/PKCS7Padding", 128);
				cipher.initilize(key, IV);
				byte[] encryptedLessSalt=new byte[firstBlock.length-salt.length];
				System.arraycopy(firstBlock, salt.length, encryptedLessSalt, 0, encryptedLessSalt.length);
				return cipher.decrypt(encryptedLessSalt);
			default:
				throw new NoSuchAlgorithmException("Strength not supported");
		}
	}
	
	public void initializeCheckSignature(byte[] publicKey, int strength, int numberOfPieces) throws NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidKeySpecException 
	{
		str=strength;
		switch(str)
		{
			case 128:
				signers=new EllipticCurveDSA[numberOfPieces];
				for(int index=0; index<signers.length; index++)
				{
					signers[index]=new EllipticCurveDSA();
					signers[index].init(KeyFactory.getInstance("ECDSA", new BouncyCastleProvider()).generatePublic(new X509EncodedKeySpec(publicKey)));
				}
				break;
			default:
				throw new NoSuchAlgorithmException("Strength not supported");
		}
	}
	
	public byte[] encrypt(byte[] toEncrypt) throws IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException 
	{
		switch(str)
		{
			case 128:
				return cipher.encrypt(toEncrypt);
			default:
				throw new NoSuchAlgorithmException("Strength not supported");
		}
	}
	
	public byte[] decrypt(byte[] encrypted) throws NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException 
	{
		switch(str)
		{
			case 128:
				return cipher.decrypt(encrypted);
			default:
				throw new NoSuchAlgorithmException("Strength not supported");
		}
	}
	
	
	public void updateSignMessage(byte[] update, int messageIndex) throws NoSuchAlgorithmException, SignatureException 
	{
		switch(str)
		{
			case 128:
				signers[messageIndex].updateSignature(update);
				break;
			default:
				throw new NoSuchAlgorithmException("Strength not supported");
		}
	}
	
	public byte[] getSignature(int messageIndex) throws SignatureException, NoSuchAlgorithmException 
	{
		switch(str)
		{
			case 128:
				return signers[messageIndex].getSignature();
			default:
				throw new NoSuchAlgorithmException("Strength not supported");
		}
	}
	
	public boolean checkSignatures(byte[] signature, int messageIndex) throws SignatureException, NoSuchAlgorithmException 
	{
		switch(str)
		{
			case 128:
				return signers[messageIndex].checkSignature(signature);
			default:
				throw new NoSuchAlgorithmException("Strength not supported");
		}	
	}
	
	public void updateSignFile(byte[] update, int messageIndex) throws NoSuchAlgorithmException, SignatureException 
	{
		switch(str)
		{
			case 128:
				fileSigners[messageIndex].updateSignature(update);
				break;
			default:
				throw new NoSuchAlgorithmException("Strength not supported");
		}
	}
	
	public byte[] getSignatureFile(int messageIndex) throws SignatureException, NoSuchAlgorithmException 
	{
		switch(str)
		{
			case 128:
				return fileSigners[messageIndex].getSignature();
			default:
				throw new NoSuchAlgorithmException("Strength not supported");
		}
	}
	
	public boolean checkSignaturesFile(byte[] signature, int messageIndex) throws SignatureException, NoSuchAlgorithmException 
	{
		switch(str)
		{
			case 128:
				return fileSigners[messageIndex].checkSignature(signature);
			default:
				throw new NoSuchAlgorithmException("Strength not supported");
		}	
	}

}
