package RT;

import MO.ManagedObject;
import MO.SIDMO;

public class CompareSIDMOID extends CompareMessage 
{

	@Override
	public boolean compareMessage(Object[] message, int messageIndex, ManagedObject callee) 
	{
		return ((SIDMO)callee).SID.equalsSID((ByteArrayWrapper)message[messageIndex]);
	}

}
