

package MO;

import RT.ByteArrayWrapper;
import RT.HSystem;
import RT.Node;
import RT.Exceptions.TimeOutException;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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

public class PrintMO extends ManagedObject 

{

public static final byte[] $_MANAGED_object_COMPILER_CLASS_ID_$=new byte[]{22, -36, -91, -86, 81, -101, -113, -79, 38, 103, 119, -40, -34, -19, -57, -49, -68, -32, -46, 109, -11, 45, 43, 30, -107, 26, -62, -82, 87, -49, 22, -54};
static final long serialVersionUID=1647373714642931633L;
    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public PrintMO() throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(PrintMO.class))
        {
            addPermission(permission, null, this);
        }
    }

    
    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483648)
    protected PrintMO(ManagedObject creator, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(PrintMO.class))
        {
            addPermission(permission, null, this);
        }
        if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648,creator,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483648))
        {
            if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648,creator,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new MOPermissionDeniedException();
            }
            $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483648);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
            if(true)
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648,creator}, null, false}, 1, -2146483643, true, true, new Object[]{creator}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=intelligence(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648,creator}, null, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                return ;
            }
            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
            {
    throw new TimeOutException();
            }
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
            if($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$==null)
            {
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$};
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
                return ;
            }
            if(!checkPermission($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new MOPermissionDeniedException();
            }
            creator=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
            $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
            $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, -2147483621, null};
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
            return ;
        }
        else
        {
            return ;
        }
    }

    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483647)
    protected Object print(String toPrint, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((PrintMO)getFirstLatticeManagedObject()).print(toPrint, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,toPrint,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483647))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,toPrint,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,toPrint}, null, false}, 1, -2146483642, true, true, new Object[]{toPrint}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=intelligence(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,toPrint}, null, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                if($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$==null)
                {
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$, null};
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
                if(!checkPermission($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                toPrint=(String)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
                $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
                $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
                System.out.println("PRINTMOPRINT: "+toPrint);
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, -2147483621, null};
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
            else
            {
                return null;
            }
        }
    }

    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483646)
    public Object findAndPrint(int[] attributes, int[] weights, String toPrint, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((PrintMO)getFirstLatticeManagedObject()).findAndPrint(attributes, weights, toPrint, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,attributes,weights,toPrint,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483646))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,attributes,weights,toPrint,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483646);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,attributes,weights,toPrint}, null, false}, 1, -2146483641, true, true, new Object[]{toPrint,weights,attributes}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=intelligence(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,attributes,weights,toPrint}, null, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                if($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$==null)
                {
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$, null};
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
                if(!checkPermission($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                attributes=(int[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
                weights=(int[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[5];
                toPrint=(String)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[6];
                $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
                $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,attributes,weights, 1,HSystem.defaultNumCheckNodes, false}, 1, -2146483640, true, true, new Object[]{$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,toPrint,weights,attributes}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=latticeSearch(attributes, weights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
Node[] printMO=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,toPrint}, 1, -2146483639, true, true, new Object[]{printMO,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,toPrint,weights,attributes}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=((PrintMO)printMO[0].mO).print(toPrint, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, -2147483621, null};
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
            else
            {
                return null;
            }
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    private PrintMO($_MANAGED_object_COMPILER_DUMMY_VARIABLE_$ $_MANAGED_object_COMPILER_DUMMY_variable_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(PrintMO.class))
        {
            addPermission(permission, null, this);
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483645)
    protected static   Object $_MANAGED_object_COMPILER_CREATE_METHOD_$(ManagedObject creator, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
PrintMO $_MANAGED_object_COMPILER_CREATED_Object_$=new PrintMO(new $_MANAGED_object_COMPILER_DUMMY_VARIABLE_$());
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            $_MANAGED_object_COMPILER_CREATED_Object_$.addPermission(permission, null, $_MANAGED_object_COMPILER_CREATED_Object_$);
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483645);
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
;
        $_MANAGED_object_COMPILER_CREATED_Object_$.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(creator, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_COMPILER_CREATED_Object_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,$_MANAGED_object_COMPILER_CREATED_Object_$};
        return null;
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483644)
    public PrintMO $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(ManagedObject creator, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(PrintMO.class))
        {
            addPermission(permission, null, this);
        }
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483644,creator,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483644);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483644,creator}, 1, -2146483638, true, true, new Object[]{creator}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=super.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(creator, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
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

    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483643)
    private void PrintMO_MANAGED_object_COMPILER_METHOD_60(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483643,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483643))
        {
            if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new MOPermissionDeniedException();
            }
            $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483648);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
ManagedObject creator;
            creator=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
            $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
            {
    throw new TimeOutException();
            }
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
            if($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$==null)
            {
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$};
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
                return ;
            }
            if(!checkPermission($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new MOPermissionDeniedException();
            }
            creator=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
            $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
            $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, -2147483621, null};
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
            return ;
        }
        else
        {
            return ;
        }
    }
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483642)
    private Object print_MANAGED_object_COMPILER_METHOD_61(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((PrintMO)getFirstLatticeManagedObject()).print_MANAGED_object_COMPILER_METHOD_61($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483642,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483642))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
String toPrint;
                toPrint=(String)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                if($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$==null)
                {
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$, null};
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
                if(!checkPermission($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                toPrint=(String)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
                $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
                $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
                System.out.println("PRINTMOPRINT: "+toPrint);
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, -2147483621, null};
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
            else
            {
                return null;
            }
        }
    }
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483641)
    private Object findAndPrint_MANAGED_object_COMPILER_METHOD_62(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((PrintMO)getFirstLatticeManagedObject()).findAndPrint_MANAGED_object_COMPILER_METHOD_62($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483641,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483641))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483646);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
String toPrint;
int[] weights;
int[] attributes;
                toPrint=(String)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                weights=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                attributes=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                if($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$==null)
                {
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$, null};
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
                if(!checkPermission($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                attributes=(int[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
                weights=(int[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[5];
                toPrint=(String)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[6];
                $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
                $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,attributes,weights, 1,HSystem.defaultNumCheckNodes, false}, 1, -2146483640, true, true, new Object[]{$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,toPrint,weights,attributes}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=latticeSearch(attributes, weights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
Node[] printMO=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,toPrint}, 1, -2146483639, true, true, new Object[]{printMO,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,toPrint,weights,attributes}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=((PrintMO)printMO[0].mO).print(toPrint, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, -2147483621, null};
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
            else
            {
                return null;
            }
        }
    }
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483640)
    private Object findAndPrint_MANAGED_object_COMPILER_METHOD_149(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((PrintMO)getFirstLatticeManagedObject()).findAndPrint_MANAGED_object_COMPILER_METHOD_149($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483640,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483640))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483646);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$;
String toPrint;
int[] weights;
int[] attributes;
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                toPrint=(String)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                weights=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                attributes=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
Node[] printMO=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,toPrint}, 1, -2146483639, true, true, new Object[]{printMO,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,toPrint,weights,attributes}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=((PrintMO)printMO[0].mO).print(toPrint, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, -2147483621, null};
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
            else
            {
                return null;
            }
        }
    }
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483639)
    private Object findAndPrint_MANAGED_object_COMPILER_METHOD_238(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((PrintMO)getFirstLatticeManagedObject()).findAndPrint_MANAGED_object_COMPILER_METHOD_238($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483639,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483639))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483646);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Node[] printMO;
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$;
String toPrint;
int[] weights;
int[] attributes;
                printMO=(Node[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                toPrint=(String)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                weights=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                attributes=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, -2147483621, null};
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
            else
            {
                return null;
            }
        }
    }
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483638)
    private Object $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_252(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483644,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483644);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
ManagedObject creator;
        creator=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
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
public static final int $_MANAGED_object_COMPILER_PrintMO_$=2147483647;
public static final int $_MANAGED_object_COMPILER_PrintMO_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2146483648;
public static final int $_MANAGED_object_COMPILER_print_String_ByteArrayWrapper_ManagedObject_$=-2146483647;
public static final int $_MANAGED_object_COMPILER_findAndPrint_int$$_int$$_String_ByteArrayWrapper_ManagedObject_$=-2146483646;
public static final int $_MANAGED_object_COMPILER_PrintMO_$_MANAGED_object_COMPILER_DUMMY_VARIABLE_$_$=2147483647;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CREATE_METHOD_$_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2146483645;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2146483644;
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public void MANAGED_object_COMPILER_RUN(Object[] message, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        switch((int)message[3])
        {
            case -2146483647:
                print((String)message[4], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483646:
                findAndPrint((int[])message[4], (int[])message[5], (String)message[6], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483643:
                PrintMO_MANAGED_object_COMPILER_METHOD_60((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483642:
                print_MANAGED_object_COMPILER_METHOD_61((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483641:
                findAndPrint_MANAGED_object_COMPILER_METHOD_62((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483640:
                findAndPrint_MANAGED_object_COMPILER_METHOD_149((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483639:
                findAndPrint_MANAGED_object_COMPILER_METHOD_238((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483638:
                $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_252((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            default:
                super.MANAGED_object_COMPILER_RUN(message, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
    }
}

