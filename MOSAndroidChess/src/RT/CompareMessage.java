package RT;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

import MO.ManagedObject;

public abstract class CompareMessage implements Serializable
{
	
	public boolean add(Object toAdd) throws Exception
	{
		return false;
	}
	
	public boolean remove(long messageIndex) throws Exception
	{
		return false;
	}
	
	public abstract boolean compareMessage(Object[] message, int messageIndex, ManagedObject callee);
	
	public boolean equals(CompareMessage toCheck) throws IOException
	{
		ByteArrayOutputStream bOutThis=new ByteArrayOutputStream();
		ObjectOutputStream oOutThis=new ObjectOutputStream(bOutThis);
		oOutThis.writeUnshared(this);
		
		ByteArrayOutputStream bOutToCheck=new ByteArrayOutputStream();
		ObjectOutputStream oOutToCheck=new ObjectOutputStream(bOutToCheck);
		oOutToCheck.writeUnshared(toCheck);
		
		return Arrays.equals(bOutThis.toByteArray(), bOutToCheck.toByteArray());
	}

}
