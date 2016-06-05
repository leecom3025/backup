package RT;

import org.bouncycastle.util.Arrays;

import MO.ManagedObject;

public class CompareSID extends CompareMessage
{
	public byte[] SID;
	
	public CompareSID(ByteArrayWrapper toCompareTo)
	{
		SID=toCompareTo.SID;
	}

	@Override
	public boolean compareMessage(Object[] message, int messageIndex, ManagedObject callee) 
	{
		return (message[messageIndex] instanceof ByteArrayWrapper && Arrays.areEqual(((ByteArrayWrapper)message[messageIndex]).SID, SID));
	}

}
