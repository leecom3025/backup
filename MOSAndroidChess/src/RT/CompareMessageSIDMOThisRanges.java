package RT;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import MO.ManagedObject;

public class CompareMessageSIDMOThisRanges extends CompareMessage
{

	private Range[] ranges;
	
	public CompareMessageSIDMOThisRanges(Range[] allowedMethodNumbers)
	{
		ranges=allowedMethodNumbers;	
	}
	
	@Override
	public boolean compareMessage(Object[] message, int messageIndex, ManagedObject callee) 
	{
		if(message[messageIndex] instanceof CompareMessage[]
				&& ((CompareMessage[])message[messageIndex]).length==4
				&& ((CompareMessage[])message[messageIndex])[0].getClass().equals(CompareSID.class)
				&& ((CompareMessage[])message[messageIndex])[1].getClass().equals(CompareMessageRange.class)
				&& ((CompareMessage[])message[messageIndex])[2].getClass().equals(CompareMessageThisManagedObject.class)
				&& ((CompareMessage[])message[messageIndex])[3].getClass().equals(CompareMessageRange.class)
				&& ((CompareMessageRange)((CompareMessage[])message[messageIndex])[3]).ranges.size()==ranges.length)
		{
			for(int index=0; index<ranges.length; index++)
			{
				if(!((CompareMessageRange)((CompareMessage[])message[messageIndex])[3]).ranges.contains(ranges[index]))
				{
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
