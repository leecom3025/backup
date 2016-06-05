

package MO;

import MO.SystemMasterManagedObject;
import RT.$_MANAGED_OBJECT_COMPILER_ANNOTATION_$;
import RT.ByteArrayWrapper;
import RT.HSystem;
import RT.ManagedObjectUtilities;
import RT.Node;
import RT.Exceptions.TimeOutException;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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

public class SystemManagedObject extends ManagedObject

{

public static final byte[] $_MANAGED_object_COMPILER_CLASS_ID_$=new byte[]{85, 93, -1, -98, 114, -92, -20, 73, -12, -91, -46, 40, 51, -52, -47, 105, 118, 24, 95, -13, 87, 126, 73, -91, -105, 110, 28, 78, -45, 85, -45, -52};
static final long serialVersionUID=6151353722051292233L;
    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public SystemManagedObject() throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(SystemManagedObject.class))
        {
            addPermission(permission, null, this);
        }
    }

    
    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483648)
    public SystemManagedObject(ManagedObject creator, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(SystemManagedObject.class))
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
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648,creator}, null, false}, 1, -2146483634, true, true, new Object[]{creator}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
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
    protected Object addMaster(ManagedObject masterMOLink, ByteArrayWrapper MOCompilier_Sending_SID, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SystemManagedObject)getFirstLatticeManagedObject()).addMaster(masterMOLink, MOCompilier_Sending_SID, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,masterMOLink,MOCompilier_Sending_SID,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483647))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,masterMOLink,MOCompilier_Sending_SID,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,masterMOLink,MOCompilier_Sending_SID}, null, false}, 1, -2146483633, true, true, new Object[]{MOCompilier_Sending_SID,masterMOLink}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=intelligence(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,masterMOLink,MOCompilier_Sending_SID}, null, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
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
                masterMOLink=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
                MOCompilier_Sending_SID=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[5];
                $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
                $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
                if(masterMOLink.mOAttributes==null)
                {
                    masterMOLink=masterMOLink.latticeNodes.get(0).mO;
                }
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$=new ByteArrayWrapper($_MANAGED_object_COMPILER_DATA_$.SID, new byte[16], $_MANAGED_object_COMPILER_DATA_$.intelligenceInfo, $_MANAGED_object_COMPILER_DATA_$.updateTime, $_MANAGED_object_COMPILER_DATA_$.data, $_MANAGED_object_COMPILER_DATA_$.userData);
                $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$.randomizeCallPathID();
                $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$.randomizeCallPathID();
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
                if($_MANAGED_object_COMPILER_SEARCH_RESULT_0_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$[0].mO instanceof MOThread)
                {
                    $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=new Node[]{new Node(HSystem.getBestMOThread())};
                }
                ((MOThread)$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$[0].mO).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$, this,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$, null, new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$, this, this, -2146483642,MOCompilier_Sending_SID,masterMOLink}}, $_MANAGED_object_COMPILER_DATA_$, this);
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, "latticeNodes"}, 1, -2146483636, true, true, new Object[]{$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,MOCompilier_Sending_SID,masterMOLink}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=masterMOLink.getVariable("latticeNodes", $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
List<Node> sysMONodes=(ArrayList<Node>)((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                for(int nodeNum=0; nodeNum<sysMONodes.size() && nodeNum<HSystem.numInitCheckNodesMOAttributes; nodeNum++)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$=new ByteArrayWrapper($_MANAGED_object_COMPILER_DATA_$.SID, new byte[16], $_MANAGED_object_COMPILER_DATA_$.intelligenceInfo, $_MANAGED_object_COMPILER_DATA_$.updateTime, $_MANAGED_object_COMPILER_DATA_$.data, $_MANAGED_object_COMPILER_DATA_$.userData);
                    $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$.randomizeCallPathID();
                    $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$.randomizeCallPathID();
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_1_$=latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
                    if($_MANAGED_object_COMPILER_SEARCH_RESULT_1_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_1_$[0].mO instanceof MOThread)
                    {
                        $_MANAGED_object_COMPILER_SEARCH_RESULT_1_$=new Node[]{new Node(HSystem.getBestMOThread())};
                    }
                    ((MOThread)$_MANAGED_object_COMPILER_SEARCH_RESULT_1_$[0].mO).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$, this,$_MANAGED_object_COMPILER_SEARCH_RESULT_1_$, null, new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$, this, this, -2146483641,nodeNum,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,MOCompilier_Sending_SID,masterMOLink}}, $_MANAGED_object_COMPILER_DATA_$, this);
                }
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, "latticeNodesMOAttributes"}, 1, -2146483635, true, true, new Object[]{sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,MOCompilier_Sending_SID,masterMOLink}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=masterMOLink.getVariable("latticeNodesMOAttributes", $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
                sysMONodes=(ArrayList<Node>)((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                for(int nodeNum=0; nodeNum<sysMONodes.size() && nodeNum<HSystem.numInitCheckNodesMOAttributes; nodeNum++)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$=new ByteArrayWrapper($_MANAGED_object_COMPILER_DATA_$.SID, new byte[16], $_MANAGED_object_COMPILER_DATA_$.intelligenceInfo, $_MANAGED_object_COMPILER_DATA_$.updateTime, $_MANAGED_object_COMPILER_DATA_$.data, $_MANAGED_object_COMPILER_DATA_$.userData);
                    $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$.randomizeCallPathID();
                    $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$.randomizeCallPathID();
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$=latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
                    if($_MANAGED_object_COMPILER_SEARCH_RESULT_2_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$[0].mO instanceof MOThread)
                    {
                        $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$=new Node[]{new Node(HSystem.getBestMOThread())};
                    }
                    ((MOThread)$_MANAGED_object_COMPILER_SEARCH_RESULT_2_$[0].mO).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$, this,$_MANAGED_object_COMPILER_SEARCH_RESULT_2_$, null, new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$, this, this, -2146483640,nodeNum,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,MOCompilier_Sending_SID,masterMOLink}}, $_MANAGED_object_COMPILER_DATA_$, this);
                }
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!! added master");
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
    public Object createManagedObject(Class<? extends ManagedObject> classToInstantiate, long numClones, ManagedObject clone, int[] cloneGroupID, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SystemManagedObject)getFirstLatticeManagedObject()).createManagedObject(classToInstantiate, numClones, clone, cloneGroupID, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,classToInstantiate,numClones,clone,cloneGroupID,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483646))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,classToInstantiate,numClones,clone,cloneGroupID,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483646);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,classToInstantiate,numClones,clone,cloneGroupID}, null, false}, 1, -2146483632, true, true, new Object[]{cloneGroupID,clone,numClones,classToInstantiate}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=intelligence(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,classToInstantiate,numClones,clone,cloneGroupID}, null, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
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
                classToInstantiate=(Class<? extends ManagedObject>)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
                numClones=(long)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[5];
                clone=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[6];
                cloneGroupID=(int[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[7];
                $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
                $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
ManagedObject newClone=null;
                try
                {
                    newClone=classToInstantiate.getConstructor().newInstance();
                }
                catch(InstantiationException|IllegalAccessException|IllegalArgumentException|InvocationTargetException|NoSuchMethodException|SecurityException e)
                {
                    Logger.getLogger(SystemManagedObject.class.getName()).log(Level.SEVERE, null, e);
                }
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646, this,clone,cloneGroupID}, 1, -2146483630, true, true, new Object[]{newClone,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,cloneGroupID,clone,numClones,classToInstantiate}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=newClone.instantiateClone(this, clone, cloneGroupID, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
                Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,newClone};
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

    /*
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483645)
    public Object createSplitFileManagedObject(StoreFileManagedObject[] splitPartsIDs, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SystemManagedObject)getFirstLatticeManagedObject()).createSplitFileManagedObject(splitPartsIDs, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483645,splitPartsIDs,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483645))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483645,splitPartsIDs,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483645);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483645, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483645,splitPartsIDs}, null, false}, 1, -2146483631, true, true, new Object[]{splitPartsIDs}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=intelligence(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483645,splitPartsIDs}, null, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
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
                splitPartsIDs=(StoreFileManagedObject[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
                $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
                $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
                try
                {
SplitFileManagedObject splitFileManagedObject=new SplitFileManagedObject(this, splitPartsIDs);
                    Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,splitFileManagedObject};
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
                catch(TimeOutException e)
                {
                    Logger.getLogger(SystemManagedObject.class.getName()).log(Level.SEVERE, null, e);
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
    */

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    private SystemManagedObject($_MANAGED_object_COMPILER_DUMMY_VARIABLE_$ $_MANAGED_object_COMPILER_DUMMY_variable_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(SystemManagedObject.class))
        {
            addPermission(permission, null, this);
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483644)
    public static   Object $_MANAGED_object_COMPILER_CREATE_METHOD_$(ManagedObject creator, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
SystemManagedObject $_MANAGED_object_COMPILER_CREATED_Object_$=new SystemManagedObject(new $_MANAGED_object_COMPILER_DUMMY_VARIABLE_$());
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            $_MANAGED_object_COMPILER_CREATED_Object_$.addPermission(permission, null, $_MANAGED_object_COMPILER_CREATED_Object_$);
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483644);
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
;
        $_MANAGED_object_COMPILER_CREATED_Object_$.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(creator, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_COMPILER_CREATED_Object_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,$_MANAGED_object_COMPILER_CREATED_Object_$};
        return null;
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483643)
    public SystemManagedObject $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(ManagedObject creator, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(SystemManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483643,creator,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483643);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483643,creator}, 1, -2146483629, true, true, new Object[]{creator}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=super.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(creator, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
        if(!getSID().equalsSID(HSystem.masterSID))
        {
            if(true)
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483643, this,HSystem.masterSID,HSystem.defaultCommunicationProtocol,HSystem.defaultSecurityLevel}, 1, -2146483628, true, true, new Object[]{creator}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                CommunicationManagedObject.$_MANAGED_object_COMPILER_CREATE_METHOD_$(this, HSystem.masterSID, HSystem.defaultCommunicationProtocol, HSystem.defaultSecurityLevel, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                return null;
            }
            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
            {
    throw new TimeOutException();
            }
CommunicationManagedObject commMO=((CommunicationManagedObject)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
Object[] addSystem=new Object[8];
            addSystem[0]=HSystem.SID;
            addSystem[1]=this;
            addSystem[2]=new int[][]{HSystem.systemMasterManagedObjectAttributes,HSystem.systemMasterManagedObjectWeights};
            try
            {
                addSystem[3]=SystemMasterManagedObject.class.getDeclaredMethod("addSystem", ManagedObject.class, byte[].class, int.class, InetAddress[].class, int.class, InetAddress.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$();
            }
            catch(NoSuchMethodException|SecurityException e)
            {
                Logger.getLogger(SystemManagedObject.class.getName()).log(Level.SEVERE, null, e);
            }
            addSystem[4]=this;
            addSystem[5]=HSystem.eCDH.getKeyPairComm().getPublic().getEncoded();
byte[] tempBy=new byte[4];
int[] dataTransferMOAttr=new int[HSystem.mOAttributesLength];
int[] dataTransferMinimumMOAttr=new int[dataTransferMOAttr.length];
int[] dataTransferMaximumMOAttr=new int[dataTransferMOAttr.length];
int[] dataTransferWeights=new int[dataTransferMOAttr.length];
            for(int attrNum=0; attrNum<dataTransferMOAttr.length; attrNum++)
            {
                if(attrNum==1)
                {
                    dataTransferMOAttr[attrNum]=HSystem.uDPManagedObjectClassHash;
                    dataTransferMinimumMOAttr[attrNum]=dataTransferMOAttr[attrNum];
                    dataTransferMaximumMOAttr[attrNum]=dataTransferMOAttr[attrNum];
                    dataTransferWeights[attrNum]=HSystem.intMaxValue;
                }
                else if(attrNum==2)
                {
                    dataTransferMOAttr[attrNum]=Integer.MIN_VALUE;
                    dataTransferMinimumMOAttr[attrNum]=Integer.MIN_VALUE;
                    dataTransferMaximumMOAttr[attrNum]=Integer.MAX_VALUE;
                    dataTransferWeights[attrNum]=HSystem.intMaxValue/10000;
                }
                else if(attrNum>6 && attrNum<15)
                {
                    System.arraycopy(HSystem.SID.SID, 4*(attrNum-7), tempBy, 0, tempBy.length);
                    dataTransferMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempBy);
                    dataTransferMinimumMOAttr[attrNum]=dataTransferMOAttr[attrNum];
                    dataTransferMaximumMOAttr[attrNum]=dataTransferMOAttr[attrNum];
                    dataTransferWeights[attrNum]=HSystem.intMaxValue;
                }
                else
                {
                    dataTransferMinimumMOAttr[attrNum]=Integer.MIN_VALUE;
                    dataTransferMaximumMOAttr[attrNum]=Integer.MAX_VALUE;
                }
            }
Node[] dataTransferManagedObject=latticeSearchLocal(dataTransferMOAttr, dataTransferMinimumMOAttr, dataTransferMaximumMOAttr, dataTransferWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
            addSystem[6]=((UDPManagedObject)dataTransferManagedObject[0].mO).socket.getLocalPort();
            try
            {
List<InetAddress> possibleIPs=new ArrayList<>();
Enumeration<NetworkInterface> networkInterfaces=NetworkInterface.getNetworkInterfaces();
                while(networkInterfaces.hasMoreElements())
                {
NetworkInterface networkInterface=networkInterfaces.nextElement();
Enumeration<InetAddress> ips=networkInterface.getInetAddresses();
                    while(ips.hasMoreElements())
                    {
InetAddress ipAddress=ips.nextElement();
                        if(ipAddress instanceof Inet4Address)
                        {
                            possibleIPs.add(ipAddress);
                        }
                    }
                }
                addSystem[7]=possibleIPs.toArray(new InetAddress[0]);
            }
            catch(SocketException e)
            {
                e.printStackTrace();
            }
            commMO.sendMessage(addSystem, $_MANAGED_object_COMPILER_DATA_$, this);
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

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483642)
    private Object $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addMaster_0_$(ByteArrayWrapper MOCompilier_Sending_SID, ManagedObject masterMOLink, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
$_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483642);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483642,masterMOLink}, 1, -2146483639, true, true, new Object[]{masterMOLink,MOCompilier_Sending_SID}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=integrate(masterMOLink, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
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

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483641)
    private Object $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addMaster_1_$(int nodeNum, List<Node> sysMONodes, Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$, ByteArrayWrapper MOCompilier_Sending_SID, ManagedObject masterMOLink, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
$_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483641);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483641,sysMONodes.get(nodeNum).mO}, 1, -2146483638, true, true, new Object[]{masterMOLink,MOCompilier_Sending_SID,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,sysMONodes,nodeNum}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=integrate(sysMONodes.get(nodeNum).mO, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
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

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483640)
    private Object $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addMaster_2_$(int nodeNum, List<Node> sysMONodes, Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$, ByteArrayWrapper MOCompilier_Sending_SID, ManagedObject masterMOLink, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
$_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483640);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483640,sysMONodes.get(nodeNum).mO}, 1, -2146483637, true, true, new Object[]{masterMOLink,MOCompilier_Sending_SID,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,sysMONodes,nodeNum}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=integrate(sysMONodes.get(nodeNum).mO, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
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

        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483639)
    private Object $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addMaster_0_$_MANAGED_object_COMPILER_METHOD_7(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
$_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483642);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
ManagedObject masterMOLink;
ByteArrayWrapper MOCompilier_Sending_SID;
        masterMOLink=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        MOCompilier_Sending_SID=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483638)
    private Object $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addMaster_1_$_MANAGED_object_COMPILER_METHOD_8(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
$_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483641);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
ManagedObject masterMOLink;
ByteArrayWrapper MOCompilier_Sending_SID;
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$;
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$;
List<Node> sysMONodes;
int nodeNum;
        masterMOLink=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        MOCompilier_Sending_SID=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
        $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
        $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=(Node[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
        sysMONodes=(List<Node>)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
        nodeNum=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483637)
    private Object $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addMaster_2_$_MANAGED_object_COMPILER_METHOD_9(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
$_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483640);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
ManagedObject masterMOLink;
ByteArrayWrapper MOCompilier_Sending_SID;
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$;
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$;
List<Node> sysMONodes;
int nodeNum;
        masterMOLink=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        MOCompilier_Sending_SID=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
        $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
        $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=(Node[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
        sysMONodes=(List<Node>)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
        nodeNum=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483636)
    private Object addMaster_MANAGED_object_COMPILER_METHOD_32(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SystemManagedObject)getFirstLatticeManagedObject()).addMaster_MANAGED_object_COMPILER_METHOD_32($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483636,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483636))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$;
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$;
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$;
ByteArrayWrapper MOCompilier_Sending_SID;
ManagedObject masterMOLink;
                $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=(Node[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                MOCompilier_Sending_SID=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                masterMOLink=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
List<Node> sysMONodes=(ArrayList<Node>)((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                for(int nodeNum=0; nodeNum<sysMONodes.size() && nodeNum<HSystem.numInitCheckNodesMOAttributes; nodeNum++)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$=new ByteArrayWrapper($_MANAGED_object_COMPILER_DATA_$.SID, new byte[16], $_MANAGED_object_COMPILER_DATA_$.intelligenceInfo, $_MANAGED_object_COMPILER_DATA_$.updateTime, $_MANAGED_object_COMPILER_DATA_$.data, $_MANAGED_object_COMPILER_DATA_$.userData);
                    $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$.randomizeCallPathID();
                    $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$.randomizeCallPathID();
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_1_$=latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
                    if($_MANAGED_object_COMPILER_SEARCH_RESULT_1_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_1_$[0].mO instanceof MOThread)
                    {
                        $_MANAGED_object_COMPILER_SEARCH_RESULT_1_$=new Node[]{new Node(HSystem.getBestMOThread())};
                    }
                    ((MOThread)$_MANAGED_object_COMPILER_SEARCH_RESULT_1_$[0].mO).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$, this,$_MANAGED_object_COMPILER_SEARCH_RESULT_1_$, null, new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$, this, this, -2146483641,nodeNum,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,MOCompilier_Sending_SID,masterMOLink}}, $_MANAGED_object_COMPILER_DATA_$, this);
                }
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, "latticeNodesMOAttributes"}, 1, -2146483635, true, true, new Object[]{sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,MOCompilier_Sending_SID,masterMOLink}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=masterMOLink.getVariable("latticeNodesMOAttributes", $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
                sysMONodes=(ArrayList<Node>)((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                for(int nodeNum=0; nodeNum<sysMONodes.size() && nodeNum<HSystem.numInitCheckNodesMOAttributes; nodeNum++)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$=new ByteArrayWrapper($_MANAGED_object_COMPILER_DATA_$.SID, new byte[16], $_MANAGED_object_COMPILER_DATA_$.intelligenceInfo, $_MANAGED_object_COMPILER_DATA_$.updateTime, $_MANAGED_object_COMPILER_DATA_$.data, $_MANAGED_object_COMPILER_DATA_$.userData);
                    $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$.randomizeCallPathID();
                    $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$.randomizeCallPathID();
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$=latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
                    if($_MANAGED_object_COMPILER_SEARCH_RESULT_2_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$[0].mO instanceof MOThread)
                    {
                        $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$=new Node[]{new Node(HSystem.getBestMOThread())};
                    }
                    ((MOThread)$_MANAGED_object_COMPILER_SEARCH_RESULT_2_$[0].mO).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$, this,$_MANAGED_object_COMPILER_SEARCH_RESULT_2_$, null, new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$, this, this, -2146483640,nodeNum,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,MOCompilier_Sending_SID,masterMOLink}}, $_MANAGED_object_COMPILER_DATA_$, this);
                }
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!! added master");
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483635)
    private Object addMaster_MANAGED_object_COMPILER_METHOD_33(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SystemManagedObject)getFirstLatticeManagedObject()).addMaster_MANAGED_object_COMPILER_METHOD_33($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483635,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483635))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
List<Node> sysMONodes;
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$;
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$;
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$;
ByteArrayWrapper MOCompilier_Sending_SID;
ManagedObject masterMOLink;
                sysMONodes=(List<Node>)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=(Node[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                MOCompilier_Sending_SID=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
                masterMOLink=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
                sysMONodes=(ArrayList<Node>)((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                for(int nodeNum=0; nodeNum<sysMONodes.size() && nodeNum<HSystem.numInitCheckNodesMOAttributes; nodeNum++)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$=new ByteArrayWrapper($_MANAGED_object_COMPILER_DATA_$.SID, new byte[16], $_MANAGED_object_COMPILER_DATA_$.intelligenceInfo, $_MANAGED_object_COMPILER_DATA_$.updateTime, $_MANAGED_object_COMPILER_DATA_$.data, $_MANAGED_object_COMPILER_DATA_$.userData);
                    $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$.randomizeCallPathID();
                    $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$.randomizeCallPathID();
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$=latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
                    if($_MANAGED_object_COMPILER_SEARCH_RESULT_2_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$[0].mO instanceof MOThread)
                    {
                        $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$=new Node[]{new Node(HSystem.getBestMOThread())};
                    }
                    ((MOThread)$_MANAGED_object_COMPILER_SEARCH_RESULT_2_$[0].mO).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$, this,$_MANAGED_object_COMPILER_SEARCH_RESULT_2_$, null, new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$, this, this, -2146483640,nodeNum,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,MOCompilier_Sending_SID,masterMOLink}}, $_MANAGED_object_COMPILER_DATA_$, this);
                }
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!! added master");
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483634)
    private void SystemManagedObject_MANAGED_object_COMPILER_METHOD_40(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483634,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483634))
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483633)
    private Object addMaster_MANAGED_object_COMPILER_METHOD_41(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SystemManagedObject)getFirstLatticeManagedObject()).addMaster_MANAGED_object_COMPILER_METHOD_41($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483633,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483633))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
ByteArrayWrapper MOCompilier_Sending_SID;
ManagedObject masterMOLink;
                MOCompilier_Sending_SID=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                masterMOLink=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
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
                masterMOLink=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
                MOCompilier_Sending_SID=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[5];
                $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
                $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
                if(masterMOLink.mOAttributes==null)
                {
                    masterMOLink=masterMOLink.latticeNodes.get(0).mO;
                }
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$=new ByteArrayWrapper($_MANAGED_object_COMPILER_DATA_$.SID, new byte[16], $_MANAGED_object_COMPILER_DATA_$.intelligenceInfo, $_MANAGED_object_COMPILER_DATA_$.updateTime, $_MANAGED_object_COMPILER_DATA_$.data, $_MANAGED_object_COMPILER_DATA_$.userData);
                $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$.randomizeCallPathID();
                $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$.randomizeCallPathID();
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
                if($_MANAGED_object_COMPILER_SEARCH_RESULT_0_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$[0].mO instanceof MOThread)
                {
                    $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=new Node[]{new Node(HSystem.getBestMOThread())};
                }
                ((MOThread)$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$[0].mO).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$, this,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$, null, new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$, this, this, -2146483642,MOCompilier_Sending_SID,masterMOLink}}, $_MANAGED_object_COMPILER_DATA_$, this);
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, "latticeNodes"}, 1, -2146483636, true, true, new Object[]{$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,MOCompilier_Sending_SID,masterMOLink}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=masterMOLink.getVariable("latticeNodes", $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
List<Node> sysMONodes=(ArrayList<Node>)((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                for(int nodeNum=0; nodeNum<sysMONodes.size() && nodeNum<HSystem.numInitCheckNodesMOAttributes; nodeNum++)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$=new ByteArrayWrapper($_MANAGED_object_COMPILER_DATA_$.SID, new byte[16], $_MANAGED_object_COMPILER_DATA_$.intelligenceInfo, $_MANAGED_object_COMPILER_DATA_$.updateTime, $_MANAGED_object_COMPILER_DATA_$.data, $_MANAGED_object_COMPILER_DATA_$.userData);
                    $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$.randomizeCallPathID();
                    $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$.randomizeCallPathID();
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_1_$=latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
                    if($_MANAGED_object_COMPILER_SEARCH_RESULT_1_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_1_$[0].mO instanceof MOThread)
                    {
                        $_MANAGED_object_COMPILER_SEARCH_RESULT_1_$=new Node[]{new Node(HSystem.getBestMOThread())};
                    }
                    ((MOThread)$_MANAGED_object_COMPILER_SEARCH_RESULT_1_$[0].mO).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$, this,$_MANAGED_object_COMPILER_SEARCH_RESULT_1_$, null, new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$, this, this, -2146483641,nodeNum,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,MOCompilier_Sending_SID,masterMOLink}}, $_MANAGED_object_COMPILER_DATA_$, this);
                }
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, "latticeNodesMOAttributes"}, 1, -2146483635, true, true, new Object[]{sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,MOCompilier_Sending_SID,masterMOLink}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=masterMOLink.getVariable("latticeNodesMOAttributes", $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
                sysMONodes=(ArrayList<Node>)((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                for(int nodeNum=0; nodeNum<sysMONodes.size() && nodeNum<HSystem.numInitCheckNodesMOAttributes; nodeNum++)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$=new ByteArrayWrapper($_MANAGED_object_COMPILER_DATA_$.SID, new byte[16], $_MANAGED_object_COMPILER_DATA_$.intelligenceInfo, $_MANAGED_object_COMPILER_DATA_$.updateTime, $_MANAGED_object_COMPILER_DATA_$.data, $_MANAGED_object_COMPILER_DATA_$.userData);
                    $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$.randomizeCallPathID();
                    $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$.randomizeCallPathID();
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$=latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
                    if($_MANAGED_object_COMPILER_SEARCH_RESULT_2_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$[0].mO instanceof MOThread)
                    {
                        $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$=new Node[]{new Node(HSystem.getBestMOThread())};
                    }
                    ((MOThread)$_MANAGED_object_COMPILER_SEARCH_RESULT_2_$[0].mO).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$, this,$_MANAGED_object_COMPILER_SEARCH_RESULT_2_$, null, new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$, this, this, -2146483640,nodeNum,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,MOCompilier_Sending_SID,masterMOLink}}, $_MANAGED_object_COMPILER_DATA_$, this);
                }
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!! added master");
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483632)
    private Object createManagedObject_MANAGED_object_COMPILER_METHOD_42(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SystemManagedObject)getFirstLatticeManagedObject()).createManagedObject_MANAGED_object_COMPILER_METHOD_42($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483632,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483632))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483646);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
int[] cloneGroupID;
ManagedObject clone;
long numClones;
Class<? extends ManagedObject> classToInstantiate;
                cloneGroupID=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                clone=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                numClones=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                classToInstantiate=(Class<? extends ManagedObject>)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
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
                classToInstantiate=(Class<? extends ManagedObject>)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
                numClones=(long)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[5];
                clone=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[6];
                cloneGroupID=(int[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[7];
                $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
                $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
ManagedObject newClone=null;
                try
                {
                    newClone=classToInstantiate.getConstructor().newInstance();
                }
                catch(InstantiationException|IllegalAccessException|IllegalArgumentException|InvocationTargetException|NoSuchMethodException|SecurityException e)
                {
                    Logger.getLogger(SystemManagedObject.class.getName()).log(Level.SEVERE, null, e);
                }
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646, this,clone,cloneGroupID}, 1, -2146483630, true, true, new Object[]{newClone,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,cloneGroupID,clone,numClones,classToInstantiate}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=newClone.instantiateClone(this, clone, cloneGroupID, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
                Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,newClone};
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
    
    /*
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483631)
    private Object createSplitFileManagedObject_MANAGED_object_COMPILER_METHOD_43(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SystemManagedObject)getFirstLatticeManagedObject()).createSplitFileManagedObject_MANAGED_object_COMPILER_METHOD_43($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483631,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483631))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483645,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483645);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
StoreFileManagedObject[] splitPartsIDs;
                splitPartsIDs=(StoreFileManagedObject[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
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
                splitPartsIDs=(StoreFileManagedObject[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
                $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
                $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
                try
                {
SplitFileManagedObject splitFileManagedObject=new SplitFileManagedObject(this, splitPartsIDs);
                    Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,splitFileManagedObject};
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
                catch(TimeOutException e)
                {
                    Logger.getLogger(SystemManagedObject.class.getName()).log(Level.SEVERE, null, e);
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
    */
    
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483630)
    private Object createManagedObject_MANAGED_object_COMPILER_METHOD_218(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SystemManagedObject)getFirstLatticeManagedObject()).createManagedObject_MANAGED_object_COMPILER_METHOD_218($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483630,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483630))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483646);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
ManagedObject newClone;
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$;
int[] cloneGroupID;
ManagedObject clone;
long numClones;
Class<? extends ManagedObject> classToInstantiate;
                newClone=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                cloneGroupID=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                clone=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                numClones=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
                classToInstantiate=(Class<? extends ManagedObject>)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
                Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,newClone};
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483629)
    private Object $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_245(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483643,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483643);
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
        if(!getSID().equalsSID(HSystem.masterSID))
        {
            if(true)
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483643, this,HSystem.masterSID,HSystem.defaultCommunicationProtocol,HSystem.defaultSecurityLevel}, 1, -2146483628, true, true, new Object[]{creator}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                CommunicationManagedObject.$_MANAGED_object_COMPILER_CREATE_METHOD_$(this, HSystem.masterSID, HSystem.defaultCommunicationProtocol, HSystem.defaultSecurityLevel, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                return null;
            }
            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
            {
    throw new TimeOutException();
            }
CommunicationManagedObject commMO=((CommunicationManagedObject)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
Object[] addSystem=new Object[8];
            addSystem[0]=HSystem.SID;
            addSystem[1]=this;
            addSystem[2]=new int[][]{HSystem.systemMasterManagedObjectAttributes,HSystem.systemMasterManagedObjectWeights};
            try
            {
                addSystem[3]=SystemMasterManagedObject.class.getDeclaredMethod("addSystem", ManagedObject.class, byte[].class, int.class, InetAddress[].class, int.class, InetAddress.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$();
            }
            catch(NoSuchMethodException|SecurityException e)
            {
                Logger.getLogger(SystemManagedObject.class.getName()).log(Level.SEVERE, null, e);
            }
            addSystem[4]=this;
            addSystem[5]=HSystem.eCDH.getKeyPairComm().getPublic().getEncoded();
byte[] tempBy=new byte[4];
int[] dataTransferMOAttr=new int[HSystem.mOAttributesLength];
int[] dataTransferMinimumMOAttr=new int[dataTransferMOAttr.length];
int[] dataTransferMaximumMOAttr=new int[dataTransferMOAttr.length];
int[] dataTransferWeights=new int[dataTransferMOAttr.length];
            for(int attrNum=0; attrNum<dataTransferMOAttr.length; attrNum++)
            {
                if(attrNum==1)
                {
                    dataTransferMOAttr[attrNum]=HSystem.uDPManagedObjectClassHash;
                    dataTransferMinimumMOAttr[attrNum]=dataTransferMOAttr[attrNum];
                    dataTransferMaximumMOAttr[attrNum]=dataTransferMOAttr[attrNum];
                    dataTransferWeights[attrNum]=HSystem.intMaxValue;
                }
                else if(attrNum==2)
                {
                    dataTransferMOAttr[attrNum]=Integer.MIN_VALUE;
                    dataTransferMinimumMOAttr[attrNum]=Integer.MIN_VALUE;
                    dataTransferMaximumMOAttr[attrNum]=Integer.MAX_VALUE;
                    dataTransferWeights[attrNum]=HSystem.intMaxValue/10000;
                }
                else if(attrNum>6 && attrNum<15)
                {
                    System.arraycopy(HSystem.SID.SID, 4*(attrNum-7), tempBy, 0, tempBy.length);
                    dataTransferMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempBy);
                    dataTransferMinimumMOAttr[attrNum]=dataTransferMOAttr[attrNum];
                    dataTransferMaximumMOAttr[attrNum]=dataTransferMOAttr[attrNum];
                    dataTransferWeights[attrNum]=HSystem.intMaxValue;
                }
                else
                {
                    dataTransferMinimumMOAttr[attrNum]=Integer.MIN_VALUE;
                    dataTransferMaximumMOAttr[attrNum]=Integer.MAX_VALUE;
                }
            }
Node[] dataTransferManagedObject=latticeSearchLocal(dataTransferMOAttr, dataTransferMinimumMOAttr, dataTransferMaximumMOAttr, dataTransferWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
            addSystem[6]=((UDPManagedObject)dataTransferManagedObject[0].mO).socket.getLocalPort();
            try
            {
List<InetAddress> possibleIPs=new ArrayList<>();
Enumeration<NetworkInterface> networkInterfaces=NetworkInterface.getNetworkInterfaces();
                while(networkInterfaces.hasMoreElements())
                {
NetworkInterface networkInterface=networkInterfaces.nextElement();
Enumeration<InetAddress> ips=networkInterface.getInetAddresses();
                    while(ips.hasMoreElements())
                    {
InetAddress ipAddress=ips.nextElement();
                        if(ipAddress instanceof Inet4Address)
                        {
                            possibleIPs.add(ipAddress);
                        }
                    }
                }
                addSystem[7]=possibleIPs.toArray(new InetAddress[0]);
            }
            catch(SocketException e)
            {
                e.printStackTrace();
            }
            commMO.sendMessage(addSystem, $_MANAGED_object_COMPILER_DATA_$, this);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483628)
    private Object $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_268(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483643,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483643);
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
CommunicationManagedObject commMO=((CommunicationManagedObject)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
Object[] addSystem=new Object[8];
        addSystem[0]=HSystem.SID;
        addSystem[1]=this;
        addSystem[2]=new int[][]{HSystem.systemMasterManagedObjectAttributes,HSystem.systemMasterManagedObjectWeights};
        try
        {
            addSystem[3]=SystemMasterManagedObject.class.getDeclaredMethod("addSystem", ManagedObject.class, byte[].class, int.class, InetAddress[].class, int.class, InetAddress.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$();
        }
        catch(NoSuchMethodException|SecurityException e)
        {
            Logger.getLogger(SystemManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
        addSystem[4]=this;
        addSystem[5]=HSystem.eCDH.getKeyPairComm().getPublic().getEncoded();
byte[] tempBy=new byte[4];
int[] dataTransferMOAttr=new int[HSystem.mOAttributesLength];
int[] dataTransferMinimumMOAttr=new int[dataTransferMOAttr.length];
int[] dataTransferMaximumMOAttr=new int[dataTransferMOAttr.length];
int[] dataTransferWeights=new int[dataTransferMOAttr.length];
        for(int attrNum=0; attrNum<dataTransferMOAttr.length; attrNum++)
        {
            if(attrNum==1)
            {
                dataTransferMOAttr[attrNum]=HSystem.uDPManagedObjectClassHash;
                dataTransferMinimumMOAttr[attrNum]=dataTransferMOAttr[attrNum];
                dataTransferMaximumMOAttr[attrNum]=dataTransferMOAttr[attrNum];
                dataTransferWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==2)
            {
                dataTransferMOAttr[attrNum]=Integer.MIN_VALUE;
                dataTransferMinimumMOAttr[attrNum]=Integer.MIN_VALUE;
                dataTransferMaximumMOAttr[attrNum]=Integer.MAX_VALUE;
                dataTransferWeights[attrNum]=HSystem.intMaxValue/10000;
            }
            else if(attrNum>6 && attrNum<15)
            {
                System.arraycopy(HSystem.SID.SID, 4*(attrNum-7), tempBy, 0, tempBy.length);
                dataTransferMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempBy);
                dataTransferMinimumMOAttr[attrNum]=dataTransferMOAttr[attrNum];
                dataTransferMaximumMOAttr[attrNum]=dataTransferMOAttr[attrNum];
                dataTransferWeights[attrNum]=HSystem.intMaxValue;
            }
            else
            {
                dataTransferMinimumMOAttr[attrNum]=Integer.MIN_VALUE;
                dataTransferMaximumMOAttr[attrNum]=Integer.MAX_VALUE;
            }
        }
Node[] dataTransferManagedObject=latticeSearchLocal(dataTransferMOAttr, dataTransferMinimumMOAttr, dataTransferMaximumMOAttr, dataTransferWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
        addSystem[6]=((UDPManagedObject)dataTransferManagedObject[0].mO).socket.getLocalPort();
        try
        {
List<InetAddress> possibleIPs=new ArrayList<>();
Enumeration<NetworkInterface> networkInterfaces=NetworkInterface.getNetworkInterfaces();
            while(networkInterfaces.hasMoreElements())
            {
NetworkInterface networkInterface=networkInterfaces.nextElement();
Enumeration<InetAddress> ips=networkInterface.getInetAddresses();
                while(ips.hasMoreElements())
                {
InetAddress ipAddress=ips.nextElement();
                    if(ipAddress instanceof Inet4Address)
                    {
                        possibleIPs.add(ipAddress);
                    }
                }
            }
            addSystem[7]=possibleIPs.toArray(new InetAddress[0]);
        }
        catch(SocketException e)
        {
            e.printStackTrace();
        }
        commMO.sendMessage(addSystem, $_MANAGED_object_COMPILER_DATA_$, this);
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
public static final int $_MANAGED_object_COMPILER_SystemManagedObject_$=2147483647;
public static final int $_MANAGED_object_COMPILER_SystemManagedObject_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2146483648;
public static final int $_MANAGED_object_COMPILER_addMaster_ManagedObject_ByteArrayWrapper_ByteArrayWrapper_ManagedObject_$=-2146483647;
public static final int $_MANAGED_object_COMPILER_createManagedObject_Class___$_extendsManagedObject___long_ManagedObject_int$$_ByteArrayWrapper_ManagedObject_$=-2146483646;
public static final int $_MANAGED_object_COMPILER_createSplitFileManagedObject_StoreFileManagedObject$$_ByteArrayWrapper_ManagedObject_$=-2146483645;
public static final int $_MANAGED_object_COMPILER_SystemManagedObject_$_MANAGED_object_COMPILER_DUMMY_VARIABLE_$_$=2147483647;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CREATE_METHOD_$_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2146483644;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2146483643;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONCURRENT_METHOD_addMaster_0_$_ByteArrayWrapper_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2146483642;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONCURRENT_METHOD_addMaster_1_$_int_List__Node___Node$$_ByteArrayWrapper_ByteArrayWrapper_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2146483641;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONCURRENT_METHOD_addMaster_2_$_int_List__Node___Node$$_ByteArrayWrapper_ByteArrayWrapper_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2146483640;
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public void MANAGED_object_COMPILER_RUN(Object[] message, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        switch((int)message[3])
        {
            case -2146483647:
                addMaster((ManagedObject)message[4], (ByteArrayWrapper)message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483646:
                createManagedObject((Class<? extends ManagedObject>)message[4], (long)message[5], (ManagedObject)message[6], (int[])message[7], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483645:
                //createSplitFileManagedObject((StoreFileManagedObject[])message[4], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483642:
                $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addMaster_0_$((ByteArrayWrapper)message[4], (ManagedObject)message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483641:
                $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addMaster_1_$((int)message[4], (List<Node>)message[5], (Node[])message[6], (ByteArrayWrapper)message[7], (ByteArrayWrapper)message[8], (ManagedObject)message[9], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483640:
                $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addMaster_2_$((int)message[4], (List<Node>)message[5], (Node[])message[6], (ByteArrayWrapper)message[7], (ByteArrayWrapper)message[8], (ManagedObject)message[9], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483639:
                $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addMaster_0_$_MANAGED_object_COMPILER_METHOD_7((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483638:
                $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addMaster_1_$_MANAGED_object_COMPILER_METHOD_8((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483637:
                $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addMaster_2_$_MANAGED_object_COMPILER_METHOD_9((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483636:
                addMaster_MANAGED_object_COMPILER_METHOD_32((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483635:
                addMaster_MANAGED_object_COMPILER_METHOD_33((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483634:
                SystemManagedObject_MANAGED_object_COMPILER_METHOD_40((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483633:
                addMaster_MANAGED_object_COMPILER_METHOD_41((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483632:
                createManagedObject_MANAGED_object_COMPILER_METHOD_42((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483631:
                //createSplitFileManagedObject_MANAGED_object_COMPILER_METHOD_43((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483630:
                createManagedObject_MANAGED_object_COMPILER_METHOD_218((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483629:
                $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_245((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483628:
                $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_268((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            default:
                super.MANAGED_object_COMPILER_RUN(message, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
    }
}

