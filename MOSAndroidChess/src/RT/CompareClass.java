package RT;

import MO.ManagedObject;

public class CompareClass extends CompareMessage
{
	Class classToCompare;
	
	public CompareClass(Class toCompare)
	{
		this.classToCompare=toCompare;
	}

	@Override
	public boolean compareMessage(Object[] message, int messageIndex, ManagedObject callee) 
	{
		return classToCompare.equals(message[messageIndex].getClass());
	}

}
