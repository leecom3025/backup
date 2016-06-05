package RT;

import java.util.Iterator;

public class ArrayIterator<Type> implements Iterator
{

	Type[] iterateArray;
	int position;
	
	public ArrayIterator(Type[] array)
	{
		iterateArray=array;
		position=0;
	}
	
	@Override
	public boolean hasNext() 
	{
		return position<iterateArray.length;
	}

	@Override
	public Type next() 
	{
		Type toReturn=iterateArray[position];
		position++;
		return toReturn;
	}

}
