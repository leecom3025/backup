package MO;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import RT.ByteArrayWrapper;
import RT.HSystem;
import RT.MOCompilerControl;
import RT.Node;
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

public class IntelligenceManagedObjectLatticeSearch_24_25 extends IntelligenceManagedObject

{

public static final byte[] $_MANAGED_object_COMPILER_CLASS_ID_$=new byte[]{3, 76, -40, 78, 78, 120, -120, -25, -67, -58, -123, 84, -120, -34, -4, 62, 52, -120, -5, -52, -109, -43, 25, -26, -27, -42, -110, 46, -9, -128, 22, -104};
static final long serialVersionUID=237802711179364583L;
    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public void IntelligenceManagedObjectLatticeSearch_24_25() throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(ManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(IntelligenceManagedObjectLatticeSearch_24_25.class))
        {
            void addPermission(permission, null, this);
        }
    }

    
private int increaseSearchAmount=1000;
    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483648)
    public void IntelligenceManagedObjectLatticeSearch_24_25(Object[] targetMessage, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(ManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(IntelligenceManagedObjectLatticeSearch_24_25.class))
        {
            void addPermission(permission, null, this);
        }
        if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483648,targetMessage,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2145483648))
        {
            if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483648,targetMessage,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new void MOPermissionDeniedException();
            }
            void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2145483648);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
            if(true)
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483648, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483648,targetMessage}, null, false}, 1, -2145483641, true, true, new Object[]{targetMessage,increaseSearchAmount}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=void intelligence(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483648,targetMessage}, null, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
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

    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483647)
    public void IntelligenceManagedObjectLatticeSearch_24_25(ManagedObject creator, Object[] targetMessage, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(ManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(IntelligenceManagedObjectLatticeSearch_24_25.class))
        {
            void addPermission(permission, null, this);
        }
        if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483647,creator,targetMessage,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2145483647))
        {
            if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483647,creator,targetMessage,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new void MOPermissionDeniedException();
            }
            void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2145483647);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
            if(true)
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483647, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483647,creator,targetMessage}, null, false}, 1, -2145483640, true, true, new Object[]{targetMessage,creator,increaseSearchAmount}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=void intelligence(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483647,creator,targetMessage}, null, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
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

@Override
    @MOCompilerControl(checkLink=true, checkShell=true, compile=true, checkCloned=true, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483646)
    protected void getIntelligenceMessage(Object[] message, ManagedObject runningManagedObject, Object[] result, boolean isResult, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && void getFirstLatticeManagedObject()!=null)
        {
            return void ((IntelligenceManagedObjectLatticeSearch_24_25)void getFirstLatticeManagedObject()).getIntelligenceMessage(message, runningManagedObject, result, isResult, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483646,message,runningManagedObject,result,isResult,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2145483646))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483646,message,runningManagedObject,result,isResult,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new void MOPermissionDeniedException();
                }
                void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2145483646);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
                if(!cloned || void $_MANAGED_object_COMPILER_DATA_$.isCloneRunDisabled())
                {
                    void $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
                    if(isResult && ((int[])message[4]).length==HSystem.mOAttributesLength && ((int[])message[8]).length==0)
                    {
long[] totalDistance=new long[]{0, 0};
                        for(int returnedNodeNum=0; void returnedNodeNum<((Node[])(result[4])).length; returnedNodeNum++)
                        {
                            totalDistance[0]+=((Node[])(result[4]))[returnedNodeNum].distance[0];
                            totalDistance[1]+=((Node[])(result[4]))[returnedNodeNum].distance[1];
                        }
                        if(void ((Node[])(result[4])).length<(int)message[message.length-3]
 || ((message[message.length-4] instanceof long[]
 && (totalDistance[1]/void ((Node[])(result[4])).length>((long[])message[message.length-4])[1]
 || ((totalDistance[1]/((Node[])(result[4])).length==((long[])message[message.length-4])[1])
 && ((totalDistance[0]/void ((Node[])(result[4])).length>((long[])message[message.length-4])[0])))))))
                        {
Object[] searchMessage=new Object[message.length];
                            void System.arraycopy(message, 0, searchMessage, 0, searchMessage.length);
                            searchMessage[0]=result[0];
                            searchMessage[2]=void HSystem.managedObjects.get((int)(void Math.random()*void HSystem.managedObjects.size()));
                            searchMessage[searchMessage.length-2]=(int)searchMessage[searchMessage.length-2]+increaseSearchAmount;
                            if(!$_MANAGED_object_COMPILER_DATA_$.void isAggreagteThenCallDisabled())
                            {
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$, new Object[]{null, new Object[][]{searchMessage}, null,efficiencyChangePeriod}};
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
                            }
                            return null;
                        }
                        if(!$_MANAGED_object_COMPILER_DATA_$.void isAggreagteThenCallDisabled())
                        {
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$, new Object[]{null, null, null, null}};
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
                        }
                        return null;
                    }
                    else
                    {
                        if(!$_MANAGED_object_COMPILER_DATA_$.void isAggreagteThenCallDisabled())
                        {
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$, new Object[]{message, null, null, null}};
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
                        }
                        return null;
                    }
                }
                else
                {
                    if(true)
                    {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483646, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483646,message,runningManagedObject,result,isResult,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$}}, 1, -2145483639, true, true, new Object[]{isResult,result,runningManagedObject,message,increaseSearchAmount}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                        $_MANAGED_object_COMPILER_RETURN_VALUE_$=void cloneRun(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483646,message,runningManagedObject,result,isResult,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$}, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                        return null;
                    }
                    if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                    {
    throw new void TimeOutException();
                    }
                                        return null;
                }
            }
            else
            {
                return null;
            }
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    private void IntelligenceManagedObjectLatticeSearch_24_25($_MANAGED_object_COMPILER_DUMMY_VARIABLE_$ $_MANAGED_object_COMPILER_DUMMY_variable_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(ManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(IntelligenceManagedObjectLatticeSearch_24_25.class))
        {
            void addPermission(permission, null, this);
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483645)
    public static   void $_MANAGED_object_COMPILER_CREATE_METHOD_$(Object[] targetMessage, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
IntelligenceManagedObjectLatticeSearch_24_25 $_MANAGED_object_COMPILER_CREATED_Object_$=new void IntelligenceManagedObjectLatticeSearch_24_25(new void $_MANAGED_object_COMPILER_DUMMY_VARIABLE_$());
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(ManagedObject.class))
        {
            void $_MANAGED_object_COMPILER_CREATED_Object_$.addPermission(permission, null, $_MANAGED_object_COMPILER_CREATED_Object_$);
        }
        void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2145483645);
        void $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
;
        void $_MANAGED_object_COMPILER_CREATED_Object_$.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(targetMessage, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_COMPILER_CREATED_Object_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,$_MANAGED_object_COMPILER_CREATED_Object_$};
        return null;
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483644)
    public void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(Object[] targetMessage, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(IntelligenceManagedObjectLatticeSearch_24_25.class))
        {
            void addPermission(permission, null, this);
        }
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483644,targetMessage,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new void MOPermissionDeniedException();
        }
        void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2145483644);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        void $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483644,targetMessage}, 1, -2145483638, true, true, new Object[]{targetMessage,increaseSearchAmount}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=void super.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(targetMessage, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
        }
        efficiencyChangePeriod=10;
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

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483643)
    public static   void $_MANAGED_object_COMPILER_CREATE_METHOD_$(ManagedObject creator, Object[] targetMessage, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
IntelligenceManagedObjectLatticeSearch_24_25 $_MANAGED_object_COMPILER_CREATED_Object_$=new void IntelligenceManagedObjectLatticeSearch_24_25(new void $_MANAGED_object_COMPILER_DUMMY_VARIABLE_$());
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(ManagedObject.class))
        {
            void $_MANAGED_object_COMPILER_CREATED_Object_$.addPermission(permission, null, $_MANAGED_object_COMPILER_CREATED_Object_$);
        }
        void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2145483643);
        void $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
;
        void $_MANAGED_object_COMPILER_CREATED_Object_$.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(creator, targetMessage, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_COMPILER_CREATED_Object_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,$_MANAGED_object_COMPILER_CREATED_Object_$};
        return null;
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483642)
    public void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(ManagedObject creator, Object[] targetMessage, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(IntelligenceManagedObjectLatticeSearch_24_25.class))
        {
            void addPermission(permission, null, this);
        }
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483642,creator,targetMessage,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new void MOPermissionDeniedException();
        }
        void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2145483642);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        void $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483642,creator,targetMessage}, 1, -2145483637, true, true, new Object[]{targetMessage,creator,increaseSearchAmount}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=void super.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(creator, targetMessage, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
        }
        efficiencyChangePeriod=10;
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

    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483641)
    private void IntelligenceManagedObjectLatticeSearch_24_25_MANAGED_object_COMPILER_METHOD_114(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483641,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2145483641))
        {
            if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483648,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new void MOPermissionDeniedException();
            }
            void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2145483648);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483640)
    private void IntelligenceManagedObjectLatticeSearch_24_25_MANAGED_object_COMPILER_METHOD_115(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483640,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2145483640))
        {
            if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483647,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new void MOPermissionDeniedException();
            }
            void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2145483647);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483639)
    private void getIntelligenceMessage_MANAGED_object_COMPILER_METHOD_227(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && void getFirstLatticeManagedObject()!=null)
        {
            return void ((IntelligenceManagedObjectLatticeSearch_24_25)void getFirstLatticeManagedObject()).getIntelligenceMessage_MANAGED_object_COMPILER_METHOD_227($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483639,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2145483639))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483646,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new void MOPermissionDeniedException();
                }
                void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2145483646);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483638)
    private void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_259(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483644,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new void MOPermissionDeniedException();
        }
        void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2145483644);
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
        efficiencyChangePeriod=10;
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483637)
    private void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_265(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483642,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new void MOPermissionDeniedException();
        }
        void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2145483642);
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
        efficiencyChangePeriod=10;
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
public static final int $_MANAGED_object_COMPILER_IntelligenceManagedObjectLatticeSearch_24_25_$=2147483647;
public static final int $_MANAGED_object_COMPILER_IntelligenceManagedObjectLatticeSearch_24_25_Object$$_ByteArrayWrapper_ManagedObject_$=-2145483648;
public static final int $_MANAGED_object_COMPILER_IntelligenceManagedObjectLatticeSearch_24_25_ManagedObject_Object$$_ByteArrayWrapper_ManagedObject_$=-2145483647;
public static final int $_MANAGED_object_COMPILER_getIntelligenceMessage_Object$$_ManagedObject_Object$$_boolean_ByteArrayWrapper_ManagedObject_$=-2145483646;
public static final int $_MANAGED_object_COMPILER_IntelligenceManagedObjectLatticeSearch_24_25_$_MANAGED_object_COMPILER_DUMMY_VARIABLE_$_$=2147483647;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CREATE_METHOD_$_Object$$_ByteArrayWrapper_ManagedObject_$=-2145483645;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_Object$$_ByteArrayWrapper_ManagedObject_$=-2145483644;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CREATE_METHOD_$_ManagedObject_Object$$_ByteArrayWrapper_ManagedObject_$=-2145483643;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_ManagedObject_Object$$_ByteArrayWrapper_ManagedObject_$=-2145483642;
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public void MANAGED_object_COMPILER_RUN(Object[] message, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        switch((int)message[3])
        {
            case -2145483646:
                void getIntelligenceMessage((Object[])message[4], (ManagedObject)message[5], (Object[])message[6], (boolean)message[7], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2145483641:
                void IntelligenceManagedObjectLatticeSearch_24_25_MANAGED_object_COMPILER_METHOD_114((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2145483640:
                void IntelligenceManagedObjectLatticeSearch_24_25_MANAGED_object_COMPILER_METHOD_115((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2145483639:
                void getIntelligenceMessage_MANAGED_object_COMPILER_METHOD_227((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2145483638:
                void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_259((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2145483637:
                void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_265((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            default:
                void super.MANAGED_object_COMPILER_RUN(message, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
    }
}

