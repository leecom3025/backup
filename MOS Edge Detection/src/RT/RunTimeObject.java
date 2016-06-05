package RT;

public class RunTimeObject 
{
	
	String clazz;
	boolean offloaded;
	int methodNumber;
	
	public RunTimeObject(String clazz, boolean offloaded, int methodNumber)
	{
		this.clazz=clazz;
		this.offloaded=offloaded;
		this.methodNumber=methodNumber;
	}
	
	@Override
	public int hashCode()
	{
		int booleanHash=0;
		if(offloaded)
		{
			booleanHash=1;
		}
		return clazz.hashCode()+booleanHash+methodNumber;		
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(other instanceof RunTimeObject)
		{
			return clazz.equals(((RunTimeObject)other).clazz) && offloaded==((RunTimeObject)other).offloaded && methodNumber==((RunTimeObject)other).methodNumber;
		}
		else
		{
			return false;
		}
	}

}
