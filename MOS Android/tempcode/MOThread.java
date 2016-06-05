
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

public static final byte[] $_MANAGED_object_COMPILER_CLASS_ID_$=new byte[]{104, -38, 74, -11, -80, 65, -103, 120, 74, -52, 85, -114, 24, 116, -26, -20, -128, 60, -71, -29, -5, -48, 85, 103, 54, -52, -41, 99, -89, -94, 59, 22};
static final long serialVersionUID=7555433743951960440L;
    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public void MOThread() throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(ManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(MOThread.class))
        {
            void addPermission(permission, null, this);
        }
    }

    
private static final int queueScaleFactor=10000;
protected final List<Object[]> toRun=new void ArrayList<>();
protected final List<Object[]> toRunAfterDelay=new void ArrayList<>();
protected volatile Object[] rMess=null;
protected volatile Object[] tempMessage=null;
protected long sleepTime=HSystem.tSleepTime;
protected long time=void System.currentTimeMillis();
protected volatile int running=-1;
protected volatile int runningDelay=0;
protected volatile boolean runNonThreadSearch=true;
private double searchForgeinChance=0.0001;
    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483648)
    protected void MOThread(ManagedObject masterMO, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(ManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(MOThread.class))
        {
            void addPermission(permission, null, this);
        }
        void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483648);
        void $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483647)
    public void run(ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        void $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
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
        void System.arraycopy(void ManagedObjectUtilities.b10ToB8(mOAttributes[7]), 0, sid, 0, 4);
        void System.arraycopy(void ManagedObjectUtilities.b10ToB8(mOAttributes[8]), 0, sid, 4, 4);
        void System.arraycopy(void ManagedObjectUtilities.b10ToB8(mOAttributes[9]), 0, sid, 8, 4);
        void System.arraycopy(void ManagedObjectUtilities.b10ToB8(mOAttributes[10]), 0, sid, 12, 4);
        void System.arraycopy(void ManagedObjectUtilities.b10ToB8(mOAttributes[11]), 0, sid, 16, 4);
        void System.arraycopy(void ManagedObjectUtilities.b10ToB8(mOAttributes[12]), 0, sid, 20, 4);
        void System.arraycopy(void ManagedObjectUtilities.b10ToB8(mOAttributes[13]), 0, sid, 24, 4);
        void System.arraycopy(void ManagedObjectUtilities.b10ToB8(mOAttributes[14]), 0, sid, 28, 4);
ByteArrayWrapper callData=new void ByteArrayWrapper(sid);
        while(true)
        {
            try
            {
                runningDelay=1;
                if(!toRunAfterDelay.void isEmpty() || !void toRun.isEmpty())
                {
                    rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                    if(rMess!=null)
                    {
                        if((long)rMess[5]+(long)rMess[6]>=void System.nanoTime())
                        {
                            runningDelay=0;
                            void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                            if(void toRun.isEmpty())
                            {
                                if(runNonThreadSearch && void Math.random()<searchForgeinChance)
                                {
                                    runNonThreadSearch=false;
                                    void setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(void toRun.size()+(int)void Math.pow(void toRunAfterDelay.size(), 0.125))))%Integer.MIN_VALUE, $_MANAGED_object_COMPILER_DATA_$, this);
                                    if(true)
                                    {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,threadAttributes,threadMinimumAttributes,threadMaximumAttributes,threadWeights, 1,HSystem.defaultNumCheckNodes/10, false}, 1, -2146483638, true, true, new Object[]{callData,sid,threadMinimumAttributes,threadMaximumAttributes,threadWeights,threadAttributes,delaySleepTime,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                        $_MANAGED_object_COMPILER_RETURN_VALUE_$=void latticeSearch(threadAttributes, threadMinimumAttributes, threadMaximumAttributes, threadWeights, 1, HSystem.defaultNumCheckNodes/10, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                        return null;
                                    }
                                    if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                    {
    throw new void TimeOutException();
                                    }
Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                                    if(threads!=null && threads[0].mO instanceof MOThread)
                                    {
Object[] newRunMessage=void ((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(newRunMessage!=null)
                                        {
                                            void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                            searchForgeinChance=1;
                                        }
                                        else
                                        {
                                            newRunMessage=void ((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                            if(newRunMessage!=null)
                                            {
                                                void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                searchForgeinChance=1;
                                            }
                                            else
                                            {
                                                void decreaseSearchForgeinChance();
                                            }
                                        }
                                    }
                                    if(void toRun.isEmpty())
                                    {
                                        rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(rMess!=null)
                                        {
                                            if((delaySleepTime=((long)rMess[5]+(long)rMess[6]-void System.nanoTime())/1000000)>0)
                                            {
                                                synchronized(this)
                                                {
                                                    void wait(delaySleepTime);
                                                }
                                            }
                                            void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                        }
                                    }
                                }
                                else
                                {
                                    runNonThreadSearch=false;
MOThread worstMOThread=void HSystem.getWorstMOThread();
                                    if(worstMOThread!=null && !void worstMOThread.equals(this))
                                    {
Object[] newRunMessage=void worstMOThread.removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(newRunMessage!=null)
                                        {
                                            void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                        }
                                        else
                                        {
                                            newRunMessage=void worstMOThread.removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                            if(newRunMessage!=null)
                                            {
                                                void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                            }
                                        }
                                    }
                                    if(void toRun.isEmpty())
                                    {
                                        rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(rMess!=null)
                                        {
                                            if((delaySleepTime=((long)rMess[5]+(long)rMess[6]-void System.nanoTime())/1000000)>0)
                                            {
                                                synchronized(this)
                                                {
                                                    void wait(delaySleepTime);
                                                }
                                            }
                                            void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                        }
                                    }
                                }
continue;
                            }
                            else
                            {
                                running=1;
                                rMess=void removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                if(rMess!=null)
                                {
                                    if(!Arrays.void areEqual(((ByteArrayWrapper)rMess[0]).SID, HSystem.SID.SID) && !(rMess[1] instanceof MOThread) && !(rMess[1] instanceof CommunicationManagedObject))
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
                        rMess=void removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                        if(rMess!=null)
                        {
                            if(!Arrays.void areEqual(((ByteArrayWrapper)rMess[0]).SID, HSystem.SID.SID) && !(rMess[1] instanceof MOThread) && !(rMess[1] instanceof CommunicationManagedObject))
                            {
                                runNonThreadSearch=true;
                            }
                        }
                    }
                    if(rMess!=null)
                    {
                        rMess=(Object[])rMess[4];
                        void ((ByteArrayWrapper)rMess[0]).resetMethodCallCount();
                        void ((ManagedObject)rMess[2]).receive(rMess, (ByteArrayWrapper)rMess[0], (ManagedObject)rMess[1]);
                    }
                    running=0;
                }
                else
                {
                    if(runNonThreadSearch && void Math.random()<searchForgeinChance)
                    {
                        runNonThreadSearch=false;
                        void setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(void toRun.size()+(int)void Math.pow(void toRunAfterDelay.size(), 0.125))))%Integer.MIN_VALUE, $_MANAGED_object_COMPILER_DATA_$, this);
                        running=0;
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,threadAttributes,threadMinimumAttributes,threadMaximumAttributes,threadWeights, 1,HSystem.defaultNumCheckNodes/10, false}, 1, -2146483637, true, true, new Object[]{callData,sid,threadMinimumAttributes,threadMaximumAttributes,threadWeights,threadAttributes,delaySleepTime,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            $_MANAGED_object_COMPILER_RETURN_VALUE_$=void latticeSearch(threadAttributes, threadMinimumAttributes, threadMaximumAttributes, threadWeights, 1, HSystem.defaultNumCheckNodes/10, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new void TimeOutException();
                        }
Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                        if(threads!=null && threads[0].mO instanceof MOThread)
                        {
Object[] newRunMessage=void ((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                            if(newRunMessage!=null)
                            {
                                void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                searchForgeinChance=1;
                            }
                            else
                            {
                                newRunMessage=void ((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                if(newRunMessage!=null)
                                {
                                    void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                    searchForgeinChance=1;
                                }
                                else
                                {
                                    void decreaseSearchForgeinChance();
                                }
                            }
                        }
                        if(void toRunAfterDelay.isEmpty() && void toRun.isEmpty())
                        {
                            synchronized(this)
                            {
                                void wait(HSystem.tSleepTime);
                            }
                        }
                    }
                    else
                    {
                        runNonThreadSearch=false;
                        running=0;
MOThread worstMOThread=void HSystem.getWorstMOThread();
                        if(worstMOThread!=null && !void worstMOThread.equals(this))
                        {
Object[] newRunMessage=void worstMOThread.removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                            if(newRunMessage!=null)
                            {
                                void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                            }
                            else
                            {
                                newRunMessage=void worstMOThread.removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                if(newRunMessage!=null)
                                {
                                    void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                }
                            }
                        }
                        if(void toRunAfterDelay.isEmpty() && void toRun.isEmpty())
                        {
                            synchronized(this)
                            {
                                void wait(HSystem.tSleepTime);
                            }
                        }
                    }
                }
            }
            catch(Exception e)
            {
                void Logger.getLogger(void MOThread.class.getName()).void log(Level.SEVERE, null, e);
            }
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483646)
    protected void removeFromToRun(ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new void MOPermissionDeniedException();
        }
        synchronized(toRun)
        {
            if(!toRun.void isEmpty()
 && (void $_MANAGED_object_COMPILER_DATA_$.equalsSID(void getSID()) || !void ((ByteArrayWrapper)void toRun.get(0)[0]).equalsSID(void getSID())))
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$=void getSID();
                void $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$.toggleNoAggregateThenCall();
                void setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(void toRun.size()-1+(int)void Math.pow(void toRunAfterDelay.size(), 0.125))))%Integer.MIN_VALUE, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$, this);
                return void toRun.remove(0);
            }
            else
            {
                return null;
            }
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483645)
    protected void removeFromToRunAfterDelay(ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483645,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new void MOPermissionDeniedException();
        }
        synchronized(toRunAfterDelay)
        {
            if(!toRunAfterDelay.void isEmpty()
 && (void $_MANAGED_object_COMPILER_DATA_$.equalsSID(void getSID()) || !void ((ByteArrayWrapper)void toRun.get(0)[0]).equalsSID(void getSID())))
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$=void getSID();
                void $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$.toggleNoAggregateThenCall();
                void setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(void toRun.size()+(int)void Math.pow(void toRunAfterDelay.size()-1, 0.125))))%Integer.MIN_VALUE, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$, this);
                return void toRunAfterDelay.remove(0);
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
    throw new void MOPermissionDeniedException();
        }
        if(toAddToRun!=null && toRun!=null)
        {
            if(void ((ByteArrayWrapper)toAddToRun[0]).isToRunAfterDelay())
            {
                synchronized(toRunAfterDelay)
                {
int pos=void Collections.binarySearch(toRunAfterDelay, toAddToRun, new void CompareTimeMessage());
                    if(pos<0)
                    {
                        pos=-(pos+1);
                    }
                    void toRunAfterDelay.add(pos, toAddToRun);
                }
            }
            else
            {
                synchronized(toRun)
                {
                    void toRun.add(toAddToRun);
                }
            }
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$=void getSID();
            void $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$.toggleNoAggregateThenCall();
            void setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(void toRun.size()+(int)void Math.pow(void toRunAfterDelay.size(), 0.125))))%Integer.MIN_VALUE, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$, this);
            void notify();
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
    private void MOThread($_MANAGED_object_COMPILER_DUMMY_VARIABLE_$ $_MANAGED_object_COMPILER_DUMMY_variable_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(ManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(MOThread.class))
        {
            void addPermission(permission, null, this);
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483641)
    protected static   void $_MANAGED_object_COMPILER_CREATE_METHOD_$(ManagedObject masterMO, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
MOThread $_MANAGED_object_COMPILER_CREATED_Object_$=new void MOThread(new void $_MANAGED_object_COMPILER_DUMMY_VARIABLE_$());
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(ManagedObject.class))
        {
            void $_MANAGED_object_COMPILER_CREATED_Object_$.addPermission(permission, null, $_MANAGED_object_COMPILER_CREATED_Object_$);
        }
        void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483641);
        void $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
;
        void $_MANAGED_object_COMPILER_CREATED_Object_$.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(masterMO, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_COMPILER_CREATED_Object_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,$_MANAGED_object_COMPILER_CREATED_Object_$};
        return null;
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483640)
    public void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(ManagedObject masterMO, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(MOThread.class))
        {
            void addPermission(permission, null, this);
        }
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483640,masterMO,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new void MOPermissionDeniedException();
        }
        void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483640);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        void $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483640,masterMO}, 1, -2146483636, true, true, new Object[]{masterMO,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=void super.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(masterMO, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
        }
Thread MOT=new void Thread(this);
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483640, new int[1]}, 1, -2146483639, true, true, new Object[]{MOT,masterMO,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=void addAttributes(new int[1], $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
        }
        void MOT.start();
        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$, this};
        if(void $_MANAGED_object_COMPILER_DATA_$.sendToMOThread())
        {
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_$=void latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
            if(!($_MANAGED_object_COMPILER_SEARCH_RESULT_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_$[0].mO instanceof MOThread))
            {
                $_MANAGED_object_COMPILER_SEARCH_RESULT_$=new Node[]{new void Node(void HSystem.getBestMOThread())};
            }
            void ((MOThread)($_MANAGED_object_COMPILER_SEARCH_RESULT_$[0].mO)).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_$, this, null, null, new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,$_MANAGED_object_COMPILER_RETURN_MESSAGE_$}}, $_MANAGED_object_COMPILER_DATA_$, this);
        }
        else
        {
            void $_MANAGED_object_COMPILER_DATA_$.incrementMethodCallCount();
            void ((ManagedObject)$_MANAGED_object_COMPILER_RETURN_MESSAGE_$[2]).aggregateThenCall($_MANAGED_object_COMPILER_RETURN_MESSAGE_$, $_MANAGED_object_COMPILER_DATA_$, this);
        }
        return null;
    }

    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483639)
    private void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_21(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483640,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new void MOPermissionDeniedException();
        }
        void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483640);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=void ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Thread MOT;
ManagedObject masterMO;
        MOT=(Thread)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        masterMO=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
        }
        void MOT.start();
        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$, this};
        if(void $_MANAGED_object_COMPILER_DATA_$.sendToMOThread())
        {
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_$=void latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
            if(!($_MANAGED_object_COMPILER_SEARCH_RESULT_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_$[0].mO instanceof MOThread))
            {
                $_MANAGED_object_COMPILER_SEARCH_RESULT_$=new Node[]{new void Node(void HSystem.getBestMOThread())};
            }
            void ((MOThread)($_MANAGED_object_COMPILER_SEARCH_RESULT_$[0].mO)).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_$, this, null, null, new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,$_MANAGED_object_COMPILER_RETURN_MESSAGE_$}}, $_MANAGED_object_COMPILER_DATA_$, this);
        }
        else
        {
            void $_MANAGED_object_COMPILER_DATA_$.incrementMethodCallCount();
            void ((ManagedObject)$_MANAGED_object_COMPILER_RETURN_MESSAGE_$[2]).aggregateThenCall($_MANAGED_object_COMPILER_RETURN_MESSAGE_$, $_MANAGED_object_COMPILER_DATA_$, this);
        }
        return null;
    }
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483638)
    private void run_MANAGED_object_COMPILER_METHOD_137(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=void ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
ByteArrayWrapper callData;
byte[] sid;
int[] threadMinimumAttributes;
int[] threadMaximumAttributes;
int[] threadWeights;
int[] threadAttributes;
long delaySleepTime;
        callData=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        sid=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
        threadMinimumAttributes=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
        threadMaximumAttributes=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
        threadWeights=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
        threadAttributes=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
        delaySleepTime=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
        while($_MANAGED_object_COMPILER_FIRST_LOOP_$ || (true))
        {
            if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
            {
                try
                {
                    if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                    {
                        if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                        {
                            if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                            {
                                if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                                {
                                    if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                                    {
                                        if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                                        {
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                                            if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                                            {
                                                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                                            }
                                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                            {
    throw new void TimeOutException();
                                            }
Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                                            if(threads!=null && threads[0].mO instanceof MOThread)
                                            {
Object[] newRunMessage=void ((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(newRunMessage!=null)
                                                {
                                                    void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                    searchForgeinChance=1;
                                                }
                                                else
                                                {
                                                    newRunMessage=void ((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                    if(newRunMessage!=null)
                                                    {
                                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                        searchForgeinChance=1;
                                                    }
                                                    else
                                                    {
                                                        void decreaseSearchForgeinChance();
                                                    }
                                                }
                                            }
                                            if(void toRun.isEmpty())
                                            {
                                                rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(rMess!=null)
                                                {
                                                    if((delaySleepTime=((long)rMess[5]+(long)rMess[6]-void System.nanoTime())/1000000)>0)
                                                    {
                                                        synchronized(this)
                                                        {
                                                            void wait(delaySleepTime);
                                                        }
                                                    }
                                                    void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                                }
                                            }
                                        }
continue;
                                    }
                                }
                            }
                            if(rMess!=null)
                            {
                                rMess=(Object[])rMess[4];
                                void ((ByteArrayWrapper)rMess[0]).resetMethodCallCount();
                                void ((ManagedObject)rMess[2]).receive(rMess, (ByteArrayWrapper)rMess[0], (ManagedObject)rMess[1]);
                            }
                            running=0;
                        }
                    }
                    else
                    {
                        runningDelay=1;
                        if(!toRunAfterDelay.void isEmpty() || !void toRun.isEmpty())
                        {
                            rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                            if(rMess!=null)
                            {
                                if((long)rMess[5]+(long)rMess[6]>=void System.nanoTime())
                                {
                                    runningDelay=0;
                                    void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                    if(void toRun.isEmpty())
                                    {
                                        if(runNonThreadSearch && void Math.random()<searchForgeinChance)
                                        {
                                            runNonThreadSearch=false;
                                            void setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(void toRun.size()+(int)void Math.pow(void toRunAfterDelay.size(), 0.125))))%Integer.MIN_VALUE, $_MANAGED_object_COMPILER_DATA_$, this);
                                            if(true)
                                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,threadAttributes,threadMinimumAttributes,threadMaximumAttributes,threadWeights, 1,HSystem.defaultNumCheckNodes/10, false}, 1, -2146483638, true, true, new Object[]{callData,sid,threadMinimumAttributes,threadMaximumAttributes,threadWeights,threadAttributes,delaySleepTime,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                                $_MANAGED_object_COMPILER_RETURN_VALUE_$=void latticeSearch(threadAttributes, threadMinimumAttributes, threadMaximumAttributes, threadWeights, 1, HSystem.defaultNumCheckNodes/10, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                                return null;
                                            }
                                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                            {
    throw new void TimeOutException();
                                            }
Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                                            if(threads!=null && threads[0].mO instanceof MOThread)
                                            {
Object[] newRunMessage=void ((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(newRunMessage!=null)
                                                {
                                                    void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                    searchForgeinChance=1;
                                                }
                                                else
                                                {
                                                    newRunMessage=void ((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                    if(newRunMessage!=null)
                                                    {
                                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                        searchForgeinChance=1;
                                                    }
                                                    else
                                                    {
                                                        void decreaseSearchForgeinChance();
                                                    }
                                                }
                                            }
                                            if(void toRun.isEmpty())
                                            {
                                                rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(rMess!=null)
                                                {
                                                    if((delaySleepTime=((long)rMess[5]+(long)rMess[6]-void System.nanoTime())/1000000)>0)
                                                    {
                                                        synchronized(this)
                                                        {
                                                            void wait(delaySleepTime);
                                                        }
                                                    }
                                                    void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                                }
                                            }
                                        }
                                        else
                                        {
                                            runNonThreadSearch=false;
MOThread worstMOThread=void HSystem.getWorstMOThread();
                                            if(worstMOThread!=null && !void worstMOThread.equals(this))
                                            {
Object[] newRunMessage=void worstMOThread.removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(newRunMessage!=null)
                                                {
                                                    void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                }
                                                else
                                                {
                                                    newRunMessage=void worstMOThread.removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                    if(newRunMessage!=null)
                                                    {
                                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                    }
                                                }
                                            }
                                            if(void toRun.isEmpty())
                                            {
                                                rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(rMess!=null)
                                                {
                                                    if((delaySleepTime=((long)rMess[5]+(long)rMess[6]-void System.nanoTime())/1000000)>0)
                                                    {
                                                        synchronized(this)
                                                        {
                                                            void wait(delaySleepTime);
                                                        }
                                                    }
                                                    void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                                }
                                            }
                                        }
continue;
                                    }
                                    else
                                    {
                                        running=1;
                                        rMess=void removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(rMess!=null)
                                        {
                                            if(!Arrays.void areEqual(((ByteArrayWrapper)rMess[0]).SID, HSystem.SID.SID) && !(rMess[1] instanceof MOThread) && !(rMess[1] instanceof CommunicationManagedObject))
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
                                rMess=void removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                if(rMess!=null)
                                {
                                    if(!Arrays.void areEqual(((ByteArrayWrapper)rMess[0]).SID, HSystem.SID.SID) && !(rMess[1] instanceof MOThread) && !(rMess[1] instanceof CommunicationManagedObject))
                                    {
                                        runNonThreadSearch=true;
                                    }
                                }
                            }
                            if(rMess!=null)
                            {
                                rMess=(Object[])rMess[4];
                                void ((ByteArrayWrapper)rMess[0]).resetMethodCallCount();
                                void ((ManagedObject)rMess[2]).receive(rMess, (ByteArrayWrapper)rMess[0], (ManagedObject)rMess[1]);
                            }
                            running=0;
                        }
                        else
                        {
                            if(runNonThreadSearch && void Math.random()<searchForgeinChance)
                            {
                                runNonThreadSearch=false;
                                void setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(void toRun.size()+(int)void Math.pow(void toRunAfterDelay.size(), 0.125))))%Integer.MIN_VALUE, $_MANAGED_object_COMPILER_DATA_$, this);
                                running=0;
                                if(true)
                                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,threadAttributes,threadMinimumAttributes,threadMaximumAttributes,threadWeights, 1,HSystem.defaultNumCheckNodes/10, false}, 1, -2146483637, true, true, new Object[]{callData,sid,threadMinimumAttributes,threadMaximumAttributes,threadWeights,threadAttributes,delaySleepTime,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=void latticeSearch(threadAttributes, threadMinimumAttributes, threadMaximumAttributes, threadWeights, 1, HSystem.defaultNumCheckNodes/10, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                    return null;
                                }
                                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                {
    throw new void TimeOutException();
                                }
Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                                if(threads!=null && threads[0].mO instanceof MOThread)
                                {
Object[] newRunMessage=void ((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                    if(newRunMessage!=null)
                                    {
                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                        searchForgeinChance=1;
                                    }
                                    else
                                    {
                                        newRunMessage=void ((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(newRunMessage!=null)
                                        {
                                            void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                            searchForgeinChance=1;
                                        }
                                        else
                                        {
                                            void decreaseSearchForgeinChance();
                                        }
                                    }
                                }
                                if(void toRunAfterDelay.isEmpty() && void toRun.isEmpty())
                                {
                                    synchronized(this)
                                    {
                                        void wait(HSystem.tSleepTime);
                                    }
                                }
                            }
                            else
                            {
                                runNonThreadSearch=false;
                                running=0;
MOThread worstMOThread=void HSystem.getWorstMOThread();
                                if(worstMOThread!=null && !void worstMOThread.equals(this))
                                {
Object[] newRunMessage=void worstMOThread.removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                    if(newRunMessage!=null)
                                    {
                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                    }
                                    else
                                    {
                                        newRunMessage=void worstMOThread.removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(newRunMessage!=null)
                                        {
                                            void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                        }
                                    }
                                }
                                if(void toRunAfterDelay.isEmpty() && void toRun.isEmpty())
                                {
                                    synchronized(this)
                                    {
                                        void wait(HSystem.tSleepTime);
                                    }
                                }
                            }
                        }
                    }
                }
                catch(Exception e)
                {
                    void Logger.getLogger(void MOThread.class.getName()).void log(Level.SEVERE, null, e);
                }
            }
            else
            {
                try
                {
                    if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                    {
                        if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                        {
                            if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                            {
                                if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                                {
                                    if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                                    {
                                        if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                                        {
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                                            if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                                            {
                                                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                                            }
                                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                            {
    throw new void TimeOutException();
                                            }
Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                                            if(threads!=null && threads[0].mO instanceof MOThread)
                                            {
Object[] newRunMessage=void ((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(newRunMessage!=null)
                                                {
                                                    void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                    searchForgeinChance=1;
                                                }
                                                else
                                                {
                                                    newRunMessage=void ((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                    if(newRunMessage!=null)
                                                    {
                                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                        searchForgeinChance=1;
                                                    }
                                                    else
                                                    {
                                                        void decreaseSearchForgeinChance();
                                                    }
                                                }
                                            }
                                            if(void toRun.isEmpty())
                                            {
                                                rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(rMess!=null)
                                                {
                                                    if((delaySleepTime=((long)rMess[5]+(long)rMess[6]-void System.nanoTime())/1000000)>0)
                                                    {
                                                        synchronized(this)
                                                        {
                                                            void wait(delaySleepTime);
                                                        }
                                                    }
                                                    void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                                }
                                            }
                                        }
continue;
                                    }
                                }
                            }
                            if(rMess!=null)
                            {
                                rMess=(Object[])rMess[4];
                                void ((ByteArrayWrapper)rMess[0]).resetMethodCallCount();
                                void ((ManagedObject)rMess[2]).receive(rMess, (ByteArrayWrapper)rMess[0], (ManagedObject)rMess[1]);
                            }
                            running=0;
                        }
                    }
                    else
                    {
                        runningDelay=1;
                        if(!toRunAfterDelay.void isEmpty() || !void toRun.isEmpty())
                        {
                            rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                            if(rMess!=null)
                            {
                                if((long)rMess[5]+(long)rMess[6]>=void System.nanoTime())
                                {
                                    runningDelay=0;
                                    void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                    if(void toRun.isEmpty())
                                    {
                                        if(runNonThreadSearch && void Math.random()<searchForgeinChance)
                                        {
                                            runNonThreadSearch=false;
                                            void setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(void toRun.size()+(int)void Math.pow(void toRunAfterDelay.size(), 0.125))))%Integer.MIN_VALUE, $_MANAGED_object_COMPILER_DATA_$, this);
                                            if(true)
                                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,threadAttributes,threadMinimumAttributes,threadMaximumAttributes,threadWeights, 1,HSystem.defaultNumCheckNodes/10, false}, 1, -2146483638, true, true, new Object[]{callData,sid,threadMinimumAttributes,threadMaximumAttributes,threadWeights,threadAttributes,delaySleepTime,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                                $_MANAGED_object_COMPILER_RETURN_VALUE_$=void latticeSearch(threadAttributes, threadMinimumAttributes, threadMaximumAttributes, threadWeights, 1, HSystem.defaultNumCheckNodes/10, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                                return null;
                                            }
                                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                            {
    throw new void TimeOutException();
                                            }
Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                                            if(threads!=null && threads[0].mO instanceof MOThread)
                                            {
Object[] newRunMessage=void ((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(newRunMessage!=null)
                                                {
                                                    void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                    searchForgeinChance=1;
                                                }
                                                else
                                                {
                                                    newRunMessage=void ((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                    if(newRunMessage!=null)
                                                    {
                                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                        searchForgeinChance=1;
                                                    }
                                                    else
                                                    {
                                                        void decreaseSearchForgeinChance();
                                                    }
                                                }
                                            }
                                            if(void toRun.isEmpty())
                                            {
                                                rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(rMess!=null)
                                                {
                                                    if((delaySleepTime=((long)rMess[5]+(long)rMess[6]-void System.nanoTime())/1000000)>0)
                                                    {
                                                        synchronized(this)
                                                        {
                                                            void wait(delaySleepTime);
                                                        }
                                                    }
                                                    void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                                }
                                            }
                                        }
                                        else
                                        {
                                            runNonThreadSearch=false;
MOThread worstMOThread=void HSystem.getWorstMOThread();
                                            if(worstMOThread!=null && !void worstMOThread.equals(this))
                                            {
Object[] newRunMessage=void worstMOThread.removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(newRunMessage!=null)
                                                {
                                                    void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                }
                                                else
                                                {
                                                    newRunMessage=void worstMOThread.removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                    if(newRunMessage!=null)
                                                    {
                                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                    }
                                                }
                                            }
                                            if(void toRun.isEmpty())
                                            {
                                                rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(rMess!=null)
                                                {
                                                    if((delaySleepTime=((long)rMess[5]+(long)rMess[6]-void System.nanoTime())/1000000)>0)
                                                    {
                                                        synchronized(this)
                                                        {
                                                            void wait(delaySleepTime);
                                                        }
                                                    }
                                                    void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                                }
                                            }
                                        }
continue;
                                    }
                                    else
                                    {
                                        running=1;
                                        rMess=void removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(rMess!=null)
                                        {
                                            if(!Arrays.void areEqual(((ByteArrayWrapper)rMess[0]).SID, HSystem.SID.SID) && !(rMess[1] instanceof MOThread) && !(rMess[1] instanceof CommunicationManagedObject))
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
                                rMess=void removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                if(rMess!=null)
                                {
                                    if(!Arrays.void areEqual(((ByteArrayWrapper)rMess[0]).SID, HSystem.SID.SID) && !(rMess[1] instanceof MOThread) && !(rMess[1] instanceof CommunicationManagedObject))
                                    {
                                        runNonThreadSearch=true;
                                    }
                                }
                            }
                            if(rMess!=null)
                            {
                                rMess=(Object[])rMess[4];
                                void ((ByteArrayWrapper)rMess[0]).resetMethodCallCount();
                                void ((ManagedObject)rMess[2]).receive(rMess, (ByteArrayWrapper)rMess[0], (ManagedObject)rMess[1]);
                            }
                            running=0;
                        }
                        else
                        {
                            if(runNonThreadSearch && void Math.random()<searchForgeinChance)
                            {
                                runNonThreadSearch=false;
                                void setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(void toRun.size()+(int)void Math.pow(void toRunAfterDelay.size(), 0.125))))%Integer.MIN_VALUE, $_MANAGED_object_COMPILER_DATA_$, this);
                                running=0;
                                if(true)
                                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,threadAttributes,threadMinimumAttributes,threadMaximumAttributes,threadWeights, 1,HSystem.defaultNumCheckNodes/10, false}, 1, -2146483637, true, true, new Object[]{callData,sid,threadMinimumAttributes,threadMaximumAttributes,threadWeights,threadAttributes,delaySleepTime,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=void latticeSearch(threadAttributes, threadMinimumAttributes, threadMaximumAttributes, threadWeights, 1, HSystem.defaultNumCheckNodes/10, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                    return null;
                                }
                                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                {
    throw new void TimeOutException();
                                }
Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                                if(threads!=null && threads[0].mO instanceof MOThread)
                                {
Object[] newRunMessage=void ((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                    if(newRunMessage!=null)
                                    {
                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                        searchForgeinChance=1;
                                    }
                                    else
                                    {
                                        newRunMessage=void ((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(newRunMessage!=null)
                                        {
                                            void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                            searchForgeinChance=1;
                                        }
                                        else
                                        {
                                            void decreaseSearchForgeinChance();
                                        }
                                    }
                                }
                                if(void toRunAfterDelay.isEmpty() && void toRun.isEmpty())
                                {
                                    synchronized(this)
                                    {
                                        void wait(HSystem.tSleepTime);
                                    }
                                }
                            }
                            else
                            {
                                runNonThreadSearch=false;
                                running=0;
MOThread worstMOThread=void HSystem.getWorstMOThread();
                                if(worstMOThread!=null && !void worstMOThread.equals(this))
                                {
Object[] newRunMessage=void worstMOThread.removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                    if(newRunMessage!=null)
                                    {
                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                    }
                                    else
                                    {
                                        newRunMessage=void worstMOThread.removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(newRunMessage!=null)
                                        {
                                            void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                        }
                                    }
                                }
                                if(void toRunAfterDelay.isEmpty() && void toRun.isEmpty())
                                {
                                    synchronized(this)
                                    {
                                        void wait(HSystem.tSleepTime);
                                    }
                                }
                            }
                        }
                    }
                }
                catch(Exception e)
                {
                    void Logger.getLogger(void MOThread.class.getName()).void log(Level.SEVERE, null, e);
                }
                try
                {
                    if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                    {
                        if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                        {
                            if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                            {
                                if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                                {
                                    if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                                    {
                                        if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                                        {
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                                            if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                                            {
                                                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                                            }
                                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                            {
    throw new void TimeOutException();
                                            }
Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                                            if(threads!=null && threads[0].mO instanceof MOThread)
                                            {
Object[] newRunMessage=void ((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(newRunMessage!=null)
                                                {
                                                    void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                    searchForgeinChance=1;
                                                }
                                                else
                                                {
                                                    newRunMessage=void ((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                    if(newRunMessage!=null)
                                                    {
                                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                        searchForgeinChance=1;
                                                    }
                                                    else
                                                    {
                                                        void decreaseSearchForgeinChance();
                                                    }
                                                }
                                            }
                                            if(void toRun.isEmpty())
                                            {
                                                rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(rMess!=null)
                                                {
                                                    if((delaySleepTime=((long)rMess[5]+(long)rMess[6]-void System.nanoTime())/1000000)>0)
                                                    {
                                                        synchronized(this)
                                                        {
                                                            void wait(delaySleepTime);
                                                        }
                                                    }
                                                    void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                                }
                                            }
                                        }
continue;
                                    }
                                }
                            }
                            if(rMess!=null)
                            {
                                rMess=(Object[])rMess[4];
                                void ((ByteArrayWrapper)rMess[0]).resetMethodCallCount();
                                void ((ManagedObject)rMess[2]).receive(rMess, (ByteArrayWrapper)rMess[0], (ManagedObject)rMess[1]);
                            }
                            running=0;
                        }
                    }
                    else
                    {
                        runningDelay=1;
                        if(!toRunAfterDelay.void isEmpty() || !void toRun.isEmpty())
                        {
                            rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                            if(rMess!=null)
                            {
                                if((long)rMess[5]+(long)rMess[6]>=void System.nanoTime())
                                {
                                    runningDelay=0;
                                    void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                    if(void toRun.isEmpty())
                                    {
                                        if(runNonThreadSearch && void Math.random()<searchForgeinChance)
                                        {
                                            runNonThreadSearch=false;
                                            void setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(void toRun.size()+(int)void Math.pow(void toRunAfterDelay.size(), 0.125))))%Integer.MIN_VALUE, $_MANAGED_object_COMPILER_DATA_$, this);
                                            if(true)
                                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,threadAttributes,threadMinimumAttributes,threadMaximumAttributes,threadWeights, 1,HSystem.defaultNumCheckNodes/10, false}, 1, -2146483638, true, true, new Object[]{callData,sid,threadMinimumAttributes,threadMaximumAttributes,threadWeights,threadAttributes,delaySleepTime,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                                $_MANAGED_object_COMPILER_RETURN_VALUE_$=void latticeSearch(threadAttributes, threadMinimumAttributes, threadMaximumAttributes, threadWeights, 1, HSystem.defaultNumCheckNodes/10, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                                return null;
                                            }
                                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                            {
    throw new void TimeOutException();
                                            }
Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                                            if(threads!=null && threads[0].mO instanceof MOThread)
                                            {
Object[] newRunMessage=void ((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(newRunMessage!=null)
                                                {
                                                    void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                    searchForgeinChance=1;
                                                }
                                                else
                                                {
                                                    newRunMessage=void ((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                    if(newRunMessage!=null)
                                                    {
                                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                        searchForgeinChance=1;
                                                    }
                                                    else
                                                    {
                                                        void decreaseSearchForgeinChance();
                                                    }
                                                }
                                            }
                                            if(void toRun.isEmpty())
                                            {
                                                rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(rMess!=null)
                                                {
                                                    if((delaySleepTime=((long)rMess[5]+(long)rMess[6]-void System.nanoTime())/1000000)>0)
                                                    {
                                                        synchronized(this)
                                                        {
                                                            void wait(delaySleepTime);
                                                        }
                                                    }
                                                    void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                                }
                                            }
                                        }
                                        else
                                        {
                                            runNonThreadSearch=false;
MOThread worstMOThread=void HSystem.getWorstMOThread();
                                            if(worstMOThread!=null && !void worstMOThread.equals(this))
                                            {
Object[] newRunMessage=void worstMOThread.removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(newRunMessage!=null)
                                                {
                                                    void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                }
                                                else
                                                {
                                                    newRunMessage=void worstMOThread.removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                    if(newRunMessage!=null)
                                                    {
                                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                    }
                                                }
                                            }
                                            if(void toRun.isEmpty())
                                            {
                                                rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(rMess!=null)
                                                {
                                                    if((delaySleepTime=((long)rMess[5]+(long)rMess[6]-void System.nanoTime())/1000000)>0)
                                                    {
                                                        synchronized(this)
                                                        {
                                                            void wait(delaySleepTime);
                                                        }
                                                    }
                                                    void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                                }
                                            }
                                        }
continue;
                                    }
                                    else
                                    {
                                        running=1;
                                        rMess=void removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(rMess!=null)
                                        {
                                            if(!Arrays.void areEqual(((ByteArrayWrapper)rMess[0]).SID, HSystem.SID.SID) && !(rMess[1] instanceof MOThread) && !(rMess[1] instanceof CommunicationManagedObject))
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
                                rMess=void removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                if(rMess!=null)
                                {
                                    if(!Arrays.void areEqual(((ByteArrayWrapper)rMess[0]).SID, HSystem.SID.SID) && !(rMess[1] instanceof MOThread) && !(rMess[1] instanceof CommunicationManagedObject))
                                    {
                                        runNonThreadSearch=true;
                                    }
                                }
                            }
                            if(rMess!=null)
                            {
                                rMess=(Object[])rMess[4];
                                void ((ByteArrayWrapper)rMess[0]).resetMethodCallCount();
                                void ((ManagedObject)rMess[2]).receive(rMess, (ByteArrayWrapper)rMess[0], (ManagedObject)rMess[1]);
                            }
                            running=0;
                        }
                        else
                        {
                            if(runNonThreadSearch && void Math.random()<searchForgeinChance)
                            {
                                runNonThreadSearch=false;
                                void setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(void toRun.size()+(int)void Math.pow(void toRunAfterDelay.size(), 0.125))))%Integer.MIN_VALUE, $_MANAGED_object_COMPILER_DATA_$, this);
                                running=0;
                                if(true)
                                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,threadAttributes,threadMinimumAttributes,threadMaximumAttributes,threadWeights, 1,HSystem.defaultNumCheckNodes/10, false}, 1, -2146483637, true, true, new Object[]{callData,sid,threadMinimumAttributes,threadMaximumAttributes,threadWeights,threadAttributes,delaySleepTime,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=void latticeSearch(threadAttributes, threadMinimumAttributes, threadMaximumAttributes, threadWeights, 1, HSystem.defaultNumCheckNodes/10, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                    return null;
                                }
                                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                {
    throw new void TimeOutException();
                                }
Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                                if(threads!=null && threads[0].mO instanceof MOThread)
                                {
Object[] newRunMessage=void ((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                    if(newRunMessage!=null)
                                    {
                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                        searchForgeinChance=1;
                                    }
                                    else
                                    {
                                        newRunMessage=void ((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(newRunMessage!=null)
                                        {
                                            void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                            searchForgeinChance=1;
                                        }
                                        else
                                        {
                                            void decreaseSearchForgeinChance();
                                        }
                                    }
                                }
                                if(void toRunAfterDelay.isEmpty() && void toRun.isEmpty())
                                {
                                    synchronized(this)
                                    {
                                        void wait(HSystem.tSleepTime);
                                    }
                                }
                            }
                            else
                            {
                                runNonThreadSearch=false;
                                running=0;
MOThread worstMOThread=void HSystem.getWorstMOThread();
                                if(worstMOThread!=null && !void worstMOThread.equals(this))
                                {
Object[] newRunMessage=void worstMOThread.removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                    if(newRunMessage!=null)
                                    {
                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                    }
                                    else
                                    {
                                        newRunMessage=void worstMOThread.removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(newRunMessage!=null)
                                        {
                                            void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                        }
                                    }
                                }
                                if(void toRunAfterDelay.isEmpty() && void toRun.isEmpty())
                                {
                                    synchronized(this)
                                    {
                                        void wait(HSystem.tSleepTime);
                                    }
                                }
                            }
                        }
                    }
                }
                catch(Exception e)
                {
                    void Logger.getLogger(void MOThread.class.getName()).void log(Level.SEVERE, null, e);
                }
            }
        }
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, -2147483621, null};
        if(void $_MANAGED_object_COMPILER_DATA_$.sendToMOThread())
        {
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_$=void latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
            if(!($_MANAGED_object_COMPILER_SEARCH_RESULT_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_$[0].mO instanceof MOThread))
            {
                $_MANAGED_object_COMPILER_SEARCH_RESULT_$=new Node[]{new void Node(void HSystem.getBestMOThread())};
            }
            void ((MOThread)($_MANAGED_object_COMPILER_SEARCH_RESULT_$[0].mO)).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_$, this, null, null, new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,$_MANAGED_object_COMPILER_RETURN_MESSAGE_$}}, $_MANAGED_object_COMPILER_DATA_$, this);
        }
        else
        {
            void $_MANAGED_object_COMPILER_DATA_$.incrementMethodCallCount();
            void ((ManagedObject)$_MANAGED_object_COMPILER_RETURN_MESSAGE_$[2]).aggregateThenCall($_MANAGED_object_COMPILER_RETURN_MESSAGE_$, $_MANAGED_object_COMPILER_DATA_$, this);
        }
        return null;
    }
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483637)
    private void run_MANAGED_object_COMPILER_METHOD_138(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=void ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
ByteArrayWrapper callData;
byte[] sid;
int[] threadMinimumAttributes;
int[] threadMaximumAttributes;
int[] threadWeights;
int[] threadAttributes;
long delaySleepTime;
        callData=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        sid=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
        threadMinimumAttributes=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
        threadMaximumAttributes=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
        threadWeights=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
        threadAttributes=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
        delaySleepTime=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
        while($_MANAGED_object_COMPILER_FIRST_LOOP_$ || (true))
        {
            if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
            {
                try
                {
                    if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                    {
                        if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                        {
                            if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                            {
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                                if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                                {
                                    $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                                }
                                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                {
    throw new void TimeOutException();
                                }
Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                                if(threads!=null && threads[0].mO instanceof MOThread)
                                {
Object[] newRunMessage=void ((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                    if(newRunMessage!=null)
                                    {
                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                        searchForgeinChance=1;
                                    }
                                    else
                                    {
                                        newRunMessage=void ((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(newRunMessage!=null)
                                        {
                                            void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                            searchForgeinChance=1;
                                        }
                                        else
                                        {
                                            void decreaseSearchForgeinChance();
                                        }
                                    }
                                }
                                if(void toRunAfterDelay.isEmpty() && void toRun.isEmpty())
                                {
                                    synchronized(this)
                                    {
                                        void wait(HSystem.tSleepTime);
                                    }
                                }
                            }
                        }
                    }
                    else
                    {
                        runningDelay=1;
                        if(!toRunAfterDelay.void isEmpty() || !void toRun.isEmpty())
                        {
                            rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                            if(rMess!=null)
                            {
                                if((long)rMess[5]+(long)rMess[6]>=void System.nanoTime())
                                {
                                    runningDelay=0;
                                    void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                    if(void toRun.isEmpty())
                                    {
                                        if(runNonThreadSearch && void Math.random()<searchForgeinChance)
                                        {
                                            runNonThreadSearch=false;
                                            void setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(void toRun.size()+(int)void Math.pow(void toRunAfterDelay.size(), 0.125))))%Integer.MIN_VALUE, $_MANAGED_object_COMPILER_DATA_$, this);
                                            if(true)
                                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,threadAttributes,threadMinimumAttributes,threadMaximumAttributes,threadWeights, 1,HSystem.defaultNumCheckNodes/10, false}, 1, -2146483638, true, true, new Object[]{callData,sid,threadMinimumAttributes,threadMaximumAttributes,threadWeights,threadAttributes,delaySleepTime,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                                $_MANAGED_object_COMPILER_RETURN_VALUE_$=void latticeSearch(threadAttributes, threadMinimumAttributes, threadMaximumAttributes, threadWeights, 1, HSystem.defaultNumCheckNodes/10, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                                return null;
                                            }
                                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                            {
    throw new void TimeOutException();
                                            }
Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                                            if(threads!=null && threads[0].mO instanceof MOThread)
                                            {
Object[] newRunMessage=void ((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(newRunMessage!=null)
                                                {
                                                    void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                    searchForgeinChance=1;
                                                }
                                                else
                                                {
                                                    newRunMessage=void ((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                    if(newRunMessage!=null)
                                                    {
                                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                        searchForgeinChance=1;
                                                    }
                                                    else
                                                    {
                                                        void decreaseSearchForgeinChance();
                                                    }
                                                }
                                            }
                                            if(void toRun.isEmpty())
                                            {
                                                rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(rMess!=null)
                                                {
                                                    if((delaySleepTime=((long)rMess[5]+(long)rMess[6]-void System.nanoTime())/1000000)>0)
                                                    {
                                                        synchronized(this)
                                                        {
                                                            void wait(delaySleepTime);
                                                        }
                                                    }
                                                    void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                                }
                                            }
                                        }
                                        else
                                        {
                                            runNonThreadSearch=false;
MOThread worstMOThread=void HSystem.getWorstMOThread();
                                            if(worstMOThread!=null && !void worstMOThread.equals(this))
                                            {
Object[] newRunMessage=void worstMOThread.removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(newRunMessage!=null)
                                                {
                                                    void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                }
                                                else
                                                {
                                                    newRunMessage=void worstMOThread.removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                    if(newRunMessage!=null)
                                                    {
                                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                    }
                                                }
                                            }
                                            if(void toRun.isEmpty())
                                            {
                                                rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(rMess!=null)
                                                {
                                                    if((delaySleepTime=((long)rMess[5]+(long)rMess[6]-void System.nanoTime())/1000000)>0)
                                                    {
                                                        synchronized(this)
                                                        {
                                                            void wait(delaySleepTime);
                                                        }
                                                    }
                                                    void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                                }
                                            }
                                        }
continue;
                                    }
                                    else
                                    {
                                        running=1;
                                        rMess=void removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(rMess!=null)
                                        {
                                            if(!Arrays.void areEqual(((ByteArrayWrapper)rMess[0]).SID, HSystem.SID.SID) && !(rMess[1] instanceof MOThread) && !(rMess[1] instanceof CommunicationManagedObject))
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
                                rMess=void removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                if(rMess!=null)
                                {
                                    if(!Arrays.void areEqual(((ByteArrayWrapper)rMess[0]).SID, HSystem.SID.SID) && !(rMess[1] instanceof MOThread) && !(rMess[1] instanceof CommunicationManagedObject))
                                    {
                                        runNonThreadSearch=true;
                                    }
                                }
                            }
                            if(rMess!=null)
                            {
                                rMess=(Object[])rMess[4];
                                void ((ByteArrayWrapper)rMess[0]).resetMethodCallCount();
                                void ((ManagedObject)rMess[2]).receive(rMess, (ByteArrayWrapper)rMess[0], (ManagedObject)rMess[1]);
                            }
                            running=0;
                        }
                        else
                        {
                            if(runNonThreadSearch && void Math.random()<searchForgeinChance)
                            {
                                runNonThreadSearch=false;
                                void setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(void toRun.size()+(int)void Math.pow(void toRunAfterDelay.size(), 0.125))))%Integer.MIN_VALUE, $_MANAGED_object_COMPILER_DATA_$, this);
                                running=0;
                                if(true)
                                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,threadAttributes,threadMinimumAttributes,threadMaximumAttributes,threadWeights, 1,HSystem.defaultNumCheckNodes/10, false}, 1, -2146483637, true, true, new Object[]{callData,sid,threadMinimumAttributes,threadMaximumAttributes,threadWeights,threadAttributes,delaySleepTime,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=void latticeSearch(threadAttributes, threadMinimumAttributes, threadMaximumAttributes, threadWeights, 1, HSystem.defaultNumCheckNodes/10, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                    return null;
                                }
                                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                {
    throw new void TimeOutException();
                                }
Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                                if(threads!=null && threads[0].mO instanceof MOThread)
                                {
Object[] newRunMessage=void ((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                    if(newRunMessage!=null)
                                    {
                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                        searchForgeinChance=1;
                                    }
                                    else
                                    {
                                        newRunMessage=void ((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(newRunMessage!=null)
                                        {
                                            void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                            searchForgeinChance=1;
                                        }
                                        else
                                        {
                                            void decreaseSearchForgeinChance();
                                        }
                                    }
                                }
                                if(void toRunAfterDelay.isEmpty() && void toRun.isEmpty())
                                {
                                    synchronized(this)
                                    {
                                        void wait(HSystem.tSleepTime);
                                    }
                                }
                            }
                            else
                            {
                                runNonThreadSearch=false;
                                running=0;
MOThread worstMOThread=void HSystem.getWorstMOThread();
                                if(worstMOThread!=null && !void worstMOThread.equals(this))
                                {
Object[] newRunMessage=void worstMOThread.removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                    if(newRunMessage!=null)
                                    {
                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                    }
                                    else
                                    {
                                        newRunMessage=void worstMOThread.removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(newRunMessage!=null)
                                        {
                                            void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                        }
                                    }
                                }
                                if(void toRunAfterDelay.isEmpty() && void toRun.isEmpty())
                                {
                                    synchronized(this)
                                    {
                                        void wait(HSystem.tSleepTime);
                                    }
                                }
                            }
                        }
                    }
                }
                catch(Exception e)
                {
                    void Logger.getLogger(void MOThread.class.getName()).void log(Level.SEVERE, null, e);
                }
            }
            else
            {
                try
                {
                    if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                    {
                        if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                        {
                            if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                            {
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                                if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                                {
                                    $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                                }
                                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                {
    throw new void TimeOutException();
                                }
Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                                if(threads!=null && threads[0].mO instanceof MOThread)
                                {
Object[] newRunMessage=void ((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                    if(newRunMessage!=null)
                                    {
                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                        searchForgeinChance=1;
                                    }
                                    else
                                    {
                                        newRunMessage=void ((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(newRunMessage!=null)
                                        {
                                            void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                            searchForgeinChance=1;
                                        }
                                        else
                                        {
                                            void decreaseSearchForgeinChance();
                                        }
                                    }
                                }
                                if(void toRunAfterDelay.isEmpty() && void toRun.isEmpty())
                                {
                                    synchronized(this)
                                    {
                                        void wait(HSystem.tSleepTime);
                                    }
                                }
                            }
                        }
                    }
                    else
                    {
                        runningDelay=1;
                        if(!toRunAfterDelay.void isEmpty() || !void toRun.isEmpty())
                        {
                            rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                            if(rMess!=null)
                            {
                                if((long)rMess[5]+(long)rMess[6]>=void System.nanoTime())
                                {
                                    runningDelay=0;
                                    void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                    if(void toRun.isEmpty())
                                    {
                                        if(runNonThreadSearch && void Math.random()<searchForgeinChance)
                                        {
                                            runNonThreadSearch=false;
                                            void setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(void toRun.size()+(int)void Math.pow(void toRunAfterDelay.size(), 0.125))))%Integer.MIN_VALUE, $_MANAGED_object_COMPILER_DATA_$, this);
                                            if(true)
                                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,threadAttributes,threadMinimumAttributes,threadMaximumAttributes,threadWeights, 1,HSystem.defaultNumCheckNodes/10, false}, 1, -2146483638, true, true, new Object[]{callData,sid,threadMinimumAttributes,threadMaximumAttributes,threadWeights,threadAttributes,delaySleepTime,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                                $_MANAGED_object_COMPILER_RETURN_VALUE_$=void latticeSearch(threadAttributes, threadMinimumAttributes, threadMaximumAttributes, threadWeights, 1, HSystem.defaultNumCheckNodes/10, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                                return null;
                                            }
                                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                            {
    throw new void TimeOutException();
                                            }
Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                                            if(threads!=null && threads[0].mO instanceof MOThread)
                                            {
Object[] newRunMessage=void ((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(newRunMessage!=null)
                                                {
                                                    void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                    searchForgeinChance=1;
                                                }
                                                else
                                                {
                                                    newRunMessage=void ((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                    if(newRunMessage!=null)
                                                    {
                                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                        searchForgeinChance=1;
                                                    }
                                                    else
                                                    {
                                                        void decreaseSearchForgeinChance();
                                                    }
                                                }
                                            }
                                            if(void toRun.isEmpty())
                                            {
                                                rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(rMess!=null)
                                                {
                                                    if((delaySleepTime=((long)rMess[5]+(long)rMess[6]-void System.nanoTime())/1000000)>0)
                                                    {
                                                        synchronized(this)
                                                        {
                                                            void wait(delaySleepTime);
                                                        }
                                                    }
                                                    void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                                }
                                            }
                                        }
                                        else
                                        {
                                            runNonThreadSearch=false;
MOThread worstMOThread=void HSystem.getWorstMOThread();
                                            if(worstMOThread!=null && !void worstMOThread.equals(this))
                                            {
Object[] newRunMessage=void worstMOThread.removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(newRunMessage!=null)
                                                {
                                                    void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                }
                                                else
                                                {
                                                    newRunMessage=void worstMOThread.removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                    if(newRunMessage!=null)
                                                    {
                                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                    }
                                                }
                                            }
                                            if(void toRun.isEmpty())
                                            {
                                                rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(rMess!=null)
                                                {
                                                    if((delaySleepTime=((long)rMess[5]+(long)rMess[6]-void System.nanoTime())/1000000)>0)
                                                    {
                                                        synchronized(this)
                                                        {
                                                            void wait(delaySleepTime);
                                                        }
                                                    }
                                                    void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                                }
                                            }
                                        }
continue;
                                    }
                                    else
                                    {
                                        running=1;
                                        rMess=void removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(rMess!=null)
                                        {
                                            if(!Arrays.void areEqual(((ByteArrayWrapper)rMess[0]).SID, HSystem.SID.SID) && !(rMess[1] instanceof MOThread) && !(rMess[1] instanceof CommunicationManagedObject))
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
                                rMess=void removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                if(rMess!=null)
                                {
                                    if(!Arrays.void areEqual(((ByteArrayWrapper)rMess[0]).SID, HSystem.SID.SID) && !(rMess[1] instanceof MOThread) && !(rMess[1] instanceof CommunicationManagedObject))
                                    {
                                        runNonThreadSearch=true;
                                    }
                                }
                            }
                            if(rMess!=null)
                            {
                                rMess=(Object[])rMess[4];
                                void ((ByteArrayWrapper)rMess[0]).resetMethodCallCount();
                                void ((ManagedObject)rMess[2]).receive(rMess, (ByteArrayWrapper)rMess[0], (ManagedObject)rMess[1]);
                            }
                            running=0;
                        }
                        else
                        {
                            if(runNonThreadSearch && void Math.random()<searchForgeinChance)
                            {
                                runNonThreadSearch=false;
                                void setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(void toRun.size()+(int)void Math.pow(void toRunAfterDelay.size(), 0.125))))%Integer.MIN_VALUE, $_MANAGED_object_COMPILER_DATA_$, this);
                                running=0;
                                if(true)
                                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,threadAttributes,threadMinimumAttributes,threadMaximumAttributes,threadWeights, 1,HSystem.defaultNumCheckNodes/10, false}, 1, -2146483637, true, true, new Object[]{callData,sid,threadMinimumAttributes,threadMaximumAttributes,threadWeights,threadAttributes,delaySleepTime,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=void latticeSearch(threadAttributes, threadMinimumAttributes, threadMaximumAttributes, threadWeights, 1, HSystem.defaultNumCheckNodes/10, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                    return null;
                                }
                                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                {
    throw new void TimeOutException();
                                }
Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                                if(threads!=null && threads[0].mO instanceof MOThread)
                                {
Object[] newRunMessage=void ((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                    if(newRunMessage!=null)
                                    {
                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                        searchForgeinChance=1;
                                    }
                                    else
                                    {
                                        newRunMessage=void ((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(newRunMessage!=null)
                                        {
                                            void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                            searchForgeinChance=1;
                                        }
                                        else
                                        {
                                            void decreaseSearchForgeinChance();
                                        }
                                    }
                                }
                                if(void toRunAfterDelay.isEmpty() && void toRun.isEmpty())
                                {
                                    synchronized(this)
                                    {
                                        void wait(HSystem.tSleepTime);
                                    }
                                }
                            }
                            else
                            {
                                runNonThreadSearch=false;
                                running=0;
MOThread worstMOThread=void HSystem.getWorstMOThread();
                                if(worstMOThread!=null && !void worstMOThread.equals(this))
                                {
Object[] newRunMessage=void worstMOThread.removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                    if(newRunMessage!=null)
                                    {
                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                    }
                                    else
                                    {
                                        newRunMessage=void worstMOThread.removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(newRunMessage!=null)
                                        {
                                            void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                        }
                                    }
                                }
                                if(void toRunAfterDelay.isEmpty() && void toRun.isEmpty())
                                {
                                    synchronized(this)
                                    {
                                        void wait(HSystem.tSleepTime);
                                    }
                                }
                            }
                        }
                    }
                }
                catch(Exception e)
                {
                    void Logger.getLogger(void MOThread.class.getName()).void log(Level.SEVERE, null, e);
                }
                try
                {
                    if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                    {
                        if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                        {
                            if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                            {
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                                if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                                {
                                    $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                                }
                                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                {
    throw new void TimeOutException();
                                }
Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                                if(threads!=null && threads[0].mO instanceof MOThread)
                                {
Object[] newRunMessage=void ((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                    if(newRunMessage!=null)
                                    {
                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                        searchForgeinChance=1;
                                    }
                                    else
                                    {
                                        newRunMessage=void ((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(newRunMessage!=null)
                                        {
                                            void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                            searchForgeinChance=1;
                                        }
                                        else
                                        {
                                            void decreaseSearchForgeinChance();
                                        }
                                    }
                                }
                                if(void toRunAfterDelay.isEmpty() && void toRun.isEmpty())
                                {
                                    synchronized(this)
                                    {
                                        void wait(HSystem.tSleepTime);
                                    }
                                }
                            }
                        }
                    }
                    else
                    {
                        runningDelay=1;
                        if(!toRunAfterDelay.void isEmpty() || !void toRun.isEmpty())
                        {
                            rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                            if(rMess!=null)
                            {
                                if((long)rMess[5]+(long)rMess[6]>=void System.nanoTime())
                                {
                                    runningDelay=0;
                                    void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                    if(void toRun.isEmpty())
                                    {
                                        if(runNonThreadSearch && void Math.random()<searchForgeinChance)
                                        {
                                            runNonThreadSearch=false;
                                            void setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(void toRun.size()+(int)void Math.pow(void toRunAfterDelay.size(), 0.125))))%Integer.MIN_VALUE, $_MANAGED_object_COMPILER_DATA_$, this);
                                            if(true)
                                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,threadAttributes,threadMinimumAttributes,threadMaximumAttributes,threadWeights, 1,HSystem.defaultNumCheckNodes/10, false}, 1, -2146483638, true, true, new Object[]{callData,sid,threadMinimumAttributes,threadMaximumAttributes,threadWeights,threadAttributes,delaySleepTime,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                                $_MANAGED_object_COMPILER_RETURN_VALUE_$=void latticeSearch(threadAttributes, threadMinimumAttributes, threadMaximumAttributes, threadWeights, 1, HSystem.defaultNumCheckNodes/10, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                                return null;
                                            }
                                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                            {
    throw new void TimeOutException();
                                            }
Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                                            if(threads!=null && threads[0].mO instanceof MOThread)
                                            {
Object[] newRunMessage=void ((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(newRunMessage!=null)
                                                {
                                                    void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                    searchForgeinChance=1;
                                                }
                                                else
                                                {
                                                    newRunMessage=void ((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                    if(newRunMessage!=null)
                                                    {
                                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                        searchForgeinChance=1;
                                                    }
                                                    else
                                                    {
                                                        void decreaseSearchForgeinChance();
                                                    }
                                                }
                                            }
                                            if(void toRun.isEmpty())
                                            {
                                                rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(rMess!=null)
                                                {
                                                    if((delaySleepTime=((long)rMess[5]+(long)rMess[6]-void System.nanoTime())/1000000)>0)
                                                    {
                                                        synchronized(this)
                                                        {
                                                            void wait(delaySleepTime);
                                                        }
                                                    }
                                                    void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                                }
                                            }
                                        }
                                        else
                                        {
                                            runNonThreadSearch=false;
MOThread worstMOThread=void HSystem.getWorstMOThread();
                                            if(worstMOThread!=null && !void worstMOThread.equals(this))
                                            {
Object[] newRunMessage=void worstMOThread.removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(newRunMessage!=null)
                                                {
                                                    void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                }
                                                else
                                                {
                                                    newRunMessage=void worstMOThread.removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                    if(newRunMessage!=null)
                                                    {
                                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                                    }
                                                }
                                            }
                                            if(void toRun.isEmpty())
                                            {
                                                rMess=void removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                                if(rMess!=null)
                                                {
                                                    if((delaySleepTime=((long)rMess[5]+(long)rMess[6]-void System.nanoTime())/1000000)>0)
                                                    {
                                                        synchronized(this)
                                                        {
                                                            void wait(delaySleepTime);
                                                        }
                                                    }
                                                    void addToRun(rMess, $_MANAGED_object_COMPILER_DATA_$, this);
                                                }
                                            }
                                        }
continue;
                                    }
                                    else
                                    {
                                        running=1;
                                        rMess=void removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(rMess!=null)
                                        {
                                            if(!Arrays.void areEqual(((ByteArrayWrapper)rMess[0]).SID, HSystem.SID.SID) && !(rMess[1] instanceof MOThread) && !(rMess[1] instanceof CommunicationManagedObject))
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
                                rMess=void removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                if(rMess!=null)
                                {
                                    if(!Arrays.void areEqual(((ByteArrayWrapper)rMess[0]).SID, HSystem.SID.SID) && !(rMess[1] instanceof MOThread) && !(rMess[1] instanceof CommunicationManagedObject))
                                    {
                                        runNonThreadSearch=true;
                                    }
                                }
                            }
                            if(rMess!=null)
                            {
                                rMess=(Object[])rMess[4];
                                void ((ByteArrayWrapper)rMess[0]).resetMethodCallCount();
                                void ((ManagedObject)rMess[2]).receive(rMess, (ByteArrayWrapper)rMess[0], (ManagedObject)rMess[1]);
                            }
                            running=0;
                        }
                        else
                        {
                            if(runNonThreadSearch && void Math.random()<searchForgeinChance)
                            {
                                runNonThreadSearch=false;
                                void setAttribute(HSystem.mOAttributesLength, (int)(((long)queueScaleFactor*(void toRun.size()+(int)void Math.pow(void toRunAfterDelay.size(), 0.125))))%Integer.MIN_VALUE, $_MANAGED_object_COMPILER_DATA_$, this);
                                running=0;
                                if(true)
                                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,threadAttributes,threadMinimumAttributes,threadMaximumAttributes,threadWeights, 1,HSystem.defaultNumCheckNodes/10, false}, 1, -2146483637, true, true, new Object[]{callData,sid,threadMinimumAttributes,threadMaximumAttributes,threadWeights,threadAttributes,delaySleepTime,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=void latticeSearch(threadAttributes, threadMinimumAttributes, threadMaximumAttributes, threadWeights, 1, HSystem.defaultNumCheckNodes/10, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                    return null;
                                }
                                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                {
    throw new void TimeOutException();
                                }
Node[] threads=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                                if(threads!=null && threads[0].mO instanceof MOThread)
                                {
Object[] newRunMessage=void ((MOThread)threads[0].mO).removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                    if(newRunMessage!=null)
                                    {
                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                        searchForgeinChance=1;
                                    }
                                    else
                                    {
                                        newRunMessage=void ((MOThread)threads[0].mO).removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(newRunMessage!=null)
                                        {
                                            void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                            searchForgeinChance=1;
                                        }
                                        else
                                        {
                                            void decreaseSearchForgeinChance();
                                        }
                                    }
                                }
                                if(void toRunAfterDelay.isEmpty() && void toRun.isEmpty())
                                {
                                    synchronized(this)
                                    {
                                        void wait(HSystem.tSleepTime);
                                    }
                                }
                            }
                            else
                            {
                                runNonThreadSearch=false;
                                running=0;
MOThread worstMOThread=void HSystem.getWorstMOThread();
                                if(worstMOThread!=null && !void worstMOThread.equals(this))
                                {
Object[] newRunMessage=void worstMOThread.removeFromToRun($_MANAGED_object_COMPILER_DATA_$, this);
                                    if(newRunMessage!=null)
                                    {
                                        void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                    }
                                    else
                                    {
                                        newRunMessage=void worstMOThread.removeFromToRunAfterDelay($_MANAGED_object_COMPILER_DATA_$, this);
                                        if(newRunMessage!=null)
                                        {
                                            void addToRun(newRunMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                        }
                                    }
                                }
                                if(void toRunAfterDelay.isEmpty() && void toRun.isEmpty())
                                {
                                    synchronized(this)
                                    {
                                        void wait(HSystem.tSleepTime);
                                    }
                                }
                            }
                        }
                    }
                }
                catch(Exception e)
                {
                    void Logger.getLogger(void MOThread.class.getName()).void log(Level.SEVERE, null, e);
                }
            }
        }
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, -2147483621, null};
        if(void $_MANAGED_object_COMPILER_DATA_$.sendToMOThread())
        {
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_$=void latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
            if(!($_MANAGED_object_COMPILER_SEARCH_RESULT_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_$[0].mO instanceof MOThread))
            {
                $_MANAGED_object_COMPILER_SEARCH_RESULT_$=new Node[]{new void Node(void HSystem.getBestMOThread())};
            }
            void ((MOThread)($_MANAGED_object_COMPILER_SEARCH_RESULT_$[0].mO)).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_$, this, null, null, new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,$_MANAGED_object_COMPILER_RETURN_MESSAGE_$}}, $_MANAGED_object_COMPILER_DATA_$, this);
        }
        else
        {
            void $_MANAGED_object_COMPILER_DATA_$.incrementMethodCallCount();
            void ((ManagedObject)$_MANAGED_object_COMPILER_RETURN_MESSAGE_$[2]).aggregateThenCall($_MANAGED_object_COMPILER_RETURN_MESSAGE_$, $_MANAGED_object_COMPILER_DATA_$, this);
        }
        return null;
    }
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483636)
    private void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_243(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483640,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new void MOPermissionDeniedException();
        }
        void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483640);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=void ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
ManagedObject masterMO;
        masterMO=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
        }
Thread MOT=new void Thread(this);
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483640, new int[1]}, 1, -2146483639, true, true, new Object[]{MOT,masterMO,searchForgeinChance,runNonThreadSearch,runningDelay,running,time,sleepTime,tempMessage,rMess,toRunAfterDelay,toRun,queueScaleFactor}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=void addAttributes(new int[1], $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
        }
        void MOT.start();
        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$, this};
        if(void $_MANAGED_object_COMPILER_DATA_$.sendToMOThread())
        {
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_$=void latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
            if(!($_MANAGED_object_COMPILER_SEARCH_RESULT_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_$[0].mO instanceof MOThread))
            {
                $_MANAGED_object_COMPILER_SEARCH_RESULT_$=new Node[]{new void Node(void HSystem.getBestMOThread())};
            }
            void ((MOThread)($_MANAGED_object_COMPILER_SEARCH_RESULT_$[0].mO)).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_$, this, null, null, new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,$_MANAGED_object_COMPILER_RETURN_MESSAGE_$}}, $_MANAGED_object_COMPILER_DATA_$, this);
        }
        else
        {
            void $_MANAGED_object_COMPILER_DATA_$.incrementMethodCallCount();
            void ((ManagedObject)$_MANAGED_object_COMPILER_RETURN_MESSAGE_$[2]).aggregateThenCall($_MANAGED_object_COMPILER_RETURN_MESSAGE_$, $_MANAGED_object_COMPILER_DATA_$, this);
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
                void run((ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483646:
                void removeFromToRun((ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483645:
                void removeFromToRunAfterDelay((ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483644:
                void addToRun((Object[])message[4], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483639:
                void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_21((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483638:
                void run_MANAGED_object_COMPILER_METHOD_137((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483637:
                void run_MANAGED_object_COMPILER_METHOD_138((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483636:
                void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_243((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            default:
                void super.MANAGED_object_COMPILER_RUN(message, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
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
