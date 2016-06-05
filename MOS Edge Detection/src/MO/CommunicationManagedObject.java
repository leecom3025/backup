


package MO;
import RT.$_MANAGED_OBJECT_COMPILER_ANNOTATION_$;
import RT.AnyObjectAllowed;
import RT.ByteArrayWrapper;
import RT.CompareMessage;
import RT.CompareMessageRange;
import RT.CompareMessageThisManagedObject;
import RT.CompareSID;
import RT.DataCompression;
import RT.HSystem;
import RT.MOCompilerControl;
import RT.ManagedObjectUtilities;
import RT.Node;
import RT.Range;
import RT.TimeOutObject;
import RT.Cryptography.AES;
import RT.Cryptography.CommunicationSecurityProtocol;
import RT.Cryptography.HMACSHA256;
import RT.Exceptions.MOPermissionDeniedException;
import RT.Exceptions.ManagedObjectDeletedException;
import RT.Exceptions.TimeOutException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;

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
import RT.HSystem;

public class CommunicationManagedObject extends ManagedObject

{

public static final byte[] $_MANAGED_object_COMPILER_CLASS_ID_$=new byte[]{48, 80, 103, -77, 33, 9, 39, 42, 5, -69, -106, -49, 102, 119, 18, 51, -114, 115, 30, -17, 117, -90, 126, 7, 68, -83, -24, -65, 77, 85, 2, -119};
static final long serialVersionUID=3481396531008448298L;
    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public CommunicationManagedObject() throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(CommunicationManagedObject.class))
        {
            addPermission(permission, null, this);
        }
    }

    
protected CommunicationSecurityProtocol commSec=null;
protected InetAddress oIP=null;
public ByteArrayWrapper oID=null;
protected int numNeeded=0;
protected int sendNumber=1;
protected int prevSendNumber=1;
protected int prevReceiveNumber=0;
protected int receiveNumber=1;
protected long sRNumber=0L;
protected long lastConTime=Long.MIN_VALUE;
protected int oPort=19472;
protected byte[] key=new byte[HSystem.SIDFull.getPublic().getEncoded().length];
protected byte dCAlg=4;
protected List<byte[][]> receivedMessageBlocks=new ArrayList<>();
protected byte[][] receivedMessageBlock=null;
protected boolean recveing=false;
protected int rLength=0;
public boolean cInit=false;
protected int received=0;
protected boolean transmitting=false;
protected List<Object[]> toSend=new ArrayList<>();
protected List<Byte> cAlgs=new ArrayList<>();
protected List<Object[]> toTransmit=new ArrayList<>();
protected Object[] senderMess=new Object[7];
protected boolean complete=false;
protected int iLength=0;
protected volatile boolean confirmSendOut=false;
protected volatile boolean confirmReceiveOut=false;
protected long confirmSendNum=0;
protected long confirmReceiveNum=0;
protected long sendConMessNumReceive=Long.MIN_VALUE;
protected long receiveConMessNumReceive=Long.MIN_VALUE;
protected long sendConMessNumSend=Long.MIN_VALUE;
protected long receiveConMessNumSend=Long.MIN_VALUE;
protected int maxTransmitSize=1472;
protected int transmitNum=100;
private int maxTransmitBytes=50*transmitNum*maxTransmitSize;
protected int[] recievingCommMOAttr=null;
protected int[] recievingCommMOMinAttr=null;
protected int[] recievingCommMOMaxAttr=null;
protected int[] recievingCommWeights=null;
protected int[] dataTransferMOAttr=null;
protected int[] dataTransferMinimumMOAttr=null;
protected int[] dataTransferMaximumMOAttr=null;
protected int[] dataTransferWeights=null;
protected BitSet receivedPackets=null;
protected boolean lastMessageReceived=false;
protected byte[] oPublicKey=null;
public int maxCommunicationAttempts=10;
public int sendAttempts=0;
public int receiveAttempts=0;
public volatile int receiveState=Integer.MAX_VALUE;
public volatile int sendState=Integer.MAX_VALUE;
private long lastReceivedTime=0L;
private DataCompression dataCompression=null;
    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483648)
    public CommunicationManagedObject(ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(CommunicationManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483648))
        {
            if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new MOPermissionDeniedException();
            }
            $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483648);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
            if(true)
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648}, null, false}, 1, -2146483620, true, true, new Object[]{dataCompression,lastReceivedTime,sendState,receiveState,receiveAttempts,sendAttempts,maxCommunicationAttempts,oPublicKey,lastMessageReceived,receivedPackets,dataTransferWeights,dataTransferMaximumMOAttr,dataTransferMinimumMOAttr,dataTransferMOAttr,recievingCommWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,maxTransmitBytes,transmitNum,maxTransmitSize,receiveConMessNumSend,sendConMessNumSend,receiveConMessNumReceive,sendConMessNumReceive,confirmReceiveNum,confirmSendNum,confirmReceiveOut,confirmSendOut,iLength,complete,senderMess,toTransmit,cAlgs,toSend,transmitting,received,cInit,rLength,recveing,receivedMessageBlock,receivedMessageBlocks,dCAlg,key,oPort,lastConTime,sRNumber,receiveNumber,prevReceiveNumber,prevSendNumber,sendNumber,numNeeded,oID,oIP,commSec}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=intelligence(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648}, null, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
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
    protected CommunicationManagedObject(ManagedObject creator, ByteArrayWrapper oSID, String securityProtocol, int protocolStrength, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(CommunicationManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,creator,oSID,securityProtocol,protocolStrength,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483647))
        {
            if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,creator,oSID,securityProtocol,protocolStrength,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new MOPermissionDeniedException();
            }
            $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
            if(true)
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,creator,oSID,securityProtocol,protocolStrength}, null, false}, 1, -2146483619, true, true, new Object[]{protocolStrength,securityProtocol,oSID,creator,dataCompression,lastReceivedTime,sendState,receiveState,receiveAttempts,sendAttempts,maxCommunicationAttempts,oPublicKey,lastMessageReceived,receivedPackets,dataTransferWeights,dataTransferMaximumMOAttr,dataTransferMinimumMOAttr,dataTransferMOAttr,recievingCommWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,maxTransmitBytes,transmitNum,maxTransmitSize,receiveConMessNumSend,sendConMessNumSend,receiveConMessNumReceive,sendConMessNumReceive,confirmReceiveNum,confirmSendNum,confirmReceiveOut,confirmSendOut,iLength,complete,senderMess,toTransmit,cAlgs,toSend,transmitting,received,cInit,rLength,recveing,receivedMessageBlock,receivedMessageBlocks,dCAlg,key,oPort,lastConTime,sRNumber,receiveNumber,prevReceiveNumber,prevSendNumber,sendNumber,numNeeded,oID,oIP,commSec}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=intelligence(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,creator,oSID,securityProtocol,protocolStrength}, null, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
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
            oSID=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[5];
            securityProtocol=(String)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[6];
            protocolStrength=(int)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[7];
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

    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483646)
    public CommunicationManagedObject(ManagedObject creator, InetAddress iPv4, int port, byte[] mCont, int mLen, String securityProtocol, int protocolStrength, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(CommunicationManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,creator,iPv4,port,mCont,mLen,securityProtocol,protocolStrength,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483646))
        {
            if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,creator,iPv4,port,mCont,mLen,securityProtocol,protocolStrength,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new MOPermissionDeniedException();
            }
            $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483646);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
            if(true)
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,creator,iPv4,port,mCont,mLen,securityProtocol,protocolStrength}, null, false}, 1, -2146483618, true, true, new Object[]{protocolStrength,securityProtocol,mLen,mCont,port,iPv4,creator,dataCompression,lastReceivedTime,sendState,receiveState,receiveAttempts,sendAttempts,maxCommunicationAttempts,oPublicKey,lastMessageReceived,receivedPackets,dataTransferWeights,dataTransferMaximumMOAttr,dataTransferMinimumMOAttr,dataTransferMOAttr,recievingCommWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,maxTransmitBytes,transmitNum,maxTransmitSize,receiveConMessNumSend,sendConMessNumSend,receiveConMessNumReceive,sendConMessNumReceive,confirmReceiveNum,confirmSendNum,confirmReceiveOut,confirmSendOut,iLength,complete,senderMess,toTransmit,cAlgs,toSend,transmitting,received,cInit,rLength,recveing,receivedMessageBlock,receivedMessageBlocks,dCAlg,key,oPort,lastConTime,sRNumber,receiveNumber,prevReceiveNumber,prevSendNumber,sendNumber,numNeeded,oID,oIP,commSec}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=intelligence(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,creator,iPv4,port,mCont,mLen,securityProtocol,protocolStrength}, null, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
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
            iPv4=(InetAddress)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[5];
            port=(int)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[6];
            mCont=(byte[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[7];
            mLen=(int)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[8];
            securityProtocol=(String)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[9];
            protocolStrength=(int)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[10];
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

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483645)
    private byte[] addSessionID(byte[] message)
    {
        if(message!=null)
        {
byte[] newMessage=new byte[message.length+8];
            System.arraycopy(ManagedObjectUtilities.b10ToB8(mOAttributes[HSystem.mOAttributesLength+8]), 0, newMessage, 0, 4);
            System.arraycopy(ManagedObjectUtilities.b10ToB8(mOAttributes[HSystem.mOAttributesLength+9]), 0, newMessage, 4, 4);
            System.arraycopy(message, 0, newMessage, 8, message.length);
            return newMessage;
        }
        return null;
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483644)
    protected synchronized void sendMessage(Object[] message, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483644,message,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        if(commSec.state!=Integer.MAX_VALUE)
        {
            toSend.add(message);
            try
            {
                senderMess[6]=addSessionID(commSec.receiveEncryptedMessage(null));
            }
            catch(InvalidKeyException|NoSuchAlgorithmException|NoSuchProviderException|InvalidAlgorithmParameterException|NoSuchPaddingException|IllegalStateException|InvalidKeySpecException|ShortBufferException|IllegalBlockSizeException|BadPaddingException e)
            {
ByteArrayOutputStream bOut=new ByteArrayOutputStream();
            }
            if(senderMess[6]!=null)
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_3_$=getSID();
                $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_3_$.toggleNoAggregateThenCall();
Node[] dataTransferManagedObject=latticeSearchLocal(dataTransferMOAttr, dataTransferMinimumMOAttr, dataTransferMaximumMOAttr, dataTransferWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_3_$, this);
                senderMess[2]=(UDPManagedObject)dataTransferManagedObject[0].mO;
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_1_$=getSID();
                $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_1_$.toggleNoAggregateThenCall();
                ((UDPManagedObject)dataTransferManagedObject[0].mO).send(senderMess, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_1_$, this);
            }
            if(commSec.state==Integer.MAX_VALUE && !toSend.isEmpty())
            {
                try
                {
                    Thread.sleep(100);
                }
                catch(InterruptedException e)
                {
ByteArrayOutputStream bOut=new ByteArrayOutputStream();
                }
Object[] messageToSend=toSend.remove(0);
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$=getSID();
                $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$.toggleNoAggregateThenCall();
                sendMessage(messageToSend, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$, this);
            }
        }
        else
        {
            toSend.add(message);
            if(sendState==Integer.MAX_VALUE)
            {
int numSendBytes=0;
List<byte[]> transmitBytes=new ArrayList<>();
                while(numSendBytes<maxTransmitBytes && !toSend.isEmpty())
                {
Object[] messageToSend=toSend.remove(0);
                    transmitBytes.add(writeMessage(messageToSend));
                    numSendBytes+=transmitBytes.get(transmitBytes.size()-1).length;
                }
ByteArrayOutputStream bOut=new ByteArrayOutputStream();
                try
                {
ObjectOutputStream oOut=new ObjectOutputStream(bOut);
                    oOut.writeObject(transmitBytes.toArray(new byte[0][]));
                }
                catch(IOException e)
                {
                    Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                }
byte[] mess=bOut.toByteArray();
                try
                {
                    mess=dataCompression.compress(mess);
                }
                catch(NoSuchAlgorithmException e)
                {
                    Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                }
                prevSendNumber=sendNumber;
                prevReceiveNumber=sendNumber+1;
                sendState=Integer.MIN_VALUE;
byte[] sendBytes=null;
byte[][] sendUnencrypted=new byte[(int)Math.ceil(((double)nextMultiple(mess.length, commSec.getBlockSize()))/(maxTransmitSize-12-commSec.getProtocolHeaderLength()))][];
                for(int sendUnencryptedInd=0; sendUnencryptedInd<sendUnencrypted.length; sendUnencryptedInd++)
                {
                    if(sendUnencryptedInd==sendUnencrypted.length-1)
                    {
                        sendUnencrypted[sendUnencryptedInd]=ManagedObjectUtilities.b10ToB8(-sendNumber);
                    }
                    else
                    {
                        sendUnencrypted[sendUnencryptedInd]=ManagedObjectUtilities.b10ToB8(sendNumber);
                    }
                    sendNumber++;
                    if(sendNumber<1)
                    {
                        sendNumber=1;
                    }
                }
byte[][] securedMessages=null;
                try
                {
                    securedMessages=commSec.sendEncryptedMessage(mess, sendUnencrypted, maxTransmitSize-12-commSec.getProtocolHeaderLength());
                }
                catch(NoSuchAlgorithmException|NoSuchProviderException|InvalidAlgorithmParameterException|IllegalBlockSizeException|BadPaddingException e)
                {
                    Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                }
                for(int securedMessageIndex=0; securedMessageIndex<securedMessages.length; securedMessageIndex++)
                {
                    sendBytes=new byte[securedMessages[securedMessageIndex].length+8];
                    System.arraycopy(ManagedObjectUtilities.b10ToB8(mOAttributes[HSystem.mOAttributesLength+8]), 0, sendBytes, 0, 4);
                    System.arraycopy(ManagedObjectUtilities.b10ToB8(mOAttributes[HSystem.mOAttributesLength+9]), 0, sendBytes, 4, 4);
                    System.arraycopy(securedMessages[securedMessageIndex], 0, sendBytes, 8, securedMessages[securedMessageIndex].length);
                    senderMess[6]=sendBytes;
                    addToToTransmit(senderMess.clone());
                }
Object[] messageToSend=null;
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_4_$=getSID();
                $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_4_$.toggleNoAggregateThenCall();
Node[] dataTransferManagedObject=latticeSearchLocal(dataTransferMOAttr, dataTransferMinimumMOAttr, dataTransferMaximumMOAttr, dataTransferWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_4_$, this);
                if(dataTransferManagedObject.length>0)
                {
                    for(int numberSent=0; numberSent<toTransmit.size() && numberSent<transmitNum; numberSent++)
                    {
                        messageToSend=toTransmit.get(numberSent);
                        messageToSend[2]=(UDPManagedObject)dataTransferManagedObject[0].mO;
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_2_$=getSID();
                        $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_2_$.toggleNoAggregateThenCall();
                        ((UDPManagedObject)dataTransferManagedObject[0].mO).send(messageToSend, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_2_$, this);
                    }
                }
                else
                {
                }
                if(toTransmit.size()>transmitNum)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_5_$=getSID();
                    $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_5_$.toggleNoAggregateThenCall();
Node[] mOThread=latticeSearchLocalMOThread(1, HSystem.defaultNumCheckNodes, getSID(), $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_5_$, this);
ByteArrayWrapper thisSID=getSID();
                    thisSID.toggleToRunAfterDelay();
                    try
                    {
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_7_$=getSID();
                        $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_7_$.toggleNoAggregateThenCall();
                        ((MOThread)mOThread[0].mO).addToRun(new Object[]{thisSID, this, this, null, new Object[]{thisSID, this, this,CommunicationManagedObject.class.getDeclaredMethod("confirmSend", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$(), 0L,confirmSendNum},System.nanoTime(), (transmitNum+10)*HSystem.packetConTime}, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_7_$, this);
                    }
                    catch(NoSuchMethodException|SecurityException e)
                    {
                        Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                    }
                }
                else
                {
ByteArrayWrapper thisSID=getSID();
                    thisSID.toggleToRunAfterDelay();
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_6_$=getSID();
                    $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_6_$.toggleNoAggregateThenCall();
Node[] mOThread=latticeSearchLocalMOThread(1, HSystem.defaultNumCheckNodes, getSID(), $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_6_$, this);
                    try
                    {
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_8_$=getSID();
                        $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_8_$.toggleNoAggregateThenCall();
                        ((MOThread)mOThread[0].mO).addToRun(new Object[]{thisSID, this, this, null, new Object[]{thisSID, this, this,CommunicationManagedObject.class.getDeclaredMethod("confirmSend", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$(), 0L,confirmSendNum},System.nanoTime(), (toTransmit.size()+10)*HSystem.packetConTime}, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_8_$, this);
                    }
                    catch(NoSuchMethodException|SecurityException e)
                    {
                        Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                    }
                }
                confirmSendOut=true;
                transmitting=true;
            }
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483643)
    private byte[] writeMessage(Object[] message)
    {
ByteArrayOutputStream bOut=new ByteArrayOutputStream();
byte[] mess=null;
        if(message.length>3)
        {
            try
            {
ObjectOutputStream oOut=new ObjectOutputStream(bOut);
                oOut.writeObject((ByteArrayWrapper)message[0]);
                oOut.writeObject((ManagedObject)message[1]);
                oOut.writeObject(message[2]);
                bOut.write(ManagedObjectUtilities.b10ToB8((int)message[3]));
                if(message.length>4)
                {
                    for(int messageInd=4; messageInd<message.length; messageInd++)
                    {
                        oOut.writeObject(message[messageInd]);
                    }
                }
                mess=bOut.toByteArray();
                bOut.reset();
            }
            catch(IOException e)
            {
                Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return mess;
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483642)
    protected synchronized Object receiveMessage(byte[] mCont, int mLen, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483642,mCont,mLen,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483642);
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
byte[] number=new byte[4];
        System.arraycopy(mCont, 8, number, 0, number.length);
        if(ManagedObjectUtilities.b8ToB10Int(number)<Integer.MIN_VALUE+10)
        {
            receiveConMessage(mCont, mLen);
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
byte[] content=new byte[mLen-8];
        System.arraycopy(mCont, 8, content, 0, content.length);
        if(commSec.state<Integer.MAX_VALUE-1)
        {
            try
            {
                senderMess[6]=addSessionID(commSec.receiveEncryptedMessage(new byte[][]{content}));
            }
            catch(InvalidKeyException|NoSuchAlgorithmException|NoSuchProviderException|InvalidAlgorithmParameterException|NoSuchPaddingException|IllegalStateException|InvalidKeySpecException|ShortBufferException|IllegalBlockSizeException|BadPaddingException e)
            {
                Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
            }
            if(senderMess[6]!=null)
            {
Node[] dataTransferManagedObject=latticeSearchLocal(dataTransferMOAttr, dataTransferMinimumMOAttr, dataTransferMaximumMOAttr, dataTransferWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
                senderMess[2]=(UDPManagedObject)dataTransferManagedObject[0].mO;
                ((UDPManagedObject)dataTransferManagedObject[0].mO).send(senderMess, $_MANAGED_object_COMPILER_DATA_$, this);
            }
            else if(commSec.state==Integer.MAX_VALUE)
            {
                if(toSend.isEmpty())
                {
                    sendConMessage(new Object[]{getSID(), this, this, -receiveNumber, 4L}, Integer.MIN_VALUE+6);
                }
                else
                {
Object[] messageToSend=toSend.remove(0);
                    sendMessage(messageToSend, $_MANAGED_object_COMPILER_DATA_$, this);
                }
            }
        }
        else if((mCont=commSec.verifyMessage(content))!=null && (receiveState==Integer.MIN_VALUE || receiveState==Integer.MAX_VALUE))
        {
            if(commSec.state==Integer.MAX_VALUE-1)
            {
                commSec.state=Integer.MAX_VALUE;
                if(!toSend.isEmpty())
                {
Object[] messageToSend=toSend.remove(0);
                    sendMessage(messageToSend, $_MANAGED_object_COMPILER_DATA_$, this);
                }
            }
            System.arraycopy(content, 0, number, 0, number.length);
long cNum=ManagedObjectUtilities.b8ToB10Int(number);
            if(cNum<0)
            {
                cNum=-cNum;
                if(receiveNumber-cNum>1073741823)
                {
                    cNum=Integer.MAX_VALUE+cNum;
                }
                if(cNum<receiveNumber)
                {
                    sendConMessage(new Object[]{getSID(), this, this, -receiveNumber, 4L, true}, Integer.MIN_VALUE);
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
                lastMessageReceived=true;
            }
            else
            {
                if(receiveNumber-cNum>1073741823)
                {
                    cNum=Integer.MAX_VALUE+cNum;
                }
                if(cNum<receiveNumber)
                {
                    sendConMessage(new Object[]{getSID(), this, this, -receiveNumber, 4L, true}, Integer.MIN_VALUE);
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
            }
            if(receiveState==Integer.MAX_VALUE)
            {
                receiveState=Integer.MIN_VALUE;
                receivedMessageBlock=new byte[transmitNum][];
                receivedPackets=new BitSet(transmitNum);
            }
            lastReceivedTime=System.nanoTime();
byte[] encrypted=new byte[content.length-36];
            System.arraycopy(content, 36, encrypted, 0, encrypted.length);
            receivedMessageBlock[(int)(cNum-receiveNumber)]=encrypted;
            receivedPackets.set((int)(cNum-receiveNumber));
            if(!confirmReceiveOut)
            {
ByteArrayWrapper thisSID=getSID();
                thisSID.toggleToRunAfterDelay();
Node[] mOThread=latticeSearchLocalMOThread(1, HSystem.defaultNumCheckNodes, getSID(), $_MANAGED_object_COMPILER_DATA_$, this);
                try
                {
                    ((MOThread)mOThread[0].mO).addToRun(new Object[]{thisSID, this, this, null, new Object[]{thisSID, this, this,CommunicationManagedObject.class.getDeclaredMethod("confirmReceive", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$(), 0L,confirmReceiveNum},System.nanoTime(),HSystem.packetConTime}, $_MANAGED_object_COMPILER_DATA_$, this);
                }
                catch(NoSuchMethodException|SecurityException e)
                {
                    Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                }
                confirmReceiveOut=true;
            }
            complete=true;
            if(lastMessageReceived)
            {
                for(int packet=0; packet<receivedPackets.length(); packet++)
                {
                    if(!receivedPackets.get(packet))
                    {
                        complete=false;
                        break;
                    }
                }
            }
            else
            {
                for(int packet=0; packet<transmitNum; packet++)
                {
                    if(!receivedPackets.get(packet))
                    {
                        complete=false;
                        break;
                    }
                }
            }
            if(complete)
            {
                if(lastMessageReceived)
                {
                    receiveState++;
                    confirmReceiveNum++;
                    confirmReceiveOut=false;
                    lastMessageReceived=false;
                    receivedMessageBlocks.add(receivedMessageBlock);
int blockNum=0;
                    for(; blockNum<receivedMessageBlock.length && receivedMessageBlock[blockNum]!=null; blockNum++)
                    {
                    }
                    receiveNumber+=blockNum;
byte[][] receivedData=new byte[transmitNum*(receivedMessageBlocks.size()-1)+blockNum][];
                    for(int receivedMessageBlockNum=0; receivedMessageBlockNum<receivedMessageBlocks.size(); receivedMessageBlockNum++)
                    {
                        for(int receivedMessageNum=0; receivedMessageNum<receivedMessageBlocks.get(receivedMessageBlockNum).length && receivedMessageBlocks.get(receivedMessageBlockNum)[receivedMessageNum]!=null; receivedMessageNum++)
                        {
                            receivedData[transmitNum*receivedMessageBlockNum+receivedMessageNum]=receivedMessageBlocks.get(receivedMessageBlockNum)[receivedMessageNum];
                        }
                    }
                    if(receiveNumber<1)
                    {
                        receiveNumber+=Integer.MAX_VALUE;
                        receiveNumber+=2;
                    }
                    receivedMessageBlocks.clear();
                    try
                    {
                        content=commSec.receiveEncryptedMessage(receivedData);
                        content=dataCompression.decompress(content);
byte[] oSID=new byte[oID.SID.length];
                        System.arraycopy(oID.SID, 0, oSID, 0, oSID.length);
ByteArrayInputStream bIn=new ByteArrayInputStream(content);
ObjectInputStream oIn=new ObjectInputStream(bIn);
byte[][] messageBytes=(byte[][])oIn.readObject();
Object[][] messages=new Object[messageBytes.length][];
                        for(int messageNum=0; messageNum<messageBytes.length; messageNum++)
                        {
                            messages[messageNum]=readMessage(messageBytes[messageNum], oSID);
                        }
                        for(int messageNum=0; messageNum<messages.length; messageNum++)
                        {
                            if(messages[messageNum]!=null)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$=new ByteArrayWrapper($_MANAGED_object_COMPILER_DATA_$.SID, new byte[16], $_MANAGED_object_COMPILER_DATA_$.intelligenceInfo, $_MANAGED_object_COMPILER_DATA_$.updateTime, $_MANAGED_object_COMPILER_DATA_$.data, $_MANAGED_object_COMPILER_DATA_$.userData);
                                $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$.randomizeCallPathID();
                                $_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$.randomizeCallPathID();
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_COMPILER_DATA_$, this);
                                if($_MANAGED_object_COMPILER_SEARCH_RESULT_0_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$[0].mO instanceof MOThread)
                                {
                                    $_MANAGED_object_COMPILER_SEARCH_RESULT_0_$=new Node[]{new Node(HSystem.getBestMOThread())};
                                }
                                ((MOThread)$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$[0].mO).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$, this,$_MANAGED_object_COMPILER_SEARCH_RESULT_0_$, null, new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_0_$, this, this, -2146483624,messageNum,messages,messageBytes,oIn,bIn,oSID,receivedData,blockNum,encrypted,cNum,content,number,mLen,mCont,dataCompression,lastReceivedTime,sendState,receiveState,receiveAttempts,sendAttempts,maxCommunicationAttempts,oPublicKey,lastMessageReceived,receivedPackets,dataTransferWeights,dataTransferMaximumMOAttr,dataTransferMinimumMOAttr,dataTransferMOAttr,recievingCommWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,maxTransmitBytes,transmitNum,maxTransmitSize,receiveConMessNumSend,sendConMessNumSend,receiveConMessNumReceive,sendConMessNumReceive,confirmReceiveNum,confirmSendNum,confirmReceiveOut,confirmSendOut,iLength,complete,senderMess,toTransmit,cAlgs,toSend,transmitting,received,cInit,rLength,recveing,receivedMessageBlock,receivedMessageBlocks,dCAlg,key,oPort,lastConTime,sRNumber,receiveNumber,prevReceiveNumber,prevSendNumber,sendNumber,numNeeded,oID,oIP,commSec}}, $_MANAGED_object_COMPILER_DATA_$, this);
                            }
                        }
                        sendConMessage(new Object[]{HSystem.SID, this, this, -receiveNumber, 1L, false}, Integer.MIN_VALUE);
                        confirmReceiveOut=true;
                    }
                    catch(Exception e)
                    {
                        Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                        sendConMessage(new Object[]{HSystem.SID, this, this, -receiveNumber, 1L, false}, Integer.MIN_VALUE);
                    }
ByteArrayWrapper thisSID=getSID();
                    thisSID.toggleToRunAfterDelay();
Node[] mOThread=latticeSearchLocalMOThread(1, HSystem.defaultNumCheckNodes, getSID(), $_MANAGED_object_COMPILER_DATA_$, this);
                    try
                    {
                        ((MOThread)mOThread[0].mO).addToRun(new Object[]{thisSID, this, this, null, new Object[]{thisSID, this, this,CommunicationManagedObject.class.getDeclaredMethod("confirmReceive", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$(), 0L,confirmReceiveNum},System.nanoTime(), 10*HSystem.packetConTime}, $_MANAGED_object_COMPILER_DATA_$, this);
                    }
                    catch(NoSuchMethodException|SecurityException e)
                    {
                        Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                    }
                    confirmReceiveOut=true;
                    receivedPackets=null;
                }
                else
                {
                    confirmReceiveNum++;
                    confirmReceiveOut=false;
                    receivedPackets.clear();
                    receivedMessageBlocks.add(receivedMessageBlock);
                    receivedMessageBlock=new byte[transmitNum][];
                    receiveNumber+=transmitNum;
                    if(receiveNumber<1)
                    {
                        receiveNumber+=Integer.MAX_VALUE;
                        receiveNumber+=2;
                    }
                    sendConMessage(new Object[]{HSystem.SID, this, this, -receiveNumber, 4L, true}, Integer.MIN_VALUE);
ByteArrayWrapper thisSID=getSID();
                    thisSID.toggleToRunAfterDelay();
Node[] mOThread=latticeSearchLocalMOThread(1, HSystem.defaultNumCheckNodes, getSID(), $_MANAGED_object_COMPILER_DATA_$, this);
                    try
                    {
                        ((MOThread)mOThread[0].mO).addToRun(new Object[]{thisSID, this, this, null, new Object[]{thisSID, this, this,CommunicationManagedObject.class.getDeclaredMethod("confirmReceive", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$(), 0L,confirmReceiveNum},System.nanoTime(), 10*HSystem.packetConTime}, $_MANAGED_object_COMPILER_DATA_$, this);
                    }
                    catch(NoSuchMethodException|SecurityException e)
                    {
                        Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                    }
                    confirmReceiveOut=true;
                }
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

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483641)
    private Object[] readMessage(byte[] content, byte[] oSID) throws MOPermissionDeniedException, TimeOutException
    {
Object[] message=new Object[4];
        try
        {
ByteArrayInputStream bIn=new ByteArrayInputStream(content);
ObjectInputStream oIn=new ObjectInputStream(bIn);
            message[0]=oIn.readObject();
            message[0]=new ByteArrayWrapper(oSID, ((ByteArrayWrapper)message[0]).MORID, ((ByteArrayWrapper)message[0]).intelligenceInfo, ((ByteArrayWrapper)message[0]).updateTime, ((ByteArrayWrapper)message[0]).data, ((ByteArrayWrapper)message[0]).userData);
            message[1]=oIn.readObject();
            message[2]=oIn.readObject();
byte[] tempB=new byte[4];
            bIn.read(tempB);
            message[3]=ManagedObjectUtilities.b8ToB10Int(tempB);
            if(bIn.available()>0)
            {
List<Object> oList=new ArrayList<>();
                while(bIn.available()>0)
                {
                    oList.add(oIn.readObject());
                }
Object[] tempMessage=new Object[message.length];
                System.arraycopy(message, 0, tempMessage, 0, 4);
                message=new Object[4+oList.size()];
                System.arraycopy(tempMessage, 0, message, 0, 4);
                for(int listInd=oList.size()-1; listInd>-1; listInd--)
                {
                    message[4+listInd]=oList.get(listInd);
                }
            }
            return message;
        }
        catch(ManagedObjectDeletedException e)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$=new ByteArrayWrapper();
            $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$.randomizeCallPathID();
            $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$.randomizeCallPathID();
Node[] $_MANAGED_object_COMPILER_SEARCH_RESULT_1_$=latticeSearchLocalMOThread(1, HSystem.mOThreadMaxSearches, $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$, $_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$, this);
            if($_MANAGED_object_COMPILER_SEARCH_RESULT_1_$.length>0 && $_MANAGED_object_COMPILER_SEARCH_RESULT_1_$[0].mO instanceof MOThread)
            {
                $_MANAGED_object_COMPILER_SEARCH_RESULT_1_$=new Node[]{new Node(HSystem.getBestMOThread())};
            }
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$=getSID();
            $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$.toggleNoAggregateThenCall();
            ((MOThread)$_MANAGED_object_COMPILER_SEARCH_RESULT_1_$[0].mO).addToRun(new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$, this,$_MANAGED_object_COMPILER_SEARCH_RESULT_1_$, null, new Object[]{$_MANAGED_object_COMPILER_DATA_CONCURRENT_1_$, this, this, -2146483623,e,message,oSID,content,dataCompression,lastReceivedTime,sendState,receiveState,receiveAttempts,sendAttempts,maxCommunicationAttempts,oPublicKey,lastMessageReceived,receivedPackets,dataTransferWeights,dataTransferMaximumMOAttr,dataTransferMinimumMOAttr,dataTransferMOAttr,recievingCommWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,maxTransmitBytes,transmitNum,maxTransmitSize,receiveConMessNumSend,sendConMessNumSend,receiveConMessNumReceive,sendConMessNumReceive,confirmReceiveNum,confirmSendNum,confirmReceiveOut,confirmSendOut,iLength,complete,senderMess,toTransmit,cAlgs,toSend,transmitting,received,cInit,rLength,recveing,receivedMessageBlock,receivedMessageBlocks,dCAlg,key,oPort,lastConTime,sRNumber,receiveNumber,prevReceiveNumber,prevSendNumber,sendNumber,numNeeded,oID,oIP,commSec}}, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$, this);
        }
        catch(ClassNotFoundException|IOException e)
        {
            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483640)
    private synchronized void sendConMessage(Object[] message, int number) throws MOPermissionDeniedException, TimeOutException
    {
byte[] mess=null;
ByteArrayOutputStream bOut=new ByteArrayOutputStream();
        if(message.length>3)
        {
            try
            {
                bOut.write(ManagedObjectUtilities.b10ToB8((int)message[3]));
                if(message.length>4)
                {
ObjectOutputStream oOut=new ObjectOutputStream(bOut);
                    for(int i=4; i<message.length; i++)
                    {
                        oOut.writeObject(message[i]);
                    }
                }
            }
            catch(IOException e)
            {
                Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
            }
            mess=bOut.toByteArray();
            bOut.reset();
        }
        try
        {
            mess=dataCompression.compress(mess);
        }
        catch(NoSuchAlgorithmException e)
        {
            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
        if(mess.length>=1411)
        {
        }
byte[] data=new byte[mess.length+12];
        System.arraycopy(ManagedObjectUtilities.b10ToB8(number), 0, data, 0, 4);
        if(number==Integer.MIN_VALUE)
        {
            System.arraycopy(ManagedObjectUtilities.b10ToB8(sendConMessNumReceive), 0, data, 4, 8);
            sendConMessNumReceive++;
        }
        else
        {
            System.arraycopy(ManagedObjectUtilities.b10ToB8(sendConMessNumSend), 0, data, 4, 8);
            sendConMessNumSend++;
        }
        System.arraycopy(mess, 0, data, 12, mess.length);
        data=commSec.signMessage(data);
        data=addSessionID(data);
        senderMess[6]=data;
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_1_$=getSID();
        $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_1_$.toggleNoAggregateThenCall();
Node[] dataTransferManagedObject=latticeSearchLocal(dataTransferMOAttr, dataTransferMinimumMOAttr, dataTransferMaximumMOAttr, dataTransferWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_1_$, this);
        if(dataTransferManagedObject.length>0)
        {
            senderMess[2]=(UDPManagedObject)dataTransferManagedObject[0].mO;
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$=getSID();
            $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$.toggleNoAggregateThenCall();
            ((UDPManagedObject)dataTransferManagedObject[0].mO).send(senderMess, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$, this);
        }
        else
        {
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483639)
    private synchronized void receiveConMessage(byte[] mCont, int mLen) throws MOPermissionDeniedException, TimeOutException
    {
byte[] content=new byte[mLen-8];
        System.arraycopy(mCont, 8, content, 0, content.length);
        if(commSec.checkSignature(content))
        {
            content=new byte[8];
            System.arraycopy(mCont, 12, content, 0, content.length);
long sendConNum=ManagedObjectUtilities.b8ToB10(content);
            content=new byte[mLen-52];
            System.arraycopy(mCont, 52, content, 0, content.length);
            try
            {
                content=dataCompression.decompress(content);
            }
            catch(NoSuchAlgorithmException e)
            {
                Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
            }
Object[] message=new Object[8];
ByteArrayInputStream bIn=new ByteArrayInputStream(content);
byte[] tempB=new byte[4];
            try
            {
                bIn.read(tempB);
            }
            catch(IOException e)
            {
                Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
            }
            message[3]=ManagedObjectUtilities.b8ToB10Int(tempB);
byte[] number=new byte[4];
            System.arraycopy(mCont, 8, number, 0, number.length);
            if(ManagedObjectUtilities.b8ToB10Int(number)==Integer.MIN_VALUE+6)
            {
                commSec.state=Integer.MAX_VALUE;
                if(!toSend.isEmpty())
                {
Object[] messageToSend=toSend.remove(0);
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$=getSID();
                    $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$.toggleNoAggregateThenCall();
                    sendMessage(messageToSend, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$, this);
                }
                return ;
            }
            if(ManagedObjectUtilities.b8ToB10Int(number)==Integer.MIN_VALUE && (sendConNum>=receiveConMessNumSend && sendConNum-receiveConMessNumSend<100000 || (sendConNum<0 && receiveConMessNumSend>0 && sendConNum<receiveConMessNumSend+100000)) && (int)message[3]<=-prevSendNumber)
            {
                receiveConMessNumSend=sendConNum;
byte[] oSID=new byte[oID.SID.length];
                System.arraycopy(oID.SID, 0, oSID, 0, oSID.length);
                message[0]=new ByteArrayWrapper(oSID);
                if(bIn.available()>0)
                {
ObjectInputStream oIn=null;
                    try
                    {
                        oIn=new ObjectInputStream(bIn);
                    }
                    catch(IOException e)
                    {
                        Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                    }
List<Object> oList=new ArrayList<>();
                    while(bIn.available()>0)
                    {
                        try
                        {
                            oList.add(oIn.readObject());
                        }
                        catch(ClassNotFoundException|IOException e)
                        {
                            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                        }
                    }
Object findMessage=new Object[4];
                    System.arraycopy(message, 0, findMessage, 0, 4);
                    message=new Object[4+oList.size()];
                    System.arraycopy(findMessage, 0, message, 0, 4);
                    for(int i=oList.size()-1; i>-1; i--)
                    {
                        message[4+i]=oList.get(i);
                    }
                }
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_2_$=getSID();
                $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_2_$.toggleNoAggregateThenCall();
                confirmSend(message, confirmSendNum, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_2_$, this);
            }
            else if(sendConNum>=receiveConMessNumReceive && (sendConNum-receiveConMessNumReceive<100000 || (sendConNum<0 && receiveConMessNumReceive>0 && sendConNum<receiveConMessNumReceive+100000)) && (int)message[3]==receiveNumber)
            {
                receiveConMessNumReceive=sendConNum;
byte[] oSID=new byte[oID.SID.length];
                System.arraycopy(oID.SID, 0, oSID, 0, oSID.length);
                message[0]=new ByteArrayWrapper(oSID);
                if(bIn.available()>0)
                {
ObjectInputStream oIn=null;
                    try
                    {
                        oIn=new ObjectInputStream(bIn);
                    }
                    catch(IOException e)
                    {
                        Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                    }
List<Object> oList=new ArrayList<>();
                    while(bIn.available()>0)
                    {
                        try
                        {
                            oList.add(oIn.readObject());
                        }
                        catch(ClassNotFoundException|IOException e)
                        {
                            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                        }
                    }
Object findMessage=new Object[4];
                    System.arraycopy(message, 0, findMessage, 0, 4);
                    message=new Object[4+oList.size()];
                    System.arraycopy(findMessage, 0, message, 0, 4);
                    for(int i=oList.size()-1; i>-1; i--)
                    {
                        message[4+i]=oList.get(i);
                    }
                }
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_1_$=getSID();
                $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_1_$.toggleNoAggregateThenCall();
                confirmReceive(message, confirmReceiveNum, $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_1_$, this);
            }
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483638)
    protected synchronized Object confirmReceive(Object[] message, long conRecvNum, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483638,message,conRecvNum,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483638);
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        if(confirmReceiveNum<=conRecvNum)
        {
            switch(receiveState)
            {
                case Integer.MIN_VALUE:
                    confirmReceiveOut=false;
                    confirmReceiveNum++;
List<Integer> needed=new ArrayList<>();
                    if(System.nanoTime()-lastReceivedTime>10*HSystem.packetConTime)
                    {
                        for(int rPacketNum=0; rPacketNum<transmitNum; rPacketNum++)
                        {
                            if(!receivedPackets.get(rPacketNum))
                            {
                                needed.add(rPacketNum);
                            }
                        }
                        sendConMessage(new Object[]{HSystem.SID, this, this, -receiveNumber,needed.toArray(new Integer[0])}, Integer.MIN_VALUE);
                    }
ByteArrayWrapper thisSID=getSID();
                    thisSID.toggleToRunAfterDelay();
Node[] mOThread=latticeSearchLocalMOThread(1, HSystem.defaultNumCheckNodes, getSID(), $_MANAGED_object_COMPILER_DATA_$, this);
                    try
                    {
                        ((MOThread)mOThread[0].mO).addToRun(new Object[]{thisSID, this, this, null, new Object[]{thisSID, this, this,CommunicationManagedObject.class.getDeclaredMethod("confirmReceive", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$(), 0L,confirmReceiveNum},System.nanoTime(), (2*needed.size()+10)*HSystem.packetConTime}, $_MANAGED_object_COMPILER_DATA_$, this);
                    }
                    catch(NoSuchMethodException|SecurityException e)
                    {
                        Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                    }
                    confirmReceiveOut=true;
                    break;
                case Integer.MIN_VALUE+1:
                    confirmReceiveOut=false;
                    confirmReceiveNum++;
                    if(((ByteArrayWrapper)message[0]).equalsSID(HSystem.SID))
                    {
                        sendConMessage(new Object[]{HSystem.SID, this, this, -receiveNumber, 1L, false}, Integer.MIN_VALUE);
                        thisSID=getSID();
                        thisSID.toggleToRunAfterDelay();
                        mOThread=latticeSearchLocalMOThread(1, HSystem.defaultNumCheckNodes, getSID(), $_MANAGED_object_COMPILER_DATA_$, this);
                        try
                        {
                            ((MOThread)mOThread[0].mO).addToRun(new Object[]{thisSID, this, this, null, new Object[]{thisSID, this, this,CommunicationManagedObject.class.getDeclaredMethod("confirmReceive", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$(), 0L,confirmReceiveNum},System.nanoTime(), 50*HSystem.packetConTime}, $_MANAGED_object_COMPILER_DATA_$, this);
                        }
                        catch(NoSuchMethodException|SecurityException e)
                        {
                            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                        }
                        confirmReceiveOut=true;
                    }
                    else if((long)message[4]==1)
                    {
                        receiveState=Integer.MAX_VALUE;
                        sendConMessage(new Object[]{HSystem.SID, this, this, -receiveNumber, 2L}, Integer.MIN_VALUE);
                    }
        			break;
                case Integer.MAX_VALUE:
                    confirmReceiveOut=false;
                    confirmReceiveNum++;
                    if(!((ByteArrayWrapper)message[0]).equalsSID(HSystem.SID))
                    {
                        sendConMessage(new Object[]{HSystem.SID, this, this, -receiveNumber, 3L}, Integer.MIN_VALUE);
                    }
	    			break;
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

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483637)
    protected synchronized Object confirmSend(Object[] message, long conSendNum, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483637,message,conSendNum,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483637);
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        if(confirmSendNum<=conSendNum)
        {
            switch(sendState)
            {
                case Integer.MIN_VALUE:
                    if(message.length>5 && !((ByteArrayWrapper)message[0]).equalsSID(HSystem.SID))
                    {
                        if(message[5].getClass().isArray())
                        {
int sendMessageNum=0;
Object[] toSendMessage=null;
Node[] dataTransferManagedObject=latticeSearchLocal(dataTransferMOAttr, dataTransferMinimumMOAttr, dataTransferMaximumMOAttr, dataTransferWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
                            if(dataTransferManagedObject.length>0)
                            {
                                for(int packet=0; packet<((Integer[])message[5]).length; packet++)
                                {
                                    if(((Integer[])message[5])[packet]<toTransmit.size())
                                    {
                                        toSendMessage=toTransmit.get(((Integer[])message[5])[packet]);
                                        toSendMessage[2]=(UDPManagedObject)dataTransferManagedObject[0].mO;
                                        ((UDPManagedObject)dataTransferManagedObject[0].mO).send(toSendMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                    }
                                }
                            }
                            else
                            {
                            }
                            confirmSendOut=false;
                            confirmSendNum++;
ByteArrayWrapper thisSID=getSID();
                            thisSID.toggleToRunAfterDelay();
Node[] mOThread=latticeSearchLocalMOThread(1, HSystem.defaultNumCheckNodes, getSID(), $_MANAGED_object_COMPILER_DATA_$, this);
                            try
                            {
                                ((MOThread)mOThread[0].mO).addToRun(new Object[]{thisSID, this, this, null, new Object[]{thisSID, this, this,CommunicationManagedObject.class.getDeclaredMethod("confirmSend", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$(), 0L,confirmSendNum},System.nanoTime(), (((Integer[])message[5]).length+10)*HSystem.packetConTime}, $_MANAGED_object_COMPILER_DATA_$, this);
                            }
                            catch(NoSuchMethodException|SecurityException e)
                            {
                                Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                            }
                            confirmSendOut=true;
                        }
                        else if(message[5] instanceof Boolean)
                        {
                            if((boolean)message[5])
                            {
                                if(-(int)message[3]>prevReceiveNumber)
                                {
                                    prevReceiveNumber=-(int)message[3];
Object[] toSendMessage=null;
Node[] dataTransferManagedObject=latticeSearchLocal(dataTransferMOAttr, dataTransferMinimumMOAttr, dataTransferMaximumMOAttr, dataTransferWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
                                    if(dataTransferManagedObject.length>0)
                                    {
                                        for(int messageNumber=transmitNum; messageNumber<toTransmit.size() && messageNumber<2*transmitNum; messageNumber++)
                                        {
                                            toSendMessage=toTransmit.get(messageNumber);
                                            toSendMessage[2]=(UDPManagedObject)dataTransferManagedObject[0].mO;
                                            ((UDPManagedObject)dataTransferManagedObject[0].mO).send(toSendMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                        }
                                    }
                                    else
                                    {
                                    }
                                    confirmSendOut=false;
                                    confirmSendNum++;
                                    if(toTransmit.size()-transmitNum>=transmitNum)
                                    {
ByteArrayWrapper thisSID=getSID();
                                        thisSID.toggleToRunAfterDelay();
Node[] mOThread=latticeSearchLocalMOThread(1, HSystem.defaultNumCheckNodes, getSID(), $_MANAGED_object_COMPILER_DATA_$, this);
                                        try
                                        {
                                            ((MOThread)mOThread[0].mO).addToRun(new Object[]{thisSID, this, this, null, new Object[]{thisSID, this, this,CommunicationManagedObject.class.getDeclaredMethod("confirmSend", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$(), 0L,confirmSendNum},System.nanoTime(), (transmitNum+10)*HSystem.packetConTime}, $_MANAGED_object_COMPILER_DATA_$, this);
                                        }
                                        catch(NoSuchMethodException|SecurityException e)
                                        {
                                            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                                        }
                                    }
                                    else
                                    {
ByteArrayWrapper thisSID=getSID();
                                        thisSID.toggleToRunAfterDelay();
Node[] mOThread=latticeSearchLocalMOThread(1, HSystem.defaultNumCheckNodes, getSID(), $_MANAGED_object_COMPILER_DATA_$, this);
                                        try
                                        {
                                            ((MOThread)mOThread[0].mO).addToRun(new Object[]{thisSID, this, this, null, new Object[]{thisSID, this, this,CommunicationManagedObject.class.getDeclaredMethod("confirmSend", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$(), 0L,confirmSendNum},System.nanoTime(), (toTransmit.size()%transmitNum+10)*HSystem.packetConTime}, $_MANAGED_object_COMPILER_DATA_$, this);
                                        }
                                        catch(NoSuchMethodException|SecurityException e)
                                        {
                                            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                                        }
                                    }
                                    confirmSendOut=true;
                                    for(int packet=0; packet<transmitNum && 0<toTransmit.size(); packet++)
                                    {
                                        removeFromToTransmit(0);
                                    }
                                }
                            }
                            else if(transmitting && (int)message[3]==-sendNumber)
                            {
                                transmitting=false;
                                prevReceiveNumber=sendNumber;
                                sendState++;
                                toTransmit.clear();
                                if(toSend.size()>0)
                                {
Object[] messageToSend=toSend.remove(0);
                                    sendMessage(messageToSend, $_MANAGED_object_COMPILER_DATA_$, this);
                                }
                                sendConMessage(new Object[]{HSystem.SID, this, this,sendNumber, 1L}, Integer.MIN_VALUE+1);
                                confirmSendOut=false;
                                confirmSendNum++;
ByteArrayWrapper thisSID=getSID();
                                thisSID.toggleToRunAfterDelay();
Node[] mOThread=latticeSearchLocalMOThread(1, HSystem.defaultNumCheckNodes, getSID(), $_MANAGED_object_COMPILER_DATA_$, this);
                                try
                                {
                                    ((MOThread)mOThread[0].mO).addToRun(new Object[]{thisSID, this, this, null, new Object[]{thisSID, this, this,CommunicationManagedObject.class.getDeclaredMethod("confirmSend", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$(), 0L,confirmSendNum},System.nanoTime(), 10*HSystem.packetConTime}, $_MANAGED_object_COMPILER_DATA_$, this);
                                }
                                catch(NoSuchMethodException|SecurityException e)
                                {
                                    Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                                }
                                confirmSendOut=true;
                            }
                        }
                    }
                    else
                    {
                        if(message[4] instanceof Long && (long)message[4]==0)
                        {
List<Object[]> toTransmitLessThanTransmitNumber=toTransmit.subList(0, Math.min(toTransmit.size(), transmitNum));
                            Collections.shuffle(toTransmitLessThanTransmitNumber, new Random());
Object[] toSendMessage=null;
Node[] dataTransferManagedObject=latticeSearchLocal(dataTransferMOAttr, dataTransferMinimumMOAttr, dataTransferMaximumMOAttr, dataTransferWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
                            if(dataTransferManagedObject.length>0)
                            {
                                for(int messageNumber=0; messageNumber<toTransmitLessThanTransmitNumber.size(); messageNumber++)
                                {
                                    toSendMessage=toTransmitLessThanTransmitNumber.get(messageNumber);
                                    toSendMessage[2]=(UDPManagedObject)dataTransferManagedObject[0].mO;
                                    ((UDPManagedObject)dataTransferManagedObject[0].mO).send(toSendMessage, $_MANAGED_object_COMPILER_DATA_$, this);
                                }
                            }
                            else
                            {
                            }
                            confirmSendOut=false;
                            confirmSendNum++;
                            if(transmitNum>toTransmit.size())
                            {
ByteArrayWrapper thisSID=getSID();
                                thisSID.toggleToRunAfterDelay();
Node[] mOThread=latticeSearchLocalMOThread(1, HSystem.defaultNumCheckNodes, getSID(), $_MANAGED_object_COMPILER_DATA_$, this);
                                try
                                {
                                    ((MOThread)mOThread[0].mO).addToRun(new Object[]{thisSID, this, this, null, new Object[]{thisSID, this, this,CommunicationManagedObject.class.getDeclaredMethod("confirmSend", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$(), 0L,confirmSendNum},System.nanoTime(), (4*toTransmit.size()+10)*HSystem.packetConTime}, $_MANAGED_object_COMPILER_DATA_$, this);
                                }
                                catch(NoSuchMethodException|SecurityException e)
                                {
                                    Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                                }
                            }
                            else
                            {
ByteArrayWrapper thisSID=getSID();
                                thisSID.toggleToRunAfterDelay();
Node[] mOThread=latticeSearchLocalMOThread(1, HSystem.defaultNumCheckNodes, getSID(), $_MANAGED_object_COMPILER_DATA_$, this);
                                try
                                {
                                    ((MOThread)mOThread[0].mO).addToRun(new Object[]{thisSID, this, this, null, new Object[]{thisSID, this, this,CommunicationManagedObject.class.getDeclaredMethod("confirmSend", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$(), 0L,confirmSendNum},System.nanoTime(), (4*transmitNum+10)*HSystem.packetConTime}, $_MANAGED_object_COMPILER_DATA_$, this);
                                }
                                catch(NoSuchMethodException|SecurityException e)
                                {
                                    Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                                }
                            }
                            confirmSendOut=true;
                        }
                    }
        			break;
                case Integer.MIN_VALUE+1:
                    if(((ByteArrayWrapper)message[0]).equalsSID(HSystem.SID) || (long)message[4]==1)
                    {
                        sendConMessage(new Object[]{HSystem.SID, this, this,sendNumber, 1L}, Integer.MIN_VALUE+1);
                        confirmSendOut=false;
                        confirmSendNum++;
ByteArrayWrapper thisSID=getSID();
                        thisSID.toggleToRunAfterDelay();
Node[] mOThread=latticeSearchLocalMOThread(1, HSystem.defaultNumCheckNodes, getSID(), $_MANAGED_object_COMPILER_DATA_$, this);
                        try
                        {
                            ((MOThread)mOThread[0].mO).addToRun(new Object[]{thisSID, this, this, null, new Object[]{thisSID, this, this,CommunicationManagedObject.class.getDeclaredMethod("confirmSend", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$(), 1L,confirmSendNum},System.nanoTime(), 10*HSystem.packetConTime}, $_MANAGED_object_COMPILER_DATA_$, this);
                        }
                        catch(NoSuchMethodException|SecurityException e)
                        {
                            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
                        }
                        confirmSendOut=true;
                    }
                    else if((long)message[4]==2 || (long)message[4]==3)
                    {
                        sendState=Integer.MAX_VALUE;
                        if(!toSend.isEmpty())
                        {
Object[] messageToSend=toSend.remove(0);
                            sendMessage(messageToSend, $_MANAGED_object_COMPILER_DATA_$, this);
                        }
                    }
        			break;
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

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=true, intelligenceBefore=true, intelligenceAfter=true, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483636)
    protected void changeCAlg(Object[] message, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483636,message,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483636);
        if(message[0]!=oIP)
        {
        }
        dCAlg=((byte[])message[8])[0];
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483635)
    private void addToToTransmit(Object[] message)
    {
        synchronized(toTransmit)
        {
            toTransmit.add(message);
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483634)
    private Object[] getFromToTransmit(int ind)
    {
        synchronized(toTransmit)
        {
            return toTransmit.get(ind);
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483633)
    private Object[][] getFromToTransmit(int ind, int number)
    {
        synchronized(toTransmit)
        {
Object[][] transmitMessages=new Object[number][];
            for(int num=0; num<number && ind+num<toTransmit.size(); num++)
            {
                transmitMessages[num]=toTransmit.get(ind+num);
            }
            return transmitMessages;
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483632)
    private Object[] removeFromToTransmit(int ind)
    {
        synchronized(toTransmit)
        {
            return toTransmit.remove(ind);
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483631)
    private int nextMultiple(int size, int multiple)
    {
        return (size/multiple+1)*multiple;
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483630)
    private void setOtherInformation(Object[] message)
    {
        sendNumber=(int)message[9];
        receiveNumber=(int)message[8];
        confirmSendNum=(long)message[11];
        confirmReceiveNum=(long)message[10];
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483629)
    private boolean isReachable(InetAddress ip, int port)
    {
DatagramSocket socket=null;
int listenPort=31234;
        for(int att=0; att<100; att++)
        {
            try
            {
                socket=new DatagramSocket(listenPort+att);
                break;
            }
            catch(SocketException e)
            {
            }
        }
        try
        {
            socket.setSoTimeout(3000);
            socket.setBroadcast(false);
        }
        catch(SocketException e)
        {
            e.printStackTrace();
        }
byte[] data=new byte[32];
        HSystem.cryptoPRNG.getBytes(data);
        try
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$=getSID();
            $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_0_$.toggleNoAggregateThenCall();
            socket.send(new DatagramPacket(data, data.length, ip, port));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
byte[] buff=new byte[32];
DatagramPacket dgp=new DatagramPacket(buff, buff.length);
        try
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_1_$=getSID();
            $_MANAGED_object_COMPILER_NO_AGGREGATE_THEN_CALL_SID_1_$.toggleNoAggregateThenCall();
            socket.receive(dgp);
        }
        catch(IOException e)
        {
            socket.close();
            return false;
        }
        socket.close();
        return Arrays.areEqual(oID.SID, dgp.getData());
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    private CommunicationManagedObject($_MANAGED_object_COMPILER_DUMMY_VARIABLE_$ $_MANAGED_object_COMPILER_DUMMY_variable_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(CommunicationManagedObject.class))
        {
            addPermission(permission, null, this);
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483628)
    protected static   Object $_MANAGED_object_COMPILER_CREATE_METHOD_$(ManagedObject creator, ByteArrayWrapper oSID, String securityProtocol, int protocolStrength, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
CommunicationManagedObject $_MANAGED_object_COMPILER_CREATED_Object_$=new CommunicationManagedObject(new $_MANAGED_object_COMPILER_DUMMY_VARIABLE_$());
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            $_MANAGED_object_COMPILER_CREATED_Object_$.addPermission(permission, null, $_MANAGED_object_COMPILER_CREATED_Object_$);
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483628);
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
;
        $_MANAGED_object_COMPILER_CREATED_Object_$.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(creator, oSID, securityProtocol, protocolStrength, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_COMPILER_CREATED_Object_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,$_MANAGED_object_COMPILER_CREATED_Object_$};
        return null;
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483627)
    public CommunicationManagedObject $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(ManagedObject creator, ByteArrayWrapper oSID, String securityProtocol, int protocolStrength, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(CommunicationManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483627,creator,oSID,securityProtocol,protocolStrength,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483627);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483627,creator}, 1, -2146483613, true, true, new Object[]{protocolStrength,securityProtocol,oSID,creator,dataCompression,lastReceivedTime,sendState,receiveState,receiveAttempts,sendAttempts,maxCommunicationAttempts,oPublicKey,lastMessageReceived,receivedPackets,dataTransferWeights,dataTransferMaximumMOAttr,dataTransferMinimumMOAttr,dataTransferMOAttr,recievingCommWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,maxTransmitBytes,transmitNum,maxTransmitSize,receiveConMessNumSend,sendConMessNumSend,receiveConMessNumReceive,sendConMessNumReceive,confirmReceiveNum,confirmSendNum,confirmReceiveOut,confirmSendOut,iLength,complete,senderMess,toTransmit,cAlgs,toSend,transmitting,received,cInit,rLength,recveing,receivedMessageBlock,receivedMessageBlocks,dCAlg,key,oPort,lastConTime,sRNumber,receiveNumber,prevReceiveNumber,prevSendNumber,sendNumber,numNeeded,oID,oIP,commSec}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            super.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(creator, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
        try
        {
            addPermission(new CompareMessage[]
{
new CompareSID(oSID),
new CompareMessageRange(new Range[]{new Range(HSystem.minManagedObject, HSystem.maxManagedObject)}),
new CompareMessageRange(new Range[]{new Range(HSystem.minManagedObject, HSystem.maxManagedObject)}),
new CompareMessageRange(new Range[]
{
new Range(CommunicationManagedObject.class.getDeclaredMethod("sendMessage", Object[].class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$()),
new Range(CommunicationManagedObject.class.getDeclaredMethod("confirmSend", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$()),
new Range(CommunicationManagedObject.class.getDeclaredMethod("receiveMessage", byte[].class, int.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$()),
new Range(CommunicationManagedObject.class.getDeclaredMethod("confirmReceive", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$())
}),
new AnyObjectAllowed(),
new AnyObjectAllowed()
}, getSID(), this);
        }
        catch(Exception e)
        {
            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
        oID=oSID;
int[] commAttrs=new int[10];
byte[] tempBy=new byte[4];
        for(int oSIDSection=0; oSIDSection<8; oSIDSection++)
        {
            System.arraycopy(oID.SID, 4*oSIDSection, tempBy, 0, 4);
            commAttrs[oSIDSection]=ManagedObjectUtilities.b8ToB10Int(tempBy);
        }
        commAttrs[8]=HSystem.cryptoPRNG.getInt();
        commAttrs[9]=HSystem.cryptoPRNG.getInt();
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483627,commAttrs}, 1, -2146483622, true, true, new Object[]{tempBy,commAttrs,protocolStrength,securityProtocol,oSID,creator,dataCompression,lastReceivedTime,sendState,receiveState,receiveAttempts,sendAttempts,maxCommunicationAttempts,oPublicKey,lastMessageReceived,receivedPackets,dataTransferWeights,dataTransferMaximumMOAttr,dataTransferMinimumMOAttr,dataTransferMOAttr,recievingCommWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,maxTransmitBytes,transmitNum,maxTransmitSize,receiveConMessNumSend,sendConMessNumSend,receiveConMessNumReceive,sendConMessNumReceive,confirmReceiveNum,confirmSendNum,confirmReceiveOut,confirmSendOut,iLength,complete,senderMess,toTransmit,cAlgs,toSend,transmitting,received,cInit,rLength,recveing,receivedMessageBlock,receivedMessageBlocks,dCAlg,key,oPort,lastConTime,sRNumber,receiveNumber,prevReceiveNumber,prevSendNumber,sendNumber,numNeeded,oID,oIP,commSec}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            addAttributes(commAttrs, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
int[] matchingCommMOAttributes=new int[mOAttributes.length];
        System.arraycopy(mOAttributes, 0, matchingCommMOAttributes, 0, mOAttributes.length);
int[] matchingCommMOAttributesWeights=new int[matchingCommMOAttributes.length];
        for(int weightNum=0; weightNum<matchingCommMOAttributesWeights.length; weightNum++)
        {
            if(weightNum==2 || weightNum==15 || weightNum==16 || weightNum==17 || weightNum==18 || 
weightNum==19 || weightNum==20 || weightNum==21)
            {
                matchingCommMOAttributesWeights[weightNum]=0;
            }
            else
            {
                matchingCommMOAttributesWeights[weightNum]=HSystem.intMaxValue;
            }
        }
        try
        {
            commSec=new CommunicationSecurityProtocol(securityProtocol, protocolStrength);
            dataCompression=new DataCompression(dCAlg);
        }
        catch(NoSuchAlgorithmException e)
        {
            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
        if(oSID.equalsSID(HSystem.masterSID))
        {
            oIP=HSystem.masterIP;
            oPort=19472;
            try
            {
                commSec.init(HSystem.masterPublicKey);
            }
            catch(InvalidKeyException|NoSuchAlgorithmException|NoSuchProviderException|InvalidAlgorithmParameterException|NoSuchPaddingException e)
            {
                Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        else
        {
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
                    System.arraycopy(HSystem.masterSID.SID, 4*(attrNum-7), tempBy, 0, tempBy.length);
                    SIDMOAttrs[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempBy);
                    minSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                    maxSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                    SIDMOWeights[attrNum]=HSystem.intMaxValue;
                }
                else if(attrNum>=HSystem.mOAttributesLength && attrNum<HSystem.mOAttributesLength+8)
                {
                    System.arraycopy(oSID.SID, 4*(attrNum-HSystem.mOAttributesLength), tempBy, 0, tempBy.length);
                    SIDMOAttrs[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempBy);
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
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483627,SIDMOAttrs,minSIDMOVals,maxSIDMOVals,SIDMOWeights, 1,HSystem.defaultNumCheckNodes, false}, 1, -2146483617, true, true, new Object[]{SIDMOWeights,maxSIDMOVals,minSIDMOVals,SIDMOAttrs,matchingCommMOAttributesWeights,matchingCommMOAttributes,tempBy,commAttrs,protocolStrength,securityProtocol,oSID,creator,dataCompression,lastReceivedTime,sendState,receiveState,receiveAttempts,sendAttempts,maxCommunicationAttempts,oPublicKey,lastMessageReceived,receivedPackets,dataTransferWeights,dataTransferMaximumMOAttr,dataTransferMinimumMOAttr,dataTransferMOAttr,recievingCommWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,maxTransmitBytes,transmitNum,maxTransmitSize,receiveConMessNumSend,sendConMessNumSend,receiveConMessNumReceive,sendConMessNumReceive,confirmReceiveNum,confirmSendNum,confirmReceiveOut,confirmSendOut,iLength,complete,senderMess,toTransmit,cAlgs,toSend,transmitting,received,cInit,rLength,recveing,receivedMessageBlock,receivedMessageBlocks,dCAlg,key,oPort,lastConTime,sRNumber,receiveNumber,prevReceiveNumber,prevSendNumber,sendNumber,numNeeded,oID,oIP,commSec}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=latticeSearch(SIDMOAttrs, minSIDMOVals, maxSIDMOVals, SIDMOWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                return null;
            }
            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
            {
    throw new TimeOutException();
            }
Node[] SIDMO=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
            if(true)
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483627,HSystem.masterIP}, 1, -2146483614, true, true, new Object[]{SIDMO,SIDMOWeights,maxSIDMOVals,minSIDMOVals,SIDMOAttrs,matchingCommMOAttributesWeights,matchingCommMOAttributes,tempBy,commAttrs,protocolStrength,securityProtocol,oSID,creator,dataCompression,lastReceivedTime,sendState,receiveState,receiveAttempts,sendAttempts,maxCommunicationAttempts,oPublicKey,lastMessageReceived,receivedPackets,dataTransferWeights,dataTransferMaximumMOAttr,dataTransferMinimumMOAttr,dataTransferMOAttr,recievingCommWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,maxTransmitBytes,transmitNum,maxTransmitSize,receiveConMessNumSend,sendConMessNumSend,receiveConMessNumReceive,sendConMessNumReceive,confirmReceiveNum,confirmSendNum,confirmReceiveOut,confirmSendOut,iLength,complete,senderMess,toTransmit,cAlgs,toSend,transmitting,received,cInit,rLength,recveing,receivedMessageBlock,receivedMessageBlocks,dCAlg,key,oPort,lastConTime,sRNumber,receiveNumber,prevReceiveNumber,prevSendNumber,sendNumber,numNeeded,oID,oIP,commSec}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                ((SIDMO)SIDMO[0].mO).getInfo(HSystem.masterIP, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                return null;
            }
            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
            {
    throw new TimeOutException();
            }
Object[] oMess=((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
            try
            {
                commSec.init((byte[])oMess[0]);
            }
            catch(InvalidKeyException|NoSuchAlgorithmException|NoSuchProviderException|InvalidAlgorithmParameterException|NoSuchPaddingException e)
            {
                Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
            }
            if(((InetAddress[])oMess[1]).length>1)
            {
                if(true)
                {
Iterator<InetAddress> $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
Object $_MANAGED_object_COMPILER_VARIABLE_1_$=(InetAddress[])oMess[1];
                    if($_MANAGED_object_COMPILER_VARIABLE_1_$!=null)
                    {
                        if($_MANAGED_object_COMPILER_VARIABLE_1_$.getClass().isArray())
                        {
                            $_MANAGED_object_COMPILER_VARIABLE_0_$=new ArrayIterator((Object[])$_MANAGED_object_COMPILER_VARIABLE_1_$);
                        }
                        else
                        {
                            $_MANAGED_object_COMPILER_VARIABLE_0_$=((Iterable<InetAddress>)$_MANAGED_object_COMPILER_VARIABLE_1_$).iterator();
                        }
InetAddress possibleIP=null;
                        while($_MANAGED_object_COMPILER_VARIABLE_0_$.hasNext())
                        {
                            possibleIP=$_MANAGED_object_COMPILER_VARIABLE_0_$.next();
                            if(possibleIP.isLoopbackAddress())
                            {
                                if(isReachable(possibleIP, ((int[])oMess[2])[0]))
                                {
                                    oIP=possibleIP;
                                    oPort=((int[])oMess[2])[0];
							break;
                                }
                            }
                            else if(isReachable(possibleIP, ((int[])oMess[2])[1]))
                            {
                                oIP=possibleIP;
                                oPort=((int[])oMess[2])[1];
						break;
                            }
                        }
                    }
                }
            }
            else
            {
                oIP=((InetAddress[])oMess[1])[0];
                oPort=((int[])oMess[2])[0];
            }
        }
        recievingCommMOAttr=new int[HSystem.mOAttributesLength+10];
        recievingCommMOMinAttr=new int[recievingCommMOAttr.length];
        recievingCommMOMaxAttr=new int[recievingCommMOAttr.length];
        recievingCommWeights=new int[recievingCommMOAttr.length];
        for(int attrNum=0; attrNum<recievingCommMOAttr.length; attrNum++)
        {
            if(attrNum==0)
            {
                recievingCommMOAttr[attrNum]=HSystem.communicationManagedObjectNameHash;
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==1)
            {
                recievingCommMOAttr[attrNum]=HSystem.communicationManagedObjectClassHash;
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==2)
            {
                recievingCommMOAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMinAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMaxAttr[attrNum]=Integer.MAX_VALUE;
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>6 && attrNum<15)
            {
                System.arraycopy(oID.SID, 4*(attrNum-7), tempBy, 0, 4);
                recievingCommMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempBy);
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>HSystem.mOAttributesLength-1 && attrNum<HSystem.mOAttributesLength+8)
            {
                System.arraycopy(HSystem.SID.SID, 4*(attrNum-HSystem.mOAttributesLength), tempBy, 0, 4);
                recievingCommMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempBy);
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>HSystem.mOAttributesLength+7 && attrNum<HSystem.mOAttributesLength+10)
            {
                recievingCommMOAttr[attrNum]=mOAttributes[attrNum];
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else
            {
                recievingCommMOMinAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMaxAttr[attrNum]=Integer.MAX_VALUE;
                recievingCommWeights[attrNum]=0;
            }
        }
        dataTransferMOAttr=new int[HSystem.mOAttributesLength];
        dataTransferMinimumMOAttr=new int[dataTransferMOAttr.length];
        dataTransferMaximumMOAttr=new int[dataTransferMOAttr.length];
        dataTransferWeights=new int[dataTransferMOAttr.length];
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
        if(commSec.state!=Integer.MAX_VALUE)
        {
            senderMess[0]=getSID();
            senderMess[1]=this;
            senderMess[3]=null;
            senderMess[4]=oIP;
            senderMess[5]=oPort;
            try
            {
                senderMess[6]=addSessionID(commSec.sendEncryptedMessage(null, null, 0)[0]);
            }
            catch(NoSuchAlgorithmException|NoSuchProviderException|InvalidAlgorithmParameterException|IllegalBlockSizeException|BadPaddingException e)
            {
                Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
            }
Node[] dataTransferManagedObject=latticeSearchLocal(dataTransferMOAttr, dataTransferMinimumMOAttr, dataTransferMaximumMOAttr, dataTransferWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
            senderMess[2]=(UDPManagedObject)dataTransferManagedObject[0].mO;
            ((UDPManagedObject)dataTransferManagedObject[0].mO).send(senderMess, $_MANAGED_object_COMPILER_DATA_$, this);
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

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483626)
    public static   Object $_MANAGED_object_COMPILER_CREATE_METHOD_$(ManagedObject creator, InetAddress iPv4, int port, byte[] mCont, int mLen, String securityProtocol, int protocolStrength, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
CommunicationManagedObject $_MANAGED_object_COMPILER_CREATED_Object_$=new CommunicationManagedObject(new $_MANAGED_object_COMPILER_DUMMY_VARIABLE_$());
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            $_MANAGED_object_COMPILER_CREATED_Object_$.addPermission(permission, null, $_MANAGED_object_COMPILER_CREATED_Object_$);
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483626);
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
;
        $_MANAGED_object_COMPILER_CREATED_Object_$.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(creator, iPv4, port, mCont, mLen, securityProtocol, protocolStrength, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_COMPILER_CREATED_Object_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,$_MANAGED_object_COMPILER_CREATED_Object_$};
        return null;
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483625)
    public CommunicationManagedObject $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(ManagedObject creator, InetAddress iPv4, int port, byte[] mCont, int mLen, String securityProtocol, int protocolStrength, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(CommunicationManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483625,creator,iPv4,port,mCont,mLen,securityProtocol,protocolStrength,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483625);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483625,creator}, 1, -2146483612, true, true, new Object[]{protocolStrength,securityProtocol,mLen,mCont,port,iPv4,creator,dataCompression,lastReceivedTime,sendState,receiveState,receiveAttempts,sendAttempts,maxCommunicationAttempts,oPublicKey,lastMessageReceived,receivedPackets,dataTransferWeights,dataTransferMaximumMOAttr,dataTransferMinimumMOAttr,dataTransferMOAttr,recievingCommWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,maxTransmitBytes,transmitNum,maxTransmitSize,receiveConMessNumSend,sendConMessNumSend,receiveConMessNumReceive,sendConMessNumReceive,confirmReceiveNum,confirmSendNum,confirmReceiveOut,confirmSendOut,iLength,complete,senderMess,toTransmit,cAlgs,toSend,transmitting,received,cInit,rLength,recveing,receivedMessageBlock,receivedMessageBlocks,dCAlg,key,oPort,lastConTime,sRNumber,receiveNumber,prevReceiveNumber,prevSendNumber,sendNumber,numNeeded,oID,oIP,commSec}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            super.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(creator, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
        try
        {
MessageDigest sha256=MessageDigest.getInstance("SHA-256");
        }
        catch(NoSuchAlgorithmException e)
        {
            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
byte[] content=new byte[mCont.length-8];
        System.arraycopy(mCont, 8, content, 0, content.length);
        try
        {
            commSec=new CommunicationSecurityProtocol(securityProtocol, protocolStrength);
        }
        catch(NoSuchAlgorithmException e)
        {
            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
        try
        {
            oID=commSec.init(content);
        }
        catch(InvalidKeyException|NoSuchAlgorithmException|NoSuchProviderException|InvalidAlgorithmParameterException|NoSuchPaddingException e)
        {
            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
        try
        {
            addPermission(new CompareMessage[]
{
new CompareSID(oID),
new CompareMessageRange(new Range[]{new Range(HSystem.minManagedObject, HSystem.maxManagedObject)}),
new CompareMessageRange(new Range[]{new Range(HSystem.minManagedObject, HSystem.maxManagedObject)}),
new CompareMessageRange(new Range[]
{
new Range(CommunicationManagedObject.class.getDeclaredMethod("sendMessage", Object[].class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$()),
new Range(CommunicationManagedObject.class.getDeclaredMethod("confirmSend", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$()),
new Range(CommunicationManagedObject.class.getDeclaredMethod("receiveMessage", byte[].class, int.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$()),
new Range(CommunicationManagedObject.class.getDeclaredMethod("confirmReceive", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$())
}),
new AnyObjectAllowed(),
new AnyObjectAllowed()
}, getSID(), this);
        }
        catch(Exception e)
        {
            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
byte[] pubKey=new byte[4];
int[] commAttrs=new int[10];
        for(int oSIDSection=0; oSIDSection<8; oSIDSection++)
        {
            System.arraycopy(oID.SID, 4*oSIDSection, pubKey, 0, pubKey.length);
            commAttrs[oSIDSection]=ManagedObjectUtilities.b8ToB10Int(pubKey);
        }
        System.arraycopy(mCont, 0, pubKey, 0, pubKey.length);
        commAttrs[8]=ManagedObjectUtilities.b8ToB10Int(pubKey);
        System.arraycopy(mCont, 4, pubKey, 0, pubKey.length);
        commAttrs[9]=ManagedObjectUtilities.b8ToB10Int(pubKey);
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483625,commAttrs}, 1, -2146483621, true, true, new Object[]{commAttrs,pubKey,content,protocolStrength,securityProtocol,mLen,mCont,port,iPv4,creator,dataCompression,lastReceivedTime,sendState,receiveState,receiveAttempts,sendAttempts,maxCommunicationAttempts,oPublicKey,lastMessageReceived,receivedPackets,dataTransferWeights,dataTransferMaximumMOAttr,dataTransferMinimumMOAttr,dataTransferMOAttr,recievingCommWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,maxTransmitBytes,transmitNum,maxTransmitSize,receiveConMessNumSend,sendConMessNumSend,receiveConMessNumReceive,sendConMessNumReceive,confirmReceiveNum,confirmSendNum,confirmReceiveOut,confirmSendOut,iLength,complete,senderMess,toTransmit,cAlgs,toSend,transmitting,received,cInit,rLength,recveing,receivedMessageBlock,receivedMessageBlocks,dCAlg,key,oPort,lastConTime,sRNumber,receiveNumber,prevReceiveNumber,prevSendNumber,sendNumber,numNeeded,oID,oIP,commSec}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            addAttributes(commAttrs, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
        oPort=port;
        oIP=iPv4;
        try
        {
            dataCompression=new DataCompression(dCAlg);
        }
        catch(NoSuchAlgorithmException e)
        {
            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
        recievingCommMOAttr=new int[HSystem.mOAttributesLength+10];
        recievingCommMOMinAttr=new int[recievingCommMOAttr.length];
        recievingCommMOMaxAttr=new int[recievingCommMOAttr.length];
        recievingCommWeights=new int[recievingCommMOAttr.length];
        for(int attrNum=0; attrNum<recievingCommMOAttr.length; attrNum++)
        {
            if(attrNum==0)
            {
                recievingCommMOAttr[attrNum]=HSystem.communicationManagedObjectNameHash;
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==1)
            {
                recievingCommMOAttr[attrNum]=HSystem.communicationManagedObjectClassHash;
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==2 || attrNum==4)
            {
                recievingCommMOAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMinAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMaxAttr[attrNum]=Integer.MAX_VALUE;
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>6 && attrNum<15)
            {
                System.arraycopy(oID.SID, 4*(attrNum-7), pubKey, 0, 4);
                recievingCommMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(pubKey);
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>HSystem.mOAttributesLength-1 && attrNum<HSystem.mOAttributesLength+8)
            {
                System.arraycopy(HSystem.SID.SID, 4*(attrNum-HSystem.mOAttributesLength), pubKey, 0, 4);
                recievingCommMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(pubKey);
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>HSystem.mOAttributesLength+7 && attrNum<HSystem.mOAttributesLength+10)
            {
                recievingCommMOAttr[attrNum]=mOAttributes[attrNum];
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else
            {
                recievingCommMOMinAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMaxAttr[attrNum]=Integer.MAX_VALUE;
                recievingCommWeights[attrNum]=0;
            }
        }
        dataTransferMOAttr=new int[HSystem.mOAttributesLength];
        dataTransferMinimumMOAttr=new int[dataTransferMOAttr.length];
        dataTransferMaximumMOAttr=new int[dataTransferMOAttr.length];
        dataTransferWeights=new int[dataTransferMOAttr.length];
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
                System.arraycopy(HSystem.SID.SID, 4*(attrNum-7), pubKey, 0, pubKey.length);
                dataTransferMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(pubKey);
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
        senderMess[0]=HSystem.SID;
        senderMess[1]=this;
        senderMess[3]=null;
        senderMess[4]=oIP;
        senderMess[5]=oPort;
        pubKey=new byte[mCont.length-8];
        System.arraycopy(mCont, 8, pubKey, 0, pubKey.length);
        if(commSec.state!=Integer.MAX_VALUE)
        {
            try
            {
                senderMess[6]=addSessionID(commSec.receiveEncryptedMessage(new byte[][]{pubKey}));
            }
            catch(InvalidKeyException|NoSuchAlgorithmException|NoSuchProviderException|InvalidAlgorithmParameterException|NoSuchPaddingException|IllegalStateException|InvalidKeySpecException|ShortBufferException|IllegalBlockSizeException|BadPaddingException e)
            {
                Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
            }
Node[] dataTransferManagedObject=latticeSearchLocal(dataTransferMOAttr, dataTransferMinimumMOAttr, dataTransferMaximumMOAttr, dataTransferWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
            senderMess[2]=(UDPManagedObject)dataTransferManagedObject[0].mO;
            ((UDPManagedObject)dataTransferManagedObject[0].mO).send(senderMess, $_MANAGED_object_COMPILER_DATA_$, this);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483624)
    private Object $_MANAGED_object_COMPILER_CONCURRENT_METHOD_receiveMessage_0_$(int messageNum, Object[][] messages, byte[][] messageBytes, ObjectInputStream oIn, ByteArrayInputStream bIn, byte[] oSID, byte[][] receivedData, int blockNum, byte[] encrypted, long cNum, byte[] content, byte[] number, int mLen, byte[] mCont, DataCompression dataCompression, long lastReceivedTime, int sendState, int receiveState, int receiveAttempts, int sendAttempts, int maxCommunicationAttempts, byte[] oPublicKey, boolean lastMessageReceived, BitSet receivedPackets, int[] dataTransferWeights, int[] dataTransferMaximumMOAttr, int[] dataTransferMinimumMOAttr, int[] dataTransferMOAttr, int[] recievingCommWeights, int[] recievingCommMOMaxAttr, int[] recievingCommMOMinAttr, int[] recievingCommMOAttr, int maxTransmitBytes, int transmitNum, int maxTransmitSize, long receiveConMessNumSend, long sendConMessNumSend, long receiveConMessNumReceive, long sendConMessNumReceive, long confirmReceiveNum, long confirmSendNum, boolean confirmReceiveOut, boolean confirmSendOut, int iLength, boolean complete, Object[] senderMess, List<Object[]> toTransmit, List<Byte> cAlgs, List<Object[]> toSend, boolean transmitting, int received, boolean cInit, int rLength, boolean recveing, byte[][] receivedMessageBlock, List<byte[][]> receivedMessageBlocks, byte dCAlg, byte[] key, int oPort, long lastConTime, long sRNumber, int receiveNumber, int prevReceiveNumber, int prevSendNumber, int sendNumber, int numNeeded, ByteArrayWrapper oID, InetAddress oIP, CommunicationSecurityProtocol commSec, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws Exception
    {
$_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483624);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        try
        {
            if(messages[messageNum][1] instanceof SystemManagedObject && (int)messages[messageNum][3]==SystemMasterManagedObject.$_MANAGED_object_COMPILER_addSystem_ManagedObject_byte$$_int_InetAddress$$_int_InetAddress_ByteArrayWrapper_ManagedObject_$ && ((int[][])messages[messageNum][2])[0][1]==HSystem.systemMasterManagedObjectClassHash)
            {
Object[] tempMessage=new Object[messages[messageNum].length+2];
                System.arraycopy(messages[messageNum], 0, tempMessage, 0, messages[messageNum].length);
                tempMessage[tempMessage.length-2]=oPort;
                tempMessage[tempMessage.length-1]=oIP;
                messages[messageNum]=tempMessage;
            }
            else if(messages[messageNum][1] instanceof CommunicationManagedObject && (int)messages[messageNum][3]==SIDMO.$_MANAGED_object_COMPILER_getInfo_InetAddress_ByteArrayWrapper_ManagedObject_$ && ((int[][])messages[messageNum][2])[0][1]==HSystem.SIDMOClassHash)
            {
                messages[messageNum][4]=oIP;
            }
        }
        catch(SecurityException e)
        {
            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
Node[] targetManagedObject=null;
        switch(((int[][])messages[messageNum][2]).length)
        {
            case 1:
                targetManagedObject=latticeSearchLocal(((int[][])messages[messageNum][2])[0], new int[0], null, new int[0], 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
				                            break;
            case 2:
                targetManagedObject=latticeSearchLocal(((int[][])messages[messageNum][2])[0], new int[0], new int[0], ((int[][])messages[messageNum][2])[1], 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
				                            break;
            case 3:
                targetManagedObject=latticeSearchLocal(((int[][])messages[messageNum][2])[0], ((int[][])messages[messageNum][2])[1], ((int[][])messages[messageNum][2])[2], new int[0], 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
				                        	break;
            case 4:
                targetManagedObject=latticeSearchLocal(((int[][])messages[messageNum][2])[0], ((int[][])messages[messageNum][2])[1], ((int[][])messages[messageNum][2])[2], ((int[][])messages[messageNum][2])[3], 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
				                            break;
        }
        if(targetManagedObject.length>0)
        {
            messages[messageNum][2]=targetManagedObject[0].mO;
            if((int)messages[messageNum][3]!=ManagedObject.$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$ && (int)messages[messageNum][3]!=ManagedObject.$_MANAGED_object_COMPILER_receiveMessageUpdate_ByteArrayWrapper_long_ByteArrayWrapper_ManagedObject_$)
            {
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483624,messages[messageNum].clone()}, 1, -2146483616, true, true, new Object[]{targetManagedObject,commSec,oIP,oID,numNeeded,sendNumber,prevSendNumber,prevReceiveNumber,receiveNumber,sRNumber,lastConTime,oPort,key,dCAlg,receivedMessageBlocks,receivedMessageBlock,recveing,rLength,cInit,received,transmitting,toSend,cAlgs,toTransmit,senderMess,complete,iLength,confirmSendOut,confirmReceiveOut,confirmSendNum,confirmReceiveNum,sendConMessNumReceive,receiveConMessNumReceive,sendConMessNumSend,receiveConMessNumSend,maxTransmitSize,transmitNum,maxTransmitBytes,recievingCommMOAttr,recievingCommMOMinAttr,recievingCommMOMaxAttr,recievingCommWeights,dataTransferMOAttr,dataTransferMinimumMOAttr,dataTransferMaximumMOAttr,dataTransferWeights,receivedPackets,lastMessageReceived,oPublicKey,maxCommunicationAttempts,sendAttempts,receiveAttempts,receiveState,sendState,lastReceivedTime,dataCompression,mCont,mLen,number,content,cNum,encrypted,blockNum,receivedData,oSID,bIn,oIn,messageBytes,messages,messageNum,dataCompression,lastReceivedTime,sendState,receiveState,receiveAttempts,sendAttempts,maxCommunicationAttempts,oPublicKey,lastMessageReceived,receivedPackets,dataTransferWeights,dataTransferMaximumMOAttr,dataTransferMinimumMOAttr,dataTransferMOAttr,recievingCommWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,maxTransmitBytes,transmitNum,maxTransmitSize,receiveConMessNumSend,sendConMessNumSend,receiveConMessNumReceive,sendConMessNumReceive,confirmReceiveNum,confirmSendNum,confirmReceiveOut,confirmSendOut,iLength,complete,senderMess,toTransmit,cAlgs,toSend,transmitting,received,cInit,rLength,recveing,receivedMessageBlock,receivedMessageBlocks,dCAlg,key,oPort,lastConTime,sRNumber,receiveNumber,prevReceiveNumber,prevSendNumber,sendNumber,numNeeded,oID,oIP,commSec}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    addMessageToSystem(messages[messageNum].clone(), $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
            }
            targetManagedObject[0].mO.MANAGED_object_COMPILER_RUN(messages[messageNum], (ByteArrayWrapper)messages[messageNum][0], (ManagedObject)messages[messageNum][1]);
        }
        else
        {
            ((ByteArrayWrapper)messages[messageNum][0]).maxIntelligenceCounter();
            ((ManagedObject)messages[messageNum][1]).aggregateThenCall(new Object[]{(ByteArrayWrapper)messages[messageNum][0], this, (ManagedObject)messages[messageNum][1], null,new TimeOutObject()}, $_MANAGED_object_COMPILER_DATA_$, this);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483623)
    private Object $_MANAGED_object_COMPILER_CONCURRENT_METHOD_readMessage_1_$(ManagedObjectDeletedException e, Object[] message, byte[] oSID, byte[] content, DataCompression dataCompression, long lastReceivedTime, int sendState, int receiveState, int receiveAttempts, int sendAttempts, int maxCommunicationAttempts, byte[] oPublicKey, boolean lastMessageReceived, BitSet receivedPackets, int[] dataTransferWeights, int[] dataTransferMaximumMOAttr, int[] dataTransferMinimumMOAttr, int[] dataTransferMOAttr, int[] recievingCommWeights, int[] recievingCommMOMaxAttr, int[] recievingCommMOMinAttr, int[] recievingCommMOAttr, int maxTransmitBytes, int transmitNum, int maxTransmitSize, long receiveConMessNumSend, long sendConMessNumSend, long receiveConMessNumReceive, long sendConMessNumReceive, long confirmReceiveNum, long confirmSendNum, boolean confirmReceiveOut, boolean confirmSendOut, int iLength, boolean complete, Object[] senderMess, List<Object[]> toTransmit, List<Byte> cAlgs, List<Object[]> toSend, boolean transmitting, int received, boolean cInit, int rLength, boolean recveing, byte[][] receivedMessageBlock, List<byte[][]> receivedMessageBlocks, byte dCAlg, byte[] key, int oPort, long lastConTime, long sRNumber, int receiveNumber, int prevReceiveNumber, int prevSendNumber, int sendNumber, int numNeeded, ByteArrayWrapper oID, InetAddress oIP, CommunicationSecurityProtocol commSec, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
$_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483623);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483623,e.deletedID}, 1, -2146483615, true, true, new Object[]{commSec,oIP,oID,numNeeded,sendNumber,prevSendNumber,prevReceiveNumber,receiveNumber,sRNumber,lastConTime,oPort,key,dCAlg,receivedMessageBlocks,receivedMessageBlock,recveing,rLength,cInit,received,transmitting,toSend,cAlgs,toTransmit,senderMess,complete,iLength,confirmSendOut,confirmReceiveOut,confirmSendNum,confirmReceiveNum,sendConMessNumReceive,receiveConMessNumReceive,sendConMessNumSend,receiveConMessNumSend,maxTransmitSize,transmitNum,maxTransmitBytes,recievingCommMOAttr,recievingCommMOMinAttr,recievingCommMOMaxAttr,recievingCommWeights,dataTransferMOAttr,dataTransferMinimumMOAttr,dataTransferMaximumMOAttr,dataTransferWeights,receivedPackets,lastMessageReceived,oPublicKey,maxCommunicationAttempts,sendAttempts,receiveAttempts,receiveState,sendState,lastReceivedTime,dataCompression,content,oSID,message,e,dataCompression,lastReceivedTime,sendState,receiveState,receiveAttempts,sendAttempts,maxCommunicationAttempts,oPublicKey,lastMessageReceived,receivedPackets,dataTransferWeights,dataTransferMaximumMOAttr,dataTransferMinimumMOAttr,dataTransferMOAttr,recievingCommWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,maxTransmitBytes,transmitNum,maxTransmitSize,receiveConMessNumSend,sendConMessNumSend,receiveConMessNumReceive,sendConMessNumReceive,confirmReceiveNum,confirmSendNum,confirmReceiveOut,confirmSendOut,iLength,complete,senderMess,toTransmit,cAlgs,toSend,transmitting,received,cInit,rLength,recveing,receivedMessageBlock,receivedMessageBlocks,dCAlg,key,oPort,lastConTime,sRNumber,receiveNumber,prevReceiveNumber,prevSendNumber,sendNumber,numNeeded,oID,oIP,commSec}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            ((ManagedObject)message[1]).deleteMOLink(e.deletedID, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
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

        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483622)
    private Object $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_42(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483627,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483627);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
byte[] tempBy;
int[] commAttrs;
int protocolStrength;
String securityProtocol;
ByteArrayWrapper oSID;
ManagedObject creator;
        tempBy=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        commAttrs=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
        protocolStrength=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
        securityProtocol=(String)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
        oSID=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
        creator=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
Object $_MANAGED_object_COMPILER_VARIABLE_2_$=null;
        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
int[] matchingCommMOAttributes=new int[mOAttributes.length];
        System.arraycopy(mOAttributes, 0, matchingCommMOAttributes, 0, mOAttributes.length);
int[] matchingCommMOAttributesWeights=new int[matchingCommMOAttributes.length];
        for(int weightNum=0; weightNum<matchingCommMOAttributesWeights.length; weightNum++)
        {
            if(weightNum==2 || weightNum==15 || weightNum==16 || weightNum==17 || weightNum==18 || 
weightNum==19 || weightNum==20 || weightNum==21)
            {
                matchingCommMOAttributesWeights[weightNum]=0;
            }
            else
            {
                matchingCommMOAttributesWeights[weightNum]=HSystem.intMaxValue;
            }
        }
        try
        {
            commSec=new CommunicationSecurityProtocol(securityProtocol, protocolStrength);
            dataCompression=new DataCompression(dCAlg);
        }
        catch(NoSuchAlgorithmException e)
        {
            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
        if(oSID.equalsSID(HSystem.masterSID))
        {
            oIP=HSystem.masterIP;
            oPort=19472;
            try
            {
                commSec.init(HSystem.masterPublicKey);
            }
            catch(InvalidKeyException|NoSuchAlgorithmException|NoSuchProviderException|InvalidAlgorithmParameterException|NoSuchPaddingException e)
            {
                Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        else
        {
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
                    System.arraycopy(HSystem.masterSID.SID, 4*(attrNum-7), tempBy, 0, tempBy.length);
                    SIDMOAttrs[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempBy);
                    minSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                    maxSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                    SIDMOWeights[attrNum]=HSystem.intMaxValue;
                }
                else if(attrNum>=HSystem.mOAttributesLength && attrNum<HSystem.mOAttributesLength+8)
                {
                    System.arraycopy(oSID.SID, 4*(attrNum-HSystem.mOAttributesLength), tempBy, 0, tempBy.length);
                    SIDMOAttrs[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempBy);
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
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483627,SIDMOAttrs,minSIDMOVals,maxSIDMOVals,SIDMOWeights, 1,HSystem.defaultNumCheckNodes, false}, 1, -2146483617, true, true, new Object[]{SIDMOWeights,maxSIDMOVals,minSIDMOVals,SIDMOAttrs,matchingCommMOAttributesWeights,matchingCommMOAttributes,tempBy,commAttrs,protocolStrength,securityProtocol,oSID,creator,dataCompression,lastReceivedTime,sendState,receiveState,receiveAttempts,sendAttempts,maxCommunicationAttempts,oPublicKey,lastMessageReceived,receivedPackets,dataTransferWeights,dataTransferMaximumMOAttr,dataTransferMinimumMOAttr,dataTransferMOAttr,recievingCommWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,maxTransmitBytes,transmitNum,maxTransmitSize,receiveConMessNumSend,sendConMessNumSend,receiveConMessNumReceive,sendConMessNumReceive,confirmReceiveNum,confirmSendNum,confirmReceiveOut,confirmSendOut,iLength,complete,senderMess,toTransmit,cAlgs,toSend,transmitting,received,cInit,rLength,recveing,receivedMessageBlock,receivedMessageBlocks,dCAlg,key,oPort,lastConTime,sRNumber,receiveNumber,prevReceiveNumber,prevSendNumber,sendNumber,numNeeded,oID,oIP,commSec}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=latticeSearch(SIDMOAttrs, minSIDMOVals, maxSIDMOVals, SIDMOWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                return null;
            }
            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
            {
    throw new TimeOutException();
            }
Node[] SIDMO=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
            if(true)
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483627,HSystem.masterIP}, 1, -2146483614, true, true, new Object[]{SIDMO,SIDMOWeights,maxSIDMOVals,minSIDMOVals,SIDMOAttrs,matchingCommMOAttributesWeights,matchingCommMOAttributes,tempBy,commAttrs,protocolStrength,securityProtocol,oSID,creator,dataCompression,lastReceivedTime,sendState,receiveState,receiveAttempts,sendAttempts,maxCommunicationAttempts,oPublicKey,lastMessageReceived,receivedPackets,dataTransferWeights,dataTransferMaximumMOAttr,dataTransferMinimumMOAttr,dataTransferMOAttr,recievingCommWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,maxTransmitBytes,transmitNum,maxTransmitSize,receiveConMessNumSend,sendConMessNumSend,receiveConMessNumReceive,sendConMessNumReceive,confirmReceiveNum,confirmSendNum,confirmReceiveOut,confirmSendOut,iLength,complete,senderMess,toTransmit,cAlgs,toSend,transmitting,received,cInit,rLength,recveing,receivedMessageBlock,receivedMessageBlocks,dCAlg,key,oPort,lastConTime,sRNumber,receiveNumber,prevReceiveNumber,prevSendNumber,sendNumber,numNeeded,oID,oIP,commSec}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                ((SIDMO)SIDMO[0].mO).getInfo(HSystem.masterIP, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                return null;
            }
            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
            {
    throw new TimeOutException();
            }
Object[] oMess=((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
            try
            {
                commSec.init((byte[])oMess[0]);
            }
            catch(InvalidKeyException|NoSuchAlgorithmException|NoSuchProviderException|InvalidAlgorithmParameterException|NoSuchPaddingException e)
            {
                Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
            }
            if(((InetAddress[])oMess[1]).length>1)
            {
                if(true)
                {
Iterator<InetAddress> $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
Object $_MANAGED_object_COMPILER_VARIABLE_1_$=(InetAddress[])oMess[1];
                    if($_MANAGED_object_COMPILER_VARIABLE_1_$!=null)
                    {
                        if($_MANAGED_object_COMPILER_VARIABLE_1_$.getClass().isArray())
                        {
                            $_MANAGED_object_COMPILER_VARIABLE_0_$=new ArrayIterator((Object[])$_MANAGED_object_COMPILER_VARIABLE_1_$);
                        }
                        else
                        {
                            $_MANAGED_object_COMPILER_VARIABLE_0_$=((Iterable<InetAddress>)$_MANAGED_object_COMPILER_VARIABLE_1_$).iterator();
                        }
InetAddress possibleIP=null;
                        while($_MANAGED_object_COMPILER_VARIABLE_0_$.hasNext())
                        {
                            possibleIP=$_MANAGED_object_COMPILER_VARIABLE_0_$.next();
                            if(possibleIP.isLoopbackAddress())
                            {
                                if(isReachable(possibleIP, ((int[])oMess[2])[0]))
                                {
                                    oIP=possibleIP;
                                    oPort=((int[])oMess[2])[0];
							break;
                                }
                            }
                            else if(isReachable(possibleIP, ((int[])oMess[2])[1]))
                            {
                                oIP=possibleIP;
                                oPort=((int[])oMess[2])[1];
						break;
                            }
                        }
                    }
                }
            }
            else
            {
                oIP=((InetAddress[])oMess[1])[0];
                oPort=((int[])oMess[2])[0];
            }
        }
        recievingCommMOAttr=new int[HSystem.mOAttributesLength+10];
        recievingCommMOMinAttr=new int[recievingCommMOAttr.length];
        recievingCommMOMaxAttr=new int[recievingCommMOAttr.length];
        recievingCommWeights=new int[recievingCommMOAttr.length];
        for(int attrNum=0; attrNum<recievingCommMOAttr.length; attrNum++)
        {
            if(attrNum==0)
            {
                recievingCommMOAttr[attrNum]=HSystem.communicationManagedObjectNameHash;
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==1)
            {
                recievingCommMOAttr[attrNum]=HSystem.communicationManagedObjectClassHash;
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==2)
            {
                recievingCommMOAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMinAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMaxAttr[attrNum]=Integer.MAX_VALUE;
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>6 && attrNum<15)
            {
                System.arraycopy(oID.SID, 4*(attrNum-7), tempBy, 0, 4);
                recievingCommMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempBy);
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>HSystem.mOAttributesLength-1 && attrNum<HSystem.mOAttributesLength+8)
            {
                System.arraycopy(HSystem.SID.SID, 4*(attrNum-HSystem.mOAttributesLength), tempBy, 0, 4);
                recievingCommMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempBy);
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>HSystem.mOAttributesLength+7 && attrNum<HSystem.mOAttributesLength+10)
            {
                recievingCommMOAttr[attrNum]=mOAttributes[attrNum];
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else
            {
                recievingCommMOMinAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMaxAttr[attrNum]=Integer.MAX_VALUE;
                recievingCommWeights[attrNum]=0;
            }
        }
        dataTransferMOAttr=new int[HSystem.mOAttributesLength];
        dataTransferMinimumMOAttr=new int[dataTransferMOAttr.length];
        dataTransferMaximumMOAttr=new int[dataTransferMOAttr.length];
        dataTransferWeights=new int[dataTransferMOAttr.length];
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
        if(commSec.state!=Integer.MAX_VALUE)
        {
            senderMess[0]=getSID();
            senderMess[1]=this;
            senderMess[3]=null;
            senderMess[4]=oIP;
            senderMess[5]=oPort;
            try
            {
                senderMess[6]=addSessionID(commSec.sendEncryptedMessage(null, null, 0)[0]);
            }
            catch(NoSuchAlgorithmException|NoSuchProviderException|InvalidAlgorithmParameterException|IllegalBlockSizeException|BadPaddingException e)
            {
                Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
            }
Node[] dataTransferManagedObject=latticeSearchLocal(dataTransferMOAttr, dataTransferMinimumMOAttr, dataTransferMaximumMOAttr, dataTransferWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
            senderMess[2]=(UDPManagedObject)dataTransferManagedObject[0].mO;
            ((UDPManagedObject)dataTransferManagedObject[0].mO).send(senderMess, $_MANAGED_object_COMPILER_DATA_$, this);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483621)
    private Object $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_43(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483625,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483625);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
int[] commAttrs;
byte[] pubKey;
byte[] content;
int protocolStrength;
String securityProtocol;
int mLen;
byte[] mCont;
int port;
InetAddress iPv4;
ManagedObject creator;
        commAttrs=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        pubKey=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
        content=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
        protocolStrength=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
        securityProtocol=(String)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
        mLen=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
        mCont=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
        port=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[7];
        iPv4=(InetAddress)$_MANAGED_object_COMPILER_RETURN_STATE_$[8];
        creator=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[9];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
        oPort=port;
        oIP=iPv4;
        try
        {
            dataCompression=new DataCompression(dCAlg);
        }
        catch(NoSuchAlgorithmException e)
        {
            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
        recievingCommMOAttr=new int[HSystem.mOAttributesLength+10];
        recievingCommMOMinAttr=new int[recievingCommMOAttr.length];
        recievingCommMOMaxAttr=new int[recievingCommMOAttr.length];
        recievingCommWeights=new int[recievingCommMOAttr.length];
        for(int attrNum=0; attrNum<recievingCommMOAttr.length; attrNum++)
        {
            if(attrNum==0)
            {
                recievingCommMOAttr[attrNum]=HSystem.communicationManagedObjectNameHash;
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==1)
            {
                recievingCommMOAttr[attrNum]=HSystem.communicationManagedObjectClassHash;
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==2 || attrNum==4)
            {
                recievingCommMOAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMinAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMaxAttr[attrNum]=Integer.MAX_VALUE;
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>6 && attrNum<15)
            {
                System.arraycopy(oID.SID, 4*(attrNum-7), pubKey, 0, 4);
                recievingCommMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(pubKey);
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>HSystem.mOAttributesLength-1 && attrNum<HSystem.mOAttributesLength+8)
            {
                System.arraycopy(HSystem.SID.SID, 4*(attrNum-HSystem.mOAttributesLength), pubKey, 0, 4);
                recievingCommMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(pubKey);
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>HSystem.mOAttributesLength+7 && attrNum<HSystem.mOAttributesLength+10)
            {
                recievingCommMOAttr[attrNum]=mOAttributes[attrNum];
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else
            {
                recievingCommMOMinAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMaxAttr[attrNum]=Integer.MAX_VALUE;
                recievingCommWeights[attrNum]=0;
            }
        }
        dataTransferMOAttr=new int[HSystem.mOAttributesLength];
        dataTransferMinimumMOAttr=new int[dataTransferMOAttr.length];
        dataTransferMaximumMOAttr=new int[dataTransferMOAttr.length];
        dataTransferWeights=new int[dataTransferMOAttr.length];
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
                System.arraycopy(HSystem.SID.SID, 4*(attrNum-7), pubKey, 0, pubKey.length);
                dataTransferMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(pubKey);
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
        senderMess[0]=HSystem.SID;
        senderMess[1]=this;
        senderMess[3]=null;
        senderMess[4]=oIP;
        senderMess[5]=oPort;
        pubKey=new byte[mCont.length-8];
        System.arraycopy(mCont, 8, pubKey, 0, pubKey.length);
        if(commSec.state!=Integer.MAX_VALUE)
        {
            try
            {
                senderMess[6]=addSessionID(commSec.receiveEncryptedMessage(new byte[][]{pubKey}));
            }
            catch(InvalidKeyException|NoSuchAlgorithmException|NoSuchProviderException|InvalidAlgorithmParameterException|NoSuchPaddingException|IllegalStateException|InvalidKeySpecException|ShortBufferException|IllegalBlockSizeException|BadPaddingException e)
            {
                Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
            }
Node[] dataTransferManagedObject=latticeSearchLocal(dataTransferMOAttr, dataTransferMinimumMOAttr, dataTransferMaximumMOAttr, dataTransferWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
            senderMess[2]=(UDPManagedObject)dataTransferManagedObject[0].mO;
            ((UDPManagedObject)dataTransferManagedObject[0].mO).send(senderMess, $_MANAGED_object_COMPILER_DATA_$, this);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483620)
    private void CommunicationManagedObject_MANAGED_object_COMPILER_METHOD_85(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483620,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483620))
        {
            if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483648,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new MOPermissionDeniedException();
            }
            $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483648);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483619)
    private void CommunicationManagedObject_MANAGED_object_COMPILER_METHOD_86(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483619,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483619))
        {
            if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new MOPermissionDeniedException();
            }
            $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
int protocolStrength;
String securityProtocol;
ByteArrayWrapper oSID;
ManagedObject creator;
            protocolStrength=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
            securityProtocol=(String)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
            oSID=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
            creator=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
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
            oSID=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[5];
            securityProtocol=(String)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[6];
            protocolStrength=(int)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[7];
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483618)
    private void CommunicationManagedObject_MANAGED_object_COMPILER_METHOD_87(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws TimeOutException, MOPermissionDeniedException
    {
        if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483618,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483618))
        {
            if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
            {
    throw new MOPermissionDeniedException();
            }
            $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483646);
            $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
int protocolStrength;
String securityProtocol;
int mLen;
byte[] mCont;
int port;
InetAddress iPv4;
ManagedObject creator;
            protocolStrength=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
            securityProtocol=(String)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
            mLen=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
            mCont=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
            port=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
            iPv4=(InetAddress)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
            creator=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
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
            iPv4=(InetAddress)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[5];
            port=(int)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[6];
            mCont=(byte[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[7];
            mLen=(int)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[8];
            securityProtocol=(String)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[9];
            protocolStrength=(int)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[10];
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483617)
    private Object $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_165(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483627,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483627);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
int[] matchingCommMOAttributesWeights;
int[] matchingCommMOAttributes;
byte[] tempBy;
int[] commAttrs;
int protocolStrength;
String securityProtocol;
ByteArrayWrapper oSID;
ManagedObject creator;
        matchingCommMOAttributesWeights=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
        matchingCommMOAttributes=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
        tempBy=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
        commAttrs=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[7];
        protocolStrength=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[8];
        securityProtocol=(String)$_MANAGED_object_COMPILER_RETURN_STATE_$[9];
        oSID=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[10];
        creator=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[11];
int[] SIDMOWeights;
int[] maxSIDMOVals;
int[] minSIDMOVals;
int[] SIDMOAttrs;
        SIDMOWeights=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        maxSIDMOVals=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
        minSIDMOVals=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
        SIDMOAttrs=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
Object $_MANAGED_object_COMPILER_VARIABLE_2_$=null;
        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
Node[] SIDMO=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483627,HSystem.masterIP}, 1, -2146483614, true, true, new Object[]{SIDMO,SIDMOWeights,maxSIDMOVals,minSIDMOVals,SIDMOAttrs,matchingCommMOAttributesWeights,matchingCommMOAttributes,tempBy,commAttrs,protocolStrength,securityProtocol,oSID,creator,dataCompression,lastReceivedTime,sendState,receiveState,receiveAttempts,sendAttempts,maxCommunicationAttempts,oPublicKey,lastMessageReceived,receivedPackets,dataTransferWeights,dataTransferMaximumMOAttr,dataTransferMinimumMOAttr,dataTransferMOAttr,recievingCommWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,maxTransmitBytes,transmitNum,maxTransmitSize,receiveConMessNumSend,sendConMessNumSend,receiveConMessNumReceive,sendConMessNumReceive,confirmReceiveNum,confirmSendNum,confirmReceiveOut,confirmSendOut,iLength,complete,senderMess,toTransmit,cAlgs,toSend,transmitting,received,cInit,rLength,recveing,receivedMessageBlock,receivedMessageBlocks,dCAlg,key,oPort,lastConTime,sRNumber,receiveNumber,prevReceiveNumber,prevSendNumber,sendNumber,numNeeded,oID,oIP,commSec}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            ((SIDMO)SIDMO[0].mO).getInfo(HSystem.masterIP, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
Object[] oMess=((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
        try
        {
            commSec.init((byte[])oMess[0]);
        }
        catch(InvalidKeyException|NoSuchAlgorithmException|NoSuchProviderException|InvalidAlgorithmParameterException|NoSuchPaddingException e)
        {
            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
        if(((InetAddress[])oMess[1]).length>1)
        {
            if(true)
            {
Iterator<InetAddress> $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
Object $_MANAGED_object_COMPILER_VARIABLE_1_$=(InetAddress[])oMess[1];
                if($_MANAGED_object_COMPILER_VARIABLE_1_$!=null)
                {
                    if($_MANAGED_object_COMPILER_VARIABLE_1_$.getClass().isArray())
                    {
                        $_MANAGED_object_COMPILER_VARIABLE_0_$=new ArrayIterator((Object[])$_MANAGED_object_COMPILER_VARIABLE_1_$);
                    }
                    else
                    {
                        $_MANAGED_object_COMPILER_VARIABLE_0_$=((Iterable<InetAddress>)$_MANAGED_object_COMPILER_VARIABLE_1_$).iterator();
                    }
InetAddress possibleIP=null;
                    while($_MANAGED_object_COMPILER_VARIABLE_0_$.hasNext())
                    {
                        possibleIP=$_MANAGED_object_COMPILER_VARIABLE_0_$.next();
                        if(possibleIP.isLoopbackAddress())
                        {
                            if(isReachable(possibleIP, ((int[])oMess[2])[0]))
                            {
                                oIP=possibleIP;
                                oPort=((int[])oMess[2])[0];
							break;
                            }
                        }
                        else if(isReachable(possibleIP, ((int[])oMess[2])[1]))
                        {
                            oIP=possibleIP;
                            oPort=((int[])oMess[2])[1];
						break;
                        }
                    }
                }
            }
        }
        else
        {
            oIP=((InetAddress[])oMess[1])[0];
            oPort=((int[])oMess[2])[0];
        }
        recievingCommMOAttr=new int[HSystem.mOAttributesLength+10];
        recievingCommMOMinAttr=new int[recievingCommMOAttr.length];
        recievingCommMOMaxAttr=new int[recievingCommMOAttr.length];
        recievingCommWeights=new int[recievingCommMOAttr.length];
        for(int attrNum=0; attrNum<recievingCommMOAttr.length; attrNum++)
        {
            if(attrNum==0)
            {
                recievingCommMOAttr[attrNum]=HSystem.communicationManagedObjectNameHash;
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==1)
            {
                recievingCommMOAttr[attrNum]=HSystem.communicationManagedObjectClassHash;
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==2)
            {
                recievingCommMOAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMinAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMaxAttr[attrNum]=Integer.MAX_VALUE;
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>6 && attrNum<15)
            {
                System.arraycopy(oID.SID, 4*(attrNum-7), tempBy, 0, 4);
                recievingCommMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempBy);
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>HSystem.mOAttributesLength-1 && attrNum<HSystem.mOAttributesLength+8)
            {
                System.arraycopy(HSystem.SID.SID, 4*(attrNum-HSystem.mOAttributesLength), tempBy, 0, 4);
                recievingCommMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempBy);
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>HSystem.mOAttributesLength+7 && attrNum<HSystem.mOAttributesLength+10)
            {
                recievingCommMOAttr[attrNum]=mOAttributes[attrNum];
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else
            {
                recievingCommMOMinAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMaxAttr[attrNum]=Integer.MAX_VALUE;
                recievingCommWeights[attrNum]=0;
            }
        }
        dataTransferMOAttr=new int[HSystem.mOAttributesLength];
        dataTransferMinimumMOAttr=new int[dataTransferMOAttr.length];
        dataTransferMaximumMOAttr=new int[dataTransferMOAttr.length];
        dataTransferWeights=new int[dataTransferMOAttr.length];
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
        if(commSec.state!=Integer.MAX_VALUE)
        {
            senderMess[0]=getSID();
            senderMess[1]=this;
            senderMess[3]=null;
            senderMess[4]=oIP;
            senderMess[5]=oPort;
            try
            {
                senderMess[6]=addSessionID(commSec.sendEncryptedMessage(null, null, 0)[0]);
            }
            catch(NoSuchAlgorithmException|NoSuchProviderException|InvalidAlgorithmParameterException|IllegalBlockSizeException|BadPaddingException e)
            {
                Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
            }
Node[] dataTransferManagedObject=latticeSearchLocal(dataTransferMOAttr, dataTransferMinimumMOAttr, dataTransferMaximumMOAttr, dataTransferWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
            senderMess[2]=(UDPManagedObject)dataTransferManagedObject[0].mO;
            ((UDPManagedObject)dataTransferManagedObject[0].mO).send(senderMess, $_MANAGED_object_COMPILER_DATA_$, this);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483616)
    private Object $_MANAGED_object_COMPILER_CONCURRENT_METHOD_receiveMessage_0_$_MANAGED_object_COMPILER_METHOD_259(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws Exception
    {
$_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483624);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Node[] targetManagedObject;
CommunicationSecurityProtocol commSec;
InetAddress oIP;
ByteArrayWrapper oID;
int numNeeded;
int sendNumber;
int prevSendNumber;
int prevReceiveNumber;
int receiveNumber;
long sRNumber;
long lastConTime;
int oPort;
byte[] key;
byte dCAlg;
List<byte[][]> receivedMessageBlocks;
byte[][] receivedMessageBlock;
boolean recveing;
int rLength;
boolean cInit;
int received;
boolean transmitting;
List<Object[]> toSend;
List<Byte> cAlgs;
List<Object[]> toTransmit;
Object[] senderMess;
boolean complete;
int iLength;
boolean confirmSendOut;
boolean confirmReceiveOut;
long confirmSendNum;
long confirmReceiveNum;
long sendConMessNumReceive;
long receiveConMessNumReceive;
long sendConMessNumSend;
long receiveConMessNumSend;
int maxTransmitSize;
int transmitNum;
int maxTransmitBytes;
int[] recievingCommMOAttr;
int[] recievingCommMOMinAttr;
int[] recievingCommMOMaxAttr;
int[] recievingCommWeights;
int[] dataTransferMOAttr;
int[] dataTransferMinimumMOAttr;
int[] dataTransferMaximumMOAttr;
int[] dataTransferWeights;
BitSet receivedPackets;
boolean lastMessageReceived;
byte[] oPublicKey;
int maxCommunicationAttempts;
int sendAttempts;
int receiveAttempts;
int receiveState;
int sendState;
long lastReceivedTime;
DataCompression dataCompression;
byte[] mCont;
int mLen;
byte[] number;
byte[] content;
long cNum;
byte[] encrypted;
int blockNum;
byte[][] receivedData;
byte[] oSID;
ByteArrayInputStream bIn;
ObjectInputStream oIn;
byte[][] messageBytes;
Object[][] messages;
int messageNum;
        targetManagedObject=(Node[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        commSec=(CommunicationSecurityProtocol)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
        oIP=(InetAddress)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
        oID=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
        numNeeded=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
        sendNumber=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
        prevSendNumber=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
        prevReceiveNumber=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[7];
        receiveNumber=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[8];
        sRNumber=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[9];
        lastConTime=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[10];
        oPort=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[11];
        key=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[12];
        dCAlg=(byte)$_MANAGED_object_COMPILER_RETURN_STATE_$[13];
        receivedMessageBlocks=(List<byte[][]>)$_MANAGED_object_COMPILER_RETURN_STATE_$[14];
        receivedMessageBlock=(byte[][])$_MANAGED_object_COMPILER_RETURN_STATE_$[15];
        recveing=(boolean)$_MANAGED_object_COMPILER_RETURN_STATE_$[16];
        rLength=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[17];
        cInit=(boolean)$_MANAGED_object_COMPILER_RETURN_STATE_$[18];
        received=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[19];
        transmitting=(boolean)$_MANAGED_object_COMPILER_RETURN_STATE_$[20];
        toSend=(List<Object[]>)$_MANAGED_object_COMPILER_RETURN_STATE_$[21];
        cAlgs=(List<Byte>)$_MANAGED_object_COMPILER_RETURN_STATE_$[22];
        toTransmit=(List<Object[]>)$_MANAGED_object_COMPILER_RETURN_STATE_$[23];
        senderMess=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[24];
        complete=(boolean)$_MANAGED_object_COMPILER_RETURN_STATE_$[25];
        iLength=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[26];
        confirmSendOut=(boolean)$_MANAGED_object_COMPILER_RETURN_STATE_$[27];
        confirmReceiveOut=(boolean)$_MANAGED_object_COMPILER_RETURN_STATE_$[28];
        confirmSendNum=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[29];
        confirmReceiveNum=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[30];
        sendConMessNumReceive=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[31];
        receiveConMessNumReceive=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[32];
        sendConMessNumSend=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[33];
        receiveConMessNumSend=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[34];
        maxTransmitSize=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[35];
        transmitNum=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[36];
        maxTransmitBytes=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[37];
        recievingCommMOAttr=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[38];
        recievingCommMOMinAttr=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[39];
        recievingCommMOMaxAttr=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[40];
        recievingCommWeights=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[41];
        dataTransferMOAttr=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[42];
        dataTransferMinimumMOAttr=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[43];
        dataTransferMaximumMOAttr=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[44];
        dataTransferWeights=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[45];
        receivedPackets=(BitSet)$_MANAGED_object_COMPILER_RETURN_STATE_$[46];
        lastMessageReceived=(boolean)$_MANAGED_object_COMPILER_RETURN_STATE_$[47];
        oPublicKey=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[48];
        maxCommunicationAttempts=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[49];
        sendAttempts=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[50];
        receiveAttempts=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[51];
        receiveState=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[52];
        sendState=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[53];
        lastReceivedTime=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[54];
        dataCompression=(DataCompression)$_MANAGED_object_COMPILER_RETURN_STATE_$[55];
        mCont=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[56];
        mLen=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[57];
        number=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[58];
        content=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[59];
        cNum=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[60];
        encrypted=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[61];
        blockNum=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[62];
        receivedData=(byte[][])$_MANAGED_object_COMPILER_RETURN_STATE_$[63];
        oSID=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[64];
        bIn=(ByteArrayInputStream)$_MANAGED_object_COMPILER_RETURN_STATE_$[65];
        oIn=(ObjectInputStream)$_MANAGED_object_COMPILER_RETURN_STATE_$[66];
        messageBytes=(byte[][])$_MANAGED_object_COMPILER_RETURN_STATE_$[67];
        messages=(Object[][])$_MANAGED_object_COMPILER_RETURN_STATE_$[68];
        messageNum=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[69];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
        targetManagedObject[0].mO.MANAGED_object_COMPILER_RUN(messages[messageNum], (ByteArrayWrapper)messages[messageNum][0], (ManagedObject)messages[messageNum][1]);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483615)
    private Object $_MANAGED_object_COMPILER_CONCURRENT_METHOD_readMessage_1_$_MANAGED_object_COMPILER_METHOD_262(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
$_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483623);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
CommunicationSecurityProtocol commSec;
InetAddress oIP;
ByteArrayWrapper oID;
int numNeeded;
int sendNumber;
int prevSendNumber;
int prevReceiveNumber;
int receiveNumber;
long sRNumber;
long lastConTime;
int oPort;
byte[] key;
byte dCAlg;
List<byte[][]> receivedMessageBlocks;
byte[][] receivedMessageBlock;
boolean recveing;
int rLength;
boolean cInit;
int received;
boolean transmitting;
List<Object[]> toSend;
List<Byte> cAlgs;
List<Object[]> toTransmit;
Object[] senderMess;
boolean complete;
int iLength;
boolean confirmSendOut;
boolean confirmReceiveOut;
long confirmSendNum;
long confirmReceiveNum;
long sendConMessNumReceive;
long receiveConMessNumReceive;
long sendConMessNumSend;
long receiveConMessNumSend;
int maxTransmitSize;
int transmitNum;
int maxTransmitBytes;
int[] recievingCommMOAttr;
int[] recievingCommMOMinAttr;
int[] recievingCommMOMaxAttr;
int[] recievingCommWeights;
int[] dataTransferMOAttr;
int[] dataTransferMinimumMOAttr;
int[] dataTransferMaximumMOAttr;
int[] dataTransferWeights;
BitSet receivedPackets;
boolean lastMessageReceived;
byte[] oPublicKey;
int maxCommunicationAttempts;
int sendAttempts;
int receiveAttempts;
int receiveState;
int sendState;
long lastReceivedTime;
DataCompression dataCompression;
byte[] content;
byte[] oSID;
Object[] message;
ManagedObjectDeletedException e;
        commSec=(CommunicationSecurityProtocol)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        oIP=(InetAddress)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
        oID=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
        numNeeded=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
        sendNumber=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
        prevSendNumber=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
        prevReceiveNumber=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
        receiveNumber=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[7];
        sRNumber=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[8];
        lastConTime=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[9];
        oPort=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[10];
        key=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[11];
        dCAlg=(byte)$_MANAGED_object_COMPILER_RETURN_STATE_$[12];
        receivedMessageBlocks=(List<byte[][]>)$_MANAGED_object_COMPILER_RETURN_STATE_$[13];
        receivedMessageBlock=(byte[][])$_MANAGED_object_COMPILER_RETURN_STATE_$[14];
        recveing=(boolean)$_MANAGED_object_COMPILER_RETURN_STATE_$[15];
        rLength=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[16];
        cInit=(boolean)$_MANAGED_object_COMPILER_RETURN_STATE_$[17];
        received=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[18];
        transmitting=(boolean)$_MANAGED_object_COMPILER_RETURN_STATE_$[19];
        toSend=(List<Object[]>)$_MANAGED_object_COMPILER_RETURN_STATE_$[20];
        cAlgs=(List<Byte>)$_MANAGED_object_COMPILER_RETURN_STATE_$[21];
        toTransmit=(List<Object[]>)$_MANAGED_object_COMPILER_RETURN_STATE_$[22];
        senderMess=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[23];
        complete=(boolean)$_MANAGED_object_COMPILER_RETURN_STATE_$[24];
        iLength=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[25];
        confirmSendOut=(boolean)$_MANAGED_object_COMPILER_RETURN_STATE_$[26];
        confirmReceiveOut=(boolean)$_MANAGED_object_COMPILER_RETURN_STATE_$[27];
        confirmSendNum=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[28];
        confirmReceiveNum=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[29];
        sendConMessNumReceive=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[30];
        receiveConMessNumReceive=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[31];
        sendConMessNumSend=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[32];
        receiveConMessNumSend=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[33];
        maxTransmitSize=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[34];
        transmitNum=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[35];
        maxTransmitBytes=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[36];
        recievingCommMOAttr=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[37];
        recievingCommMOMinAttr=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[38];
        recievingCommMOMaxAttr=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[39];
        recievingCommWeights=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[40];
        dataTransferMOAttr=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[41];
        dataTransferMinimumMOAttr=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[42];
        dataTransferMaximumMOAttr=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[43];
        dataTransferWeights=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[44];
        receivedPackets=(BitSet)$_MANAGED_object_COMPILER_RETURN_STATE_$[45];
        lastMessageReceived=(boolean)$_MANAGED_object_COMPILER_RETURN_STATE_$[46];
        oPublicKey=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[47];
        maxCommunicationAttempts=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[48];
        sendAttempts=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[49];
        receiveAttempts=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[50];
        receiveState=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[51];
        sendState=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[52];
        lastReceivedTime=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[53];
        dataCompression=(DataCompression)$_MANAGED_object_COMPILER_RETURN_STATE_$[54];
        content=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[55];
        oSID=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[56];
        message=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[57];
        e=(ManagedObjectDeletedException)$_MANAGED_object_COMPILER_RETURN_STATE_$[58];
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483614)
    private Object $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_263(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483627,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483627);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
int[] matchingCommMOAttributesWeights;
int[] matchingCommMOAttributes;
byte[] tempBy;
int[] commAttrs;
int protocolStrength;
String securityProtocol;
ByteArrayWrapper oSID;
ManagedObject creator;
        matchingCommMOAttributesWeights=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
        matchingCommMOAttributes=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
        tempBy=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[7];
        commAttrs=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[8];
        protocolStrength=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[9];
        securityProtocol=(String)$_MANAGED_object_COMPILER_RETURN_STATE_$[10];
        oSID=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[11];
        creator=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[12];
Node[] SIDMO;
int[] SIDMOWeights;
int[] maxSIDMOVals;
int[] minSIDMOVals;
int[] SIDMOAttrs;
        SIDMO=(Node[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        SIDMOWeights=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
        maxSIDMOVals=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
        minSIDMOVals=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
        SIDMOAttrs=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
Object $_MANAGED_object_COMPILER_VARIABLE_2_$=null;
        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
Object[] oMess=((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
        try
        {
            commSec.init((byte[])oMess[0]);
        }
        catch(InvalidKeyException|NoSuchAlgorithmException|NoSuchProviderException|InvalidAlgorithmParameterException|NoSuchPaddingException e)
        {
            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
        if(((InetAddress[])oMess[1]).length>1)
        {
            if(true)
            {
Iterator<InetAddress> $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
Object $_MANAGED_object_COMPILER_VARIABLE_1_$=(InetAddress[])oMess[1];
                if($_MANAGED_object_COMPILER_VARIABLE_1_$!=null)
                {
                    if($_MANAGED_object_COMPILER_VARIABLE_1_$.getClass().isArray())
                    {
                        $_MANAGED_object_COMPILER_VARIABLE_0_$=new ArrayIterator((Object[])$_MANAGED_object_COMPILER_VARIABLE_1_$);
                    }
                    else
                    {
                        $_MANAGED_object_COMPILER_VARIABLE_0_$=((Iterable<InetAddress>)$_MANAGED_object_COMPILER_VARIABLE_1_$).iterator();
                    }
InetAddress possibleIP=null;
                    while($_MANAGED_object_COMPILER_VARIABLE_0_$.hasNext())
                    {
                        possibleIP=$_MANAGED_object_COMPILER_VARIABLE_0_$.next();
                        if(possibleIP.isLoopbackAddress())
                        {
                            if(isReachable(possibleIP, ((int[])oMess[2])[0]))
                            {
                                oIP=possibleIP;
                                oPort=((int[])oMess[2])[0];
							break;
                            }
                        }
                        else if(isReachable(possibleIP, ((int[])oMess[2])[1]))
                        {
                            oIP=possibleIP;
                            oPort=((int[])oMess[2])[1];
						break;
                        }
                    }
                }
            }
        }
        else
        {
            oIP=((InetAddress[])oMess[1])[0];
            oPort=((int[])oMess[2])[0];
        }
        recievingCommMOAttr=new int[HSystem.mOAttributesLength+10];
        recievingCommMOMinAttr=new int[recievingCommMOAttr.length];
        recievingCommMOMaxAttr=new int[recievingCommMOAttr.length];
        recievingCommWeights=new int[recievingCommMOAttr.length];
        for(int attrNum=0; attrNum<recievingCommMOAttr.length; attrNum++)
        {
            if(attrNum==0)
            {
                recievingCommMOAttr[attrNum]=HSystem.communicationManagedObjectNameHash;
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==1)
            {
                recievingCommMOAttr[attrNum]=HSystem.communicationManagedObjectClassHash;
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==2)
            {
                recievingCommMOAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMinAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMaxAttr[attrNum]=Integer.MAX_VALUE;
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>6 && attrNum<15)
            {
                System.arraycopy(oID.SID, 4*(attrNum-7), tempBy, 0, 4);
                recievingCommMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempBy);
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>HSystem.mOAttributesLength-1 && attrNum<HSystem.mOAttributesLength+8)
            {
                System.arraycopy(HSystem.SID.SID, 4*(attrNum-HSystem.mOAttributesLength), tempBy, 0, 4);
                recievingCommMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempBy);
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>HSystem.mOAttributesLength+7 && attrNum<HSystem.mOAttributesLength+10)
            {
                recievingCommMOAttr[attrNum]=mOAttributes[attrNum];
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else
            {
                recievingCommMOMinAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMaxAttr[attrNum]=Integer.MAX_VALUE;
                recievingCommWeights[attrNum]=0;
            }
        }
        dataTransferMOAttr=new int[HSystem.mOAttributesLength];
        dataTransferMinimumMOAttr=new int[dataTransferMOAttr.length];
        dataTransferMaximumMOAttr=new int[dataTransferMOAttr.length];
        dataTransferWeights=new int[dataTransferMOAttr.length];
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
        if(commSec.state!=Integer.MAX_VALUE)
        {
            senderMess[0]=getSID();
            senderMess[1]=this;
            senderMess[3]=null;
            senderMess[4]=oIP;
            senderMess[5]=oPort;
            try
            {
                senderMess[6]=addSessionID(commSec.sendEncryptedMessage(null, null, 0)[0]);
            }
            catch(NoSuchAlgorithmException|NoSuchProviderException|InvalidAlgorithmParameterException|IllegalBlockSizeException|BadPaddingException e)
            {
                Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
            }
Node[] dataTransferManagedObject=latticeSearchLocal(dataTransferMOAttr, dataTransferMinimumMOAttr, dataTransferMaximumMOAttr, dataTransferWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
            senderMess[2]=(UDPManagedObject)dataTransferManagedObject[0].mO;
            ((UDPManagedObject)dataTransferManagedObject[0].mO).send(senderMess, $_MANAGED_object_COMPILER_DATA_$, this);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483613)
    private Object $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_277(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483627,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483627);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
int protocolStrength;
String securityProtocol;
ByteArrayWrapper oSID;
ManagedObject creator;
        protocolStrength=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        securityProtocol=(String)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
        oSID=(ByteArrayWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
        creator=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
Object $_MANAGED_object_COMPILER_VARIABLE_2_$=null;
        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
        try
        {
            addPermission(new CompareMessage[]
{
new CompareSID(oSID),
new CompareMessageRange(new Range[]{new Range(HSystem.minManagedObject, HSystem.maxManagedObject)}),
new CompareMessageRange(new Range[]{new Range(HSystem.minManagedObject, HSystem.maxManagedObject)}),
new CompareMessageRange(new Range[]
{
new Range(CommunicationManagedObject.class.getDeclaredMethod("sendMessage", Object[].class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$()),
new Range(CommunicationManagedObject.class.getDeclaredMethod("confirmSend", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$()),
new Range(CommunicationManagedObject.class.getDeclaredMethod("receiveMessage", byte[].class, int.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$()),
new Range(CommunicationManagedObject.class.getDeclaredMethod("confirmReceive", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$())
}),
new AnyObjectAllowed(),
new AnyObjectAllowed()
}, getSID(), this);
        }
        catch(Exception e)
        {
            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
        oID=oSID;
int[] commAttrs=new int[10];
byte[] tempBy=new byte[4];
        for(int oSIDSection=0; oSIDSection<8; oSIDSection++)
        {
            System.arraycopy(oID.SID, 4*oSIDSection, tempBy, 0, 4);
            commAttrs[oSIDSection]=ManagedObjectUtilities.b8ToB10Int(tempBy);
        }
        commAttrs[8]=HSystem.cryptoPRNG.getInt();
        commAttrs[9]=HSystem.cryptoPRNG.getInt();
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483627,commAttrs}, 1, -2146483622, true, true, new Object[]{tempBy,commAttrs,protocolStrength,securityProtocol,oSID,creator,dataCompression,lastReceivedTime,sendState,receiveState,receiveAttempts,sendAttempts,maxCommunicationAttempts,oPublicKey,lastMessageReceived,receivedPackets,dataTransferWeights,dataTransferMaximumMOAttr,dataTransferMinimumMOAttr,dataTransferMOAttr,recievingCommWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,maxTransmitBytes,transmitNum,maxTransmitSize,receiveConMessNumSend,sendConMessNumSend,receiveConMessNumReceive,sendConMessNumReceive,confirmReceiveNum,confirmSendNum,confirmReceiveOut,confirmSendOut,iLength,complete,senderMess,toTransmit,cAlgs,toSend,transmitting,received,cInit,rLength,recveing,receivedMessageBlock,receivedMessageBlocks,dCAlg,key,oPort,lastConTime,sRNumber,receiveNumber,prevReceiveNumber,prevSendNumber,sendNumber,numNeeded,oID,oIP,commSec}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            addAttributes(commAttrs, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
int[] matchingCommMOAttributes=new int[mOAttributes.length];
        System.arraycopy(mOAttributes, 0, matchingCommMOAttributes, 0, mOAttributes.length);
int[] matchingCommMOAttributesWeights=new int[matchingCommMOAttributes.length];
        for(int weightNum=0; weightNum<matchingCommMOAttributesWeights.length; weightNum++)
        {
            if(weightNum==2 || weightNum==15 || weightNum==16 || weightNum==17 || weightNum==18 || 
weightNum==19 || weightNum==20 || weightNum==21)
            {
                matchingCommMOAttributesWeights[weightNum]=0;
            }
            else
            {
                matchingCommMOAttributesWeights[weightNum]=HSystem.intMaxValue;
            }
        }
        try
        {
            commSec=new CommunicationSecurityProtocol(securityProtocol, protocolStrength);
            dataCompression=new DataCompression(dCAlg);
        }
        catch(NoSuchAlgorithmException e)
        {
            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
        if(oSID.equalsSID(HSystem.masterSID))
        {
            oIP=HSystem.masterIP;
            oPort=19472;
            try
            {
                commSec.init(HSystem.masterPublicKey);
            }
            catch(InvalidKeyException|NoSuchAlgorithmException|NoSuchProviderException|InvalidAlgorithmParameterException|NoSuchPaddingException e)
            {
                Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        else
        {
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
                    System.arraycopy(HSystem.masterSID.SID, 4*(attrNum-7), tempBy, 0, tempBy.length);
                    SIDMOAttrs[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempBy);
                    minSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                    maxSIDMOVals[attrNum]=SIDMOAttrs[attrNum];
                    SIDMOWeights[attrNum]=HSystem.intMaxValue;
                }
                else if(attrNum>=HSystem.mOAttributesLength && attrNum<HSystem.mOAttributesLength+8)
                {
                    System.arraycopy(oSID.SID, 4*(attrNum-HSystem.mOAttributesLength), tempBy, 0, tempBy.length);
                    SIDMOAttrs[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempBy);
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
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483627,SIDMOAttrs,minSIDMOVals,maxSIDMOVals,SIDMOWeights, 1,HSystem.defaultNumCheckNodes, false}, 1, -2146483617, true, true, new Object[]{SIDMOWeights,maxSIDMOVals,minSIDMOVals,SIDMOAttrs,matchingCommMOAttributesWeights,matchingCommMOAttributes,tempBy,commAttrs,protocolStrength,securityProtocol,oSID,creator,dataCompression,lastReceivedTime,sendState,receiveState,receiveAttempts,sendAttempts,maxCommunicationAttempts,oPublicKey,lastMessageReceived,receivedPackets,dataTransferWeights,dataTransferMaximumMOAttr,dataTransferMinimumMOAttr,dataTransferMOAttr,recievingCommWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,maxTransmitBytes,transmitNum,maxTransmitSize,receiveConMessNumSend,sendConMessNumSend,receiveConMessNumReceive,sendConMessNumReceive,confirmReceiveNum,confirmSendNum,confirmReceiveOut,confirmSendOut,iLength,complete,senderMess,toTransmit,cAlgs,toSend,transmitting,received,cInit,rLength,recveing,receivedMessageBlock,receivedMessageBlocks,dCAlg,key,oPort,lastConTime,sRNumber,receiveNumber,prevReceiveNumber,prevSendNumber,sendNumber,numNeeded,oID,oIP,commSec}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=latticeSearch(SIDMOAttrs, minSIDMOVals, maxSIDMOVals, SIDMOWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                return null;
            }
            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
            {
    throw new TimeOutException();
            }
Node[] SIDMO=((Node[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
            if(true)
            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483627,HSystem.masterIP}, 1, -2146483614, true, true, new Object[]{SIDMO,SIDMOWeights,maxSIDMOVals,minSIDMOVals,SIDMOAttrs,matchingCommMOAttributesWeights,matchingCommMOAttributes,tempBy,commAttrs,protocolStrength,securityProtocol,oSID,creator,dataCompression,lastReceivedTime,sendState,receiveState,receiveAttempts,sendAttempts,maxCommunicationAttempts,oPublicKey,lastMessageReceived,receivedPackets,dataTransferWeights,dataTransferMaximumMOAttr,dataTransferMinimumMOAttr,dataTransferMOAttr,recievingCommWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,maxTransmitBytes,transmitNum,maxTransmitSize,receiveConMessNumSend,sendConMessNumSend,receiveConMessNumReceive,sendConMessNumReceive,confirmReceiveNum,confirmSendNum,confirmReceiveOut,confirmSendOut,iLength,complete,senderMess,toTransmit,cAlgs,toSend,transmitting,received,cInit,rLength,recveing,receivedMessageBlock,receivedMessageBlocks,dCAlg,key,oPort,lastConTime,sRNumber,receiveNumber,prevReceiveNumber,prevSendNumber,sendNumber,numNeeded,oID,oIP,commSec}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                ((SIDMO)SIDMO[0].mO).getInfo(HSystem.masterIP, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                return null;
            }
            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
            {
    throw new TimeOutException();
            }
Object[] oMess=((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
            try
            {
                commSec.init((byte[])oMess[0]);
            }
            catch(InvalidKeyException|NoSuchAlgorithmException|NoSuchProviderException|InvalidAlgorithmParameterException|NoSuchPaddingException e)
            {
                Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
            }
            if(((InetAddress[])oMess[1]).length>1)
            {
                if(true)
                {
Iterator<InetAddress> $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
Object $_MANAGED_object_COMPILER_VARIABLE_1_$=(InetAddress[])oMess[1];
                    if($_MANAGED_object_COMPILER_VARIABLE_1_$!=null)
                    {
                        if($_MANAGED_object_COMPILER_VARIABLE_1_$.getClass().isArray())
                        {
                            $_MANAGED_object_COMPILER_VARIABLE_0_$=new ArrayIterator((Object[])$_MANAGED_object_COMPILER_VARIABLE_1_$);
                        }
                        else
                        {
                            $_MANAGED_object_COMPILER_VARIABLE_0_$=((Iterable<InetAddress>)$_MANAGED_object_COMPILER_VARIABLE_1_$).iterator();
                        }
InetAddress possibleIP=null;
                        while($_MANAGED_object_COMPILER_VARIABLE_0_$.hasNext())
                        {
                            possibleIP=$_MANAGED_object_COMPILER_VARIABLE_0_$.next();
                            if(possibleIP.isLoopbackAddress())
                            {
                                if(isReachable(possibleIP, ((int[])oMess[2])[0]))
                                {
                                    oIP=possibleIP;
                                    oPort=((int[])oMess[2])[0];
							break;
                                }
                            }
                            else if(isReachable(possibleIP, ((int[])oMess[2])[1]))
                            {
                                oIP=possibleIP;
                                oPort=((int[])oMess[2])[1];
						break;
                            }
                        }
                    }
                }
            }
            else
            {
                oIP=((InetAddress[])oMess[1])[0];
                oPort=((int[])oMess[2])[0];
            }
        }
        recievingCommMOAttr=new int[HSystem.mOAttributesLength+10];
        recievingCommMOMinAttr=new int[recievingCommMOAttr.length];
        recievingCommMOMaxAttr=new int[recievingCommMOAttr.length];
        recievingCommWeights=new int[recievingCommMOAttr.length];
        for(int attrNum=0; attrNum<recievingCommMOAttr.length; attrNum++)
        {
            if(attrNum==0)
            {
                recievingCommMOAttr[attrNum]=HSystem.communicationManagedObjectNameHash;
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==1)
            {
                recievingCommMOAttr[attrNum]=HSystem.communicationManagedObjectClassHash;
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==2)
            {
                recievingCommMOAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMinAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMaxAttr[attrNum]=Integer.MAX_VALUE;
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>6 && attrNum<15)
            {
                System.arraycopy(oID.SID, 4*(attrNum-7), tempBy, 0, 4);
                recievingCommMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempBy);
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>HSystem.mOAttributesLength-1 && attrNum<HSystem.mOAttributesLength+8)
            {
                System.arraycopy(HSystem.SID.SID, 4*(attrNum-HSystem.mOAttributesLength), tempBy, 0, 4);
                recievingCommMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempBy);
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>HSystem.mOAttributesLength+7 && attrNum<HSystem.mOAttributesLength+10)
            {
                recievingCommMOAttr[attrNum]=mOAttributes[attrNum];
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else
            {
                recievingCommMOMinAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMaxAttr[attrNum]=Integer.MAX_VALUE;
                recievingCommWeights[attrNum]=0;
            }
        }
        dataTransferMOAttr=new int[HSystem.mOAttributesLength];
        dataTransferMinimumMOAttr=new int[dataTransferMOAttr.length];
        dataTransferMaximumMOAttr=new int[dataTransferMOAttr.length];
        dataTransferWeights=new int[dataTransferMOAttr.length];
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
        if(commSec.state!=Integer.MAX_VALUE)
        {
            senderMess[0]=getSID();
            senderMess[1]=this;
            senderMess[3]=null;
            senderMess[4]=oIP;
            senderMess[5]=oPort;
            try
            {
                senderMess[6]=addSessionID(commSec.sendEncryptedMessage(null, null, 0)[0]);
            }
            catch(NoSuchAlgorithmException|NoSuchProviderException|InvalidAlgorithmParameterException|IllegalBlockSizeException|BadPaddingException e)
            {
                Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
            }
Node[] dataTransferManagedObject=latticeSearchLocal(dataTransferMOAttr, dataTransferMinimumMOAttr, dataTransferMaximumMOAttr, dataTransferWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
            senderMess[2]=(UDPManagedObject)dataTransferManagedObject[0].mO;
            ((UDPManagedObject)dataTransferManagedObject[0].mO).send(senderMess, $_MANAGED_object_COMPILER_DATA_$, this);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483612)
    private Object $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_278(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483625,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483625);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
int protocolStrength;
String securityProtocol;
int mLen;
byte[] mCont;
int port;
InetAddress iPv4;
ManagedObject creator;
        protocolStrength=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
        securityProtocol=(String)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
        mLen=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
        mCont=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
        port=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
        iPv4=(InetAddress)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
        creator=(ManagedObject)$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
        try
        {
MessageDigest sha256=MessageDigest.getInstance("SHA-256");
        }
        catch(NoSuchAlgorithmException e)
        {
            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
byte[] content=new byte[mCont.length-8];
        System.arraycopy(mCont, 8, content, 0, content.length);
        try
        {
            commSec=new CommunicationSecurityProtocol(securityProtocol, protocolStrength);
        }
        catch(NoSuchAlgorithmException e)
        {
            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
        try
        {
            oID=commSec.init(content);
        }
        catch(InvalidKeyException|NoSuchAlgorithmException|NoSuchProviderException|InvalidAlgorithmParameterException|NoSuchPaddingException e)
        {
            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
        try
        {
            addPermission(new CompareMessage[]
{
new CompareSID(oID),
new CompareMessageRange(new Range[]{new Range(HSystem.minManagedObject, HSystem.maxManagedObject)}),
new CompareMessageRange(new Range[]{new Range(HSystem.minManagedObject, HSystem.maxManagedObject)}),
new CompareMessageRange(new Range[]
{
new Range(CommunicationManagedObject.class.getDeclaredMethod("sendMessage", Object[].class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$()),
new Range(CommunicationManagedObject.class.getDeclaredMethod("confirmSend", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$()),
new Range(CommunicationManagedObject.class.getDeclaredMethod("receiveMessage", byte[].class, int.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$()),
new Range(CommunicationManagedObject.class.getDeclaredMethod("confirmReceive", Object[].class, long.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$())
}),
new AnyObjectAllowed(),
new AnyObjectAllowed()
}, getSID(), this);
        }
        catch(Exception e)
        {
            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
byte[] pubKey=new byte[4];
int[] commAttrs=new int[10];
        for(int oSIDSection=0; oSIDSection<8; oSIDSection++)
        {
            System.arraycopy(oID.SID, 4*oSIDSection, pubKey, 0, pubKey.length);
            commAttrs[oSIDSection]=ManagedObjectUtilities.b8ToB10Int(pubKey);
        }
        System.arraycopy(mCont, 0, pubKey, 0, pubKey.length);
        commAttrs[8]=ManagedObjectUtilities.b8ToB10Int(pubKey);
        System.arraycopy(mCont, 4, pubKey, 0, pubKey.length);
        commAttrs[9]=ManagedObjectUtilities.b8ToB10Int(pubKey);
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483625,commAttrs}, 1, -2146483621, true, true, new Object[]{commAttrs,pubKey,content,protocolStrength,securityProtocol,mLen,mCont,port,iPv4,creator,dataCompression,lastReceivedTime,sendState,receiveState,receiveAttempts,sendAttempts,maxCommunicationAttempts,oPublicKey,lastMessageReceived,receivedPackets,dataTransferWeights,dataTransferMaximumMOAttr,dataTransferMinimumMOAttr,dataTransferMOAttr,recievingCommWeights,recievingCommMOMaxAttr,recievingCommMOMinAttr,recievingCommMOAttr,maxTransmitBytes,transmitNum,maxTransmitSize,receiveConMessNumSend,sendConMessNumSend,receiveConMessNumReceive,sendConMessNumReceive,confirmReceiveNum,confirmSendNum,confirmReceiveOut,confirmSendOut,iLength,complete,senderMess,toTransmit,cAlgs,toSend,transmitting,received,cInit,rLength,recveing,receivedMessageBlock,receivedMessageBlocks,dCAlg,key,oPort,lastConTime,sRNumber,receiveNumber,prevReceiveNumber,prevSendNumber,sendNumber,numNeeded,oID,oIP,commSec}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            addAttributes(commAttrs, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
        oPort=port;
        oIP=iPv4;
        try
        {
            dataCompression=new DataCompression(dCAlg);
        }
        catch(NoSuchAlgorithmException e)
        {
            Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
        }
        recievingCommMOAttr=new int[HSystem.mOAttributesLength+10];
        recievingCommMOMinAttr=new int[recievingCommMOAttr.length];
        recievingCommMOMaxAttr=new int[recievingCommMOAttr.length];
        recievingCommWeights=new int[recievingCommMOAttr.length];
        for(int attrNum=0; attrNum<recievingCommMOAttr.length; attrNum++)
        {
            if(attrNum==0)
            {
                recievingCommMOAttr[attrNum]=HSystem.communicationManagedObjectNameHash;
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==1)
            {
                recievingCommMOAttr[attrNum]=HSystem.communicationManagedObjectClassHash;
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==2 || attrNum==4)
            {
                recievingCommMOAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMinAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMaxAttr[attrNum]=Integer.MAX_VALUE;
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>6 && attrNum<15)
            {
                System.arraycopy(oID.SID, 4*(attrNum-7), pubKey, 0, 4);
                recievingCommMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(pubKey);
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>HSystem.mOAttributesLength-1 && attrNum<HSystem.mOAttributesLength+8)
            {
                System.arraycopy(HSystem.SID.SID, 4*(attrNum-HSystem.mOAttributesLength), pubKey, 0, 4);
                recievingCommMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(pubKey);
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum>HSystem.mOAttributesLength+7 && attrNum<HSystem.mOAttributesLength+10)
            {
                recievingCommMOAttr[attrNum]=mOAttributes[attrNum];
                recievingCommMOMinAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommMOMaxAttr[attrNum]=recievingCommMOAttr[attrNum];
                recievingCommWeights[attrNum]=HSystem.intMaxValue;
            }
            else
            {
                recievingCommMOMinAttr[attrNum]=Integer.MIN_VALUE;
                recievingCommMOMaxAttr[attrNum]=Integer.MAX_VALUE;
                recievingCommWeights[attrNum]=0;
            }
        }
        dataTransferMOAttr=new int[HSystem.mOAttributesLength];
        dataTransferMinimumMOAttr=new int[dataTransferMOAttr.length];
        dataTransferMaximumMOAttr=new int[dataTransferMOAttr.length];
        dataTransferWeights=new int[dataTransferMOAttr.length];
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
                System.arraycopy(HSystem.SID.SID, 4*(attrNum-7), pubKey, 0, pubKey.length);
                dataTransferMOAttr[attrNum]=ManagedObjectUtilities.b8ToB10Int(pubKey);
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
        senderMess[0]=HSystem.SID;
        senderMess[1]=this;
        senderMess[3]=null;
        senderMess[4]=oIP;
        senderMess[5]=oPort;
        pubKey=new byte[mCont.length-8];
        System.arraycopy(mCont, 8, pubKey, 0, pubKey.length);
        if(commSec.state!=Integer.MAX_VALUE)
        {
            try
            {
                senderMess[6]=addSessionID(commSec.receiveEncryptedMessage(new byte[][]{pubKey}));
            }
            catch(InvalidKeyException|NoSuchAlgorithmException|NoSuchProviderException|InvalidAlgorithmParameterException|NoSuchPaddingException|IllegalStateException|InvalidKeySpecException|ShortBufferException|IllegalBlockSizeException|BadPaddingException e)
            {
                Logger.getLogger(CommunicationManagedObject.class.getName()).log(Level.SEVERE, null, e);
            }
Node[] dataTransferManagedObject=latticeSearchLocal(dataTransferMOAttr, dataTransferMinimumMOAttr, dataTransferMaximumMOAttr, dataTransferWeights, 1, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
            senderMess[2]=(UDPManagedObject)dataTransferManagedObject[0].mO;
            ((UDPManagedObject)dataTransferManagedObject[0].mO).send(senderMess, $_MANAGED_object_COMPILER_DATA_$, this);
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
public static final int $_MANAGED_object_COMPILER_CommunicationManagedObject_$=2147483647;
public static final int $_MANAGED_object_COMPILER_CommunicationManagedObject_ByteArrayWrapper_ManagedObject_$=-2146483648;
public static final int $_MANAGED_object_COMPILER_CommunicationManagedObject_ManagedObject_ByteArrayWrapper_String_int_ByteArrayWrapper_ManagedObject_$=-2146483647;
public static final int $_MANAGED_object_COMPILER_CommunicationManagedObject_ManagedObject_InetAddress_int_byte$$_int_String_int_ByteArrayWrapper_ManagedObject_$=-2146483646;
public static final int $_MANAGED_object_COMPILER_addSessionID_byte$$_$=-2146483645;
public static final int $_MANAGED_object_COMPILER_sendMessage_Object$$_ByteArrayWrapper_ManagedObject_$=-2146483644;
public static final int $_MANAGED_object_COMPILER_writeMessage_Object$$_$=-2146483643;
public static final int $_MANAGED_object_COMPILER_receiveMessage_byte$$_int_ByteArrayWrapper_ManagedObject_$=-2146483642;
public static final int $_MANAGED_object_COMPILER_readMessage_byte$$_byte$$_$=-2146483641;
public static final int $_MANAGED_object_COMPILER_sendConMessage_Object$$_int_$=-2146483640;
public static final int $_MANAGED_object_COMPILER_receiveConMessage_byte$$_int_$=-2146483639;
public static final int $_MANAGED_object_COMPILER_confirmReceive_Object$$_long_ByteArrayWrapper_ManagedObject_$=-2146483638;
public static final int $_MANAGED_object_COMPILER_confirmSend_Object$$_long_ByteArrayWrapper_ManagedObject_$=-2146483637;
public static final int $_MANAGED_object_COMPILER_changeCAlg_Object$$_ByteArrayWrapper_ManagedObject_$=-2146483636;
public static final int $_MANAGED_object_COMPILER_addToToTransmit_Object$$_$=-2146483635;
public static final int $_MANAGED_object_COMPILER_getFromToTransmit_int_$=-2146483634;
public static final int $_MANAGED_object_COMPILER_getFromToTransmit_int_int_$=-2146483633;
public static final int $_MANAGED_object_COMPILER_removeFromToTransmit_int_$=-2146483632;
public static final int $_MANAGED_object_COMPILER_nextMultiple_int_int_$=-2146483631;
public static final int $_MANAGED_object_COMPILER_setOtherInformation_Object$$_$=-2146483630;
public static final int $_MANAGED_object_COMPILER_isReachable_InetAddress_int_$=-2146483629;
public static final int $_MANAGED_object_COMPILER_CommunicationManagedObject_$_MANAGED_object_COMPILER_DUMMY_VARIABLE_$_$=2147483647;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CREATE_METHOD_$_ManagedObject_ByteArrayWrapper_String_int_ByteArrayWrapper_ManagedObject_$=-2146483628;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_ManagedObject_ByteArrayWrapper_String_int_ByteArrayWrapper_ManagedObject_$=-2146483627;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CREATE_METHOD_$_ManagedObject_InetAddress_int_byte$$_int_String_int_ByteArrayWrapper_ManagedObject_$=-2146483626;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_ManagedObject_InetAddress_int_byte$$_int_String_int_ByteArrayWrapper_ManagedObject_$=-2146483625;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONCURRENT_METHOD_receiveMessage_0_$_int_Object$$$$_byte$$$$_ObjectInputStream_ByteArrayInputStream_byte$$_byte$$$$_int_byte$$_long_byte$$_byte$$_int_byte$$_DataCompression_long_int_int_int_int_int_byte$$_boolean_BitSet_int$$_int$$_int$$_int$$_int$$_int$$_int$$_int$$_int_int_int_long_long_long_long_long_long_boolean_boolean_int_boolean_Object$$_List__Object$$___List__Byte___List__Object$$___boolean_int_boolean_int_boolean_byte$$$$_List__byte$$$$___byte_byte$$_int_long_long_int_int_int_int_int_ByteArrayWrapper_InetAddress_CommunicationSecurityProtocol_ByteArrayWrapper_ManagedObject_$=-2146483624;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONCURRENT_METHOD_readMessage_1_$_ManagedObjectDeletedException_Object$$_byte$$_byte$$_DataCompression_long_int_int_int_int_int_byte$$_boolean_BitSet_int$$_int$$_int$$_int$$_int$$_int$$_int$$_int$$_int_int_int_long_long_long_long_long_long_boolean_boolean_int_boolean_Object$$_List__Object$$___List__Byte___List__Object$$___boolean_int_boolean_int_boolean_byte$$$$_List__byte$$$$___byte_byte$$_int_long_long_int_int_int_int_int_ByteArrayWrapper_InetAddress_CommunicationSecurityProtocol_ByteArrayWrapper_ManagedObject_$=-2146483623;
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public void MANAGED_object_COMPILER_RUN(Object[] message, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws Exception, MOPermissionDeniedException, TimeOutException
    {
        switch((int)message[3])
        {
            case -2146483644:
                sendMessage((Object[])message[4], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483642:
                receiveMessage((byte[])message[4], (int)message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483638:
                confirmReceive(message, (long)message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483637:
                confirmSend(message, (long)message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483636:
                changeCAlg((Object[])message[4], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483628:
                $_MANAGED_object_COMPILER_CREATE_METHOD_$((ManagedObject)message[4], (ByteArrayWrapper)message[5], (String)message[6], (int)message[7], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483627:
                $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$((ManagedObject)message[4], (ByteArrayWrapper)message[5], (String)message[6], (int)message[7], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483626:
                $_MANAGED_object_COMPILER_CREATE_METHOD_$((ManagedObject)message[4], (InetAddress)message[5], (int)message[6], (byte[])message[7], (int)message[8], (String)message[9], (int)message[10], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483625:
                $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$((ManagedObject)message[4], (InetAddress)message[5], (int)message[6], (byte[])message[7], (int)message[8], (String)message[9], (int)message[10], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483624:
                $_MANAGED_object_COMPILER_CONCURRENT_METHOD_receiveMessage_0_$((int)message[4], (Object[][])message[5], (byte[][])message[6], (ObjectInputStream)message[7], (ByteArrayInputStream)message[8], (byte[])message[9], (byte[][])message[10], (int)message[11], (byte[])message[12], (long)message[13], (byte[])message[14], (byte[])message[15], (int)message[16], (byte[])message[17], (DataCompression)message[18], (long)message[19], (int)message[20], (int)message[21], (int)message[22], (int)message[23], (int)message[24], (byte[])message[25], (boolean)message[26], (BitSet)message[27], (int[])message[28], (int[])message[29], (int[])message[30], (int[])message[31], (int[])message[32], (int[])message[33], (int[])message[34], (int[])message[35], (int)message[36], (int)message[37], (int)message[38], (long)message[39], (long)message[40], (long)message[41], (long)message[42], (long)message[43], (long)message[44], (boolean)message[45], (boolean)message[46], (int)message[47], (boolean)message[48], (Object[])message[49], (List<Object[]>)message[50], (List<Byte>)message[51], (List<Object[]>)message[52], (boolean)message[53], (int)message[54], (boolean)message[55], (int)message[56], (boolean)message[57], (byte[][])message[58], (List<byte[][]>)message[59], (byte)message[60], (byte[])message[61], (int)message[62], (long)message[63], (long)message[64], (int)message[65], (int)message[66], (int)message[67], (int)message[68], (int)message[69], (ByteArrayWrapper)message[70], (InetAddress)message[71], (CommunicationSecurityProtocol)message[72], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483623:
                $_MANAGED_object_COMPILER_CONCURRENT_METHOD_readMessage_1_$((ManagedObjectDeletedException)message[4], (Object[])message[5], (byte[])message[6], (byte[])message[7], (DataCompression)message[8], (long)message[9], (int)message[10], (int)message[11], (int)message[12], (int)message[13], (int)message[14], (byte[])message[15], (boolean)message[16], (BitSet)message[17], (int[])message[18], (int[])message[19], (int[])message[20], (int[])message[21], (int[])message[22], (int[])message[23], (int[])message[24], (int[])message[25], (int)message[26], (int)message[27], (int)message[28], (long)message[29], (long)message[30], (long)message[31], (long)message[32], (long)message[33], (long)message[34], (boolean)message[35], (boolean)message[36], (int)message[37], (boolean)message[38], (Object[])message[39], (List<Object[]>)message[40], (List<Byte>)message[41], (List<Object[]>)message[42], (boolean)message[43], (int)message[44], (boolean)message[45], (int)message[46], (boolean)message[47], (byte[][])message[48], (List<byte[][]>)message[49], (byte)message[50], (byte[])message[51], (int)message[52], (long)message[53], (long)message[54], (int)message[55], (int)message[56], (int)message[57], (int)message[58], (int)message[59], (ByteArrayWrapper)message[60], (InetAddress)message[61], (CommunicationSecurityProtocol)message[62], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483622:
                $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_42((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483621:
                $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_43((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483620:
                CommunicationManagedObject_MANAGED_object_COMPILER_METHOD_85((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483619:
                CommunicationManagedObject_MANAGED_object_COMPILER_METHOD_86((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483618:
                CommunicationManagedObject_MANAGED_object_COMPILER_METHOD_87((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483617:
                $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_165((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483616:
                $_MANAGED_object_COMPILER_CONCURRENT_METHOD_receiveMessage_0_$_MANAGED_object_COMPILER_METHOD_259((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483615:
                $_MANAGED_object_COMPILER_CONCURRENT_METHOD_readMessage_1_$_MANAGED_object_COMPILER_METHOD_262((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483614:
                $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_263((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483613:
                $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_277((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483612:
                $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_278((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            default:
                super.MANAGED_object_COMPILER_RUN(message, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
    }
}

    

    
    
    
    
    


