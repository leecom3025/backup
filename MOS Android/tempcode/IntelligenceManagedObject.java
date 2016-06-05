

package MO;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Hashtable;

import RT.$_MANAGED_OBJECT_COMPILER_ANNOTATION_$;
import RT.ByteArrayWrapper;
import RT.HSystem;
import RT.MOCompilerControl;
import RT.ManagedObjectUtilities;
import RT.Exceptions.TimeOutException;
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
import java.util.ArrayList;
import java.util.Iterator;
import RT.CompareMessage;
import RT.ManagedObjectUtilities;

public abstract class IntelligenceManagedObject extends ManagedObject

{

public static final byte[] $_MANAGED_object_COMPILER_CLASS_ID_$=new byte[]{67, -114, 101, 89, -103, -123, 52, -49, 24, -65, -34, 99, -122, 29, -43, 51, 60, -13, -92, -22, 74, -81, 122, -58, 103, 63, 78, 121, 64, 112, -109, -107};
static final long serialVersionUID=4867939682736223439L;
    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public void IntelligenceManagedObject() throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(ManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(IntelligenceManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
    }

    
protected int efficiencyChangePeriod=0;
    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483648)
    public void IntelligenceManagedObject(Object[] targetMessage, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(ManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(IntelligenceManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
        if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648,targetMessage,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483648))
        {
            if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648,targetMessage,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new void MOPermissionDeniedException();
            }
            void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483648);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
            if(true)
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648,targetMessage}, null, false}, 1, -2146483641, true, true, new Object[]{targetMessage,efficiencyChangePeriod}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=void intelligence(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648,targetMessage}, null, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                return ;
            }
            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
            {
    throw new void TimeOutException();
            }
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
            if($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$==null)
            {
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$};
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
                return ;
            }
            if(!checkPermission($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new void MOPermissionDeniedException();
            }
            targetMessage=(Object[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
            $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
            $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
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
            return ;
        }
        else
        {
            return ;
        }
    }

    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483647)
    public void IntelligenceManagedObject(ManagedObject creator, Object[] targetMessage, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(ManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(IntelligenceManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
        if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,creator,targetMessage,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483647))
        {
            if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,creator,targetMessage,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new void MOPermissionDeniedException();
            }
            void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
            if(true)
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,creator,targetMessage}, null, false}, 1, -2146483640, true, true, new Object[]{targetMessage,creator,efficiencyChangePeriod}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=void intelligence(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,creator,targetMessage}, null, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                return ;
            }
            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
            {
    throw new void TimeOutException();
            }
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
            if($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$==null)
            {
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$};
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
                return ;
            }
            if(!checkPermission($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new void MOPermissionDeniedException();
            }
            creator=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
            targetMessage=(Object[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[5];
            $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
            $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
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
            return ;
        }
        else
        {
            return ;
        }
    }

    @MOCompilerControl(checkLink=true, checkShell=true, compile=true, checkCloned=true, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2147483648)
    protected abstract void getIntelligenceMessage(Object[] message, ManagedObject runningManagedObject, Object[] result, boolean isResult, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException;

    
    
    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483646)
    public void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(Object[] targetMessage, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(IntelligenceManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,targetMessage,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new void MOPermissionDeniedException();
        }
        void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483646);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        void $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
int[] newMOAttributes=new int[22];
        newMOAttributes[0]=void ManagedObjectUtilities.compareHash(new byte[][]{void this.getClass().void getSimpleName().void getBytes()});
        if(void HSystem.classHashes.get(void this.getClass())==null)
        {
            void HSystem.classHashes.put(void this.getClass(), void ManagedObjectUtilities.hashClass(void this.getClass()));
        }
        newMOAttributes[1]=void HSystem.classHashes.get(void this.getClass());
        newMOAttributes[2]=0;
        newMOAttributes[3]=newMOAttributes[1]+(int)((Integer.MAX_VALUE*void Math.random())%HSystem.gradientNumber);
        newMOAttributes[4]=0;
        newMOAttributes[5]=HSystem.defaultPlasticity;
        newMOAttributes[6]=HSystem.defaultEffReportMessages;
byte[] tempBy=new byte[4];
        void System.arraycopy(HSystem.SID.SID, 0, tempBy, 0, tempBy.length);
        newMOAttributes[7]=void ManagedObjectUtilities.b8ToB10Int(tempBy);
        void System.arraycopy(HSystem.SID.SID, 4, tempBy, 0, tempBy.length);
        newMOAttributes[8]=void ManagedObjectUtilities.b8ToB10Int(tempBy);
        void System.arraycopy(HSystem.SID.SID, 8, tempBy, 0, tempBy.length);
        newMOAttributes[9]=void ManagedObjectUtilities.b8ToB10Int(tempBy);
        void System.arraycopy(HSystem.SID.SID, 12, tempBy, 0, tempBy.length);
        newMOAttributes[10]=void ManagedObjectUtilities.b8ToB10Int(tempBy);
        void System.arraycopy(HSystem.SID.SID, 16, tempBy, 0, tempBy.length);
        newMOAttributes[11]=void ManagedObjectUtilities.b8ToB10Int(tempBy);
        void System.arraycopy(HSystem.SID.SID, 20, tempBy, 0, tempBy.length);
        newMOAttributes[12]=void ManagedObjectUtilities.b8ToB10Int(tempBy);
        void System.arraycopy(HSystem.SID.SID, 24, tempBy, 0, tempBy.length);
        newMOAttributes[13]=void ManagedObjectUtilities.b8ToB10Int(tempBy);
        void System.arraycopy(HSystem.SID.SID, 28, tempBy, 0, tempBy.length);
        newMOAttributes[14]=void ManagedObjectUtilities.b8ToB10Int(tempBy);
SecureRandom sRand=new void SecureRandom();
        newMOAttributes[15]=void sRand.nextInt()%Integer.MAX_VALUE;
        newMOAttributes[16]=void sRand.nextInt()%Integer.MAX_VALUE;
        newMOAttributes[17]=Integer.MAX_VALUE;
        newMOAttributes[18]=Integer.MAX_VALUE;
        newMOAttributes[19]=Integer.MAX_VALUE;
        newMOAttributes[20]=Integer.MAX_VALUE;
        newMOAttributes[21]=Integer.MAX_VALUE;
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,newMOAttributes}, 1, -2146483642, true, true, new Object[]{sRand,tempBy,newMOAttributes,targetMessage,efficiencyChangePeriod}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=void setAttributes(newMOAttributes, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
        }
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646, voidvoid ManagedObjectUtilities.getMessageAttributes(targetMessage)}, 1, -2146483644, true, true, new Object[]{sRand,tempBy,newMOAttributes,targetMessage,efficiencyChangePeriod}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=void addAttributes(void ManagedObjectUtilities.getMessageAttributes(targetMessage), $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
        }
        receivedMessageNumber=void sRand.nextInt();
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

    
    
    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483645)
    public void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(ManagedObject creator, Object[] targetMessage, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(IntelligenceManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483645,creator,targetMessage,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new void MOPermissionDeniedException();
        }
        void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483645);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        void $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483645,creator}, 1, -2146483638, true, true, new Object[]{targetMessage,creator,efficiencyChangePeriod}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=void super.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(creator, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
        }
        numReceiveMethodNums=new int[28];
        numReceiveMethodNums[0]=-2147483648;
        numReceiveMethodNums[1]=-2147483647;
        numReceiveMethodNums[2]=-2147483646;
        numReceiveMethodNums[3]=-2147483645;
        numReceiveMethodNums[4]=-2147483644;
        numReceiveMethodNums[5]=-2147483643;
        numReceiveMethodNums[6]=-2147483642;
        numReceiveMethodNums[7]=-2147483641;
        numReceiveMethodNums[8]=-2147483640;
        numReceiveMethodNums[9]=-2147483639;
        numReceiveMethodNums[10]=-2147483638;
        numReceiveMethodNums[11]=-2147483637;
        numReceiveMethodNums[12]=-2147483636;
        numReceiveMethodNums[12]=-2147483635;
        numReceiveMethodNums[13]=-2147483634;
        numReceiveMethodNums[14]=-2147483633;
        numReceiveMethodNums[15]=-2147483632;
        numReceiveMethodNums[16]=-2147483631;
        numReceiveMethodNums[17]=-2147483630;
        numReceiveMethodNums[18]=-2147483629;
        numReceiveMethodNums[19]=-2147483628;
        numReceiveMethodNums[20]=-2147483627;
        numReceiveMethodNums[21]=-2147483626;
        numReceiveMethodNums[22]=-2147483625;
        numReceiveMethodNums[23]=-2147483624;
        numReceiveMethodNums[24]=-2147483623;
        numReceiveMethodNums[25]=-2147483622;
        numReceiveMethodNums[26]=0;
        numReceiveMethodNums[27]=1;
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483645, voidvoid ManagedObjectUtilities.getMessageAttributes(targetMessage)}, 1, -2146483643, true, true, new Object[]{targetMessage,creator,efficiencyChangePeriod}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=void addAttributes(void ManagedObjectUtilities.getMessageAttributes(targetMessage), $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
        }
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

    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483644)
    private void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_19(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new void MOPermissionDeniedException();
        }
        void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483646);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=void ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
SecureRandom sRand;
byte[] tempBy;
int[] newMOAttributes;
Object[] targetMessage;
        sRand=(SecureRandom)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        tempBy=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
        newMOAttributes=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
        targetMessage=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
        }
        receivedMessageNumber=void sRand.nextInt();
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483643)
    private void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_20(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483645,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new void MOPermissionDeniedException();
        }
        void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483645);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=void ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Object[] targetMessage;
ManagedObject creator;
        targetMessage=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        creator=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
        }
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483642)
    private void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_26(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new void MOPermissionDeniedException();
        }
        void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483646);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=void ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
SecureRandom sRand;
byte[] tempBy;
int[] newMOAttributes;
Object[] targetMessage;
        sRand=(SecureRandom)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        tempBy=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
        newMOAttributes=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
        targetMessage=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
        }
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646, voidvoid ManagedObjectUtilities.getMessageAttributes(targetMessage)}, 1, -2146483644, true, true, new Object[]{sRand,tempBy,newMOAttributes,targetMessage,efficiencyChangePeriod}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=void addAttributes(void ManagedObjectUtilities.getMessageAttributes(targetMessage), $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
        }
        receivedMessageNumber=void sRand.nextInt();
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483641)
    private void IntelligenceManagedObject_MANAGED_object_COMPILER_METHOD_38(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483641,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483641))
        {
            if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new void MOPermissionDeniedException();
            }
            void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483648);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=void ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Object[] targetMessage;
            targetMessage=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
            $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
            {
    throw new void TimeOutException();
            }
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
            if($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$==null)
            {
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$};
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
                return ;
            }
            if(!checkPermission($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new void MOPermissionDeniedException();
            }
            targetMessage=(Object[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
            $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
            $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
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
            return ;
        }
        else
        {
            return ;
        }
    }
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483640)
    private void IntelligenceManagedObject_MANAGED_object_COMPILER_METHOD_39(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483640,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483640))
        {
            if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new void MOPermissionDeniedException();
            }
            void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=void ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Object[] targetMessage;
ManagedObject creator;
            targetMessage=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
            creator=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
            $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
            {
    throw new void TimeOutException();
            }
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
            if($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$==null)
            {
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$};
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
                return ;
            }
            if(!checkPermission($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new void MOPermissionDeniedException();
            }
            creator=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
            targetMessage=(Object[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[5];
            $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
            $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
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
            return ;
        }
        else
        {
            return ;
        }
    }
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483639)
    private abstract void getIntelligenceMessage_MANAGED_object_COMPILER_METHOD_218(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && void getFirstLatticeManagedObject()!=null)
        {
            return void ((IntelligenceManagedObject)void getFirstLatticeManagedObject()).getIntelligenceMessage_MANAGED_object_COMPILER_METHOD_218($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483639,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483639))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2147483648,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new void MOPermissionDeniedException();
                }
                void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2147483648);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=void ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
boolean isResult;
Object[] result;
ManagedObject runningManagedObject;
Object[] message;
                isResult=(boolean)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                result=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                runningManagedObject=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                message=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new void TimeOutException();
                }
                                return null;
            }
            else
            {
                return null;
            }
        }
    }
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483638)
    private void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_242(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483645,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new void MOPermissionDeniedException();
        }
        void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483645);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=void ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Object[] targetMessage;
ManagedObject creator;
        targetMessage=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        creator=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
        }
        numReceiveMethodNums=new int[28];
        numReceiveMethodNums[0]=-2147483648;
        numReceiveMethodNums[1]=-2147483647;
        numReceiveMethodNums[2]=-2147483646;
        numReceiveMethodNums[3]=-2147483645;
        numReceiveMethodNums[4]=-2147483644;
        numReceiveMethodNums[5]=-2147483643;
        numReceiveMethodNums[6]=-2147483642;
        numReceiveMethodNums[7]=-2147483641;
        numReceiveMethodNums[8]=-2147483640;
        numReceiveMethodNums[9]=-2147483639;
        numReceiveMethodNums[10]=-2147483638;
        numReceiveMethodNums[11]=-2147483637;
        numReceiveMethodNums[12]=-2147483636;
        numReceiveMethodNums[12]=-2147483635;
        numReceiveMethodNums[13]=-2147483634;
        numReceiveMethodNums[14]=-2147483633;
        numReceiveMethodNums[15]=-2147483632;
        numReceiveMethodNums[16]=-2147483631;
        numReceiveMethodNums[17]=-2147483630;
        numReceiveMethodNums[18]=-2147483629;
        numReceiveMethodNums[19]=-2147483628;
        numReceiveMethodNums[20]=-2147483627;
        numReceiveMethodNums[21]=-2147483626;
        numReceiveMethodNums[22]=-2147483625;
        numReceiveMethodNums[23]=-2147483624;
        numReceiveMethodNums[24]=-2147483623;
        numReceiveMethodNums[25]=-2147483622;
        numReceiveMethodNums[26]=0;
        numReceiveMethodNums[27]=1;
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483645, voidvoid ManagedObjectUtilities.getMessageAttributes(targetMessage)}, 1, -2146483643, true, true, new Object[]{targetMessage,creator,efficiencyChangePeriod}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=void addAttributes(void ManagedObjectUtilities.getMessageAttributes(targetMessage), $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
        }
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
public static final int $_MANAGED_object_COMPILER_IntelligenceManagedObject_$=2147483647;
public static final int $_MANAGED_object_COMPILER_IntelligenceManagedObject_Object$$_ByteArrayWrapper_ManagedObject_$=-2146483648;
public static final int $_MANAGED_object_COMPILER_IntelligenceManagedObject_ManagedObject_Object$$_ByteArrayWrapper_ManagedObject_$=-2146483647;
public static final int $_MANAGED_object_COMPILER_getIntelligenceMessage_Object$$_ManagedObject_Object$$_boolean_ByteArrayWrapper_ManagedObject_$=-2147483648;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_Object$$_ByteArrayWrapper_ManagedObject_$=-2146483646;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_ManagedObject_Object$$_ByteArrayWrapper_ManagedObject_$=-2146483645;
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public void MANAGED_object_COMPILER_RUN(Object[] message, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        switch((int)message[3])
        {
            case -2146483644:
                void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_19((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483643:
                void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_20((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483642:
                void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_26((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483641:
                void IntelligenceManagedObject_MANAGED_object_COMPILER_METHOD_38((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483640:
                void IntelligenceManagedObject_MANAGED_object_COMPILER_METHOD_39((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483639:
                void getIntelligenceMessage_MANAGED_object_COMPILER_METHOD_218((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483638:
                void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_242((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            default:
                void super.MANAGED_object_COMPILER_RUN(message, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
    }
}

