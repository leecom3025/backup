package MO;

import java.io.File;
import java.nio.file.Files;
import java.util.Hashtable;
import java.util.List;

import RT.ByteArrayWrapper;
import RT.HSystem;

public class TestLZ4Compression 
{
	
static final boolean master=true;
	
	static final int numberOfThreads=8;
	
	static MOThread baseMOThread;
	static MOThread[] mOThreads;
	
	public static void main(String[] args) throws Exception
	{
		init();
        
        if(master)
        {
        	master();
        }
        else
        {
        	client();
        }
		
	}
	
	static void init() throws Exception
	{
		HSystem.init(numberOfThreads);
       
	}
	
	static void master() throws Exception
	{
		LZ4CompressorClass lz4=new LZ4CompressorClass(true);
		
		
		
		Thread.sleep(2000);
		List<ManagedObject> mos=HSystem.managedObjects;
		Hashtable<ByteArrayWrapper, ByteArrayWrapper> runningMessages=HSystem.runningMessages;
		System.out.println("ready");
	}
	
	static void client() throws Exception
	{
		LZ4CompressorClass lz4=new LZ4CompressorClass(true);

		
		Thread.sleep(5000);
		List<ManagedObject> mos=HSystem.managedObjects;
		
		while(true)
		{
			Thread.sleep(5000);
			lz4.example(Files.readAllBytes(new File("").toPath()));
			HSystem.printRunTimes();
		}
	}

}
