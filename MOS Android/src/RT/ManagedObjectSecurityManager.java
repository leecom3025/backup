package RT;

import java.security.Permission;

import MO.ManagedObject;

public class ManagedObjectSecurityManager extends SecurityManager //TODO: test security manager
{
	public void checkPermission(Permission permission)
	{
		Class[] stackClasses=getClassContext(); //TODO: Make sure [1] is the calling class
		if(!getClassContext()[1].getPackage().equals(ManagedObject.class.getPackage()))
		{
			throw new SecurityException("Permission denied for "+getClassContext()[1].getName());
			
		}
	}
	
	public Class[] getClassContext()
	{
		return super.getClassContext();
	}
	
	public Object getSecurityContext()
	{
		return super.getSecurityContext();
	}

}
