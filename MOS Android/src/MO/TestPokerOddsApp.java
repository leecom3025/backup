package MO;

import java.io.File;
import java.util.Hashtable;
import java.util.List;

import RT.ByteArrayWrapper;
import RT.HSystem;
import RT.ManagedObjectUtilities;
import RT.RunTimeObject;

public class TestPokerOddsApp
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
        UDPManagedObject.$_MANAGED_object_COMPILER_CREATE_METHOD_$(HSystem.mothreads[0], HSystem.SID, HSystem.mothreads[0]);	
	}
	
	static void master() throws Exception
	{
		SystemMasterManagedObject.$_MANAGED_object_COMPILER_CREATE_METHOD_$(HSystem.mothreads[0], HSystem.SID, HSystem.mothreads[0]);
		MonteCarlo.$_MANAGED_object_COMPILER_CREATE_METHOD_$("", 0, 0, HSystem.mothreads[0], HSystem.SID, HSystem.mothreads[0]);
		Thread.sleep(2000);
		List<ManagedObject> mos=HSystem.managedObjects;
		Hashtable<ByteArrayWrapper, ByteArrayWrapper> runningMessages=HSystem.runningMessages;
		Hashtable<RunTimeObject, Long> runtimes=HSystem.runtimes;
		System.out.println("ready");
	}
	
	static void client() throws Exception
	{
		SystemManagedObject.$_MANAGED_object_COMPILER_CREATE_METHOD_$(HSystem.mothreads[0], HSystem.SID, HSystem.mothreads[0]);
		Thread.sleep(5000);
		int[] searchAttributes=new int[22];
		int[] searchAttributesWeights=new int[22];
		for(int index=0; index<searchAttributes.length; index++)
		{
			if(index==0)
			{
				searchAttributes[index]=HSystem.printManagedObjectNameHash;
				searchAttributesWeights[index]=HSystem.intMaxValue;
			}
			else if(index==1)
			{
				searchAttributes[index]=HSystem.printManagedObjectClassHash;
				searchAttributesWeights[index]=HSystem.intMaxValue;
			}
			else if(index>=7 && index<=13)
			{
				byte[] tempBytes=new byte[4];
				System.arraycopy(HSystem.masterSID.SID, 4*(index-7), tempBytes, 0, tempBytes.length);
				searchAttributes[index]=ManagedObjectUtilities.b8ToB10Int(tempBytes);
				searchAttributesWeights[index]=HSystem.intMaxValue;
			}
			else
			{
				searchAttributesWeights[index]=0;			
			}
		}
		int numMOs=HSystem.managedObjects.size();
		MonteCarlo.$_MANAGED_object_COMPILER_CREATE_METHOD_$(HSystem.mothreads[0], HSystem.SID, HSystem.mothreads[0]);
				
		while(numMOs==HSystem.managedObjects.size())
		{
			Thread.sleep(50);
		}
		Thread.sleep(30000);
		System.out.println("running");
		/*while(true)
		{
			((MatrixObject)HSystem.managedObjects.get(HSystem.managedObjects.size()-1)).multiplyRandomMatricesAndGetFNormTest(100000, new ByteArrayWrapper(), null);
			Thread.sleep(1000);
		}*/
	}

}