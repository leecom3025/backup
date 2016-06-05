package RT;

import java.io.Serializable;
import java.util.Arrays;

public class ByteArrayWrapper implements Serializable, Comparable<ByteArrayWrapper>
{
	
	public static final int toRunAfterDelayByteIndex=0;
	public static final byte toRunAfterDelayMask=1;
	
	public static final int noAggregateThenCallByteIndex=0;
	public static final byte noAggregateThenCallMask=2;
	
	public static final int verifiedByteIndex=0;
	public static final byte verifiedMask=3;
	
	public static final int invalidatedByteIndex=0;
	public static final byte invalidatedMask=4;	
	
	public static final int methodCallCountByteIndex=1;	
	public static final int runNumberByteIndex=2;
	
	public static final int cloneRunDisabledByteIndex=6;
	public static final byte cloneRunDisabledMask=1;
	
	public static final int aggreagteThenCallDisabledByteIndex=6;
	public static final byte aggreagteThenCallDisabledMask=2;
	
	public static final int callPathIDIndex=8;
	
	public final byte[] SID;
	public byte[] MORID;
	public byte[] intelligenceInfo;
	public byte[] updateTime;
	public byte[] data;
	public byte[] userData;
	
	public byte[] targetClassID;
	public int targetVerificationMethodNumber;

	public ByteArrayWrapper()
    {
		SID=new byte[32];
		MORID=new byte[16];
		intelligenceInfo=new byte[4];
		updateTime=new byte[8];
		updateTime=ManagedObjectUtilities.b10ToB8(HSystem.uTime);
		data=new byte[40];
		userData=new byte[0];

		data[methodCallCountByteIndex]=-128;
    }
	
	public ByteArrayWrapper(byte[] SID)
    {
		this.SID=SID;
		MORID=new byte[16];
		intelligenceInfo=new byte[4];
		updateTime=ManagedObjectUtilities.b10ToB8(HSystem.uTime);
		data=new byte[40];
		userData=new byte[0];

		data[methodCallCountByteIndex]=-128;
    }
	
    public ByteArrayWrapper(byte[] SID, byte[] MORID, byte[] intelligenceInfo, byte[] updateTime, byte[] data, byte[] userData)
    {
        this.SID=SID.clone();
        this.MORID=MORID.clone();
        this.intelligenceInfo=intelligenceInfo.clone();
        this.updateTime=updateTime.clone();
        this.data=data.clone();
        this.userData=userData.clone();
    }
    
    public ByteArrayWrapper(byte[] SID, byte[] MORID, byte[] intelligenceInfo, byte[] updateTime, byte[] data, byte[] userData, byte[] targetClassID, int targetVerificationMethodNumber)
    {
        this.SID=SID.clone();
        this.MORID=MORID.clone();
        this.intelligenceInfo=intelligenceInfo.clone();
        this.updateTime=updateTime.clone();
        this.data=data.clone();
        this.userData=userData.clone();
        this.targetClassID=targetClassID.clone();
        this.targetVerificationMethodNumber=targetVerificationMethodNumber;
    }
    
    public void setTargetClassID(byte[] targetClassID)
    {
    	this.targetClassID=targetClassID.clone();
    }
    
    public void setTargetVerificationMethodNumber(int targetVerificationMethodNumber)
    {
    	this.targetVerificationMethodNumber=targetVerificationMethodNumber;
    }
    
    public void resetIntelCounter()
    {
    	intelligenceInfo=new byte[4];
    }
    
    public void incrementIntelligenceCounter()
    {
    	int counterValue=ManagedObjectUtilities.b8ToB10Int(intelligenceInfo);
    	if(counterValue<Integer.MAX_VALUE)
    	{
    		intelligenceInfo=ManagedObjectUtilities.b10ToB8(ManagedObjectUtilities.b8ToB10Int(intelligenceInfo)+1); 
    	}
    }
    
    public void setIntelligenceCounter(byte[] newValue)
    {
    	for(int valueIndex=0; valueIndex<intelligenceInfo.length; valueIndex++)
    	{
    		intelligenceInfo[valueIndex]=newValue[valueIndex];
    	}
    }

    public void maxIntelligenceCounter()
    {
    	intelligenceInfo=ManagedObjectUtilities.b10ToB8(Integer.MAX_VALUE);   	
    }
    
    public boolean intelContinue()
    {
    	return ManagedObjectUtilities.b8ToB10Int(intelligenceInfo)<=HSystem.maxIntelContactTimes[2];
    }
    
    public void toggleNoAggregateThenCall()
    {
    	data[noAggregateThenCallByteIndex]=(byte)(data[noAggregateThenCallByteIndex]^noAggregateThenCallMask);
    }
    
    public boolean noAggregateThenCall()
    {
    	return (data[noAggregateThenCallByteIndex] & noAggregateThenCallMask)!=0;
    }
    
    public void toggleToRunAfterDelay()
    {
    	data[toRunAfterDelayByteIndex]=(byte)(data[toRunAfterDelayByteIndex]^toRunAfterDelayMask);
    }
    
    public void noToRunAfterDelay()
    {
    	data[toRunAfterDelayByteIndex]=(byte)(data[toRunAfterDelayByteIndex] & ~(1>>toRunAfterDelayMask));
    }
    
    public void setVerifiedToFalse()
    {
    	data[verifiedByteIndex]=(byte)(data[verifiedByteIndex] & ~(1>>verifiedMask));
    }
    
    public void setVerifiedToTrue()
    {
    	data[verifiedByteIndex]=(byte)(data[verifiedByteIndex] | (1>>verifiedMask));
    }
    
    public boolean verified()
    {
    	return (data[verifiedByteIndex] & verifiedMask)!=0;
    }
    
    public void setInvalidatedToTrue()
    {
    	data[invalidatedByteIndex]=(byte)(data[invalidatedByteIndex] | (1>>invalidatedMask));
    }
    
    public boolean invalidated()
    {
    	return (data[invalidatedByteIndex] & invalidatedMask)!=0;
    }
    
    public boolean isToRunAfterDelay()
    {
    	return (data[toRunAfterDelayByteIndex] & toRunAfterDelayMask)!=0;
    }
    
    public void resetMethodCallCount()
    {
    	data[methodCallCountByteIndex]=-128;
    }
    
    public void incrementMethodCallCount()
    {
    	data[methodCallCountByteIndex]++;   	
    }
    
    public void maxMethodCallCount()
    {
    	data[methodCallCountByteIndex]=127;   	
    }
    
    public void setCloneRunDisabled()
    {
    	data[cloneRunDisabledByteIndex]=(byte)(data[cloneRunDisabledByteIndex] | cloneRunDisabledMask);
    }
    
    public boolean isCloneRunDisabled()
    {
    	return (data[cloneRunDisabledByteIndex] & cloneRunDisabledMask)!=0;
    }
    
    public void setAggreagteThenCallDisabled()
    {
    	data[aggreagteThenCallDisabledByteIndex]=(byte)(data[aggreagteThenCallDisabledByteIndex] | aggreagteThenCallDisabledMask);
    }
    
    public boolean isAggreagteThenCallDisabled()
    {
    	return (data[aggreagteThenCallDisabledByteIndex] & aggreagteThenCallDisabledMask)!=0;
    }
    
    public void setRunNumber(int runNumber)
    {
    	byte[] runNumberBytes=ManagedObjectUtilities.b10ToB8(runNumber);
    	System.arraycopy(runNumberBytes, 0, data, runNumberByteIndex, runNumberBytes.length);   	
    }
    
    public boolean sendToMOThread()
    {
    	return data[methodCallCountByteIndex]>HSystem.maxNumberOfMethodCalls;
    }
    
    public int getRunNumber()
    {
    	byte[] runNumberBytes=new byte[4];
    	System.arraycopy(data, runNumberByteIndex, runNumberBytes, 0, runNumberBytes.length);
    	return ManagedObjectUtilities.b8ToB10Int(runNumberBytes);
    }
    
    public void setCallPathID(byte[] newCallPathID)
    {
    	if(newCallPathID.length==32)
    	{
    		System.arraycopy(newCallPathID, 0, data, callPathIDIndex, newCallPathID.length);
    	}
    	else
    	{
    		System.out.println("Callpath ID too short: "+newCallPathID.length+" bytes");
    	}
    }
    
    public byte[] getCallPathID()
    {
    	byte[] callPathID=new byte[32];
    	System.arraycopy(data, callPathIDIndex, callPathID, 0, callPathID.length);
    	return callPathID;
    }
    
    public void randomizeCallPathID()
    {
    	byte[] newCallPathID=new byte[32];
    	HSystem.cryptoPRNG.getBytes(newCallPathID);
    	System.arraycopy(newCallPathID, 0, data, callPathIDIndex, newCallPathID.length);
    }
    
    @Override
    public int hashCode()
    {
    	return Arrays.hashCode(MORID);
    }
    
    @Override
    public boolean equals(Object other)
    {
        if (!(other instanceof ByteArrayWrapper))
        {
            return false;
        }
        return Arrays.equals(MORID, ((ByteArrayWrapper)other).MORID);
    }
    
    public boolean equalsSID(Object other)
    {
        if (!(other instanceof ByteArrayWrapper))
        {
            return false;
        }
        return Arrays.equals(SID, ((ByteArrayWrapper)other).SID);
    }
    
    public boolean equalsCallPathID(Object other)
    {
        if (!(other instanceof ByteArrayWrapper))
        {
            return false;
        }
        return Arrays.equals(getCallPathID(), ((ByteArrayWrapper)other).getCallPathID());
    }
    
	@Override
	public int compareTo(ByteArrayWrapper toCompare) 
	{
		for(int byteNum=0; byteNum<SID.length; byteNum++)
		{
			if(SID[byteNum]!=toCompare.SID[byteNum])
			{
				return SID[byteNum]-toCompare.SID[byteNum];
			}
		}
		
		if(MORID.length!=toCompare.MORID.length)
		{
			return MORID.length-toCompare.MORID.length;
		}
		for(int byteNum=0; byteNum<(int)Math.ceil(MORID.length/8.0); byteNum++)
		{
			byte[] timeBytesThis=new byte[8];
			byte[] timeBytesOther=new byte[8];
			if(8*byteNum+8<MORID.length)
			{			
				System.arraycopy(MORID, 8*byteNum, timeBytesThis, 0, timeBytesThis.length);
				System.arraycopy(toCompare.MORID, 8*byteNum, timeBytesOther, 0, timeBytesThis.length);
			}
			else
			{
				System.arraycopy(MORID, 8*byteNum, timeBytesThis, 0, MORID.length-8*byteNum);
				System.arraycopy(toCompare.MORID, 8*byteNum, timeBytesOther, 0, toCompare.MORID.length-8*byteNum);
				
			}
			long thisLongValue=ManagedObjectUtilities.b8ToB10(timeBytesThis);
			long otherLongValue=ManagedObjectUtilities.b8ToB10(timeBytesOther);
			if(thisLongValue!=otherLongValue)
			{
				if(thisLongValue-otherLongValue>Integer.MAX_VALUE)
				{
					return Integer.MAX_VALUE;
				}
				else if(thisLongValue-otherLongValue<Integer.MIN_VALUE)
				{
					return Integer.MIN_VALUE;
				}
				else
				{
					return (int)(thisLongValue-otherLongValue);
				}
			}
		}
		
		for(int byteNum=0; byteNum<intelligenceInfo.length; byteNum++)
		{
			if(intelligenceInfo[byteNum]!=toCompare.intelligenceInfo[byteNum])
			{
				return intelligenceInfo[byteNum]-toCompare.intelligenceInfo[byteNum];
			}
		}
		
		for(int byteNum=0; byteNum<updateTime.length; byteNum++)
		{
			if(updateTime[byteNum]!=toCompare.updateTime[byteNum])
			{
				return updateTime[byteNum]-toCompare.updateTime[byteNum];
			}
		}
		
		for(int byteNum=0; byteNum<data.length; byteNum++)
		{
			if(data[byteNum]!=toCompare.data[byteNum])
			{
				return data[byteNum]-toCompare.data[byteNum];
			}
		}
		
		return 0;
	}
	
	public String toString()
	{
		String dataString="";
		for(byte b: data)
		{
			dataString+=b+", ";
		}
		if(!dataString.isEmpty())
		{
			dataString=dataString.substring(0, dataString.length()-2);
		}
		return dataString;
	}
	
}
