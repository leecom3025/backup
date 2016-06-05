/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RT.Cryptography;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;

import org.bouncycastle.crypto.util.PublicKeyFactory;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class EllipticCurveDSA
{

	Signature ecdsaSign;
	
	public EllipticCurveDSA()
	{
		
	}
	
	public void init(PrivateKey privateKey) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException
	{
		ecdsaSign=Signature.getInstance("SHA256withECDSA", new BouncyCastleProvider());
		ecdsaSign.initSign(privateKey);
	}
	
	public void init(PublicKey publicKey) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException
	{
		ecdsaSign=Signature.getInstance("SHA256withECDSA", new BouncyCastleProvider());
		ecdsaSign.initVerify(publicKey);
	}
	
    public void updateSignature(byte[] message) throws SignatureException //TODO: Make sure this considers all updated bytes
    {
        ecdsaSign.update(message);
    }
    
    public byte[] getSignature() throws SignatureException
    {
    	return ecdsaSign.sign();
    	
    }
    
    public boolean checkSignature(byte[] signature) throws SignatureException
    {
    	return ecdsaSign.verify(signature);
    }
       
}
