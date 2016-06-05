/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RT;

import RT.HSystem;
import RT.UnsecureHash;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author C
 */
public class CompareHash 
{
    
    public static int compareHash(byte[][] bytes) throws NoSuchAlgorithmException, IOException
    {
        long sum=0;
        long hash=0;
        for(int i=0; i<bytes.length; i++)
        {
            for(int b=0; b<bytes[i].length; b++)
            {
                sum+=bytes[i][b]*bytes[i][b];
            }
            hash+=sum;
        }
        return (int)hash;
    }
      
}
