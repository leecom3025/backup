package RT;

import MO.ManagedObject;
import RT.HSystem;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.NoSuchAlgorithmException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import net.jpountz.lz4.LZ4Compressor;
import net.jpountz.lz4.LZ4Factory;
import net.jpountz.lz4.LZ4FastDecompressor;
import net.jpountz.lz4.LZ4SafeDecompressor;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author C
 */
public class DataCompression 
{
      
    private final byte compressionAlgorithm;
    private Object compressor;
    private Object decompressor;
    
    public DataCompression(byte cAlg) throws NoSuchAlgorithmException
    {
    	compressionAlgorithm=cAlg;
    	switch(compressionAlgorithm)
        {
            case 0:
                break;
            case 1:
                LZMAInitialize();
                break;
            case 2:
                zipBestInitialize();
                break;
            case 3:
                zipFastestInitialize();
                break;
            case 4:
                LZ4FastInitialize();
                break;
            case 5:
                LZ4BestInitialize();
                break;
            default:
            	throw new NoSuchAlgorithmException("Compression Algorithm Unsupported");
        }
    }
    
    public byte[] compress(byte data[]) throws NoSuchAlgorithmException
    {
        switch(compressionAlgorithm)
        {
            case 0:
                break;
            case 1:
                data=LZMACompress(data);
                break;
            case 2:
                data=zipCompressBest(data);
                break;
            case 3:
                data=zipCompressFastest(data);
                break;
            case 4:
                data=LZ4CompressFast(data);
                break;
            case 5:
                data=LZ4CompressBest(data);
                break;
            default:
            	throw new NoSuchAlgorithmException("Compression Algorithm Unsupported");
        }
        return data;
    }
    
    public byte[] decompress(byte data[]) throws NoSuchAlgorithmException
    {
        switch(compressionAlgorithm)
        {
            case 0:
                break;
            case 1:
                data=LZMADecompress(data);
                break;
            case 2:
                data=zipDecompress(data);
                break;
            case 3:
                data=zipDecompress(data);
                break;
            case 4:
                data=LZ4Decompress(data);
                break;
            case 5:
                data=LZ4Decompress(data);
                break;
            default:
            	throw new NoSuchAlgorithmException("Compression Algorithm Unsupported");
        }
        return data;
    }
    
    private void LZMAInitialize()
    {
    	SevenZip.Compression.LZMA.Encoder encoder=new SevenZip.Compression.LZMA.Encoder();
        encoder.SetEndMarkerMode(false);
        compressor=encoder;
        SevenZip.Compression.LZMA.Decoder decoder=new SevenZip.Compression.LZMA.Decoder();
        decompressor=decoder;
    }
    
    private byte[] LZMACompress(byte[] bytes)
    {
        try 
        {
        	ByteArrayInputStream in=new ByteArrayInputStream(bytes);
            ByteArrayOutputStream out=new ByteArrayOutputStream();      
    	    ((SevenZip.Compression.LZMA.Encoder)compressor).WriteCoderProperties(out);
			out.write(ManagedObjectUtilities.b10ToB8(bytes.length));
			((SevenZip.Compression.LZMA.Encoder)compressor).Code(in, out, -1, -1, null);
	        bytes=new byte[out.size()];
	        bytes=out.toByteArray();
	        out.flush();
	        return bytes;
		} 
        catch (IOException e) 
        {
			e.printStackTrace();
		}
        return null;	
    }    
    
    private byte[] LZMADecompress(byte[] bytes)
    {
    	try
    	{
	        ByteArrayInputStream in=new ByteArrayInputStream(bytes);
	        ByteArrayOutputStream out=new ByteArrayOutputStream();
	        byte tempB[]=new byte[5];
	        in.read(tempB);
	        ((SevenZip.Compression.LZMA.Decoder)decompressor).SetDecoderProperties(tempB);
	        tempB=new byte[4];
	        in.read(tempB);
	        ((SevenZip.Compression.LZMA.Decoder)decompressor).Code(in, out, ManagedObjectUtilities.b8ToB10Int(tempB));
	        return out.toByteArray(); 
    	} 
        catch (IOException e) 
        {
			e.printStackTrace();
		}
    	return null;   
    } 
    
    private void zipBestInitialize()
    {
    	Deflater deflater=new Deflater(Deflater.BEST_COMPRESSION); 
        compressor=deflater;
        Inflater inflater=new Inflater();
        decompressor=inflater;
    }
    
    private byte[] zipCompressBest(byte[] bytes)
    {
    	((Deflater)compressor).setInput(bytes);
        byte comp[]=new byte[((Deflater)compressor).deflate(bytes)]; 
        System.arraycopy(bytes, 0, comp, 0, comp.length);
        return comp;
    }
    
    private void zipFastestInitialize()
    {
    	Deflater deflater=new Deflater(Deflater.BEST_SPEED); 
        compressor=deflater;
        Inflater inflater=new Inflater();
        decompressor=inflater;
    }
    
    private byte[] zipCompressFastest(byte[] bytes)
    {
        Deflater deflater=new Deflater(Deflater.BEST_SPEED);       
        deflater.setInput(bytes);
        byte comp[]=new byte[deflater.deflate(bytes)]; 
        deflater.end();
        System.arraycopy(bytes, 0, comp, 0, comp.length);
        return comp;
    }    
    
    private byte[] zipDecompress(byte[] bytes)
    {
    	try
    	{
	    	((Inflater)decompressor).setInput(bytes);
	        ByteArrayOutputStream bOut = new ByteArrayOutputStream();  
	        byte[] buff = new byte[1024];
	        int count=0;
	        while(!((Inflater)decompressor).finished()) 
	        {  
	            count=((Inflater)decompressor).inflate(buff);  
	            bOut.write(buff, 0, count);  
	        }  
	        bOut.close();     
	        return bOut.toByteArray();
		} 
		catch (IOException | DataFormatException e) 
		{
			e.printStackTrace();
		}
    	return null;
    } 
    
    private void LZ4FastInitialize()
    {
        LZ4Factory factory=LZ4Factory.fastestInstance();
        compressor=factory.fastCompressor();
        decompressor=factory.fastDecompressor();
    }
    
    private byte[] LZ4CompressFast(byte[] bytes)
    {
        int maxCompressedLength=((LZ4Compressor)compressor).maxCompressedLength(bytes.length);
        byte[] compressed=new byte[maxCompressedLength+4];
        int compressedLength=((LZ4Compressor)compressor).compress(bytes, 0, bytes.length, compressed, 4);
        System.arraycopy(ManagedObjectUtilities.b10ToB8(bytes.length), 0, compressed, 0, 4);       
        bytes=new byte[compressedLength+4];
        System.arraycopy(compressed, 0, bytes, 0, bytes.length);
        return bytes;    
    }
    
    private void LZ4BestInitialize()
    {
        LZ4Factory factory=LZ4Factory.fastestInstance();
        compressor=factory.highCompressor();
        decompressor=factory.fastDecompressor();
    }
    
    private byte[] LZ4CompressBest(byte[] bytes)
    {
        int maxCompressedLength=((LZ4Compressor)compressor).maxCompressedLength(bytes.length);
        byte[] compressed=new byte[maxCompressedLength+4];
        int compressedLength=((LZ4Compressor)compressor).compress(bytes, 0, bytes.length, compressed, 4);
        System.arraycopy(ManagedObjectUtilities.b10ToB8(bytes.length), 0, compressed, 0, 4);       
        bytes=new byte[compressedLength+4];
        System.arraycopy(compressed, 0, bytes, 0, bytes.length);
        return bytes;    
    }   
    
    private byte[] LZ4Decompress(byte[] bytes)
    {
        byte tempB[]=new byte[4];
        System.arraycopy(bytes, 0, tempB, 0, 4);
        int len=ManagedObjectUtilities.b8ToB10Int(tempB);
        tempB=new byte[len];
        ((LZ4FastDecompressor)decompressor).decompress(bytes, 4, tempB, 0, len);
        return tempB;
    }
    
}
