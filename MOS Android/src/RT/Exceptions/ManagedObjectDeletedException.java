package RT.Exceptions;

import java.io.IOException;

public class ManagedObjectDeletedException extends IOException
{
	
	public final int[] deletedID;
	
	public ManagedObjectDeletedException(int[] deleted)
	{
		deletedID=deleted;
	}

}
