package RT;

import java.util.ArrayList;

import MO.ManagedObject;

public class CompareCallSequence extends CompareMessage
{
	
	String[] callSequence;
	CompareMessage compareMessage;
	
	public CompareCallSequence(String[] callSequence, CompareMessage compareMessage)
	{
		this.callSequence=callSequence;
		this.compareMessage=compareMessage;
	}
	
	@Override
	public boolean compareMessage(Object[] message, int messageIndex, ManagedObject callee) 
	{
		StackTraceElement[] stackTraces=Thread.currentThread().getStackTrace();
		for(int stackPosition=5; stackPosition-5<callSequence.length; stackPosition++)
		{
			if(stackPosition>=stackTraces.length)
			{
				return false;
			}
			else if(!callSequence[stackPosition-5].equals(stackTraces[stackPosition].getClassName()+"."+stackTraces[stackPosition].getMethodName()))
			{
				return false;
			}
		}
		return compareMessage.compareMessage(message, messageIndex, callee);
	}

}
