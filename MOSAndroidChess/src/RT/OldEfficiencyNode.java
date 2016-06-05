package RT;

import MO.ManagedObject;

public class OldEfficiencyNode extends Node
{
	
	public final long oldEfficiency;
	public int[] fileSystemID;
	
	public OldEfficiencyNode(ManagedObject mo, long oldEfficiency, int[] fileSystemMOID)
	{
		super(mo);
		this.oldEfficiency=oldEfficiency;
		fileSystemID=new int[2];
		fileSystemID[0]=fileSystemMOID[15];
		fileSystemID[1]=fileSystemMOID[16];
	}

}
