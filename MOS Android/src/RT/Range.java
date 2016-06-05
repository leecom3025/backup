package RT;

import java.io.Serializable;
import java.util.Arrays;

public class Range implements Comparable<Object>, Serializable
{

	public Comparable low;
	public Comparable high;
	
	public Range(Comparable point)
	{
		this.low=point;
		this.high=point;
	}
	
	public Range(Comparable low, Comparable high)
	{
		this.low=low;
		this.high=high;
	}
	
	public void addToMessageIndices(Long[] messageIndices)
	{
		for(long messageIndex: messageIndices)
		{
			int indexPosition=Arrays.binarySearch(messageIndices, messageIndex);
			if(indexPosition<0)
			{
				indexPosition=-(indexPosition+1);
				Long[] newMessageIndices=new Long[messageIndices.length+1];
				System.arraycopy(messageIndices, 0, newMessageIndices, 0, indexPosition);
				newMessageIndices[indexPosition]=messageIndex;
				if(indexPosition+1<messageIndices.length)
				{
					System.arraycopy(messageIndices, indexPosition, newMessageIndices, indexPosition+1, messageIndices.length-indexPosition);
				}
				messageIndices=newMessageIndices;
			}
		}
	}
	
	public boolean removeFromMessageIndices(Long[] messageIndices)
	{
		for(long messageIndex: messageIndices)
		{
			int indexPosition=Arrays.binarySearch(messageIndices, messageIndex);
			if(indexPosition>=0)
			{
				Long[] newMessageIndices=new Long[messageIndices.length-1];
				System.arraycopy(messageIndices, 0, newMessageIndices, 0, indexPosition);
				if(indexPosition<newMessageIndices.length)
				{
					System.arraycopy(messageIndices, indexPosition+1, newMessageIndices, indexPosition, newMessageIndices.length-indexPosition);
				}
				messageIndices=newMessageIndices;
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int compareTo(Object toCompare) 
	{
		if(toCompare instanceof Range)
		{
			return low.compareTo(((Range)toCompare).low);
		}
		else 
		{
			if(low.compareTo(toCompare)>0)
			{
				return 1;
			}
			if(high.compareTo(toCompare)<0)
			{
				return -1;
			}
			return 0;
		}
	}
	
}
