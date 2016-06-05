package RT;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import MO.ManagedObject;

public class ManagedObjectUtilities 
{

	public static byte[] b10ToB8UInt16(int b10)
    {
        byte[] b8=new byte[2];
        b8[0] = (byte)(b10 >>> 8);
        b8[1] = (byte)b10;
        return b8;     
    }
	
	public static byte[] b10ToB8(int b10)
    {
        byte[] b8=new byte[4];
        b8[0] = (byte)(b10 >>> 24);
        b8[1] = (byte)(b10 >>> 16);
        b8[2] = (byte)(b10 >>> 8);
        b8[3] = (byte)b10;
        return b8;     
    }
    
    public static byte[] b10ToB8(long b10)
    {
        byte[] b8=new byte[8];
        b8[0] = (byte)(b10 >>> 56);
        b8[1] = (byte)(b10 >>> 48);
        b8[2] = (byte)(b10 >>> 40);
        b8[3] = (byte)(b10 >>> 32);
        b8[4] = (byte)(b10 >>> 24);
        b8[5] = (byte)(b10 >>> 16);
        b8[6] = (byte)(b10 >>>  8);
        b8[7] = (byte)b10;
        return b8;
    }
    
    public static byte[] twoB10ToB8(long b10A, long b10B)
    {
        byte b8[]=new byte[16];
        b8[0] = (byte)(b10A >>> 56);
        b8[1] = (byte)(b10A >>> 48);
        b8[2] = (byte)(b10A >>> 40);
        b8[3] = (byte)(b10A >>> 32);
        b8[4] = (byte)(b10A >>> 24);
        b8[5] = (byte)(b10A >>> 16);
        b8[6] = (byte)(b10A >>>  8);
        b8[7] = (byte)b10A;
        b8[8] = (byte)(b10B >>> 56);
        b8[9] = (byte)(b10B >>> 48);
        b8[10] = (byte)(b10B >>> 40);
        b8[11] = (byte)(b10B >>> 32);
        b8[12] = (byte)(b10B >>> 24);
        b8[13] = (byte)(b10B >>> 16);
        b8[14] = (byte)(b10B >>>  8);
        b8[15] = (byte)b10B;
        return b8;
    }
    
    public static long b8ToB10(byte[] b8)
    {
        return ((b8[0] & 0xFFL) << 56) |
         ((b8[1] & 0xFFL) << 48) |
         ((b8[2] & 0xFFL) << 40) |
         ((b8[3] & 0xFFL) << 32) |
         ((b8[4] & 0xFFL) << 24) |
         ((b8[5] & 0xFFL) << 16) |
         ((b8[6] & 0xFFL) <<  8) |
         (b8[7] & 0xFFL);
    }
    
    public static int b8ToB10Int(byte[] b8)
    {
        return ((b8[0] & 0xFF) << 24) |
         ((b8[1] & 0xFF) << 16) |
         ((b8[2] & 0xFF) <<  8) |
         (b8[3] & 0xFF);
    }
    
    public static int b8ToB10UInt16(byte[] b8)
    {
        return ((b8[0] & 0xFF) << 8) |
         (b8[1] & 0xFF);
    }  
    
    public static int[] longToInt(long l)
    {
    	byte[] longBytes=b10ToB8(l);
    	byte[] intBytesA=new byte[4];
    	System.arraycopy(longBytes, 0, intBytesA, 0, intBytesA.length);
    	byte[] intBytesB=new byte[4];
    	System.arraycopy(longBytes, 4, intBytesB, 0, intBytesB.length);
    	return new int[]{b8ToB10Int(intBytesA), b8ToB10Int(intBytesB)};
    }
    
    public static byte[] objToByte(Object o)
    {
        ByteArrayOutputStream bOut=new ByteArrayOutputStream();
        ObjectOutputStream oOut;
		try 
		{
			oOut = new ObjectOutputStream(bOut);
			oOut.writeUnshared(o);
	        oOut.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
        return bOut.toByteArray();
    }
    
    public static Object byteToObj(byte b[]) throws IOException, ClassNotFoundException
    {
        ByteArrayInputStream bIn=new ByteArrayInputStream(b);
        ObjectInputStream oIn=new ObjectInputStream(bIn);       
        return oIn.readObject();
    }
    
    public static int hashString(String toConvert)
    {
        return UnsecureHash.hashString(toConvert, 0);
    }
    
    public static int hashString(String toConvert, int seed)
    {
        return UnsecureHash.hashString(toConvert, seed);
    }
    
    public static int unsecureHashBytes(byte[] data, int seed) 
    {
		int c1 = 0xcc9e2d51;
		int c2 = 0x1b873593;
		int len=data.length;
		int h1 = seed;
		int roundedEnd = (len & 0xfffffffc); 
		
		for (int i = 0; i < roundedEnd; i += 4) 
		{
		    int k1 = (data[i] & 0xff) | ((data[i + 1] & 0xff) << 8) | ((data[i + 2] & 0xff) << 16) | (data[i + 3] << 24);
		    k1 *= c1;
		    k1 = (k1 << 15) | (k1 >>> 17);  
		    k1 *= c2;
		
		    h1 ^= k1;
		    h1 = (h1 << 13) | (h1 >>> 19);  
		    h1 = h1 * 5 + 0xe6546b64;
		}
		int k1 = 0;		
		switch(len & 0x03) 
		{
		    case 3:
		      k1 = (data[roundedEnd + 2] & 0xff) << 16;
		
		    case 2:
		      k1 |= (data[roundedEnd + 1] & 0xff) << 8;
		
		    case 1:
		      k1 |= data[roundedEnd] & 0xff;
		      k1 *= c1;
		      k1 = (k1 << 15) | (k1 >>> 17);  
		      k1 *= c2;
		      h1 ^= k1;
		    default:
		}
		h1 ^= len;	
		h1 ^= h1 >>> 16;
		h1 *= 0x85ebca6b;
		h1 ^= h1 >>> 13;
	    h1 *= 0xc2b2ae35;
		h1 ^= h1 >>> 16;
	
		return h1;
    }
    
    public static int[] getMessageAttributes(Object[] message)
    {
	    int[] messAttr=new int[message.length];
	    if(message[0] instanceof Integer)
	    {
	        messAttr[0]=(int)message[0];                
	    }
	    else if(message[0]!=null)
	    {
	        messAttr[0]=UnsecureHash.hash(((ByteArrayWrapper)message[0]).SID, 0);        
	    }
	    else
	    {
	        messAttr[0]=Integer.MAX_VALUE;          
	    }
	    if(message[1] instanceof Long)
	    {
	        messAttr[1]=(int)((long)message[1]);                
	    }
	    else if(message[1] instanceof Integer)
	    {
	        messAttr[1]=(int)(message[1]);       
	    }
	    else if(message[1]!=null)
	    {
	        messAttr[1]=((ManagedObject)message[1]).getAttribute1();        
	    }
	    else
	    {
	        messAttr[1]=Integer.MAX_VALUE;          
	    }
	    
	    if(message[2] instanceof Long)
	    {
	        messAttr[2]=(int)((long)message[2]);                
	    }
	    else if(message[2] instanceof Integer)
	    {
	        messAttr[2]=(int)(message[2]);       
	    }
	    else if(message[2]!=null)
	    {
	        messAttr[2]=((ManagedObject)message[2]).getAttribute1();        
	    }
	    else
	    {
	        messAttr[2]=Integer.MAX_VALUE;          
	    }
	    
	    if(message[3] instanceof Integer)
	    {
	        messAttr[3]=(int)(message[3]);       
	    }
	    else if(message[3]!=null)
	    {
	        messAttr[3]=ManagedObjectUtilities.unsecureHashBytes(ManagedObjectUtilities.objToByte(message[3]), 0);       
	    }
	    else
	    {
	        messAttr[3]=Integer.MAX_VALUE;   
	    }
	
	    for(int messAttrInd=4; messAttrInd<messAttr.length; messAttrInd++)
	    {
	        if(message[messAttrInd] instanceof Long)
	        {
	            messAttr[messAttrInd]=(int)((long)message[messAttrInd]);                
	        }
	        else if(message[messAttrInd] instanceof Integer)
	        {
	            messAttr[messAttrInd]=(int)(message[messAttrInd]);       
	        }
	        else if(message[messAttrInd]!=null)
	        {
	        	messAttr[messAttrInd]=message[messAttrInd].hashCode();
	        }
	        else
	        {
	            messAttr[messAttrInd]=Integer.MAX_VALUE;
	        }
	    }
	    return messAttr;
    }
    
    public static int compareHash(byte[][] bytes)
    {
        long sum=0;
        long hash=0;
        byte[] compareBytes=new byte[4];
        for(int i=0; i<bytes.length; i++)
        {
            for(int b=0; b<bytes[i].length; b++)
            {
            	if(b+3<bytes[i].length)
            	{
            		System.arraycopy(bytes[i], b, compareBytes, 0, 4);
            		sum=ManagedObjectUtilities.unsecureHashBytes(compareBytes, 0); 
            		if(sum%17==0 || sum%31==0 || sum%29==1 || sum%23==1 || sum%43==1 || sum%19==1)
            		{
            			hash+=sum;
            		}
            	}
            	hash+=bytes[i][b];      
            }
        }
        return (int)(hash%((long)Integer.MAX_VALUE+1));
    }
    
    public static int hashClass(Class clazz)
    {
        List<byte[]> classBytes=new ArrayList<>();
        List<String> dataNames=new ArrayList<>();
        do
        {          
            for(Method method: clazz.getDeclaredMethods())
            {
                classBytes.add(method.getName().getBytes());
                dataNames.add(method.getName());
                for(Class mClazz:method.getParameterTypes())
                {
                    classBytes.add(mClazz.getCanonicalName().getBytes());
                    dataNames.add(mClazz.getCanonicalName());
                }
            }
            for(Field field: clazz.getDeclaredFields())
            {
                classBytes.add(field.getName().getBytes()); 
                dataNames.add(field.getName());
            }
            clazz=clazz.getSuperclass();
        }
        while(clazz!=null && clazz!=Object.class);
        return ManagedObjectUtilities.compareHash(classBytes.toArray(new byte[0][]));
    }
    
    public static Object messAgree(Object[] message)
    {
        return message[0];
    }
    
    
    
    public static void addPermissionsToManagedObject(Class ManagedObjectClassToAddTo, List<CompareMessageInterface> permissions, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject addingManagedObject) throws Exception
    {
    	for(int index=0; index<HSystem.managedObjects.size(); index++)
    	{
    		if(ManagedObjectClassToAddTo.isAssignableFrom(HSystem.managedObjects.get(index).getClass()))
    		{
    			for(CompareMessageInterface permission: permissions)
    			{
    				HSystem.managedObjects.get(index).addPermission(permission.createCompareMessage(), $_MANAGED_object_COMPILER_DATA_$, addingManagedObject);
    			}
    		}
    	}
    }
    
    public static Object cloneObject(Object toClone) throws IOException, ClassNotFoundException
    {
    	ByteArrayOutputStream bOut=new ByteArrayOutputStream();
    	ObjectOutputStream oOut=new ObjectOutputStream(bOut);
    	oOut.writeObject(toClone);
    	ByteArrayInputStream bIn=new ByteArrayInputStream(bOut.toByteArray());
    	ObjectInputStream oIn=new ObjectInputStream(bIn);
    	Object clonedObject=oIn.readObject();
    	oOut.close();
    	bOut.close();
    	oIn.close();
    	bIn.close();
    	return clonedObject;	
    }

}
