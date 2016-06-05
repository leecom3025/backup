package RT.Cryptography;

import java.security.Key;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import java.security.spec.KeySpec;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class AES_CBC_PKCS7Padding 
{    
    
    private Cipher AESCipherE;
    private Cipher AESCipherD;
    
    public AES_CBC_PKCS7Padding()
    {       
    }
    
    public void init(byte key[], byte iv[]) throws Exception
    { 
        Key secret = new SecretKeySpec(key, "AES");
        AESCipherE = Cipher.getInstance("AES/CBC/PKCS7Padding", new BouncyCastleProvider());       
        AESCipherE.init(Cipher.ENCRYPT_MODE, secret, new IvParameterSpec(iv));
        AESCipherD = Cipher.getInstance("AES/CBC/PKCS7Padding", new BouncyCastleProvider());
        AESCipherD.init(Cipher.DECRYPT_MODE, secret, new IvParameterSpec(iv));
    }
    
    public synchronized byte[] AESEncrypt(byte[] toEncrypt) throws Exception
    {       
        return AESCipherE.doFinal(toEncrypt);       
    }
    
    public synchronized byte[] AESDecrypt(byte[] toEncrypt) throws Exception
    {       
        return AESCipherD.doFinal(toEncrypt);       
    }
    
}
