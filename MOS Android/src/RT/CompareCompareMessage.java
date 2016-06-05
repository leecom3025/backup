package RT;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import MO.ManagedObject;

public class CompareCompareMessage extends CompareMessage
{
	
	CompareMessage[] compareMessages;

	@Override
	public boolean compareMessage(Object[] message, int messageIndex, ManagedObject callee)
	{
		if(message[messageIndex] instanceof CompareMessage[]
				&& ((CompareMessage[])message[messageIndex]).length==compareMessages.length)
		{
			for(int index=0; index<compareMessages.length; index++)
			{
				try
				{
					if(!compareMessages[index].equals(((CompareMessage[])message[messageIndex])[index]))
					{
						return false;
					}
				}
				catch(IOException e)
				{
					Logger.getLogger(CompareCompareMessage.class.getName()).log(Level.SEVERE, null, e);
					return false;
				}
			}
			return true;
		}
		else
		{
			return false;
		}
	}

}
