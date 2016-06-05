/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RT.Cryptography;

import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.encoders.Hex;

/**
 *
 * @author C
 */
public class HMACSHA256 
{
    
    private HMac sha256HMAC;
    
    public HMACSHA256()
    {
        
    }
    
    public void init(byte key[]) throws Exception
    {
        sha256HMAC = new HMac(new SHA256Digest());
        sha256HMAC.init(new KeyParameter(key));
    }
    
    public synchronized byte[] HMAC (byte toHMAC[])
    {
        sha256HMAC.update(toHMAC, 0, toHMAC.length);
        byte hmac[]=new byte[32]; 
        sha256HMAC.doFinal(hmac, 0); 
        return hmac;
    }
    
}
