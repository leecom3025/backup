/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RT.Cryptography;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.spec.ECFieldFp;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.KeyAgreement;
import javax.crypto.ShortBufferException;

import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.ECPointUtil;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECPrivateKeySpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;
/**
 *
 * @author C
 */
public class EllipticCurveDiffieHellman implements Serializable 
{
    
    private KeyPairGenerator keyGen;
    private KeyPair keyPairMess;
    private static KeyFactory fact;
    private KeyAgreement keyAgree;
    
    public EllipticCurveDiffieHellman() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException
    {  
    }
    
    public void init() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException
    {
        Security.addProvider(new BouncyCastleProvider());
        ECNamedCurveParameterSpec ecSpec = ECNamedCurveTable.getParameterSpec("prime256v1");
        keyGen=KeyPairGenerator.getInstance("ECDH", new BouncyCastleProvider());
        keyGen.initialize(ecSpec, SecureRandom.getInstance("SHA1PRNG"));
        keyPairMess=keyGen.generateKeyPair();
        fact=KeyFactory.getInstance("ECDSA", new BouncyCastleProvider());
        keyAgree=KeyAgreement.getInstance("ECDH", new BouncyCastleProvider());
    }
    
    public void init(KeyPair keyPair) throws NoSuchAlgorithmException, NoSuchProviderException
    {
        Security.addProvider(new BouncyCastleProvider());
        keyPairMess=keyPair;
        fact=KeyFactory.getInstance("ECDSA", new BouncyCastleProvider());
        keyAgree=KeyAgreement.getInstance("ECDH", new BouncyCastleProvider());
    }
    
    public void init(byte[] passwordInformation) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException
    {
    	Security.addProvider(new BouncyCastleProvider());
        ECNamedCurveParameterSpec ecSpec=ECNamedCurveTable.getParameterSpec("prime256v1");
        ECPrivateKeySpec priKeySpec=new ECPrivateKeySpec(
            new BigInteger(passwordInformation).abs(),
            ecSpec);
        ECPoint G=ecSpec.getG();
        BigInteger d=priKeySpec.getD();
        ECPoint dG=G.multiply(d);
        ECPublicKeySpec pubKeySpec = new ECPublicKeySpec(
        		dG,
                ecSpec);
        fact=KeyFactory.getInstance("ECDSA", new BouncyCastleProvider());
        keyPairMess=new KeyPair(fact.generatePublic(pubKeySpec), fact.generatePrivate(priKeySpec));
        keyAgree=KeyAgreement.getInstance("ECDH", new BouncyCastleProvider());
    }
    
    public KeyPair getKeyPairComm()
    {
        return keyPairMess;  
    }
      
    public synchronized byte[] makeShared(PrivateKey prKey, byte[] puKey) throws InvalidKeyException, IllegalStateException, InvalidKeySpecException, ShortBufferException
    {
        keyAgree.init(prKey);
        keyAgree.doPhase(fact.generatePublic(new X509EncodedKeySpec(puKey)), true);
        byte key[]=new byte[158];
        keyAgree.generateSecret(key, 0);
        return key;
    }
    
}
