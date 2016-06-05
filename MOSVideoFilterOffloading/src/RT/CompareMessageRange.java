package RT;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import MO.ManagedObject;

public class CompareMessageRange extends CompareMessage
{
	public List<Range> ranges;
	
	public CompareMessageRange(Range[] ranges)
	{
		this.ranges=Arrays.asList(ranges);
		Collections.sort(this.ranges);
	}
	
	private boolean sameType(Object point)
	{
		return ranges.get(0).low.getClass().equals(point.getClass());	
	}
	
	/*
	 * add a range to the range list. 
	 * 1. to all ranges within range, add range's message index
	 * 2. for all ranges containing range's start/end, split the ranges at the start/end and add the 
	 *    range's message index to the new range within the range's range.
	 */
	public boolean add(Object toAdd) throws Exception
	{
		if(toAdd instanceof CompareMessageRange && (((CompareMessageRange)toAdd).ranges.isEmpty() || sameType(((CompareMessageRange)toAdd).ranges.get(0))))
		{
			for(Range toAddRange: ((CompareMessageRange)toAdd).ranges)
			{
				int lowIndex=Collections.binarySearch(ranges, toAddRange.low);
				if(lowIndex<0)
				{
					lowIndex=-(lowIndex+1);
				}
				int highIndex=Collections.binarySearch(ranges, toAddRange.high);
				if(highIndex<0)
				{
					highIndex=-(highIndex+1);
				}
				
				if(lowIndex<ranges.size())
				{
					if(toAddRange.low.compareTo(ranges.get(lowIndex).low)==1)
					{
						Range belowRange=new Range(ranges.get(lowIndex).low, toAddRange.low);
						Range aboveRange=new Range(toAddRange.low, ranges.get(lowIndex).high);
						ranges.set(lowIndex, belowRange);
						ranges.add(lowIndex+1, aboveRange);
						highIndex++;
					}
				}
				
				if(!ranges.isEmpty() && toAddRange.low.compareTo(ranges.get(ranges.size()-1).high)<0)
				{
					if(toAddRange.high.compareTo(ranges.get(lowIndex).high)==-1)
					{
						Range belowRange=new Range(ranges.get(lowIndex).low, toAddRange.high);
						Range aboveRange=new Range(toAddRange.high, ranges.get(lowIndex).high);
						ranges.set(highIndex, belowRange);
						ranges.add(highIndex+1, aboveRange);
					}	
				}		
			}
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean remove(long index) throws Exception
	{
		boolean removed=false;
		for(Range range: ranges)
		{
			removed=range.removeFromMessageIndices(new Long[]{index});
			if(removed)
			{
				break;
			}
		}
		if(removed)
		{
			for(int rangeIndex=0; rangeIndex<ranges.size(); rangeIndex++)
			{
				ranges.remove(rangeIndex);
				rangeIndex--;
			}
			return true;
		}
		return false;
	}
	
	/*
	 * main call, find range object is in (if any) and return corresponding message indices
	 */
	public boolean compareMessage(Object[] message, int messageIndex, ManagedObject callee)
	{
		if(sameType(message[messageIndex]))
		{
			int inRange=Collections.binarySearch(ranges, message[messageIndex]);
			if(inRange>=0)
			{
				return true;
			}
		}
		return false;
	}

}
