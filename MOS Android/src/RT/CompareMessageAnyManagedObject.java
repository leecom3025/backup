package RT;

import MO.ManagedObject;

public class CompareMessageAnyManagedObject extends CompareMessage
{

	@Override
	public boolean compareMessage(Object[] message, int messageIndex, ManagedObject callee) 
	{
		return message[messageIndex] instanceof ManagedObject;
	}

}
