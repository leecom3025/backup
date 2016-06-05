package RT;

import MO.ManagedObject;

public class AnyObjectAllowed extends CompareMessage
{

	public AnyObjectAllowed()
	{
		
	}

	@Override
	public boolean compareMessage(Object[] message, int messageIndex, ManagedObject callee) {
		return true;
	}

}
