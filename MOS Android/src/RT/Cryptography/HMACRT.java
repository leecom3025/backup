package RT.Cryptography;

import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

public class HMACRT 
{
	private String HMACType;
	private int HMACStrength;
	private Object HMAC;
	
	public HMACRT(String type, int strength)
	{
		HMACType=type;
		HMACStrength=strength;			
	}
	
	public void init(byte[] key)
	{
		switch(HMACType)
		{
			case "HMACSHA2":
				switch(HMACStrength)
				{
					case 128:
						HMAC = new HMac(new SHA256Digest());
						((HMac)HMAC).init(new KeyParameter(key));
						break;
				}
				break;
		}		
	}
	
	public byte[] HMAC(byte[] toHMAC)
	{
		synchronized(HMAC)
		{
			switch(HMACType)
			{
				case "HMACSHA2":
					switch(HMACStrength)
					{
						case 128:
							((HMac)HMAC).update(toHMAC, 0, toHMAC.length);
					        byte hmac[]=new byte[32]; 
					        ((HMac)HMAC).doFinal(hmac, 0); 
					        ((HMac)HMAC).reset();
					        return hmac;
					}
					break;
			}
			return null;
		}
	}
	
	public boolean checkHMAC(byte[] toCheck, byte[] checkHMAC)
	{
		synchronized(HMAC)
		{
			switch(HMACType)
			{
				case "HMACSHA2":
					switch(HMACStrength)
					{
						case 128:
							boolean equal=true;
							byte[] computedHMAC=HMAC(toCheck);
							for(int compareIndex=0; compareIndex<computedHMAC.length; compareIndex++)
							{
								if(computedHMAC[compareIndex]!=checkHMAC[compareIndex])
								{
									equal=false;
								}
							}
							return equal;
					}
					break;
			}
			return false;	
		}	
	}

}
