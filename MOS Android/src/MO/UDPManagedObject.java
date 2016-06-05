

package MO;

import RT.$_MANAGED_OBJECT_COMPILER_ANNOTATION_$;
import RT.ByteArrayWrapper;
import RT.HSystem;
import RT.MOCompilerControl;
import RT.ManagedObjectUtilities;
import RT.Node;
import RT.Exceptions.TimeOutException;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
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
import java.util.ArrayList;
import java.util.Iterator;
import RT.CompareMessage;
import RT.ManagedObjectUtilities;
import RT.HSystem;

public class UDPManagedObject extends DataTransferManagedObject

{

public static final byte[] $_MANAGED_object_COMPILER_CLASS_ID_$=new byte[]{107, -17, -103, -9, -109, 23, -83, -75, 16, 14, -97, -28, -111, 36, 105, 121, 3, -62, 122, -92, 101, -46, 18, 118, -14, 45, -96, -101, -86, 92, -44, 23};
static final long serialVersionUID=7777604370095910325L;
    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public UDPManagedObject() throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(UDPManagedObject.class))
        {
            addPermission(permission, null, this);
        }
    }

    
private static final long keepAliveInterval=10000000000L;
protected DatagramSocket socket=null;
protected boolean[] sendLock=new boolean[]{false};
protected boolean[] receiveLock=new boolean[]{false};
protected Object[] mMessage=new Object[7];
    
    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483648)
    protected UDPManagedObject(ManagedObject creator, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(UDPManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483648,creator,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2145483648))
        {
            if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483648,creator,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new MOPermissionDeniedException();
            }
            $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2145483648);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
            if(true)
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483648, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483648,creator}, null, false}, 1, -2145483640, true, true, new Object[]{creator,mMessage,receiveLock,sendLock,socket,keepAliveInterval}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=intelligence(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483648,creator}, null, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
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

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483647)
    protected void send(Object[] message, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483647,message,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        try
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$=getSID();
            $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$.toggleNoAggregateThenCall();
            socket.send(new DatagramPacket((byte[])message[6], ((byte[])message[6]).length, (InetAddress)message[4], (int)message[5]));
        }
        catch(IOException e)
        {
            Logger.getLogger(UDPManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483646)
    protected void listen(ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483646,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        synchronized(receiveLock)
        {
byte[] buff=new byte[1500];
DatagramPacket dgp=new DatagramPacket(buff, buff.length);
            try
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_1_$=getSID();
                $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_1_$.toggleNoAggregateThenCall();
                socket.receive(dgp);
                if(dgp.getLength()>32)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$=new ByteArrayWrapper($_MANAGED_object_COMPILER_DATA_$.SID, new byte[16], $_MANAGED_object_COMPILER_DATA_$.intelligenceInfo, $_MANAGED_object_COMPILER_DATA_$.updateTime, $_MANAGED_object_COMPILER_DATA_$.data, $_MANAGED_object_COMPILER_DATA_$.userData);
                    $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$.randomizeCallPathID();
                    $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$.randomizeCallPathID();
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
                    if($_MANAGED_object_COMPILER_SEARCH_RESULT_0_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$[0].mO instanceof MOThread)
                    {
                        $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=new Node[]{new Node(HSystem.getBestMOThread())};
                    }
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_2_$=getSID();
                    $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_2_$.toggleNoAggregateThenCall();
                    ((MOThread)$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$[0].mO).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$, this,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$, null, new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$, this, this, -2145483642,dgp,buff,mMessage,receiveLock,sendLock,socket,keepAliveInterval}}, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_2_$, this);
                }
                else if(dgp.getLength()==32)
                {
byte[] replyData=new byte[getSID().SID.length];
                    System.arraycopy(getSID().SID, 0, replyData, 0, replyData.length);
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$=getSID();
                    $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$.toggleNoAggregateThenCall();
                    send(new Object[]{null, null, null, null,dgp.getAddress(),dgp.getPort(),replyData}, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$, this);
                }
            }
            catch(IOException ex)
            {
            }
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483645)
    private void keepAlive(ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483645,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$=getSID();
            $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$.toggleNoAggregateThenCall();
            send(new Object[]{null, null, null, null,HSystem.masterIP,socket.getLocalPort(), new byte[0]}, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$, this);
Object[] keepAliveMessage=new Object[4];
        keepAliveMessage[0]=getSID();
        keepAliveMessage[1]=this;
        keepAliveMessage[2]=this;
        keepAliveMessage[3]=$_MANAGED_object_COMPILER_keepAlive_ByteArrayWrapper_ManagedObject_$;
ByteArrayWrapper runAfterDelayByteArrayWrapper=getSID();
        runAfterDelayByteArrayWrapper.toggleToRunAfterDelay();
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_1_$=getSID();
        $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_1_$.toggleNoAggregateThenCall();
Node[] mOThread=latticeSearchLocalMOThread(1, HSystem.defaultNumCheckNodes, getSID(), $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_1_$, this);
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_2_$=getSID();
        $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_2_$.toggleNoAggregateThenCall();
        ((MOThread)mOThread[0].mO).addToRun(new Object[]{runAfterDelayByteArrayWrapper, this, this, null,keepAliveMessage,System.nanoTime(),keepAliveInterval}, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_2_$, this);
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    private UDPManagedObject($_MANAGED_object_COMPILER_DUMMY_VARIABLE_$ $_MANAGED_object_COMPILER_DUMMY_variable_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(UDPManagedObject.class))
        {
            addPermission(permission, null, this);
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483644)
	public
    static   Object $_MANAGED_object_COMPILER_CREATE_METHOD_$(ManagedObject creator, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
UDPManagedObject $_MANAGED_object_COMPILER_CREATED_Object_$=new UDPManagedObject(new $_MANAGED_object_COMPILER_DUMMY_VARIABLE_$());
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            $_MANAGED_object_COMPILER_CREATED_Object_$.addPermission(permission, null, $_MANAGED_object_COMPILER_CREATED_Object_$);
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2145483644);
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
;
        $_MANAGED_object_COMPILER_CREATED_Object_$.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(creator, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_COMPILER_CREATED_Object_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,$_MANAGED_object_COMPILER_CREATED_Object_$};
        return null;
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483643)
    public UDPManagedObject $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(ManagedObject creator, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(UDPManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483643,creator,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2145483643);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483643,creator}, 1, -2145483639, true, true, new Object[]{creator,mMessage,receiveLock,sendLock,socket,keepAliveInterval}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=super.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(creator, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
        try
        {
SecureRandom sRand=SecureRandom.getInstance("SHA1PRNG");
        }
        catch(NoSuchAlgorithmException e)
        {
            Logger.getLogger(UDPManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
int port=19472;
        for(int att=0; att<100; att++)
        {
            try
            {
                socket=new DatagramSocket(port+att);
                break;
            }
            catch(SocketException e)
            {
            }
        }
        try
        {
            socket.setSoTimeout(1000);
            socket.setReceiveBufferSize(1500000);
            socket.setBroadcast(false);
        }
        catch(SocketException e)
        {
            Logger.getLogger(UDPManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
Node[] mOThread=latticeSearchLocalMOThread(1, HSystem.defaultNumCheckNodes, getSID(), $_MANAGED_object_COMPILER_DATA_$, this);
        ((MOThread)mOThread[0].mO).addToRun(mess, $_MANAGED_object_COMPILER_DATA_$, this);
        mMessage[0]=HSystem.masterSID;
        mMessage[1]=this;
        mMessage[2]=this;
        try
        {
            mMessage[3]=DataTransferManagedObject.class.getDeclaredMethod("send", Object[].class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$();
        }
        catch(NoSuchMethodException|SecurityException e)
        {
            Logger.getLogger(UDPManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
        mMessage[4]=HSystem.masterIP;
        mMessage[5]=19472;
        mMessage[6]=new byte[]{};
        if(!Arrays.areEqual(HSystem.masterPublicKey, HSystem.SIDFull.getPublic().getEncoded()))
        {
Object[] keepAliveMessage=new Object[4];
            keepAliveMessage[0]=getSID();
            keepAliveMessage[1]=this;
            keepAliveMessage[2]=this;
            keepAliveMessage[3]=$_MANAGED_object_COMPILER_keepAlive_ByteArrayWrapper_ManagedObject_$;
ByteArrayWrapper runAfterDelayByteArrayWrapper=getSID();
            runAfterDelayByteArrayWrapper.toggleToRunAfterDelay();
            mOThread=latticeSearchLocalMOThread(1, HSystem.defaultNumCheckNodes, getSID(), $_MANAGED_object_COMPILER_DATA_$, this);
            ((MOThread)mOThread[0].mO).addToRun(new Object[]{runAfterDelayByteArrayWrapper, this, this, null,keepAliveMessage,System.nanoTime(),keepAliveInterval}, $_MANAGED_object_COMPILER_DATA_$, this);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483642)
    private Object $_MANAGED_object_COMPILER_CONCURRENT_METHOD_listen_0_$(DatagramPacket dgp, byte[] buff, Object[] mMessage, boolean[] receiveLock, boolean[] sendLock, DatagramSocket socket, long keepAliveInterval, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
$_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2145483642);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
byte[] tempBy=new byte[4];
int[] recievingCommMOAttr=new int[HSystem.mOAttributesLength+10];
int[] recievingCommMOMinAttr=new int[recievingCommMOAttr.length];
int[] recievingCommMOMaxAttr=new int[recievingCommMOAttr.length];
int[] recievingCommMOWeights=new int[recievingCommMOAttr.length];
        for(int attrNum=0; attrNum<recievingCommMOAttr.length; attrNum++)
        {
            if(attrNum==0)
            {
                recievingCommMOAttr[attrNum]=HSystem.communicationManagedObjectNameHash;
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==1)
            {
                recievingCommMOAttr[attrNum]=HSystem.communicationManagedObjectClassHash;
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==2 || attrNum==4)
            {
                recievingCommMOAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMinAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMaxAttr[attrNum]=Integer.MAX_VALUE;
            }
            else if(attrNum>=7 && attrNum<15)
            {
                System.arraycopy(HSystem.SID.SID, 4*(attrNum-7), tempBy, 0, tempBy.length);
                recievingCommMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempBy);
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>HSystem.mOAttributesLength+7 && attrNum<HSystem.mOAttributesLength+10)
            {
                recievingCommMOWeights[attrNum]=HSystem.intMaxValue;
            }
            else
            {
                recievingCommMOMinAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMaxAttr[attrNum]=Integer.MAX_VALUE;
                recievingCommMOWeights[attrNum]=0;
            }
        }
byte[] seq=new byte[4];
        System.arraycopy(dgp.getData(), 0, seq, 0, 4);
        recievingCommMOAttr[HSystem.mOAttributesLength-1+9]=ManagedObjectUtilities.b8ToB10Int(seq);
        recievingCommMOMinAttr[HSystem.mOAttributesLength-1+9]=recievingCommMOAttr[HSystem.mOAttributesLength-1+9];
        recievingCommMOMaxAttr[HSystem.mOAttributesLength-1+9]=recievingCommMOAttr[HSystem.mOAttributesLength-1+9];
        System.arraycopy(dgp.getData(), 4, seq, 0, 4);
        recievingCommMOAttr[HSystem.mOAttributesLength-1+10]=ManagedObjectUtilities.b8ToB10Int(seq);
        recievingCommMOMinAttr[HSystem.mOAttributesLength-1+10]=recievingCommMOAttr[HSystem.mOAttributesLength-1+10];
        recievingCommMOMaxAttr[HSystem.mOAttributesLength-1+10]=recievingCommMOAttr[HSystem.mOAttributesLength-1+10];
Node[] commMOs=latticeSearchLocal(recievingCommMOAttr, recievingCommMOMinAttr, recievingCommMOMaxAttr, recievingCommMOWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
        if(commMOs.length>0)
        {
            if(true)
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483642,dgp.getData(),dgp.getLength()}, 1, -2145483641, true, true, new Object[]{commMOs,seq,recievingCommMOWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,tempBy,keepAliveInterval,socket,sendLock,receiveLock,mMessage,buff,dgp,mMessage,receiveLock,sendLock,socket,keepAliveInterval}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                ((CommunicationManagedObject)commMOs[0].mO).receiveMessage(dgp.getData(), dgp.getLength(), $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                return null;
            }
            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
            {
    throw new TimeOutException();
            }
        }
        else
        {
            if(true)
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483642, this,dgp.getAddress(),dgp.getPort(),dgp.getData(),dgp.getLength(),HSystem.defaultCommunicationProtocol,HSystem.defaultSecurityLevel}, 1, -2145483638, true, true, new Object[]{commMOs,seq,recievingCommMOWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,tempBy,keepAliveInterval,socket,sendLock,receiveLock,mMessage,buff,dgp,mMessage,receiveLock,sendLock,socket,keepAliveInterval}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                CommunicationManagedObject.$_MANAGED_object_COMPILER_CREATE_METHOD_$(this, dgp.getAddress(), dgp.getPort(), dgp.getData(), dgp.getLength(), HSystem.defaultCommunicationProtocol, HSystem.defaultSecurityLevel, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                return null;
            }
            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
            {
    throw new TimeOutException();
            }
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

        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483641)
    private Object $_MANAGED_object_COMPILER_CONCURRENT_METHOD_listen_0_$_MANAGED_object_COMPILER_METHOD_0(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
$_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2145483642);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Node[] commMOs;
byte[] seq;
int[] recievingCommMOWeights;
int[] recievingCommMOMaxAttr;
int[] recievingCommMOMinAttr;
int[] recievingCommMOAttr;
byte[] tempBy;
long keepAliveInterval;
DatagramSocket socket;
boolean[] sendLock;
boolean[] receiveLock;
Object[] mMessage;
byte[] buff;
DatagramPacket dgp;
        commMOs=(Node[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        seq=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
        recievingCommMOWeights=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
        recievingCommMOMaxAttr=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
        recievingCommMOMinAttr=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
        recievingCommMOAttr=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
        tempBy=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
        keepAliveInterval=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[7];
        socket=(DatagramSocket)$_MANAGED_object_COMPILER_RETURN_STATE_$[8];
        sendLock=(boolean[])$_MANAGED_object_COMPILER_RETURN_STATE_$[9];
        receiveLock=(boolean[])$_MANAGED_object_COMPILER_RETURN_STATE_$[10];
        mMessage=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[11];
        buff=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[12];
        dgp=(DatagramPacket)$_MANAGED_object_COMPILER_RETURN_STATE_$[13];
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483640)
    private void UDPManagedObject_MANAGED_object_COMPILER_METHOD_132(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483640,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2145483640))
        {
            if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483648,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new MOPermissionDeniedException();
            }
            $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2145483648);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483639)
    private Object $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_329(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2145483643,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2145483643);
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
        try
        {
SecureRandom sRand=SecureRandom.getInstance("SHA1PRNG");
        }
        catch(NoSuchAlgorithmException e)
        {
            Logger.getLogger(UDPManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
int port=19472;
        for(int att=0; att<100; att++)
        {
            try
            {
                socket=new DatagramSocket(port+att);
                break;
            }
            catch(SocketException e)
            {
            }
        }
        try
        {
            socket.setSoTimeout(1000);
            socket.setReceiveBufferSize(1500000);
            socket.setBroadcast(false);
        }
        catch(SocketException e)
        {
            Logger.getLogger(UDPManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
Node[] mOThread=latticeSearchLocalMOThread(1, HSystem.defaultNumCheckNodes, getSID(), $_MANAGED_object_COMPILER_DATA_$, this);
        ((MOThread)mOThread[0].mO).addToRun(mess, $_MANAGED_object_COMPILER_DATA_$, this);
        mMessage[0]=HSystem.masterSID;
        mMessage[1]=this;
        mMessage[2]=this;
        try
        {
            mMessage[3]=DataTransferManagedObject.class.getDeclaredMethod("send", Object[].class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$();
        }
        catch(NoSuchMethodException|SecurityException e)
        {
            Logger.getLogger(UDPManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
        mMessage[4]=HSystem.masterIP;
        mMessage[5]=19472;
        mMessage[6]=new byte[]{};
        if(!Arrays.areEqual(HSystem.masterPublicKey, HSystem.SIDFull.getPublic().getEncoded()))
        {
Object[] keepAliveMessage=new Object[4];
            keepAliveMessage[0]=getSID();
            keepAliveMessage[1]=this;
            keepAliveMessage[2]=this;
            keepAliveMessage[3]=$_MANAGED_object_COMPILER_keepAlive_ByteArrayWrapper_ManagedObject_$;
ByteArrayWrapper runAfterDelayByteArrayWrapper=getSID();
            runAfterDelayByteArrayWrapper.toggleToRunAfterDelay();
            mOThread=latticeSearchLocalMOThread(1, HSystem.defaultNumCheckNodes, getSID(), $_MANAGED_object_COMPILER_DATA_$, this);
            ((MOThread)mOThread[0].mO).addToRun(new Object[]{runAfterDelayByteArrayWrapper, this, this, null,keepAliveMessage,System.nanoTime(),keepAliveInterval}, $_MANAGED_object_COMPILER_DATA_$, this);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2145483638)
    private Object $_MANAGED_object_COMPILER_CONCURRENT_METHOD_listen_0_$_MANAGED_object_COMPILER_METHOD_339(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
$_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2145483642);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Node[] commMOs;
byte[] seq;
int[] recievingCommMOWeights;
int[] recievingCommMOMaxAttr;
int[] recievingCommMOMinAttr;
int[] recievingCommMOAttr;
byte[] tempBy;
long keepAliveInterval;
DatagramSocket socket;
boolean[] sendLock;
boolean[] receiveLock;
Object[] mMessage;
byte[] buff;
DatagramPacket dgp;
        commMOs=(Node[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        seq=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
        recievingCommMOWeights=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
        recievingCommMOMaxAttr=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
        recievingCommMOMinAttr=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
        recievingCommMOAttr=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
        tempBy=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
        keepAliveInterval=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[7];
        socket=(DatagramSocket)$_MANAGED_object_COMPILER_RETURN_STATE_$[8];
        sendLock=(boolean[])$_MANAGED_object_COMPILER_RETURN_STATE_$[9];
        receiveLock=(boolean[])$_MANAGED_object_COMPILER_RETURN_STATE_$[10];
        mMessage=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[11];
        buff=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[12];
        dgp=(DatagramPacket)$_MANAGED_object_COMPILER_RETURN_STATE_$[13];
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
public static final int $_MANAGED_object_COMPILER_UDPManagedObject_$=2147483647;
public static final int $_MANAGED_object_COMPILER_UDPManagedObject_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2145483648;
public static final int $_MANAGED_object_COMPILER_send_Object$$_ByteArrayWrapper_ManagedObject_$=-2145483647;
public static final int $_MANAGED_object_COMPILER_listen_ByteArrayWrapper_ManagedObject_$=-2145483646;
public static final int $_MANAGED_object_COMPILER_keepAlive_ByteArrayWrapper_ManagedObject_$=-2145483645;
public static final int $_MANAGED_object_COMPILER_UDPManagedObject_$_MANAGED_object_COMPILER_DUMMY_VARIABLE_$_$=2147483647;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CREATE_METHOD_$_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2145483644;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2145483643;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONCURRENT_METHOD_listen_0_$_DatagramPacket_byte$$_Object$$_boolean$$_boolean$$_DatagramSocket_long_ByteArrayWrapper_ManagedObject_$=-2145483642;
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public void MANAGED_object_COMPILER_RUN(Object[] message, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws Exception, MOPermissionDeniedException, TimeOutException
    {
        switch((int)message[3])
        {
            case -2145483647:
                send((Object[])message[4], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2145483646:
                listen((ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2145483645:
                keepAlive((ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2145483644:
                $_MANAGED_object_COMPILER_CREATE_METHOD_$((ManagedObject)message[4], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2145483643:
                $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$((ManagedObject)message[4], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2145483642:
                $_MANAGED_object_COMPILER_CONCURRENT_METHOD_listen_0_$((DatagramPacket)message[4], (byte[])message[5], (Object[])message[6], (boolean[])message[7], (boolean[])message[8], (DatagramSocket)message[9], (long)message[10], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2145483641:
                $_MANAGED_object_COMPILER_CONCURRENT_METHOD_listen_0_$_MANAGED_object_COMPILER_METHOD_0((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2145483640:
                UDPManagedObject_MANAGED_object_COMPILER_METHOD_132((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2145483639:
                $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_329((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2145483638:
                $_MANAGED_object_COMPILER_CONCURRENT_METHOD_listen_0_$_MANAGED_object_COMPILER_METHOD_339((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            default:
                super.MANAGED_object_COMPILER_RUN(message, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
    }
}

