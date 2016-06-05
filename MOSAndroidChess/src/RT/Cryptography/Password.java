package RT.Cryptography;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Password 
{
	
	private CryptographicPRNG secureRandom;
	
	public Password(String password) throws NoSuchAlgorithmException
	{
		MessageDigest sha256=MessageDigest.getInstance("SHA-256");
		byte[] passwordDigest=sha256.digest(password.getBytes());
		secureRandom=new CryptographicPRNG();
		secureRandom.seed(passwordDigest);
	}
	
	public byte[] getPasswordInformation(byte[] dst)
	{
		secureRandom.getBytes(dst);
		return dst;
	}

}
