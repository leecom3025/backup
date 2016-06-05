package RT;

import MO.ManagedObject;

public class CompareMessageThisManagedObject extends CompareMessage
{

	@Override
	public boolean compareMessage(Object[] message, int messageIndex, ManagedObject callee) 
	{
		return (message[messageIndex] instanceof ManagedObject 
				&& ((ManagedObject)message[messageIndex]).equals(callee));
	}

}
