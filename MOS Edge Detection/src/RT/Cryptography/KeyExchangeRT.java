package RT.Cryptography;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.ShortBufferException;

public class KeyExchangeRT 
{
	private Object keyExchanger;
	private String keyExchangeType;
	private int keyExchangeStrength;
	
	public KeyExchangeRT(String type, int strength)
	{
		keyExchangeType=type;
		keyExchangeStrength=strength;
	}
	
	public void init() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException
	{
		switch(keyExchangeType)
		{
			case "ECDH":
				switch(keyExchangeStrength)
				{
					case 128:
						keyExchanger=new EllipticCurveDiffieHellman();
						((EllipticCurveDiffieHellman)keyExchanger).init();
				}
				break;
		}		
	}
	
	public byte[] getPublicInfo()
	{
		switch(keyExchangeType)
		{
			case "ECDH":
				switch(keyExchangeStrength)
				{
					case 128:
						return ((EllipticCurveDiffieHellman)keyExchanger).getKeyPairComm().getPublic().getEncoded();
				}
				break;
		}
		return null;		
	}
	
	public byte[] createSharedSecret(byte[] publicInfo) throws InvalidKeyException, IllegalStateException, InvalidKeySpecException, ShortBufferException
	{
		switch(keyExchangeType)
		{
			case "ECDH":
				switch(keyExchangeStrength)
				{
					case 128:
						return ((EllipticCurveDiffieHellman)keyExchanger).makeShared(((EllipticCurveDiffieHellman)keyExchanger).getKeyPairComm().getPrivate(), publicInfo);
				}
				break;
		}
		return null;	
	}
	
	

}
