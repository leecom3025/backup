
package MO;
import RT.ByteArrayWrapper;
import RT.CompareMessage;
import RT.HSystem;
import RT.MOCompilerControl;
import RT.Node;
import RT.Exceptions.TimeOutException;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bouncycastle.util.Arrays;
import MO.ManagedObject;
import MO.MOThread;
import RT.ArrayIterator;
import RT.ByteArrayWrapper;
import RT.MOCompilerControl;
import RT.$_MANAGED_OBJECT_COMPILER_ANNOTATION_$;
import RT.$_MANAGED_object_COMPILER_DUMMY_VARIABLE_$;
import RT.Node;
import RT.Exceptions.TimeOutException;
import RT.Exceptions.MOPermissionDeniedException;
import RT.TimeOutObject;
import java.util.Iterator;
import RT.CompareMessage;
import RT.ManagedObjectUtilities;

public class MOThread extends ManagedObject implements Runnable 

{

public static final byte[] $_MANAGED_object_COMPILER_CLASS_ID_$=new byte[]{-50, -102, 100, -111, -109, 40, 12, 9, 43, -97, 30, 83, -113, -124, -93, 97, 73, 122, 63, 83, -6, 46, -68, 88, 33, -24, -75, -105, -67, -101, 119, 124};
static final long serialVersionUID=-3559421979081044983L;
    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public MOThread() throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(MOThread.class))
        {
            addPermission(permission, null, this);
        }
    }

    
private static final int queueScaleFactor=10000;
protected final List<Object[]> toRun=new ArrayList<>();
protected final List<Object[]> toRunAfterDelay=new ArrayList<>();
protected volatile Object[] rMess=null;
protected volatile Object[] tempMessage=null;
protected long sleepTime=HSystem.tSleepTime;
protected long time=System.currentTimeMillis();
protected volatile int running=-1;
protected volatile int runningDelay=0;
protected volatile boolean runNonThreadSearch=true;
private double searchForgeinChance=0.0001;
    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483648)
    protected MOThread(ManagedObject masterMO, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(MOThread.class))
        {
            addPermission(permission, null, this);
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483648);
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483647)
    public void run()
    {
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
long delaySleepTime=0L;
int[] threadAttributes=new int[HSystem.mOAttributesLength+1];
int[] threadWeights=new int[threadAttributes.length];
int[] threadMaximumAttributes=new int[threadAttributes.length];
int[] threadMinimumAttributes=new int[threadAttributes.length];
        for(int attrNum=0; attrNum<threadAttributes.length; attrNum++)
        {
            if(attrNum==0 || attrNum==1)
            {
                threadAttributes[attrNum]=mOAttributes[attrNum];
                threadWeights[attrNum]=HSystem.intMaxValue;
                threadMaximumAttributes[attrNum]=mOAttributes[attrNum];
                threadMinimumAttributes[attrNum]=mOAttributes[attrNum];
            }
            else if(attrNum==2 || attrNum==4)
            {
                threadAttributes[attrNum]=Integer.MIN_VALUE;
                threadWeights[attrNum]=attrNum/2;
                threadMaximumAttributes[attrNum]=Integer.MAX_VALUE;
                threadMinimumAttributes[attrNum]=Integer.MIN_VALUE;
            }
            else if(attrNum==HSystem.mOAttributesLength)
            {
                threadAttributes[attrNum]=Integer.MAX_VALUE;
                threadWeights[attrNum]=Integer.MAX_VALUE;
                threadMaximumAttributes[attrNum]=Integer.MAX_VALUE;
                threadMinimumAttributes[attrNum]=Integer.MIN_VALUE;
            }
            else
            {
                threadWeights[attrNum]=0;
                threadMaximumAttributes[attrNum]=Integer.MAX_VALUE;
                threadMinimumAttributes[attrNum]=Integer.MIN_VALUE;
            }
        }
byte[] sid=new byte[32];
        System.arraycopy(ManagedObjectUtilities.b10ToB8(mOAttributes[7]), 0, sid, 0, 4);
        System.arraycopy(ManagedObjectUtilities.b10ToB8(mOAttributes[8]), 0, sid, 4, 4);
        System.arraycopy(ManagedObjectUtilities.b10ToB8(mOAttributes[9]), 0, sid, 8, 4);
        System.arraycopy(ManagedObjectUtilities.b10ToB8(mOAttributes[10]), 0, sid, 12, 4);
        System.arraycopy(ManagedObjectUtilities.b10ToB8(mOAttributes[11]), 0, sid, 16, 4);
        System.arraycopy(ManagedObjectUtilities.b10ToB8(mOAttributes[12]), 0, sid, 20, 4);
        System.arraycopy(ManagedObjectUtilities.b10ToB8(mOAttributes[13]), 0, sid, 24, 4);
        System.arraycopy(ManagedObjectUtilities.b10ToB8(mOAttributes[14]), 0, sid, 28, 4);
ByteArrayWrapper callData=new ByteArrayWrapper(sid);
        while(true)
        {
            try
            {
                runningDelay=1;
                if(!toRunAfterDelay.isEmpty() || !toRun.isEmpty())
                {
                    rMess=removeFromToRunAfterDelay(callData, this);
                    if(rMess!=null)
                    {
                        if((long)rMess[5]+(long)rMess[6]>=System.nanoTime())
                        {
                            runningDelay=0;
                            addToRun(rMess, callData, this);
                            if(toRun.isEmpty())
                            {
                                if(runNonThreadSearch && Math.random()<searchForgeinChance)
                                {
                                    runNonThreadSearch=false;
                                    setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(toRun.size()+(int)Math.pow(toRunAfterDelay.size(), 0.125))))%Integer.MIN_VALUE, callData, this);
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate(callData, this, new Object[]{callData,this, this, -2146483647,threadAttributes,threadMinimumAttributes,threadMaximumAttributes,threadWeights, 1,HSystem.defaultNumCheckNodes/10, false}, 1, -2146483638, true, true, new Object[]{callData,sid,threadMinimumAttributes,threadMaximumAttributes,threadWeights,threadAttributes,delaySleepTime,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, callData, this);
                                        $_MANAGED_object_COMPILER_RETURN_VALUE_$=latticeSearch(threadAttributes, threadMinimumAttributes, threadMaximumAttributes, threadWeights, 1, HSystem.defaultNumCheckNodes/10, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                   
                                    if(toRun.isEmpty())
                                    {
                                        rMess=removeFromToRunAfterDelay(callData, this);
                                        if(rMess!=null)
                                        {
                                            if((delaySleepTime=((long)rMess[5]+(long)rMess[6]-System.nanoTime())/1000000)>0)
                                            {
                                                synchronized(this)
                                                {
                                                    wait(delaySleepTime);
                                                }
                                            }
                                            addToRun(rMess, callData, this);
                                        }
                                    }
                                }
                                else
                                {
                                    runNonThreadSearch=false;
MOThread worstMOThread=HSystem.getWorstMOThread();
                                    if(worstMOThread!=null && !worstMOThread.equals(this))
                                    {
Object[] newRunMessage=worstMOThread.removeFromToRun(callData, this);
                                        if(newRunMessage!=null)
                                        {
                                            addToRun(newRunMessage, callData, this);
                                        }
                                        else
                                        {
                                            newRunMessage=worstMOThread.removeFromToRunAfterDelay(callData, this);
                                            if(newRunMessage!=null)
                                            {
                                                addToRun(newRunMessage, callData, this);
                                            }
                                        }
                                    }
                                    if(toRun.isEmpty())
                                    {
                                        rMess=removeFromToRunAfterDelay(callData, this);
                                        if(rMess!=null)
                                        {
                                            if((delaySleepTime=((long)rMess[5]+(long)rMess[6]-System.nanoTime())/1000000)>0)
                                            {
                                                synchronized(this)
                                                {
                                                    wait(delaySleepTime);
                                                }
                                            }
                                            addToRun(rMess, callData, this);
                                        }
                                    }
                                }
continue;
                            }
                            else
                            {
                                running=1;
                                rMess=removeFromToRun(callData, this);
                                if(rMess!=null)
                                {
                                    if(!Arrays.areEqual(((ByteArrayWrapper)rMess[0]).SID, HSystem.SID.SID) && !(rMess[1] instanceof MOThread) && !(rMess[1] instanceof CommunicationManagedObject))
                                    {
                                        runNonThreadSearch=true;
                                    }
                                }
                            }
                        }
                    }
                    else
                    {
                        running=1;
                        rMess=removeFromToRun(callData, this);
                        if(rMess!=null)
                        {
                            if(!Arrays.areEqual(((ByteArrayWrapper)rMess[0]).SID, HSystem.SID.SID) && !(rMess[1] instanceof MOThread) && !(rMess[1] instanceof CommunicationManagedObject))
                            {
                                runNonThreadSearch=true;
                            }
                        }
                    }
                    if(rMess!=null)
                    {
                        rMess=(Object[])rMess[4];
                        ((ByteArrayWrapper)rMess[0]).resetMethodCallCount();
                        ((ManagedObject)rMess[2]).receive(rMess, (ByteArrayWrapper)rMess[0], (ManagedObject)rMess[1]);
                    }
                    running=0;
                }
                else
                {
                    if(runNonThreadSearch && Math.random()<searchForgeinChance)
                    {
                        runNonThreadSearch=false;
                        setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(toRun.size()+(int)Math.pow(toRunAfterDelay.size(), 0.125))))%Integer.MIN_VALUE, callData, this);
                        running=0;
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate(callData, this, new Object[]{callData,this, this, -2146483647,threadAttributes,threadMinimumAttributes,threadMaximumAttributes,threadWeights, 1,HSystem.defaultNumCheckNodes/10, false}, 1, -2146483637, true, true, new Object[]{callData,sid,threadMinimumAttributes,threadMaximumAttributes,threadWeights,threadAttributes,delaySleepTime,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, callData, this);
                            $_MANAGED_object_COMPILER_RETURN_VALUE_$=latticeSearch(threadAttributes, threadMinimumAttributes, threadMaximumAttributes, threadWeights, 1, HSystem.defaultNumCheckNodes/10, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                           
                        if(toRunAfterDelay.isEmpty() && toRun.isEmpty())
                        {
                            synchronized(this)
                            {
                                wait(HSystem.tSleepTime);
                            }
                        }
                    }
                    else
                    {
                        runNonThreadSearch=false;
                        running=0;
MOThread worstMOThread=HSystem.getWorstMOThread();
                        if(worstMOThread!=null && !worstMOThread.equals(this))
                        {
Object[] newRunMessage=worstMOThread.removeFromToRun(callData, this);
                            if(newRunMessage!=null)
                            {
                                addToRun(newRunMessage, callData, this);
                            }
                            else
                            {
                                newRunMessage=worstMOThread.removeFromToRunAfterDelay(callData, this);
                                if(newRunMessage!=null)
                                {
                                    addToRun(newRunMessage, callData, this);
                                }
                            }
                        }
                        if(toRunAfterDelay.isEmpty() && toRun.isEmpty())
                        {
                            synchronized(this)
                            {
                                wait(HSystem.tSleepTime);
                            }
                        }
                    }
                }
            }
            catch(Exception e)
            {
                Logger.getLogger(MOThread.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483646)
    protected Object[] removeFromToRun(ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        synchronized(toRun)
        {
            if(!toRun.isEmpty()
 && ($_MANAGED_object_COMPILER_DATA_$.equalsSID(getSID()) || !((ByteArrayWrapper)toRun.get(0)[0]).equalsSID(getSID())))
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$=getSID();
                $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$.toggleNoAggregateThenCall();
                setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(toRun.size()-1+(int)Math.pow(toRunAfterDelay.size(), 0.125))))%Integer.MIN_VALUE, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$, this);
                return toRun.remove(0);
            }
            else
            {
                return null;
            }
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483645)
    protected Object[] removeFromToRunAfterDelay(ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483645,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        synchronized(toRunAfterDelay)
        {
            if(!toRunAfterDelay.isEmpty()
 && ($_MANAGED_object_COMPILER_DATA_$.equalsSID(getSID()) || !((ByteArrayWrapper)toRun.get(0)[0]).equalsSID(getSID())))
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$=getSID();
                $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$.toggleNoAggregateThenCall();
                setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(toRun.size()+(int)Math.pow(toRunAfterDelay.size()-1, 0.125))))%Integer.MIN_VALUE, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$, this);
                return toRunAfterDelay.remove(0);
            }
            else
            {
                return null;
            }
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483644)
    public synchronized void addToRun(Object[] toAddToRun, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483644,toAddToRun,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        if(toAddToRun!=null && toRun!=null)
        {
            if(((ByteArrayWrapper)toAddToRun[0]).isToRunAfterDelay())
            {
                synchronized(toRunAfterDelay)
                {
int pos=Collections.binarySearch(toRunAfterDelay, toAddToRun, new CompareTimeMessage());
                    if(pos<0)
                    {
                        pos=-(pos+1);
                    }
                    toRunAfterDelay.add(pos, toAddToRun);
                }
            }
            else
            {
                synchronized(toRun)
                {
                    toRun.add(toAddToRun);
                }
            }
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$=getSID();
            $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$.toggleNoAggregateThenCall();
            setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(toRun.size()+(int)Math.pow(toRunAfterDelay.size(), 0.125))))%Integer.MIN_VALUE, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$, this);
            notify();
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483643)
    private void increaseSearchForgeinChance()
    {
        searchForgeinChance*=1.2;
        if(searchForgeinChance>0.01)
        {
            searchForgeinChance=0.01;
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483642)
    private void decreaseSearchForgeinChance()
    {
        searchForgeinChance/=2;
        if(searchForgeinChance==0)
        {
            searchForgeinChance=Double.MIN_NORMAL;
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    private MOThread($_MANAGED_object_COMPILER_DUMMY_VARIABLE_$ $_MANAGED_object_COMPILER_DUMMY_variable_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(MOThread.class))
        {
            addPermission(permission, null, this);
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483641)
	public
    static   Object $_MANAGED_object_COMPILER_CREATE_METHOD_$(ManagedObject masterMO, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
MOThread $_MANAGED_object_COMPILER_CREATED_Object_$=new MOThread(new $_MANAGED_object_COMPILER_DUMMY_VARIABLE_$());
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            $_MANAGED_object_COMPILER_CREATED_Object_$.addPermission(permission, null, $_MANAGED_object_COMPILER_CREATED_Object_$);
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483641);
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
;
        $_MANAGED_object_COMPILER_CREATED_Object_$.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(masterMO, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_COMPILER_CREATED_Object_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,$_MANAGED_object_COMPILER_CREATED_Object_$};
        return null;
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483640)
    public MOThread $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(ManagedObject masterMO, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(MOThread.class))
        {
            addPermission(permission, null, this);
        }
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483640,masterMO,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483640);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483640,masterMO}, 1, -2146483636, true, true, new Object[]{masterMO,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=super.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(masterMO, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
Thread MOT=new Thread(this);
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483640, new int[1]}, 1, -2146483639, true, true, new Object[]{MOT,masterMO,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=addAttributes(new int[1], $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
        MOT.start();
        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$, this};
        if($_MANAGED_object_COMPILER_DATA_$.sendToMOThread())
        {
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_$=latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
            if(!($_MANAGED_object_COMPILER_SEARCH_RESULT_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_$[0].mO instanceof MOThread))
            {
                $_MANAGED_object_COMPILER_SEARCH_RESULT_$=new Node[]{new Node(HSystem.getBestMOThread())};
            }
            ((MOThread)($_MANAGED_object_COMPILER_SEARCH_RESULT_$[0].mO)).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_$, this, null, null, new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,$_MANAGED_object_COMPILER_RETURN_MESSAGE_$}}, $_MANAGED_object_COMPILER_DATA_$, this);
        }
        else
        {
            $_MANAGED_object_COMPILER_DATA_$.incrementMethodCallCount();
            ((ManagedObject)$_MANAGED_object_COMPILER_RETURN_MESSAGE_$[2]).aggregateThenCall($_MANAGED_object_COMPILER_RETURN_MESSAGE_$, $_MANAGED_object_COMPILER_DATA_$, this);
        }
        return null;
    }

    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483639)
    private Object $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_21(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483640,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483640);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Thread MOT;
ManagedObject masterMO;
        MOT=(Thread)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        masterMO=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
        MOT.start();
        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$, this};
        if($_MANAGED_object_COMPILER_DATA_$.sendToMOThread())
        {
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_$=latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
            if(!($_MANAGED_object_COMPILER_SEARCH_RESULT_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_$[0].mO instanceof MOThread))
            {
                $_MANAGED_object_COMPILER_SEARCH_RESULT_$=new Node[]{new Node(HSystem.getBestMOThread())};
            }
            ((MOThread)($_MANAGED_object_COMPILER_SEARCH_RESULT_$[0].mO)).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_$, this, null, null, new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,$_MANAGED_object_COMPILER_RETURN_MESSAGE_$}}, $_MANAGED_object_COMPILER_DATA_$, this);
        }
        else
        {
            $_MANAGED_object_COMPILER_DATA_$.incrementMethodCallCount();
            ((ManagedObject)$_MANAGED_object_COMPILER_RETURN_MESSAGE_$[2]).aggregateThenCall($_MANAGED_object_COMPILER_RETURN_MESSAGE_$, $_MANAGED_object_COMPILER_DATA_$, this);
        }
        return null;
    }
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483638)
    private void run_MANAGED_object_COMPILER_METHOD_137(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
$_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);

Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                                            if(threads!=null && threads[0].mO instanceof MOThread)
                                            {
Object[] newRunMessage=((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(newRunMessage!=null)
                                                {
                                                    addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                    searchForgeinChance=1;
                                                }
                                                else
                                                {
                                                    newRunMessage=((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                    if(newRunMessage!=null)
                                                    {
                                                        addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                        searchForgeinChance=1;
                                                    }
                                                    else
                                                    {
                                                        decreaseSearchForgeinChance();
                                                    }
                                                }
                                            }      
    }
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483637)
    private void run_MANAGED_object_COMPILER_METHOD_138(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
$_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);

Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                                if(threads!=null && threads[0].mO instanceof MOThread)
                                {
Object[] newRunMessage=((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                    if(newRunMessage!=null)
                                    {
                                        addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                        searchForgeinChance=1;
                                    }
                                    else
                                    {
                                        newRunMessage=((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(newRunMessage!=null)
                                        {
                                            addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                            searchForgeinChance=1;
                                        }
                                        else
                                        {
                                            decreaseSearchForgeinChance();
                                        }
                                    }
                                }
    }
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483636)
    private Object $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_244(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483640,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483640);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
ManagedObject masterMO;
        masterMO=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
Thread MOT=new Thread(this);
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483640, new int[1]}, 1, -2146483639, true, true, new Object[]{MOT,masterMO,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=addAttributes(new int[1], $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
        MOT.start();
        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$, this};
        if($_MANAGED_object_COMPILER_DATA_$.sendToMOThread())
        {
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_$=latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
            if(!($_MANAGED_object_COMPILER_SEARCH_RESULT_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_$[0].mO instanceof MOThread))
            {
                $_MANAGED_object_COMPILER_SEARCH_RESULT_$=new Node[]{new Node(HSystem.getBestMOThread())};
            }
            ((MOThread)($_MANAGED_object_COMPILER_SEARCH_RESULT_$[0].mO)).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_$, this, null, null, new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,$_MANAGED_object_COMPILER_RETURN_MESSAGE_$}}, $_MANAGED_object_COMPILER_DATA_$, this);
        }
        else
        {
            $_MANAGED_object_COMPILER_DATA_$.incrementMethodCallCount();
            ((ManagedObject)$_MANAGED_object_COMPILER_RETURN_MESSAGE_$[2]).aggregateThenCall($_MANAGED_object_COMPILER_RETURN_MESSAGE_$, $_MANAGED_object_COMPILER_DATA_$, this);
        }
        return null;
    }
public static final int $_MANAGED_object_COMPILER_MOThread_$=2147483647;
public static final int $_MANAGED_object_COMPILER_MOThread_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2146483648;
public static final int $_MANAGED_object_COMPILER_run_ByteArrayWrapper_ManagedObject_$=-2146483647;
public static final int $_MANAGED_object_COMPILER_removeFromToRun_ByteArrayWrapper_ManagedObject_$=-2146483646;
public static final int $_MANAGED_object_COMPILER_removeFromToRunAfterDelay_ByteArrayWrapper_ManagedObject_$=-2146483645;
public static final int $_MANAGED_object_COMPILER_addToRun_Object$$_ByteArrayWrapper_ManagedObject_$=-2146483644;
public static final int $_MANAGED_object_COMPILER_increaseSearchForgeinChance_$=-2146483643;
public static final int $_MANAGED_object_COMPILER_decreaseSearchForgeinChance_$=-2146483642;
public static final int $_MANAGED_object_COMPILER_MOThread_$_MANAGED_object_COMPILER_DUMMY_VARIABLE_$_$=2147483647;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CREATE_METHOD_$_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2146483641;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2146483640;
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public void MANAGED_object_COMPILER_RUN(Object[] message, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        switch((int)message[3])
        {
            case -2146483647:
                //run((ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483646:
                removeFromToRun((ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483645:
                removeFromToRunAfterDelay((ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483644:
                addToRun((Object[])message[4], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483639:
                $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_21((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483638:
                run_MANAGED_object_COMPILER_METHOD_137((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483637:
                run_MANAGED_object_COMPILER_METHOD_138((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483636:
                $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_244((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            default:
                super.MANAGED_object_COMPILER_RUN(message, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
    }
}


class CompareTimeMessage implements Comparator<Object[]>
{
	
	CompareTimeMessage()
	{		
	}

	@Override
	public int compare(Object[] delayMessageA, Object[] delayMessageB) 
	{
		if((long)delayMessageA[5]+(long)delayMessageA[6]>(long)delayMessageB[5]+(long)delayMessageB[6])
		{
			return 1;
		}
		else if((long)delayMessageA[5]+(long)delayMessageA[6]<(long)delayMessageB[5]+(long)delayMessageB[6])
		{
			return -1;		
		}
		else
		{
			return 0;
		}
	}
	
}
