package jwtc.chess.algorithm;

import jwtc.chess.GameControl;
import jwtc.chess.JNI;
import jwtc.chess.Move;
import MO.ManagedObject;
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

public class SearchAlgorithmRunner extends ManagedObject implements Runnable 

{

public static final byte[] $_MANAGED_object_COMPILER_CLASS_ID_$=new byte[]{-21, 35, 112, 113, 57, -107, -81, 87, -5, 67, 41, -70, 63, -58, -96, 112, -35, 15, 52, 6, 37, 95, 95, -51, 37, 115, -55, -11, 58, 14, 49, -96};
static final long serialVersionUID=-1503234219011887273L;
    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public SearchAlgorithmRunner() throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(SearchAlgorithmRunner.class))
        {
            addPermission(permission, null, this);
        }
    }

    @MOCompilerControl(checkLink=true, checkShell=true, compile=true, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483646)
    public Object run(ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SearchAlgorithmRunner)getFirstLatticeManagedObject()).run($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483646))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483646);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
                $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,m_control}, 1, -2146483630, true, true, new Object[]{}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    run(m_control, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
Object[] result=(Object[])((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                m_control=(GameControl)result[1];
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

    
protected GameControl m_control=null;
    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483648)
    public SearchAlgorithmRunner(GameControl gc) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(SearchAlgorithmRunner.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(gc, new ByteArrayWrapper(), HSystem.mothreads[0]);
    }

    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483647)
    public Object run(GameControl m_control, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SearchAlgorithmRunner)getFirstLatticeManagedObject()).run(m_control, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,m_control,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483647))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,m_control,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,m_control}, null, false}, 1, -2146483633, true, true, new Object[]{m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=intelligence(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,m_control}, null, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
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
                m_control=(GameControl)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
                $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
                $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
                try
                {
                    if(true)
                    {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, this,m_control}, 1, -2146483631, true, true, new Object[]{$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                        GameControlWrapper.$_MANAGED_object_COMPILER_CREATE_METHOD_$(this, m_control, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                        return null;
                    }
                    if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                    {
    throw new TimeOutException();
                    }
GameControlWrapper m_control_wrapper=((GameControlWrapper)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                    if(true)
                    {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483643, true, true, new Object[]{m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                        m_control_wrapper.getJNI($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                        return null;
                    }
                    if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                    {
    throw new TimeOutException();
                    }
JNI _jni=((JNI)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                    if(_jni.isEnded()!= 0)
                    {
                        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$, new Object[]{m_control}};
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
                    if(true)
                    {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483642, true, true, new Object[]{_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                        m_control_wrapper.disableControl($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                        return null;
                    }
                    if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                    {
    throw new TimeOutException();
                    }
                    if(true)
                    {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483641, true, true, new Object[]{_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                        m_control_wrapper.getLevelMode($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                        return null;
                    }
                    if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                    {
    throw new TimeOutException();
                    }
                    if(((int)$_MANAGED_object_COMPILER_RETURN_VALUE_$)==GameControl.LEVEL_PLY)
                    {
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483640, true, true, new Object[]{_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            m_control_wrapper.getLevelPly($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
int level=((int)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                        _jni.searchDepth(level);
int move=_jni.getMove();
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,move}, 1, -2146483639, true, true, new Object[]{move,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            m_control_wrapper.sendMoveMessageFromThread(move, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
int evalCnt=_jni.getEvalCount();
String s=null;
                        if(evalCnt== 0)
                        {
                            s="From opening book";
                        }
                        else
                        {
                            s="Searched at " +level+ " ply";
                        }
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483637, true, true, new Object[]{s,evalCnt,move,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
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
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483634, true, true, new Object[]{_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            m_control_wrapper.getLevel($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
int level=((int)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
int[] secs={1, 1, 2, 4, 8, 10, 20, 30, 60, 300, 900, 1800};
                        _jni.searchMove(secs[level]);
long lMillies=System.currentTimeMillis();
int move=0;
int tmpMove=0;
int value=0;
int ply=1;
int evalCnt=0;
int j=0;
int iSleep=1000;
int iNps=0;
String s="";
float fValue=0.0f;
                        while(_jni.peekSearchDone()== 0)
                        {
                            Thread.sleep(iSleep);
                            ply=_jni.peekSearchDepth();
                            value=_jni.peekSearchBestValue();
                            evalCnt=_jni.getEvalCount();
                            fValue=(float)value/ 100.0F;
                            s="";
                            if(ply> 5)
                            {
                                ply=5;
                            }
                            for(j=0; j<ply; j++)
                            {
                                tmpMove=_jni.peekSearchBestMove(j);
                                if(tmpMove!= 0)
                                {
                                    s+=Move.toDbgString(tmpMove).replace("[", "").replace("]", "")+ " ";
                                }
                            }
                            if(ply== 5)
                            {
                                s+= "...";
                            }
                            s=s+ "\n\t" +String.format("%.2f", fValue);
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483636, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
                        }
                        move=_jni.getMove();
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,move}, 1, -2146483638, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            m_control_wrapper.sendMoveMessageFromThread(move, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
                        value=_jni.peekSearchBestValue();
                        fValue=(float)value/ 100.0F;
                        evalCnt=_jni.getEvalCount();
                        if(evalCnt== 0)
                        {
                            s="From opening book";
                        }
                        else
                        {
int iTime=(int)((System.currentTimeMillis()-lMillies)/1000);
                            iNps=(int)(evalCnt/iTime);
                            s=iNps+ " N/s (" +iTime+ " s)" + "\n\t" +String.format("%.2f", fValue);
                        }
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483635, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
                    }
                }
                catch(Exception ex)
                {
                    ex.printStackTrace(System.out);
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
    public void run()
    {
        try
        {
            run(new ByteArrayWrapper(), this);
        }
        catch(MOPermissionDeniedException|TimeOutException e)
        {
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    private SearchAlgorithmRunner($_MANAGED_object_COMPILER_DUMMY_VARIABLE_$ $_MANAGED_object_COMPILER_DUMMY_variable_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(SearchAlgorithmRunner.class))
        {
            addPermission(permission, null, this);
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483645)
    public static   Object $_MANAGED_object_COMPILER_CREATE_METHOD_$(GameControl gc, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
SearchAlgorithmRunner $_MANAGED_object_COMPILER_CREATED_Object_$=new SearchAlgorithmRunner(new $_MANAGED_object_COMPILER_DUMMY_VARIABLE_$());
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            $_MANAGED_object_COMPILER_CREATED_Object_$.addPermission(permission, null, $_MANAGED_object_COMPILER_CREATED_Object_$);
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483645);
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
;
        $_MANAGED_object_COMPILER_CREATED_Object_$.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(gc, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_COMPILER_CREATED_Object_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,$_MANAGED_object_COMPILER_CREATED_Object_$};
        return null;
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483644)
    public SearchAlgorithmRunner $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(GameControl gc, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(SearchAlgorithmRunner.class))
        {
            addPermission(permission, null, this);
        }
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483644,gc,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483644);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
        $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
        if(true)
        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483644,HSystem.mothreads[0]}, 1, -2146483632, true, true, new Object[]{gc,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            super.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(HSystem.mothreads[0], $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
        m_control=gc;
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
    private Object run_MANAGED_object_COMPILER_METHOD_2(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SearchAlgorithmRunner)getFirstLatticeManagedObject()).run_MANAGED_object_COMPILER_METHOD_2($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483643,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483643))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$;
GameControl m_control;
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                m_control=(GameControl)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                try
                {
                    if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                    {
GameControlWrapper m_control_wrapper;
                        m_control_wrapper=(GameControlWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                        if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                        {
                            $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
JNI _jni=((JNI)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                        if(_jni.isEnded()!= 0)
                        {
                            Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$, new Object[]{m_control}};
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
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483642, true, true, new Object[]{_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            m_control_wrapper.disableControl($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483641, true, true, new Object[]{_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            m_control_wrapper.getLevelMode($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
                        if(((int)$_MANAGED_object_COMPILER_RETURN_VALUE_$)==GameControl.LEVEL_PLY)
                        {
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483640, true, true, new Object[]{_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.getLevelPly($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
int level=((int)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                            _jni.searchDepth(level);
int move=_jni.getMove();
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,move}, 1, -2146483639, true, true, new Object[]{move,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMoveMessageFromThread(move, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
int evalCnt=_jni.getEvalCount();
String s=null;
                            if(evalCnt== 0)
                            {
                                s="From opening book";
                            }
                            else
                            {
                                s="Searched at " +level+ " ply";
                            }
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483637, true, true, new Object[]{s,evalCnt,move,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
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
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483634, true, true, new Object[]{_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.getLevel($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
int level=((int)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
int[] secs={1, 1, 2, 4, 8, 10, 20, 30, 60, 300, 900, 1800};
                            _jni.searchMove(secs[level]);
long lMillies=System.currentTimeMillis();
int move=0;
int tmpMove=0;
int value=0;
int ply=1;
int evalCnt=0;
int j=0;
int iSleep=1000;
int iNps=0;
String s="";
float fValue=0.0f;
                            while(_jni.peekSearchDone()== 0)
                            {
                                Thread.sleep(iSleep);
                                ply=_jni.peekSearchDepth();
                                value=_jni.peekSearchBestValue();
                                evalCnt=_jni.getEvalCount();
                                fValue=(float)value/ 100.0F;
                                s="";
                                if(ply> 5)
                                {
                                    ply=5;
                                }
                                for(j=0; j<ply; j++)
                                {
                                    tmpMove=_jni.peekSearchBestMove(j);
                                    if(tmpMove!= 0)
                                    {
                                        s+=Move.toDbgString(tmpMove).replace("[", "").replace("]", "")+ " ";
                                    }
                                }
                                if(ply== 5)
                                {
                                    s+= "...";
                                }
                                s=s+ "\n\t" +String.format("%.2f", fValue);
                                if(true)
                                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483636, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                    m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                    return null;
                                }
                                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                {
    throw new TimeOutException();
                                }
                            }
                            move=_jni.getMove();
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,move}, 1, -2146483638, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMoveMessageFromThread(move, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
                            value=_jni.peekSearchBestValue();
                            fValue=(float)value/ 100.0F;
                            evalCnt=_jni.getEvalCount();
                            if(evalCnt== 0)
                            {
                                s="From opening book";
                            }
                            else
                            {
int iTime=(int)((System.currentTimeMillis()-lMillies)/1000);
                                iNps=(int)(evalCnt/iTime);
                                s=iNps+ " N/s (" +iTime+ " s)" + "\n\t" +String.format("%.2f", fValue);
                            }
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483635, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
                        }
                    }
                }
                catch(Exception ex)
                {
                    ex.printStackTrace(System.out);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483642)
    private Object run_MANAGED_object_COMPILER_METHOD_4(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SearchAlgorithmRunner)getFirstLatticeManagedObject()).run_MANAGED_object_COMPILER_METHOD_4($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
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
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$;
GameControl m_control;
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                m_control=(GameControl)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                try
                {
                    if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                    {
JNI _jni;
GameControlWrapper m_control_wrapper;
                        _jni=(JNI)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                        m_control_wrapper=(GameControlWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                        if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                        {
                            $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483641, true, true, new Object[]{_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            m_control_wrapper.getLevelMode($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
                        if(((int)$_MANAGED_object_COMPILER_RETURN_VALUE_$)==GameControl.LEVEL_PLY)
                        {
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483640, true, true, new Object[]{_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.getLevelPly($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
int level=((int)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                            _jni.searchDepth(level);
int move=_jni.getMove();
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,move}, 1, -2146483639, true, true, new Object[]{move,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMoveMessageFromThread(move, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
int evalCnt=_jni.getEvalCount();
String s=null;
                            if(evalCnt== 0)
                            {
                                s="From opening book";
                            }
                            else
                            {
                                s="Searched at " +level+ " ply";
                            }
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483637, true, true, new Object[]{s,evalCnt,move,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
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
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483634, true, true, new Object[]{_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.getLevel($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
int level=((int)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
int[] secs={1, 1, 2, 4, 8, 10, 20, 30, 60, 300, 900, 1800};
                            _jni.searchMove(secs[level]);
long lMillies=System.currentTimeMillis();
int move=0;
int tmpMove=0;
int value=0;
int ply=1;
int evalCnt=0;
int j=0;
int iSleep=1000;
int iNps=0;
String s="";
float fValue=0.0f;
                            while(_jni.peekSearchDone()== 0)
                            {
                                Thread.sleep(iSleep);
                                ply=_jni.peekSearchDepth();
                                value=_jni.peekSearchBestValue();
                                evalCnt=_jni.getEvalCount();
                                fValue=(float)value/ 100.0F;
                                s="";
                                if(ply> 5)
                                {
                                    ply=5;
                                }
                                for(j=0; j<ply; j++)
                                {
                                    tmpMove=_jni.peekSearchBestMove(j);
                                    if(tmpMove!= 0)
                                    {
                                        s+=Move.toDbgString(tmpMove).replace("[", "").replace("]", "")+ " ";
                                    }
                                }
                                if(ply== 5)
                                {
                                    s+= "...";
                                }
                                s=s+ "\n\t" +String.format("%.2f", fValue);
                                if(true)
                                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483636, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                    m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                    return null;
                                }
                                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                {
    throw new TimeOutException();
                                }
                            }
                            move=_jni.getMove();
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,move}, 1, -2146483638, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMoveMessageFromThread(move, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
                            value=_jni.peekSearchBestValue();
                            fValue=(float)value/ 100.0F;
                            evalCnt=_jni.getEvalCount();
                            if(evalCnt== 0)
                            {
                                s="From opening book";
                            }
                            else
                            {
int iTime=(int)((System.currentTimeMillis()-lMillies)/1000);
                                iNps=(int)(evalCnt/iTime);
                                s=iNps+ " N/s (" +iTime+ " s)" + "\n\t" +String.format("%.2f", fValue);
                            }
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483635, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
                        }
                    }
                }
                catch(Exception ex)
                {
                    ex.printStackTrace(System.out);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483641)
    private Object run_MANAGED_object_COMPILER_METHOD_6(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SearchAlgorithmRunner)getFirstLatticeManagedObject()).run_MANAGED_object_COMPILER_METHOD_6($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483641,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483641))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$;
GameControl m_control;
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                m_control=(GameControl)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                try
                {
                    if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                    {
JNI _jni;
GameControlWrapper m_control_wrapper;
                        _jni=(JNI)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                        m_control_wrapper=(GameControlWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                        if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                        {
                            $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
                        if(((int)$_MANAGED_object_COMPILER_RETURN_VALUE_$)==GameControl.LEVEL_PLY)
                        {
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483640, true, true, new Object[]{_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.getLevelPly($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
int level=((int)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                            _jni.searchDepth(level);
int move=_jni.getMove();
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,move}, 1, -2146483639, true, true, new Object[]{move,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMoveMessageFromThread(move, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
int evalCnt=_jni.getEvalCount();
String s=null;
                            if(evalCnt== 0)
                            {
                                s="From opening book";
                            }
                            else
                            {
                                s="Searched at " +level+ " ply";
                            }
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483637, true, true, new Object[]{s,evalCnt,move,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
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
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483634, true, true, new Object[]{_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.getLevel($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
int level=((int)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
int[] secs={1, 1, 2, 4, 8, 10, 20, 30, 60, 300, 900, 1800};
                            _jni.searchMove(secs[level]);
long lMillies=System.currentTimeMillis();
int move=0;
int tmpMove=0;
int value=0;
int ply=1;
int evalCnt=0;
int j=0;
int iSleep=1000;
int iNps=0;
String s="";
float fValue=0.0f;
                            while(_jni.peekSearchDone()== 0)
                            {
                                Thread.sleep(iSleep);
                                ply=_jni.peekSearchDepth();
                                value=_jni.peekSearchBestValue();
                                evalCnt=_jni.getEvalCount();
                                fValue=(float)value/ 100.0F;
                                s="";
                                if(ply> 5)
                                {
                                    ply=5;
                                }
                                for(j=0; j<ply; j++)
                                {
                                    tmpMove=_jni.peekSearchBestMove(j);
                                    if(tmpMove!= 0)
                                    {
                                        s+=Move.toDbgString(tmpMove).replace("[", "").replace("]", "")+ " ";
                                    }
                                }
                                if(ply== 5)
                                {
                                    s+= "...";
                                }
                                s=s+ "\n\t" +String.format("%.2f", fValue);
                                if(true)
                                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483636, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                    m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                    return null;
                                }
                                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                {
    throw new TimeOutException();
                                }
                            }
                            move=_jni.getMove();
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,move}, 1, -2146483638, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMoveMessageFromThread(move, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
                            value=_jni.peekSearchBestValue();
                            fValue=(float)value/ 100.0F;
                            evalCnt=_jni.getEvalCount();
                            if(evalCnt== 0)
                            {
                                s="From opening book";
                            }
                            else
                            {
int iTime=(int)((System.currentTimeMillis()-lMillies)/1000);
                                iNps=(int)(evalCnt/iTime);
                                s=iNps+ " N/s (" +iTime+ " s)" + "\n\t" +String.format("%.2f", fValue);
                            }
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483635, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
                        }
                    }
                }
                catch(Exception ex)
                {
                    ex.printStackTrace(System.out);
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
    private Object run_MANAGED_object_COMPILER_METHOD_8(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SearchAlgorithmRunner)getFirstLatticeManagedObject()).run_MANAGED_object_COMPILER_METHOD_8($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483640,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483640))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$;
GameControl m_control;
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                m_control=(GameControl)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                try
                {
                    if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                    {
JNI _jni;
GameControlWrapper m_control_wrapper;
                        _jni=(JNI)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                        m_control_wrapper=(GameControlWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                        if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                        {
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                            if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                            {
                                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
int level=((int)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                            _jni.searchDepth(level);
int move=_jni.getMove();
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,move}, 1, -2146483639, true, true, new Object[]{move,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMoveMessageFromThread(move, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
int evalCnt=_jni.getEvalCount();
String s=null;
                            if(evalCnt== 0)
                            {
                                s="From opening book";
                            }
                            else
                            {
                                s="Searched at " +level+ " ply";
                            }
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483637, true, true, new Object[]{s,evalCnt,move,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
                        }
                    }
                }
                catch(Exception ex)
                {
                    ex.printStackTrace(System.out);
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
    private Object run_MANAGED_object_COMPILER_METHOD_10(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SearchAlgorithmRunner)getFirstLatticeManagedObject()).run_MANAGED_object_COMPILER_METHOD_10($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483639,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483639))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$;
GameControl m_control;
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
                m_control=(GameControl)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
                try
                {
                    if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                    {
JNI _jni;
GameControlWrapper m_control_wrapper;
                        _jni=(JNI)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                        m_control_wrapper=(GameControlWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                        if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                        {
int move;
int level;
                            move=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                            level=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                            if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                            {
                                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
int evalCnt=_jni.getEvalCount();
String s=null;
                            if(evalCnt== 0)
                            {
                                s="From opening book";
                            }
                            else
                            {
                                s="Searched at " +level+ " ply";
                            }
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483637, true, true, new Object[]{s,evalCnt,move,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
                        }
                    }
                }
                catch(Exception ex)
                {
                    ex.printStackTrace(System.out);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483638)
    private Object run_MANAGED_object_COMPILER_METHOD_11(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SearchAlgorithmRunner)getFirstLatticeManagedObject()).run_MANAGED_object_COMPILER_METHOD_11($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483638,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483638))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$;
GameControl m_control;
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[15];
                m_control=(GameControl)$_MANAGED_object_COMPILER_RETURN_STATE_$[16];
                try
                {
                    if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                    {
JNI _jni;
GameControlWrapper m_control_wrapper;
                        _jni=(JNI)$_MANAGED_object_COMPILER_RETURN_STATE_$[13];
                        m_control_wrapper=(GameControlWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[14];
                        if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                        {
float fValue;
String s;
int iNps;
int iSleep;
int j;
int evalCnt;
int ply;
int value;
int tmpMove;
int move;
long lMillies;
int[] secs;
int level;
                            fValue=(float)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                            s=(String)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                            iNps=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                            iSleep=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                            j=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
                            evalCnt=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
                            ply=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
                            value=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[7];
                            tmpMove=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[8];
                            move=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[9];
                            lMillies=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[10];
                            secs=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[11];
                            level=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[12];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                            if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                            {
                                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
                            value=_jni.peekSearchBestValue();
                            fValue=(float)value/ 100.0F;
                            evalCnt=_jni.getEvalCount();
                            if(evalCnt== 0)
                            {
                                s="From opening book";
                            }
                            else
                            {
int iTime=(int)((System.currentTimeMillis()-lMillies)/1000);
                                iNps=(int)(evalCnt/iTime);
                                s=iNps+ " N/s (" +iTime+ " s)" + "\n\t" +String.format("%.2f", fValue);
                            }
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483635, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
                        }
                    }
                }
                catch(Exception ex)
                {
                    ex.printStackTrace(System.out);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483637)
    private Object run_MANAGED_object_COMPILER_METHOD_13(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SearchAlgorithmRunner)getFirstLatticeManagedObject()).run_MANAGED_object_COMPILER_METHOD_13($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483637,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483637))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$;
GameControl m_control;
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
                m_control=(GameControl)$_MANAGED_object_COMPILER_RETURN_STATE_$[7];
                try
                {
                    if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                    {
JNI _jni;
GameControlWrapper m_control_wrapper;
                        _jni=(JNI)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
                        m_control_wrapper=(GameControlWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
                        if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                        {
String s;
int evalCnt;
int move;
int level;
                            s=(String)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                            evalCnt=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                            move=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                            level=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                            if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                            {
                                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
                        }
                    }
                }
                catch(Exception ex)
                {
                    ex.printStackTrace(System.out);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483636)
    private Object run_MANAGED_object_COMPILER_METHOD_14(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SearchAlgorithmRunner)getFirstLatticeManagedObject()).run_MANAGED_object_COMPILER_METHOD_14($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
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
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$;
GameControl m_control;
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[15];
                m_control=(GameControl)$_MANAGED_object_COMPILER_RETURN_STATE_$[16];
                try
                {
                    if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                    {
JNI _jni;
GameControlWrapper m_control_wrapper;
                        _jni=(JNI)$_MANAGED_object_COMPILER_RETURN_STATE_$[13];
                        m_control_wrapper=(GameControlWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[14];
                        if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                        {
float fValue;
String s;
int iNps;
int iSleep;
int j;
int evalCnt;
int ply;
int value;
int tmpMove;
int move;
long lMillies;
int[] secs;
int level;
                            fValue=(float)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                            s=(String)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                            iNps=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                            iSleep=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                            j=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
                            evalCnt=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
                            ply=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
                            value=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[7];
                            tmpMove=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[8];
                            move=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[9];
                            lMillies=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[10];
                            secs=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[11];
                            level=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[12];
                            while($_MANAGED_object_COMPILER_FIRST_LOOP_$ || (_jni.peekSearchDone()== 0))
                            {
                                if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                                {
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                                    if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                                    {
                                        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                                    }
                                }
                                else
                                {
                                    Thread.sleep(iSleep);
                                    ply=_jni.peekSearchDepth();
                                    value=_jni.peekSearchBestValue();
                                    evalCnt=_jni.getEvalCount();
                                    fValue=(float)value/ 100.0F;
                                    s="";
                                    if(ply> 5)
                                    {
                                        ply=5;
                                    }
                                    for(j=0; j<ply; j++)
                                    {
                                        tmpMove=_jni.peekSearchBestMove(j);
                                        if(tmpMove!= 0)
                                        {
                                            s+=Move.toDbgString(tmpMove).replace("[", "").replace("]", "")+ " ";
                                        }
                                    }
                                    if(ply== 5)
                                    {
                                        s+= "...";
                                    }
                                    s=s+ "\n\t" +String.format("%.2f", fValue);
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                                    if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                                    {
                                        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                                    }
                                    else
                                    {
                                        if(true)
                                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483636, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                            m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                            return null;
                                        }
                                    }
                                }
                                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                {
    throw new TimeOutException();
                                }
                            }
                            move=_jni.getMove();
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,move}, 1, -2146483638, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMoveMessageFromThread(move, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
                            value=_jni.peekSearchBestValue();
                            fValue=(float)value/ 100.0F;
                            evalCnt=_jni.getEvalCount();
                            if(evalCnt== 0)
                            {
                                s="From opening book";
                            }
                            else
                            {
int iTime=(int)((System.currentTimeMillis()-lMillies)/1000);
                                iNps=(int)(evalCnt/iTime);
                                s=iNps+ " N/s (" +iTime+ " s)" + "\n\t" +String.format("%.2f", fValue);
                            }
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483635, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
                        }
                    }
                }
                catch(Exception ex)
                {
                    ex.printStackTrace(System.out);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483635)
    private Object run_MANAGED_object_COMPILER_METHOD_15(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SearchAlgorithmRunner)getFirstLatticeManagedObject()).run_MANAGED_object_COMPILER_METHOD_15($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
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
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$;
GameControl m_control;
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[15];
                m_control=(GameControl)$_MANAGED_object_COMPILER_RETURN_STATE_$[16];
                try
                {
                    if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                    {
JNI _jni;
GameControlWrapper m_control_wrapper;
                        _jni=(JNI)$_MANAGED_object_COMPILER_RETURN_STATE_$[13];
                        m_control_wrapper=(GameControlWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[14];
                        if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                        {
float fValue;
String s;
int iNps;
int iSleep;
int j;
int evalCnt;
int ply;
int value;
int tmpMove;
int move;
long lMillies;
int[] secs;
int level;
                            fValue=(float)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                            s=(String)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                            iNps=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                            iSleep=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                            j=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
                            evalCnt=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
                            ply=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
                            value=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[7];
                            tmpMove=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[8];
                            move=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[9];
                            lMillies=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[10];
                            secs=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[11];
                            level=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[12];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                            if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                            {
                                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
                        }
                    }
                }
                catch(Exception ex)
                {
                    ex.printStackTrace(System.out);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483634)
    private Object run_MANAGED_object_COMPILER_METHOD_17(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SearchAlgorithmRunner)getFirstLatticeManagedObject()).run_MANAGED_object_COMPILER_METHOD_17($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483634,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483634))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$;
GameControl m_control;
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                m_control=(GameControl)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                try
                {
                    if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                    {
JNI _jni;
GameControlWrapper m_control_wrapper;
                        _jni=(JNI)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                        m_control_wrapper=(GameControlWrapper)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                        if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                        {
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                            if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                            {
                                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
int level=((int)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
int[] secs={1, 1, 2, 4, 8, 10, 20, 30, 60, 300, 900, 1800};
                            _jni.searchMove(secs[level]);
long lMillies=System.currentTimeMillis();
int move=0;
int tmpMove=0;
int value=0;
int ply=1;
int evalCnt=0;
int j=0;
int iSleep=1000;
int iNps=0;
String s="";
float fValue=0.0f;
                            while(_jni.peekSearchDone()== 0)
                            {
                                Thread.sleep(iSleep);
                                ply=_jni.peekSearchDepth();
                                value=_jni.peekSearchBestValue();
                                evalCnt=_jni.getEvalCount();
                                fValue=(float)value/ 100.0F;
                                s="";
                                if(ply> 5)
                                {
                                    ply=5;
                                }
                                for(j=0; j<ply; j++)
                                {
                                    tmpMove=_jni.peekSearchBestMove(j);
                                    if(tmpMove!= 0)
                                    {
                                        s+=Move.toDbgString(tmpMove).replace("[", "").replace("]", "")+ " ";
                                    }
                                }
                                if(ply== 5)
                                {
                                    s+= "...";
                                }
                                s=s+ "\n\t" +String.format("%.2f", fValue);
                                if(true)
                                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483636, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                    m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                    return null;
                                }
                                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                {
    throw new TimeOutException();
                                }
                            }
                            move=_jni.getMove();
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,move}, 1, -2146483638, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMoveMessageFromThread(move, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
                            value=_jni.peekSearchBestValue();
                            fValue=(float)value/ 100.0F;
                            evalCnt=_jni.getEvalCount();
                            if(evalCnt== 0)
                            {
                                s="From opening book";
                            }
                            else
                            {
int iTime=(int)((System.currentTimeMillis()-lMillies)/1000);
                                iNps=(int)(evalCnt/iTime);
                                s=iNps+ " N/s (" +iTime+ " s)" + "\n\t" +String.format("%.2f", fValue);
                            }
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483635, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
                        }
                    }
                }
                catch(Exception ex)
                {
                    ex.printStackTrace(System.out);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483633)
    private Object run_MANAGED_object_COMPILER_METHOD_73(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SearchAlgorithmRunner)getFirstLatticeManagedObject()).run_MANAGED_object_COMPILER_METHOD_73($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
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
GameControl m_control;
                m_control=(GameControl)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
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
                m_control=(GameControl)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
                $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
                $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
                try
                {
                    if(true)
                    {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, this,m_control}, 1, -2146483631, true, true, new Object[]{$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                        GameControlWrapper.$_MANAGED_object_COMPILER_CREATE_METHOD_$(this, m_control, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                        return null;
                    }
                    if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                    {
    throw new TimeOutException();
                    }
GameControlWrapper m_control_wrapper=((GameControlWrapper)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                    if(true)
                    {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483643, true, true, new Object[]{m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                        m_control_wrapper.getJNI($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                        return null;
                    }
                    if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                    {
    throw new TimeOutException();
                    }
JNI _jni=((JNI)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                    if(_jni.isEnded()!= 0)
                    {
                        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$, new Object[]{m_control}};
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
                    if(true)
                    {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483642, true, true, new Object[]{_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                        m_control_wrapper.disableControl($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                        return null;
                    }
                    if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                    {
    throw new TimeOutException();
                    }
                    if(true)
                    {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483641, true, true, new Object[]{_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                        m_control_wrapper.getLevelMode($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                        return null;
                    }
                    if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                    {
    throw new TimeOutException();
                    }
                    if(((int)$_MANAGED_object_COMPILER_RETURN_VALUE_$)==GameControl.LEVEL_PLY)
                    {
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483640, true, true, new Object[]{_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            m_control_wrapper.getLevelPly($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
int level=((int)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                        _jni.searchDepth(level);
int move=_jni.getMove();
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,move}, 1, -2146483639, true, true, new Object[]{move,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            m_control_wrapper.sendMoveMessageFromThread(move, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
int evalCnt=_jni.getEvalCount();
String s=null;
                        if(evalCnt== 0)
                        {
                            s="From opening book";
                        }
                        else
                        {
                            s="Searched at " +level+ " ply";
                        }
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483637, true, true, new Object[]{s,evalCnt,move,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
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
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483634, true, true, new Object[]{_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            m_control_wrapper.getLevel($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
int level=((int)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
int[] secs={1, 1, 2, 4, 8, 10, 20, 30, 60, 300, 900, 1800};
                        _jni.searchMove(secs[level]);
long lMillies=System.currentTimeMillis();
int move=0;
int tmpMove=0;
int value=0;
int ply=1;
int evalCnt=0;
int j=0;
int iSleep=1000;
int iNps=0;
String s="";
float fValue=0.0f;
                        while(_jni.peekSearchDone()== 0)
                        {
                            Thread.sleep(iSleep);
                            ply=_jni.peekSearchDepth();
                            value=_jni.peekSearchBestValue();
                            evalCnt=_jni.getEvalCount();
                            fValue=(float)value/ 100.0F;
                            s="";
                            if(ply> 5)
                            {
                                ply=5;
                            }
                            for(j=0; j<ply; j++)
                            {
                                tmpMove=_jni.peekSearchBestMove(j);
                                if(tmpMove!= 0)
                                {
                                    s+=Move.toDbgString(tmpMove).replace("[", "").replace("]", "")+ " ";
                                }
                            }
                            if(ply== 5)
                            {
                                s+= "...";
                            }
                            s=s+ "\n\t" +String.format("%.2f", fValue);
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483636, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
                        }
                        move=_jni.getMove();
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,move}, 1, -2146483638, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            m_control_wrapper.sendMoveMessageFromThread(move, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
                        value=_jni.peekSearchBestValue();
                        fValue=(float)value/ 100.0F;
                        evalCnt=_jni.getEvalCount();
                        if(evalCnt== 0)
                        {
                            s="From opening book";
                        }
                        else
                        {
int iTime=(int)((System.currentTimeMillis()-lMillies)/1000);
                            iNps=(int)(evalCnt/iTime);
                            s=iNps+ " N/s (" +iTime+ " s)" + "\n\t" +String.format("%.2f", fValue);
                        }
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483635, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
                    }
                }
                catch(Exception ex)
                {
                    ex.printStackTrace(System.out);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483632)
    private Object $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_266(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483644,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
        {
    throw new MOPermissionDeniedException();
        }
        $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483644);
        $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
GameControl gc;
        gc=(GameControl)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
        $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
        m_control=gc;
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483631)
    private Object run_MANAGED_object_COMPILER_METHOD_283(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SearchAlgorithmRunner)getFirstLatticeManagedObject()).run_MANAGED_object_COMPILER_METHOD_283($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483631,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483631))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$;
GameControl m_control;
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                m_control=(GameControl)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                try
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
    throw new TimeOutException();
                        }
GameControlWrapper m_control_wrapper=((GameControlWrapper)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483643, true, true, new Object[]{m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            m_control_wrapper.getJNI($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
JNI _jni=((JNI)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                        if(_jni.isEnded()!= 0)
                        {
                            Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$, new Object[]{m_control}};
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
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483642, true, true, new Object[]{_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            m_control_wrapper.disableControl($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483641, true, true, new Object[]{_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            m_control_wrapper.getLevelMode($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
                        if(((int)$_MANAGED_object_COMPILER_RETURN_VALUE_$)==GameControl.LEVEL_PLY)
                        {
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483640, true, true, new Object[]{_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.getLevelPly($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
int level=((int)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                            _jni.searchDepth(level);
int move=_jni.getMove();
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,move}, 1, -2146483639, true, true, new Object[]{move,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMoveMessageFromThread(move, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
int evalCnt=_jni.getEvalCount();
String s=null;
                            if(evalCnt== 0)
                            {
                                s="From opening book";
                            }
                            else
                            {
                                s="Searched at " +level+ " ply";
                            }
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483637, true, true, new Object[]{s,evalCnt,move,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
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
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647}, 1, -2146483634, true, true, new Object[]{_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.getLevel($_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
int level=((int)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
int[] secs={1, 1, 2, 4, 8, 10, 20, 30, 60, 300, 900, 1800};
                            _jni.searchMove(secs[level]);
long lMillies=System.currentTimeMillis();
int move=0;
int tmpMove=0;
int value=0;
int ply=1;
int evalCnt=0;
int j=0;
int iSleep=1000;
int iNps=0;
String s="";
float fValue=0.0f;
                            while(_jni.peekSearchDone()== 0)
                            {
                                Thread.sleep(iSleep);
                                ply=_jni.peekSearchDepth();
                                value=_jni.peekSearchBestValue();
                                evalCnt=_jni.getEvalCount();
                                fValue=(float)value/ 100.0F;
                                s="";
                                if(ply> 5)
                                {
                                    ply=5;
                                }
                                for(j=0; j<ply; j++)
                                {
                                    tmpMove=_jni.peekSearchBestMove(j);
                                    if(tmpMove!= 0)
                                    {
                                        s+=Move.toDbgString(tmpMove).replace("[", "").replace("]", "")+ " ";
                                    }
                                }
                                if(ply== 5)
                                {
                                    s+= "...";
                                }
                                s=s+ "\n\t" +String.format("%.2f", fValue);
                                if(true)
                                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483636, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                    m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                    return null;
                                }
                                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                                {
    throw new TimeOutException();
                                }
                            }
                            move=_jni.getMove();
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,move}, 1, -2146483638, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMoveMessageFromThread(move, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
                            value=_jni.peekSearchBestValue();
                            fValue=(float)value/ 100.0F;
                            evalCnt=_jni.getEvalCount();
                            if(evalCnt== 0)
                            {
                                s="From opening book";
                            }
                            else
                            {
int iTime=(int)((System.currentTimeMillis()-lMillies)/1000);
                                iNps=(int)(evalCnt/iTime);
                                s=iNps+ " N/s (" +iTime+ " s)" + "\n\t" +String.format("%.2f", fValue);
                            }
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,s}, 1, -2146483635, true, true, new Object[]{fValue,s,iNps,iSleep,j,evalCnt,ply,value,tmpMove,move,lMillies,secs,level,_jni,m_control_wrapper,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,m_control,m_control}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                m_control_wrapper.sendMessageFromThread(s, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                            if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                            {
    throw new TimeOutException();
                            }
                        }
                    }
                }
                catch(Exception ex)
                {
                    ex.printStackTrace(System.out);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483630)
    private Object run_MANAGED_object_COMPILER_METHOD_288(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((SearchAlgorithmRunner)getFirstLatticeManagedObject()).run_MANAGED_object_COMPILER_METHOD_288($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
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
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
Object[] result=(Object[])((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                m_control=(GameControl)result[1];
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
public static final int $_MANAGED_object_COMPILER_SearchAlgorithmRunner_$=2147483647;
public static final int $_MANAGED_object_COMPILER_run_ByteArrayWrapper_ManagedObject_$=-2146483646;
public static final int $_MANAGED_object_COMPILER_SearchAlgorithmRunner_GameControl_$=-2146483648;
public static final int $_MANAGED_object_COMPILER_run_GameControl_ByteArrayWrapper_ManagedObject_$=-2146483647;
public static final int $_MANAGED_object_COMPILER_run_$=2147483647;
public static final int $_MANAGED_object_COMPILER_SearchAlgorithmRunner_$_MANAGED_object_COMPILER_DUMMY_VARIABLE_$_$=2147483647;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CREATE_METHOD_$_GameControl_ByteArrayWrapper_ManagedObject_$=-2146483645;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_GameControl_ByteArrayWrapper_ManagedObject_$=-2146483644;
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public void MANAGED_object_COMPILER_RUN(Object[] message, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws Exception, MOPermissionDeniedException, TimeOutException
    {
        switch((int)message[3])
        {
            case -2146483646:
                run((ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483647:
                run((GameControl)message[4], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483645:
                $_MANAGED_object_COMPILER_CREATE_METHOD_$((GameControl)message[4], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483644:
                $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$((GameControl)message[4], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483643:
                run_MANAGED_object_COMPILER_METHOD_2((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483642:
                run_MANAGED_object_COMPILER_METHOD_4((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483641:
                run_MANAGED_object_COMPILER_METHOD_6((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483640:
                run_MANAGED_object_COMPILER_METHOD_8((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483639:
                run_MANAGED_object_COMPILER_METHOD_10((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483638:
                run_MANAGED_object_COMPILER_METHOD_11((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483637:
                run_MANAGED_object_COMPILER_METHOD_13((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483636:
                run_MANAGED_object_COMPILER_METHOD_14((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483635:
                run_MANAGED_object_COMPILER_METHOD_15((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483634:
                run_MANAGED_object_COMPILER_METHOD_17((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483633:
                run_MANAGED_object_COMPILER_METHOD_73((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483632:
                $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_266((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483631:
                run_MANAGED_object_COMPILER_METHOD_283((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483630:
                run_MANAGED_object_COMPILER_METHOD_288((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            default:
                super.MANAGED_object_COMPILER_RUN(message, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
    }
}
 
