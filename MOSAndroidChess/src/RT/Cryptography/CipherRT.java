package RT.Cryptography;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class CipherRT 
{
	
	private Object encryptCipher;
	private Object decryptCipher;
	private String cipherType;
	private int cipherstrength;
	
	public CipherRT(String type, int strength)
	{
		cipherType=type;
		cipherstrength=strength;		
	}
	
	public void initilize(byte[] key, byte[] iv) throws InvalidKeyException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException, NoSuchPaddingException
	{
		switch(cipherType)
		{
			case "AES":
				switch(cipherstrength)
				{
					case 128:
						Key secret=new SecretKeySpec(key, "AES");
						encryptCipher=Cipher.getInstance("AES", new BouncyCastleProvider());       
						((Cipher)encryptCipher).init(Cipher.ENCRYPT_MODE, secret);
						decryptCipher=Cipher.getInstance("AES", new BouncyCastleProvider());
						((Cipher)decryptCipher).init(Cipher.DECRYPT_MODE, secret);	
						break;
				}
				break;
			case "AES/CBC/PKCS7Padding":
				switch(cipherstrength)
				{
					case 128:
						Key secret=new SecretKeySpec(key, "AES");
						encryptCipher=Cipher.getInstance("AES/CBC/PKCS7Padding", new BouncyCastleProvider());       
						((Cipher)encryptCipher).init(Cipher.ENCRYPT_MODE, secret, new IvParameterSpec(iv));
						decryptCipher=Cipher.getInstance("AES/CBC/PKCS7Padding", new BouncyCastleProvider());
						((Cipher)decryptCipher).init(Cipher.DECRYPT_MODE, secret, new IvParameterSpec(iv));	
						break;
				}
				break;
		}	
	}
	
	public byte[] encrypt(byte[] toEncrypt) throws IllegalBlockSizeException, BadPaddingException
	{
		switch(cipherType)
		{
			case "AES/CBC/PKCS7Padding":
				switch(cipherstrength)
				{
					case 128:
						return ((Cipher)encryptCipher).doFinal(toEncrypt);
				}
				break;
		}
		return null;		
	}

	
	public byte[] decrypt(byte[] toDecrypt) throws IllegalBlockSizeException, BadPaddingException
	{
		switch(cipherType)
		{
			case "AES/CBC/PKCS7Padding":
				switch(cipherstrength)
				{
					case 128:
						return ((Cipher)decryptCipher).doFinal(toDecrypt);
				}
				break;
		}
		return null;
	}
}
