package MO;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Hashtable;
import java.util.List;

import RT.$_MANAGED_OBJECT_COMPILER_ANNOTATION_$;
import RT.AnyObjectAllowed;
import RT.ByteArrayWrapper;
import RT.CompareClass;
import RT.CompareMessage;
import RT.CompareMessageAnyManagedObject;
import RT.CompareMessageRange;
import RT.CompareMessageThisManagedObject;
import RT.CompareSID;
import RT.HSystem;
import RT.ManagedObjectUtilities;
import RT.Node;
import RT.Range;

public class TestCommunicationPrintMO 
{
	
	static final boolean master=true;
	
	static final int numberOfThreads=4;
	
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
		ByteArrayWrapper clientSID=new ByteArrayWrapper(new byte[]{});
		SystemMasterManagedObject.$_MANAGED_object_COMPILER_CREATE_METHOD_$(HSystem.mothreads[0], HSystem.SID, HSystem.mothreads[0]);
		PrintMO.$_MANAGED_object_COMPILER_CREATE_METHOD_$(HSystem.mothreads[0], HSystem.SID, HSystem.mothreads[0]);
		Thread.sleep(2000);
		List<ManagedObject> mos=HSystem.managedObjects;
		Hashtable<ByteArrayWrapper, ByteArrayWrapper> runningMessages=HSystem.runningMessages;
		System.out.println("ready");
	}
	
	static void client() throws Exception
	{
		SystemManagedObject.$_MANAGED_object_COMPILER_CREATE_METHOD_$(HSystem.mothreads[0], HSystem.SID, HSystem.mothreads[0]);
		Thread.sleep(5000);
		//String sendString=new String(Files.readAllBytes(new File("C:\\Users\\n\\Desktop\\toPrint.txt").toPath()));
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
		PrintMO.$_MANAGED_object_COMPILER_CREATE_METHOD_$(HSystem.mothreads[0], HSystem.SID, HSystem.mothreads[0]);
				
		while(numMOs==HSystem.managedObjects.size())
		{
			Thread.sleep(50);
		}
		Thread.sleep(2000);
		//((PrintMO)HSystem.managedObjects.get(HSystem.managedObjects.size()-1)).findAndPrint(searchAttributes, searchAttributesWeights, sendString, HSystem.SID, HSystem.mothreads[0]);
		System.out.println("run");
	}

}
