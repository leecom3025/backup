package RT.Cryptography;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class CryptographicPRNG 
{
	SecureRandom sRand;
	
	public CryptographicPRNG() throws NoSuchAlgorithmException
	{
		sRand=new SecureRandom().getInstance("SHA1PRNG");
	}
	
	public void seed(byte[] seed)
	{
		sRand.setSeed(seed);
	}
	
	public int getInt()
	{
		return sRand.nextInt();
	}
	
	public long getLong()
	{
		return sRand.nextLong();
	}
	
	public void getBytes(byte[] toHold)
	{
		sRand.nextBytes(toHold);
	}
	
	public String getFileString(int length)
	{
		String sRand="";
		for(int index=0; index<length; index++)
		{
			sRand+=getLong()%10;
		}
		return sRand;
	}

}
