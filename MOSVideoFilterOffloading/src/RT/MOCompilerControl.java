package RT;

public @interface MOCompilerControl 
{
	boolean checkLink();
	boolean checkShell();
	boolean checkCloned();
	boolean compile();
	boolean checkPermission();
	boolean intelligenceBefore();
	boolean intelligenceAfter();
	boolean aggregateReturn();
	boolean timeEfficiency();
	boolean offload();
}
