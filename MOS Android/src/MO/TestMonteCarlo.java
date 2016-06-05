package MO;

import java.util.Hashtable;
import java.util.List;

import RT.ByteArrayWrapper;
import RT.HSystem;
import RT.ManagedObjectUtilities;

public class TestMonteCarlo 
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
		
		
		new MonteCarlo("7HAH3H9HAD6H5D", 1000000000, 9);
		
		Thread.sleep(2000);
		List<ManagedObject> mos=HSystem.managedObjects;
		Hashtable<ByteArrayWrapper, ByteArrayWrapper> runningMessages=HSystem.runningMessages;
		System.out.println("ready");
	}
	
	static void client() throws Exception
	{
		MonteCarlo mc=new MonteCarlo("7HAH3H9HAD6H5D", 1000000000, 9);
		Thread.sleep(5000);
		List<ManagedObject> mos=HSystem.managedObjects;
		mc.start();
		
		while(true)
		{
			Thread.sleep(5000);
			System.out.println(mc.willWinIn());
			HSystem.printRunTimes();
		}
	}

}
