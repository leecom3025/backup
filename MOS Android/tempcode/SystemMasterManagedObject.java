

package MO.Master;

import MO.ManagedObject;
import RT.ByteArrayWrapper;
import RT.HSystem;
import RT.ManagedObjectUtilities;
import RT.Node;
import RT.Exceptions.TimeOutException;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
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

public class SystemMasterManagedObject extends ManagedObject 

{

public static final byte[] $_MANAGED_object_COMPILER_CLASS_ID_$=new byte[]{102, -1, 10, 45, 109, 80, -41, -62, -60, -5, -1, 70, 112, -36, 54, 19, -4, 119, 74, -102, 2, 64, -67, 28, 30, 51, -69, 48, -39, 99, -45, 62};
static final long serialVersionUID=7421661901153687490L;
    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public void SystemMasterManagedObject() throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(ManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(SystemMasterManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
    }

    
    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483648)
    public void SystemMasterManagedObject(ManagedObject creator, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(ManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(SystemMasterManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
        if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648,creator,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483648))
        {
            if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648,creator,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new void MOPermissionDeniedException();
            }
            void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483648);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
            if(true)
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648,creator}, null, false}, 1, -2146483636, true, true, new Object[]{creator}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=void intelligence(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648,creator}, null, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
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
    protected void addSystem(ManagedObject masterMOLink, byte[] publicKey, int localPort, InetAddress[] localIPv4s, int port, InetAddress IPv4, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && void getFirstLatticeManagedObject()!=null)
        {
            return void ((SystemMasterManagedObject)void getFirstLatticeManagedObject()).addSystem(masterMOLink, publicKey, localPort, localIPv4s, port, IPv4, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,masterMOLink,publicKey,localPort,localIPv4s,port,IPv4,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483647))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,masterMOLink,publicKey,localPort,localIPv4s,port,IPv4,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new void MOPermissionDeniedException();
                }
                void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,masterMOLink,publicKey,localPort,localIPv4s,port,IPv4}, null, false}, 1, -2146483635, true, true, new Object[]{IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=void intelligence(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,masterMOLink,publicKey,localPort,localIPv4s,port,IPv4}, null, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new void TimeOutException();
                }
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                if($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$==null)
                {
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$, null};
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
                if(!checkPermission($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new void MOPermissionDeniedException();
                }
                masterMOLink=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
                publicKey=(byte[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[5];
                localPort=(int)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[6];
                localIPv4s=(InetAddress[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[7];
                port=(int)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[8];
                IPv4=(InetAddress)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[9];
                $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
                $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$=new void ByteArrayWrapper($_MANAGED_object_COMPILER_DATA_$.SID, new byte[16], $_MANAGED_object_COMPILER_DATA_$.intelligenceInfo, $_MANAGED_object_COMPILER_DATA_$.updateTime, $_MANAGED_object_COMPILER_DATA_$.data, $_MANAGED_object_COMPILER_DATA_$.userData);
                void $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$.randomizeCallPathID();
                void $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$.randomizeCallPathID();
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=void latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
                if($_MANAGED_object_COMPILER_SEARCH_RESULT_0_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$[0].mO instanceof MOThread)
                {
                    $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=new Node[]{new void Node(void HSystem.getBestMOThread())};
                }
                void ((MOThread)$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$[0].mO).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$, this,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$, null, new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$, this, this, -2146483644,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}}, $_MANAGED_object_COMPILER_DATA_$, this);
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, "latticeNodes"}, 1, -2146483638, true, true, new Object[]{$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=void masterMOLink.getVariable("latticeNodes", $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new void TimeOutException();
                }
List<Node> sysMONodes=(ArrayList<Node>)((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                for(int nodeNum=0; void nodeNum<sysMONodes.size() && nodeNum<HSystem.numInitCheckNodes; nodeNum++)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$=new void ByteArrayWrapper($_MANAGED_object_COMPILER_DATA_$.SID, new byte[16], $_MANAGED_object_COMPILER_DATA_$.intelligenceInfo, $_MANAGED_object_COMPILER_DATA_$.updateTime, $_MANAGED_object_COMPILER_DATA_$.data, $_MANAGED_object_COMPILER_DATA_$.userData);
                    void $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$.randomizeCallPathID();
                    void $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$.randomizeCallPathID();
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_1_$=void latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
                    if($_MANAGED_object_COMPILER_SEARCH_RESULT_1_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_1_$[0].mO instanceof MOThread)
                    {
                        $_MANAGED_object_COMPILER_SEARCH_RESULT_1_$=new Node[]{new void Node(void HSystem.getBestMOThread())};
                    }
                    void ((MOThread)$_MANAGED_object_COMPILER_SEARCH_RESULT_1_$[0].mO).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$, this,$_MANAGED_object_COMPILER_SEARCH_RESULT_1_$, null, new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$, this, this, -2146483643,nodeNum,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}}, $_MANAGED_object_COMPILER_DATA_$, this);
                }
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, "latticeNodesMOAttributes"}, 1, -2146483637, true, true, new Object[]{sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=void masterMOLink.getVariable("latticeNodesMOAttributes", $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new void TimeOutException();
                }
                sysMONodes=(ArrayList<Node>)((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                for(int nodeNum=0; void nodeNum<sysMONodes.size() && nodeNum<HSystem.numInitCheckNodesMOAttributes; nodeNum++)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$=new void ByteArrayWrapper($_MANAGED_object_COMPILER_DATA_$.SID, new byte[16], $_MANAGED_object_COMPILER_DATA_$.intelligenceInfo, $_MANAGED_object_COMPILER_DATA_$.updateTime, $_MANAGED_object_COMPILER_DATA_$.data, $_MANAGED_object_COMPILER_DATA_$.userData);
                    void $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$.randomizeCallPathID();
                    void $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$.randomizeCallPathID();
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$=void latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
                    if($_MANAGED_object_COMPILER_SEARCH_RESULT_2_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$[0].mO instanceof MOThread)
                    {
                        $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$=new Node[]{new void Node(void HSystem.getBestMOThread())};
                    }
                    void ((MOThread)$_MANAGED_object_COMPILER_SEARCH_RESULT_2_$[0].mO).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$, this,$_MANAGED_object_COMPILER_SEARCH_RESULT_2_$, null, new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$, this, this, -2146483642,nodeNum,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}}, $_MANAGED_object_COMPILER_DATA_$, this);
                }
MessageDigest sha256=null;
                try
                {
                    sha256=void MessageDigest.getInstance("SHA-256");
                }
                catch(NoSuchAlgorithmException e)
                {
                    void Logger.getLogger(void SystemMasterManagedObject.class.getName()).void log(Level.SEVERE, null, e);
                }
byte[] oID=void sha256.digest(publicKey);
                void sha256.reset();
byte[] tempBy=new byte[4];
int[] SIDMOAttrs=new int[HSystem.mOAttributesLength+16];
int[] minSIDMOVals=new int[SIDMOAttrs.length];
int[] maxSIDMOVals=new int[SIDMOAttrs.length];
int[] SIDMOWeights=new int[SIDMOAttrs.length];
                for(int attrNum=0; attrNum<SIDMOAttrs.length; attrNum++)
                {
                    if(attrNum==0)
                    {
                        SIDMOAttrs[attrNum]=HSystem.SIDMONameHash;
                        minSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        maxSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        SIDMOWeights[attrNum]=HSystem.intMaxValue;
                    }
                    else if(attrNum==1)
                    {
                        SIDMOAttrs[attrNum]=HSystem.SIDMOClassHash;
                        minSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        maxSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        SIDMOWeights[attrNum]=HSystem.intMaxValue;
                    }
                    else if(attrNum>6 && attrNum<15)
                    {
                        void System.arraycopy(HSystem.masterSID.SID, 4*(attrNum-7), tempBy, 0, tempBy.length);
                        SIDMOAttrs[attrNum]=void ManagedObjectUtilities.b8ToB10Int(tempBy);
                        minSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        maxSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        SIDMOWeights[attrNum]=HSystem.intMaxValue;
                    }
                    else if(attrNum>HSystem.mOAttributesLength && attrNum<HSystem.mOAttributesLength+9)
                    {
                        void System.arraycopy(oID, 4*(attrNum-HSystem.mOAttributesLength-1), tempBy, 0, tempBy.length);
                        SIDMOAttrs[attrNum]=void ManagedObjectUtilities.b8ToB10Int(tempBy);
                        minSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        maxSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        SIDMOWeights[attrNum]=HSystem.intMaxValue;
                    }
                    else
                    {
                        minSIDMOVals[attrNum]=Integer.MIN_VALUE;
                        maxSIDMOVals[attrNum]=Integer.MAX_VALUE;
                        SIDMOWeights[attrNum]=0;
                    }
                }
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,SIDMOAttrs,minSIDMOVals,maxSIDMOVals,SIDMOWeights, 1,HSystem.numInitCheckNodes, false}, 1, -2146483634, true, true, new Object[]{SIDMOWeights,maxSIDMOVals,minSIDMOVals,SIDMOAttrs,tempBy,oID,sha256,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=void latticeSearch(SIDMOAttrs, minSIDMOVals, maxSIDMOVals, SIDMOWeights, 1, HSystem.numInitCheckNodes, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new void TimeOutException();
                }
Node[] SID=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                if(SID.length==0)
                {
                    if(true)
                    {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, this,publicKey,port,IPv4,localPort,localIPv4s}, 1, -2146483632, true, true, new Object[]{SID,SIDMOWeights,maxSIDMOVals,minSIDMOVals,SIDMOAttrs,tempBy,oID,sha256,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                        void SIDMO.$_MANAGED_object_COMPILER_CREATE_METHOD_$(this, publicKey, port, IPv4, localPort, localIPv4s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                        return null;
                    }
                    if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                    {
    throw new void TimeOutException();
                    }
                }
                void System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! added system");
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
            else
            {
                return null;
            }
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    private void SystemMasterManagedObject($_MANAGED_object_COMPILER_DUMMY_VARIABLE_$ $_MANAGED_object_COMPILER_DUMMY_variable_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(ManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(SystemMasterManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483646)
    public static   void $_MANAGED_object_COMPILER_CREATE_METHOD_$(ManagedObject creator, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
SystemMasterManagedObject $_MANAGED_object_COMPILER_CREATED_Object_$=new void SystemMasterManagedObject(new void $_MANAGED_object_COMPILER_DUMMY_VARIABLE_$());
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(ManagedObject.class))
        {
            void $_MANAGED_object_COMPILER_CREATED_Object_$.addPermission(permission, null, $_MANAGED_object_COMPILER_CREATED_Object_$);
        }
        void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483646);
        void $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
;
        void $_MANAGED_object_COMPILER_CREATED_Object_$.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(creator, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_COMPILER_CREATED_Object_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,$_MANAGED_object_COMPILER_CREATED_Object_$};
        return null;
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483645)
    public void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(ManagedObject creator, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: void HSystem.getDefaultPermission(SystemMasterManagedObject.class))
        {
            void addPermission(permission, null, this);
        }
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483645,creator,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new void MOPermissionDeniedException();
        }
        void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483645);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        void $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483645,creator}, 1, -2146483633, true, true, new Object[]{creator}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=void super.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(creator, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
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

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483644)
    private void $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addSystem_0_$(InetAddress IPv4, int port, InetAddress[] localIPv4s, int localPort, byte[] publicKey, ManagedObject masterMOLink, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483644);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        void $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483644,masterMOLink}, 1, -2146483641, true, true, new Object[]{masterMOLink,publicKey,localPort,localIPv4s,port,IPv4}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=void integrate(masterMOLink, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
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

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483643)
    private void $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addSystem_1_$(int nodeNum, List<Node> sysMONodes, Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$, InetAddress IPv4, int port, InetAddress[] localIPv4s, int localPort, byte[] publicKey, ManagedObject masterMOLink, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483643);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        void $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483643, voidvoid sysMONodes.get(nodeNum).mO}, 1, -2146483640, true, true, new Object[]{masterMOLink,publicKey,localPort,localIPv4s,port,IPv4,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,sysMONodes,nodeNum}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=void integrate(void sysMONodes.get(nodeNum).mO, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
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

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483642)
    private void $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addSystem_2_$(int nodeNum, List<Node> sysMONodes, Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$, InetAddress IPv4, int port, InetAddress[] localIPv4s, int localPort, byte[] publicKey, ManagedObject masterMOLink, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483642);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        void $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483642, voidvoid sysMONodes.get(nodeNum).mO}, 1, -2146483639, true, true, new Object[]{masterMOLink,publicKey,localPort,localIPv4s,port,IPv4,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,sysMONodes,nodeNum}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=void integrate(void sysMONodes.get(nodeNum).mO, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
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

        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483641)
    private void $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addSystem_0_$_MANAGED_object_COMPILER_METHOD_10(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483644);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=void ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
ManagedObject masterMOLink;
byte[] publicKey;
int localPort;
InetAddress[] localIPv4s;
int port;
InetAddress IPv4;
        masterMOLink=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        publicKey=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
        localPort=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
        localIPv4s=(InetAddress[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
        port=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
        IPv4=(InetAddress)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483640)
    private void $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addSystem_1_$_MANAGED_object_COMPILER_METHOD_11(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483643);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=void ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
ManagedObject masterMOLink;
byte[] publicKey;
int localPort;
InetAddress[] localIPv4s;
int port;
InetAddress IPv4;
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$;
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$;
List<Node> sysMONodes;
int nodeNum;
        masterMOLink=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        publicKey=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
        localPort=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
        localIPv4s=(InetAddress[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
        port=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
        IPv4=(InetAddress)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
        $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
        $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=(Node[])$_MANAGED_object_COMPILER_RETURN_STATE_$[7];
        sysMONodes=(List<Node>)$_MANAGED_object_COMPILER_RETURN_STATE_$[8];
        nodeNum=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[9];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483639)
    private void $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addSystem_2_$_MANAGED_object_COMPILER_METHOD_12(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483642);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=void ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
ManagedObject masterMOLink;
byte[] publicKey;
int localPort;
InetAddress[] localIPv4s;
int port;
InetAddress IPv4;
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$;
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$;
List<Node> sysMONodes;
int nodeNum;
        masterMOLink=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        publicKey=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
        localPort=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
        localIPv4s=(InetAddress[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
        port=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
        IPv4=(InetAddress)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
        $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
        $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=(Node[])$_MANAGED_object_COMPILER_RETURN_STATE_$[7];
        sysMONodes=(List<Node>)$_MANAGED_object_COMPILER_RETURN_STATE_$[8];
        nodeNum=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[9];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new void TimeOutException();
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483638)
    private void addSystem_MANAGED_object_COMPILER_METHOD_34(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && void getFirstLatticeManagedObject()!=null)
        {
            return void ((SystemMasterManagedObject)void getFirstLatticeManagedObject()).addSystem_MANAGED_object_COMPILER_METHOD_34($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483638,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483638))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new void MOPermissionDeniedException();
                }
                void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=void ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$;
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$;
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$;
InetAddress IPv4;
int port;
InetAddress[] localIPv4s;
int localPort;
byte[] publicKey;
ManagedObject masterMOLink;
                $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=(Node[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                IPv4=(InetAddress)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                port=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
                localIPv4s=(InetAddress[])$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
                localPort=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
                publicKey=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[7];
                masterMOLink=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[8];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new void TimeOutException();
                }
List<Node> sysMONodes=(ArrayList<Node>)((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                for(int nodeNum=0; void nodeNum<sysMONodes.size() && nodeNum<HSystem.numInitCheckNodes; nodeNum++)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$=new void ByteArrayWrapper($_MANAGED_object_COMPILER_DATA_$.SID, new byte[16], $_MANAGED_object_COMPILER_DATA_$.intelligenceInfo, $_MANAGED_object_COMPILER_DATA_$.updateTime, $_MANAGED_object_COMPILER_DATA_$.data, $_MANAGED_object_COMPILER_DATA_$.userData);
                    void $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$.randomizeCallPathID();
                    void $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$.randomizeCallPathID();
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_1_$=void latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
                    if($_MANAGED_object_COMPILER_SEARCH_RESULT_1_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_1_$[0].mO instanceof MOThread)
                    {
                        $_MANAGED_object_COMPILER_SEARCH_RESULT_1_$=new Node[]{new void Node(void HSystem.getBestMOThread())};
                    }
                    void ((MOThread)$_MANAGED_object_COMPILER_SEARCH_RESULT_1_$[0].mO).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$, this,$_MANAGED_object_COMPILER_SEARCH_RESULT_1_$, null, new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$, this, this, -2146483643,nodeNum,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}}, $_MANAGED_object_COMPILER_DATA_$, this);
                }
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, "latticeNodesMOAttributes"}, 1, -2146483637, true, true, new Object[]{sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=void masterMOLink.getVariable("latticeNodesMOAttributes", $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new void TimeOutException();
                }
                sysMONodes=(ArrayList<Node>)((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                for(int nodeNum=0; void nodeNum<sysMONodes.size() && nodeNum<HSystem.numInitCheckNodesMOAttributes; nodeNum++)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$=new void ByteArrayWrapper($_MANAGED_object_COMPILER_DATA_$.SID, new byte[16], $_MANAGED_object_COMPILER_DATA_$.intelligenceInfo, $_MANAGED_object_COMPILER_DATA_$.updateTime, $_MANAGED_object_COMPILER_DATA_$.data, $_MANAGED_object_COMPILER_DATA_$.userData);
                    void $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$.randomizeCallPathID();
                    void $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$.randomizeCallPathID();
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$=void latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
                    if($_MANAGED_object_COMPILER_SEARCH_RESULT_2_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$[0].mO instanceof MOThread)
                    {
                        $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$=new Node[]{new void Node(void HSystem.getBestMOThread())};
                    }
                    void ((MOThread)$_MANAGED_object_COMPILER_SEARCH_RESULT_2_$[0].mO).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$, this,$_MANAGED_object_COMPILER_SEARCH_RESULT_2_$, null, new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$, this, this, -2146483642,nodeNum,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}}, $_MANAGED_object_COMPILER_DATA_$, this);
                }
MessageDigest sha256=null;
                try
                {
                    sha256=void MessageDigest.getInstance("SHA-256");
                }
                catch(NoSuchAlgorithmException e)
                {
                    void Logger.getLogger(void SystemMasterManagedObject.class.getName()).void log(Level.SEVERE, null, e);
                }
byte[] oID=void sha256.digest(publicKey);
                void sha256.reset();
byte[] tempBy=new byte[4];
int[] SIDMOAttrs=new int[HSystem.mOAttributesLength+16];
int[] minSIDMOVals=new int[SIDMOAttrs.length];
int[] maxSIDMOVals=new int[SIDMOAttrs.length];
int[] SIDMOWeights=new int[SIDMOAttrs.length];
                for(int attrNum=0; attrNum<SIDMOAttrs.length; attrNum++)
                {
                    if(attrNum==0)
                    {
                        SIDMOAttrs[attrNum]=HSystem.SIDMONameHash;
                        minSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        maxSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        SIDMOWeights[attrNum]=HSystem.intMaxValue;
                    }
                    else if(attrNum==1)
                    {
                        SIDMOAttrs[attrNum]=HSystem.SIDMOClassHash;
                        minSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        maxSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        SIDMOWeights[attrNum]=HSystem.intMaxValue;
                    }
                    else if(attrNum>6 && attrNum<15)
                    {
                        void System.arraycopy(HSystem.masterSID.SID, 4*(attrNum-7), tempBy, 0, tempBy.length);
                        SIDMOAttrs[attrNum]=void ManagedObjectUtilities.b8ToB10Int(tempBy);
                        minSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        maxSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        SIDMOWeights[attrNum]=HSystem.intMaxValue;
                    }
                    else if(attrNum>HSystem.mOAttributesLength && attrNum<HSystem.mOAttributesLength+9)
                    {
                        void System.arraycopy(oID, 4*(attrNum-HSystem.mOAttributesLength-1), tempBy, 0, tempBy.length);
                        SIDMOAttrs[attrNum]=void ManagedObjectUtilities.b8ToB10Int(tempBy);
                        minSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        maxSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        SIDMOWeights[attrNum]=HSystem.intMaxValue;
                    }
                    else
                    {
                        minSIDMOVals[attrNum]=Integer.MIN_VALUE;
                        maxSIDMOVals[attrNum]=Integer.MAX_VALUE;
                        SIDMOWeights[attrNum]=0;
                    }
                }
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,SIDMOAttrs,minSIDMOVals,maxSIDMOVals,SIDMOWeights, 1,HSystem.numInitCheckNodes, false}, 1, -2146483634, true, true, new Object[]{SIDMOWeights,maxSIDMOVals,minSIDMOVals,SIDMOAttrs,tempBy,oID,sha256,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=void latticeSearch(SIDMOAttrs, minSIDMOVals, maxSIDMOVals, SIDMOWeights, 1, HSystem.numInitCheckNodes, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new void TimeOutException();
                }
Node[] SID=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                if(SID.length==0)
                {
                    if(true)
                    {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, this,publicKey,port,IPv4,localPort,localIPv4s}, 1, -2146483632, true, true, new Object[]{SID,SIDMOWeights,maxSIDMOVals,minSIDMOVals,SIDMOAttrs,tempBy,oID,sha256,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                        void SIDMO.$_MANAGED_object_COMPILER_CREATE_METHOD_$(this, publicKey, port, IPv4, localPort, localIPv4s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                        return null;
                    }
                    if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                    {
    throw new void TimeOutException();
                    }
                }
                void System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! added system");
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
            else
            {
                return null;
            }
        }
    }
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483637)
    private void addSystem_MANAGED_object_COMPILER_METHOD_35(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && void getFirstLatticeManagedObject()!=null)
        {
            return void ((SystemMasterManagedObject)void getFirstLatticeManagedObject()).addSystem_MANAGED_object_COMPILER_METHOD_35($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483637,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483637))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new void MOPermissionDeniedException();
                }
                void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=void ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
List<Node> sysMONodes;
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$;
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$;
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$;
InetAddress IPv4;
int port;
InetAddress[] localIPv4s;
int localPort;
byte[] publicKey;
ManagedObject masterMOLink;
                sysMONodes=(List<Node>)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=(Node[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                IPv4=(InetAddress)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
                port=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
                localIPv4s=(InetAddress[])$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
                localPort=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[7];
                publicKey=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[8];
                masterMOLink=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[9];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new void TimeOutException();
                }
                sysMONodes=(ArrayList<Node>)((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                for(int nodeNum=0; void nodeNum<sysMONodes.size() && nodeNum<HSystem.numInitCheckNodesMOAttributes; nodeNum++)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$=new void ByteArrayWrapper($_MANAGED_object_COMPILER_DATA_$.SID, new byte[16], $_MANAGED_object_COMPILER_DATA_$.intelligenceInfo, $_MANAGED_object_COMPILER_DATA_$.updateTime, $_MANAGED_object_COMPILER_DATA_$.data, $_MANAGED_object_COMPILER_DATA_$.userData);
                    void $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$.randomizeCallPathID();
                    void $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$.randomizeCallPathID();
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$=void latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
                    if($_MANAGED_object_COMPILER_SEARCH_RESULT_2_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$[0].mO instanceof MOThread)
                    {
                        $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$=new Node[]{new void Node(void HSystem.getBestMOThread())};
                    }
                    void ((MOThread)$_MANAGED_object_COMPILER_SEARCH_RESULT_2_$[0].mO).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$, this,$_MANAGED_object_COMPILER_SEARCH_RESULT_2_$, null, new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$, this, this, -2146483642,nodeNum,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}}, $_MANAGED_object_COMPILER_DATA_$, this);
                }
MessageDigest sha256=null;
                try
                {
                    sha256=void MessageDigest.getInstance("SHA-256");
                }
                catch(NoSuchAlgorithmException e)
                {
                    void Logger.getLogger(void SystemMasterManagedObject.class.getName()).void log(Level.SEVERE, null, e);
                }
byte[] oID=void sha256.digest(publicKey);
                void sha256.reset();
byte[] tempBy=new byte[4];
int[] SIDMOAttrs=new int[HSystem.mOAttributesLength+16];
int[] minSIDMOVals=new int[SIDMOAttrs.length];
int[] maxSIDMOVals=new int[SIDMOAttrs.length];
int[] SIDMOWeights=new int[SIDMOAttrs.length];
                for(int attrNum=0; attrNum<SIDMOAttrs.length; attrNum++)
                {
                    if(attrNum==0)
                    {
                        SIDMOAttrs[attrNum]=HSystem.SIDMONameHash;
                        minSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        maxSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        SIDMOWeights[attrNum]=HSystem.intMaxValue;
                    }
                    else if(attrNum==1)
                    {
                        SIDMOAttrs[attrNum]=HSystem.SIDMOClassHash;
                        minSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        maxSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        SIDMOWeights[attrNum]=HSystem.intMaxValue;
                    }
                    else if(attrNum>6 && attrNum<15)
                    {
                        void System.arraycopy(HSystem.masterSID.SID, 4*(attrNum-7), tempBy, 0, tempBy.length);
                        SIDMOAttrs[attrNum]=void ManagedObjectUtilities.b8ToB10Int(tempBy);
                        minSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        maxSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        SIDMOWeights[attrNum]=HSystem.intMaxValue;
                    }
                    else if(attrNum>HSystem.mOAttributesLength && attrNum<HSystem.mOAttributesLength+9)
                    {
                        void System.arraycopy(oID, 4*(attrNum-HSystem.mOAttributesLength-1), tempBy, 0, tempBy.length);
                        SIDMOAttrs[attrNum]=void ManagedObjectUtilities.b8ToB10Int(tempBy);
                        minSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        maxSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        SIDMOWeights[attrNum]=HSystem.intMaxValue;
                    }
                    else
                    {
                        minSIDMOVals[attrNum]=Integer.MIN_VALUE;
                        maxSIDMOVals[attrNum]=Integer.MAX_VALUE;
                        SIDMOWeights[attrNum]=0;
                    }
                }
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,SIDMOAttrs,minSIDMOVals,maxSIDMOVals,SIDMOWeights, 1,HSystem.numInitCheckNodes, false}, 1, -2146483634, true, true, new Object[]{SIDMOWeights,maxSIDMOVals,minSIDMOVals,SIDMOAttrs,tempBy,oID,sha256,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=void latticeSearch(SIDMOAttrs, minSIDMOVals, maxSIDMOVals, SIDMOWeights, 1, HSystem.numInitCheckNodes, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new void TimeOutException();
                }
Node[] SID=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                if(SID.length==0)
                {
                    if(true)
                    {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, this,publicKey,port,IPv4,localPort,localIPv4s}, 1, -2146483632, true, true, new Object[]{SID,SIDMOWeights,maxSIDMOVals,minSIDMOVals,SIDMOAttrs,tempBy,oID,sha256,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                        void SIDMO.$_MANAGED_object_COMPILER_CREATE_METHOD_$(this, publicKey, port, IPv4, localPort, localIPv4s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                        return null;
                    }
                    if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                    {
    throw new void TimeOutException();
                    }
                }
                void System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! added system");
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
            else
            {
                return null;
            }
        }
    }
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483636)
    private void SystemMasterManagedObject_MANAGED_object_COMPILER_METHOD_56(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483636,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483636))
        {
            if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new void MOPermissionDeniedException();
            }
            void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483648);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=void ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
ManagedObject creator;
            creator=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483635)
    private void addSystem_MANAGED_object_COMPILER_METHOD_57(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && void getFirstLatticeManagedObject()!=null)
        {
            return void ((SystemMasterManagedObject)void getFirstLatticeManagedObject()).addSystem_MANAGED_object_COMPILER_METHOD_57($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483635,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483635))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new void MOPermissionDeniedException();
                }
                void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=void ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
InetAddress IPv4;
int port;
InetAddress[] localIPv4s;
int localPort;
byte[] publicKey;
ManagedObject masterMOLink;
                IPv4=(InetAddress)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                port=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                localIPv4s=(InetAddress[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                localPort=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                publicKey=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
                masterMOLink=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new void TimeOutException();
                }
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                if($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$==null)
                {
Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$, null};
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
                if(!checkPermission($_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new void MOPermissionDeniedException();
                }
                masterMOLink=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
                publicKey=(byte[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[5];
                localPort=(int)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[6];
                localIPv4s=(InetAddress[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[7];
                port=(int)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[8];
                IPv4=(InetAddress)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[9];
                $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
                $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$=new void ByteArrayWrapper($_MANAGED_object_COMPILER_DATA_$.SID, new byte[16], $_MANAGED_object_COMPILER_DATA_$.intelligenceInfo, $_MANAGED_object_COMPILER_DATA_$.updateTime, $_MANAGED_object_COMPILER_DATA_$.data, $_MANAGED_object_COMPILER_DATA_$.userData);
                void $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$.randomizeCallPathID();
                void $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$.randomizeCallPathID();
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=void latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
                if($_MANAGED_object_COMPILER_SEARCH_RESULT_0_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$[0].mO instanceof MOThread)
                {
                    $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=new Node[]{new void Node(void HSystem.getBestMOThread())};
                }
                void ((MOThread)$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$[0].mO).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$, this,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$, null, new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$, this, this, -2146483644,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}}, $_MANAGED_object_COMPILER_DATA_$, this);
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, "latticeNodes"}, 1, -2146483638, true, true, new Object[]{$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=void masterMOLink.getVariable("latticeNodes", $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new void TimeOutException();
                }
List<Node> sysMONodes=(ArrayList<Node>)((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                for(int nodeNum=0; void nodeNum<sysMONodes.size() && nodeNum<HSystem.numInitCheckNodes; nodeNum++)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$=new void ByteArrayWrapper($_MANAGED_object_COMPILER_DATA_$.SID, new byte[16], $_MANAGED_object_COMPILER_DATA_$.intelligenceInfo, $_MANAGED_object_COMPILER_DATA_$.updateTime, $_MANAGED_object_COMPILER_DATA_$.data, $_MANAGED_object_COMPILER_DATA_$.userData);
                    void $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$.randomizeCallPathID();
                    void $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$.randomizeCallPathID();
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_1_$=void latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
                    if($_MANAGED_object_COMPILER_SEARCH_RESULT_1_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_1_$[0].mO instanceof MOThread)
                    {
                        $_MANAGED_object_COMPILER_SEARCH_RESULT_1_$=new Node[]{new void Node(void HSystem.getBestMOThread())};
                    }
                    void ((MOThread)$_MANAGED_object_COMPILER_SEARCH_RESULT_1_$[0].mO).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$, this,$_MANAGED_object_COMPILER_SEARCH_RESULT_1_$, null, new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$, this, this, -2146483643,nodeNum,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}}, $_MANAGED_object_COMPILER_DATA_$, this);
                }
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, "latticeNodesMOAttributes"}, 1, -2146483637, true, true, new Object[]{sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=void masterMOLink.getVariable("latticeNodesMOAttributes", $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new void TimeOutException();
                }
                sysMONodes=(ArrayList<Node>)((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                for(int nodeNum=0; void nodeNum<sysMONodes.size() && nodeNum<HSystem.numInitCheckNodesMOAttributes; nodeNum++)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$=new void ByteArrayWrapper($_MANAGED_object_COMPILER_DATA_$.SID, new byte[16], $_MANAGED_object_COMPILER_DATA_$.intelligenceInfo, $_MANAGED_object_COMPILER_DATA_$.updateTime, $_MANAGED_object_COMPILER_DATA_$.data, $_MANAGED_object_COMPILER_DATA_$.userData);
                    void $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$.randomizeCallPathID();
                    void $_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$.randomizeCallPathID();
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$=void latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
                    if($_MANAGED_object_COMPILER_SEARCH_RESULT_2_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$[0].mO instanceof MOThread)
                    {
                        $_MANAGED_object_COMPILER_SEARCH_RESULT_2_$=new Node[]{new void Node(void HSystem.getBestMOThread())};
                    }
                    void ((MOThread)$_MANAGED_object_COMPILER_SEARCH_RESULT_2_$[0].mO).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$, this,$_MANAGED_object_COMPILER_SEARCH_RESULT_2_$, null, new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_2_$, this, this, -2146483642,nodeNum,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}}, $_MANAGED_object_COMPILER_DATA_$, this);
                }
MessageDigest sha256=null;
                try
                {
                    sha256=void MessageDigest.getInstance("SHA-256");
                }
                catch(NoSuchAlgorithmException e)
                {
                    void Logger.getLogger(void SystemMasterManagedObject.class.getName()).void log(Level.SEVERE, null, e);
                }
byte[] oID=void sha256.digest(publicKey);
                void sha256.reset();
byte[] tempBy=new byte[4];
int[] SIDMOAttrs=new int[HSystem.mOAttributesLength+16];
int[] minSIDMOVals=new int[SIDMOAttrs.length];
int[] maxSIDMOVals=new int[SIDMOAttrs.length];
int[] SIDMOWeights=new int[SIDMOAttrs.length];
                for(int attrNum=0; attrNum<SIDMOAttrs.length; attrNum++)
                {
                    if(attrNum==0)
                    {
                        SIDMOAttrs[attrNum]=HSystem.SIDMONameHash;
                        minSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        maxSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        SIDMOWeights[attrNum]=HSystem.intMaxValue;
                    }
                    else if(attrNum==1)
                    {
                        SIDMOAttrs[attrNum]=HSystem.SIDMOClassHash;
                        minSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        maxSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        SIDMOWeights[attrNum]=HSystem.intMaxValue;
                    }
                    else if(attrNum>6 && attrNum<15)
                    {
                        void System.arraycopy(HSystem.masterSID.SID, 4*(attrNum-7), tempBy, 0, tempBy.length);
                        SIDMOAttrs[attrNum]=void ManagedObjectUtilities.b8ToB10Int(tempBy);
                        minSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        maxSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        SIDMOWeights[attrNum]=HSystem.intMaxValue;
                    }
                    else if(attrNum>HSystem.mOAttributesLength && attrNum<HSystem.mOAttributesLength+9)
                    {
                        void System.arraycopy(oID, 4*(attrNum-HSystem.mOAttributesLength-1), tempBy, 0, tempBy.length);
                        SIDMOAttrs[attrNum]=void ManagedObjectUtilities.b8ToB10Int(tempBy);
                        minSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        maxSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                        SIDMOWeights[attrNum]=HSystem.intMaxValue;
                    }
                    else
                    {
                        minSIDMOVals[attrNum]=Integer.MIN_VALUE;
                        maxSIDMOVals[attrNum]=Integer.MAX_VALUE;
                        SIDMOWeights[attrNum]=0;
                    }
                }
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,SIDMOAttrs,minSIDMOVals,maxSIDMOVals,SIDMOWeights, 1,HSystem.numInitCheckNodes, false}, 1, -2146483634, true, true, new Object[]{SIDMOWeights,maxSIDMOVals,minSIDMOVals,SIDMOAttrs,tempBy,oID,sha256,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=void latticeSearch(SIDMOAttrs, minSIDMOVals, maxSIDMOVals, SIDMOWeights, 1, HSystem.numInitCheckNodes, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new void TimeOutException();
                }
Node[] SID=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                if(SID.length==0)
                {
                    if(true)
                    {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, this,publicKey,port,IPv4,localPort,localIPv4s}, 1, -2146483632, true, true, new Object[]{SID,SIDMOWeights,maxSIDMOVals,minSIDMOVals,SIDMOAttrs,tempBy,oID,sha256,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                        void SIDMO.$_MANAGED_object_COMPILER_CREATE_METHOD_$(this, publicKey, port, IPv4, localPort, localIPv4s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                        return null;
                    }
                    if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                    {
    throw new void TimeOutException();
                    }
                }
                void System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! added system");
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
            else
            {
                return null;
            }
        }
    }
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483634)
    private void addSystem_MANAGED_object_COMPILER_METHOD_140(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && void getFirstLatticeManagedObject()!=null)
        {
            return void ((SystemMasterManagedObject)void getFirstLatticeManagedObject()).addSystem_MANAGED_object_COMPILER_METHOD_140($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483634,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483634))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new void MOPermissionDeniedException();
                }
                void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=void ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
int[] SIDMOWeights;
int[] maxSIDMOVals;
int[] minSIDMOVals;
int[] SIDMOAttrs;
byte[] tempBy;
byte[] oID;
MessageDigest sha256;
List<Node> sysMONodes;
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$;
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$;
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$;
InetAddress IPv4;
int port;
InetAddress[] localIPv4s;
int localPort;
byte[] publicKey;
ManagedObject masterMOLink;
                SIDMOWeights=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                maxSIDMOVals=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                minSIDMOVals=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                SIDMOAttrs=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                tempBy=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
                oID=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
                sha256=(MessageDigest)$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
                sysMONodes=(List<Node>)$_MANAGED_object_COMPILER_RETURN_STATE_$[7];
                $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=(Node[])$_MANAGED_object_COMPILER_RETURN_STATE_$[8];
                $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[9];
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[10];
                IPv4=(InetAddress)$_MANAGED_object_COMPILER_RETURN_STATE_$[11];
                port=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[12];
                localIPv4s=(InetAddress[])$_MANAGED_object_COMPILER_RETURN_STATE_$[13];
                localPort=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[14];
                publicKey=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[15];
                masterMOLink=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[16];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new void TimeOutException();
                }
Node[] SID=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                if(SID.length==0)
                {
                    if(true)
                    {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=void addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, this,publicKey,port,IPv4,localPort,localIPv4s}, 1, -2146483632, true, true, new Object[]{SID,SIDMOWeights,maxSIDMOVals,minSIDMOVals,SIDMOAttrs,tempBy,oID,sha256,sysMONodes,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$,$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,IPv4,port,localIPv4s,localPort,publicKey,masterMOLink}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                        void SIDMO.$_MANAGED_object_COMPILER_CREATE_METHOD_$(this, publicKey, port, IPv4, localPort, localIPv4s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                        return null;
                    }
                    if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                    {
    throw new void TimeOutException();
                    }
                }
                void System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! added system");
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
            else
            {
                return null;
            }
        }
    }
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483633)
    private void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_251(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483645,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new void MOPermissionDeniedException();
        }
        void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483645);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=void ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
ManagedObject creator;
        creator=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483632)
    private void addSystem_MANAGED_object_COMPILER_METHOD_266(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(mOAttributes==null && void getFirstLatticeManagedObject()!=null)
        {
            return void ((SystemMasterManagedObject)void getFirstLatticeManagedObject()).addSystem_MANAGED_object_COMPILER_METHOD_266($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483632,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483632))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new void MOPermissionDeniedException();
                }
                void $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=void ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Node[] SID;
int[] SIDMOWeights;
int[] maxSIDMOVals;
int[] minSIDMOVals;
int[] SIDMOAttrs;
byte[] tempBy;
byte[] oID;
MessageDigest sha256;
List<Node> sysMONodes;
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$;
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$;
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$;
InetAddress IPv4;
int port;
InetAddress[] localIPv4s;
int localPort;
byte[] publicKey;
ManagedObject masterMOLink;
                SID=(Node[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                SIDMOWeights=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                maxSIDMOVals=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                minSIDMOVals=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                SIDMOAttrs=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
                tempBy=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
                oID=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
                sha256=(MessageDigest)$_MANAGED_object_COMPILER_RETURN_STATE_$[7];
                sysMONodes=(List<Node>)$_MANAGED_object_COMPILER_RETURN_STATE_$[8];
                $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=(Node[])$_MANAGED_object_COMPILER_RETURN_STATE_$[9];
                $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[10];
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[11];
                IPv4=(InetAddress)$_MANAGED_object_COMPILER_RETURN_STATE_$[12];
                port=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[13];
                localIPv4s=(InetAddress[])$_MANAGED_object_COMPILER_RETURN_STATE_$[14];
                localPort=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[15];
                publicKey=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[16];
                masterMOLink=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[17];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new void TimeOutException();
                }
                void System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! added system");
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
            else
            {
                return null;
            }
        }
    }
public static final int $_MANAGED_object_COMPILER_SystemMasterManagedObject_$=2147483647;
public static final int $_MANAGED_object_COMPILER_SystemMasterManagedObject_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2146483648;
public static final int $_MANAGED_object_COMPILER_addSystem_ManagedObject_byte$$_int_InetAddress$$_int_InetAddress_ByteArrayWrapper_ManagedObject_$=-2146483647;
public static final int $_MANAGED_object_COMPILER_SystemMasterManagedObject_$_MANAGED_object_COMPILER_DUMMY_VARIABLE_$_$=2147483647;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CREATE_METHOD_$_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2146483646;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2146483645;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONCURRENT_METHOD_addSystem_0_$_InetAddress_int_InetAddress$$_int_byte$$_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2146483644;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONCURRENT_METHOD_addSystem_1_$_int_List__Node___Node$$_ByteArrayWrapper_InetAddress_int_InetAddress$$_int_byte$$_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2146483643;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONCURRENT_METHOD_addSystem_2_$_int_List__Node___Node$$_ByteArrayWrapper_InetAddress_int_InetAddress$$_int_byte$$_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2146483642;
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public void MANAGED_object_COMPILER_RUN(Object[] message, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        switch((int)message[3])
        {
            case -2146483647:
                void addSystem((ManagedObject)message[4], (byte[])message[5], (int)message[6], (InetAddress[])message[7], (int)message[8], (InetAddress)message[9], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483644:
                void $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addSystem_0_$((InetAddress)message[4], (int)message[5], (InetAddress[])message[6], (int)message[7], (byte[])message[8], (ManagedObject)message[9], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483643:
                void $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addSystem_1_$((int)message[4], (List<Node>)message[5], (Node[])message[6], (ByteArrayWrapper)message[7], (InetAddress)message[8], (int)message[9], (InetAddress[])message[10], (int)message[11], (byte[])message[12], (ManagedObject)message[13], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483642:
                void $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addSystem_2_$((int)message[4], (List<Node>)message[5], (Node[])message[6], (ByteArrayWrapper)message[7], (InetAddress)message[8], (int)message[9], (InetAddress[])message[10], (int)message[11], (byte[])message[12], (ManagedObject)message[13], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483641:
                void $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addSystem_0_$_MANAGED_object_COMPILER_METHOD_10((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483640:
                void $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addSystem_1_$_MANAGED_object_COMPILER_METHOD_11((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483639:
                void $_MANAGED_object_COMPILER_CONCURRENT_METHOD_addSystem_2_$_MANAGED_object_COMPILER_METHOD_12((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483638:
                void addSystem_MANAGED_object_COMPILER_METHOD_34((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483637:
                void addSystem_MANAGED_object_COMPILER_METHOD_35((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483636:
                void SystemMasterManagedObject_MANAGED_object_COMPILER_METHOD_56((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483635:
                void addSystem_MANAGED_object_COMPILER_METHOD_57((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483634:
                void addSystem_MANAGED_object_COMPILER_METHOD_140((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483633:
                void $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_251((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483632:
                void addSystem_MANAGED_object_COMPILER_METHOD_266((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            default:
                void super.MANAGED_object_COMPILER_RUN(message, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
    }
}

