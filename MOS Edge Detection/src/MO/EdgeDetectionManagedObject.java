package MO;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import MO.ManagedObject;
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
import RT.HSystem;

public class EdgeDetectionManagedObject extends ManagedObject

{

public static final byte[] $_MANAGED_object_COMPILER_CLASS_ID_$=new byte[]{-67, 28, -51, -10, -72, 4, 0, -32, -26, -103, -55, 50, 2, 83, -127, 52, -31, -61, -67, 95, 5, -85, 61, 87, 89, 55, 68, 114, 124, -68, 64, -100};
static final long serialVersionUID=-4819751041660354336L;
    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public EdgeDetectionManagedObject() throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(EdgeDetectionManagedObject.class))
        {
            addPermission(permission, null, this);
        }
    }

    @MOCompilerControl(checkLink=true, checkShell=true, compile=true, checkCloned=false, checkPermission=true, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=true, timeEfficiency=true, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483645)
    public Object run(byte[] imageData, int height, int width, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws IOException, MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((EdgeDetectionManagedObject)getFirstLatticeManagedObject()).run(imageData, height, width, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483645,imageData,height,width,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483645))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483645,imageData,height,width,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483645);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
                $_MANAGED_object_COMPILER_DATA_$.maxIntelligenceCounter();
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483645,imageData,height,width,numberTimesRun}, 1, -2146483636, true, true, new Object[]{width,height,imageData}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    run(imageData, height, width, numberTimesRun, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                    return null;
                }
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
Object[] result=(Object[])((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                numberTimesRun=(long)result[0];
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

    
public static long numberTimesRun=0;
    
    
    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483648)
    public EdgeDetectionManagedObject(ManagedObject creator) throws TimeOutException, MOPermissionDeniedException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(EdgeDetectionManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(creator, new ByteArrayWrapper(), HSystem.mothreads[0]);
    }

    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483647)
    public Object run(byte[] imageData, int height, int width, long numberTimesRun, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws IOException, MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((EdgeDetectionManagedObject)getFirstLatticeManagedObject()).run(imageData, height, width, numberTimesRun, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,imageData,height,width,numberTimesRun,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483647))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,imageData,height,width,numberTimesRun,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483647);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,imageData,height,width,numberTimesRun}, null, false}, 1, -2146483639, true, true, new Object[]{numberTimesRun,width,height,imageData,numberTimesRun}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=intelligence(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,imageData,height,width,numberTimesRun}, null, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
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
                imageData=(byte[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
                height=(int)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[5];
                width=(int)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[6];
                numberTimesRun=(long)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[7];
                $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
                $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
                if(HSystem.offload(this, -2146483647))
                {
int[] searchAttributes=new int[5];
                    System.arraycopy(getAttributesShell($_MANAGED_object_COMPILER_DATA_$, this), 0, searchAttributes, 0, 2);
                    searchAttributes[2]=Integer.MIN_VALUE;
                    searchAttributes[4]=Integer.MIN_VALUE;
Node[] offloadTarget=latticeSearchLocalMOLink(searchAttributes, new int[0], null, new int[]{1, 1, 1, 0, 1}, 2, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
                    if(offloadTarget.length>0 && !HSystem.SID.equalsSID(offloadTarget[0].mO.getSID()) && offloadTarget[0].mO instanceof EdgeDetectionManagedObject)
                    {
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,imageData,height,width,numberTimesRun}, 1, -2146483635, true, true, new Object[]{offloadTarget,searchAttributes,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,numberTimesRun,width,height,imageData,numberTimesRun}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            ((EdgeDetectionManagedObject)offloadTarget[0].mO).run(imageData, height, width, numberTimesRun, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
                        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$)};
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
                    if(offloadTarget.length>1 && !HSystem.SID.equalsSID(offloadTarget[1].mO.getSID()) && offloadTarget[1].mO instanceof EdgeDetectionManagedObject)
                    {
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,imageData,height,width,numberTimesRun}, 1, -2146483634, true, true, new Object[]{offloadTarget,searchAttributes,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,numberTimesRun,width,height,imageData,numberTimesRun}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            ((EdgeDetectionManagedObject)offloadTarget[1].mO).run(imageData, height, width, numberTimesRun, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
                        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$)};
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
                while(true)
                {
                    if(true)
                    {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,imageData,height,width}, 1, -2146483642, true, true, new Object[]{$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,numberTimesRun,width,height,imageData,numberTimesRun}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                        detectEdges(imageData, height, width, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                        return null;
                    }
                    if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                    {
    throw new TimeOutException();
                    }
                    numberTimesRun++;
                }
            }
            else
            {
                return null;
            }
        }
    }

    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483646)
    public Object detectEdges(byte[] imageData, int height, int width, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws IOException, MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((EdgeDetectionManagedObject)getFirstLatticeManagedObject()).detectEdges(imageData, height, width, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,imageData,height,width,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483646))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,imageData,height,width,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483646);
Object $_MANAGED_object_COMPILER_RETURN_VALUE_$=null;
                if(true)
                {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,imageData,height,width}, null, false}, 1, -2146483638, true, true, new Object[]{width,height,imageData,numberTimesRun}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                    $_MANAGED_object_COMPILER_RETURN_VALUE_$=intelligence(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,imageData,height,width}, null, false, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
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
                imageData=(byte[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
                height=(int)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[5];
                width=(int)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[6];
                $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
                $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
                if(HSystem.offload(this, -2146483646))
                {
int[] searchAttributes=new int[5];
                    System.arraycopy(getAttributesShell($_MANAGED_object_COMPILER_DATA_$, this), 0, searchAttributes, 0, 2);
                    searchAttributes[2]=Integer.MIN_VALUE;
                    searchAttributes[4]=Integer.MIN_VALUE;
Node[] offloadTarget=latticeSearchLocalMOLink(searchAttributes, new int[0], null, new int[]{1, 1, 1, 0, 1}, 2, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
                    if(offloadTarget.length>0 && !HSystem.SID.equalsSID(offloadTarget[0].mO.getSID()) && offloadTarget[0].mO instanceof EdgeDetectionManagedObject)
                    {
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,imageData,height,width}, 1, -2146483641, true, true, new Object[]{offloadTarget,searchAttributes,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,width,height,imageData,numberTimesRun}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            ((EdgeDetectionManagedObject)offloadTarget[0].mO).detectEdges(imageData, height, width, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
                        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,((byte[])$_MANAGED_object_COMPILER_RETURN_VALUE_$)};
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
                    if(offloadTarget.length>1 && !HSystem.SID.equalsSID(offloadTarget[1].mO.getSID()) && offloadTarget[1].mO instanceof EdgeDetectionManagedObject)
                    {
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,imageData,height,width}, 1, -2146483640, true, true, new Object[]{offloadTarget,searchAttributes,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,width,height,imageData,numberTimesRun}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            ((EdgeDetectionManagedObject)offloadTarget[1].mO).detectEdges(imageData, height, width, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
                        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,((byte[])$_MANAGED_object_COMPILER_RETURN_VALUE_$)};
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
Mat imgSource=new Mat(height, width, CvType.CV_8UC3);
                imgSource.put(0, 0, imageData);
                Imgproc.cvtColor(imgSource, imgSource, Imgproc.COLOR_BGR2GRAY);
                Imgproc.Canny(imgSource, imgSource, 0.5, 1.0);
byte[] return_buff=new byte[(int)(imgSource.total()*imgSource.channels())];
                imgSource.get(0, 0, return_buff);
                Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,return_buff};
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
    public void run(byte[] imageData, int height, int width) throws IOException
    {
        try
        {
            run(imageData, height, width, new ByteArrayWrapper(), this);
        }
        catch(MOPermissionDeniedException|TimeOutException e)
        {
        }
    }

        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483646)
    public byte[] detectEdges(byte[] imageData, int height, int width) throws IOException
    {
Mat imgSource=new Mat(height, width, CvType.CV_8UC3);
        imgSource.put(0, 0, imageData);
        Imgproc.cvtColor(imgSource, imgSource, Imgproc.COLOR_BGR2GRAY);
        Imgproc.Canny(imgSource, imgSource, 0.5, 1.0);
byte[] return_buff=new byte[(int)(imgSource.total()*imgSource.channels())];
        imgSource.get(0, 0, return_buff);
        return return_buff;
    }
    @MOCompilerControl(checkLink=false, checkShell=false, compile=false, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    private EdgeDetectionManagedObject($_MANAGED_object_COMPILER_DUMMY_VARIABLE_$ $_MANAGED_object_COMPILER_DUMMY_variable_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(ManagedObject.class))
        {
            addPermission(permission, null, this);
        }
        for(CompareMessage[] permission: HSystem.getDefaultPermission(EdgeDetectionManagedObject.class))
        {
            addPermission(permission, null, this);
        }
    }

    @MOCompilerControl(checkLink=false, checkShell=false, compile=true, checkCloned=false, checkPermission=false, intelligenceBefore=false, intelligenceAfter=false, aggregateReturn=false, timeEfficiency=false, offload=false)
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483644)
    public static   Object $_MANAGED_object_COMPILER_CREATE_METHOD_$(ManagedObject creator, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
EdgeDetectionManagedObject $_MANAGED_object_COMPILER_CREATED_Object_$=new EdgeDetectionManagedObject(new $_MANAGED_object_COMPILER_DUMMY_VARIABLE_$());
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
    public EdgeDetectionManagedObject $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(ManagedObject creator, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
    {
        for(CompareMessage[] permission: HSystem.getDefaultPermission(EdgeDetectionManagedObject.class))
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
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483643,creator}, 1, -2146483637, true, true, new Object[]{creator,numberTimesRun}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
            super.$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$(creator, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;            return null;
        }
        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
        {
    throw new TimeOutException();
        }
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
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

    
        @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483642)
    private Object run_MANAGED_object_COMPILER_METHOD_4(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws IOException, MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((EdgeDetectionManagedObject)getFirstLatticeManagedObject()).run_MANAGED_object_COMPILER_METHOD_4($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
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
long numberTimesRun;
int width;
int height;
byte[] imageData;
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                numberTimesRun=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                width=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                height=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                imageData=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
                while($_MANAGED_object_COMPILER_FIRST_LOOP_$ || (true))
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
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                        if($_MANAGED_object_COMPILER_FIRST_LOOP_$)
                        {
                            $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                        }
                        else
                        {
                            if(true)
                            {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,imageData,height,width}, 1, -2146483642, true, true, new Object[]{$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,numberTimesRun,width,height,imageData,numberTimesRun}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                                detectEdges(imageData, height, width, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                                return null;
                            }
                        }
                    }
                    if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                    {
    throw new TimeOutException();
                    }
                    numberTimesRun++;
                }
                Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$, new Object[]{numberTimesRun}};
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
    private Object detectEdges_MANAGED_object_COMPILER_METHOD_5(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws IOException, MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((EdgeDetectionManagedObject)getFirstLatticeManagedObject()).detectEdges_MANAGED_object_COMPILER_METHOD_5($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
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
Object[] $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$;
int width;
int height;
byte[] imageData;
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                width=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                height=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
                imageData=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
Node[] offloadTarget;
int[] searchAttributes;
                offloadTarget=(Node[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                searchAttributes=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
                Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,((byte[])$_MANAGED_object_COMPILER_RETURN_VALUE_$)};
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
    private Object detectEdges_MANAGED_object_COMPILER_METHOD_6(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws IOException, MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((EdgeDetectionManagedObject)getFirstLatticeManagedObject()).detectEdges_MANAGED_object_COMPILER_METHOD_6($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
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
int width;
int height;
byte[] imageData;
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                width=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                height=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
                imageData=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
Node[] offloadTarget;
int[] searchAttributes;
                offloadTarget=(Node[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                searchAttributes=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
                Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,((byte[])$_MANAGED_object_COMPILER_RETURN_VALUE_$)};
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
    private Object run_MANAGED_object_COMPILER_METHOD_58(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws IOException, MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((EdgeDetectionManagedObject)getFirstLatticeManagedObject()).run_MANAGED_object_COMPILER_METHOD_58($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
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
long numberTimesRun;
int width;
int height;
byte[] imageData;
                numberTimesRun=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                width=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                height=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                imageData=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
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
                imageData=(byte[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
                height=(int)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[5];
                width=(int)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[6];
                numberTimesRun=(long)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[7];
                $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
                $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
                if(HSystem.offload(this, -2146483647))
                {
int[] searchAttributes=new int[5];
                    System.arraycopy(getAttributesShell($_MANAGED_object_COMPILER_DATA_$, this), 0, searchAttributes, 0, 2);
                    searchAttributes[2]=Integer.MIN_VALUE;
                    searchAttributes[4]=Integer.MIN_VALUE;
Node[] offloadTarget=latticeSearchLocalMOLink(searchAttributes, new int[0], null, new int[]{1, 1, 1, 0, 1}, 2, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
                    if(offloadTarget.length>0 && !HSystem.SID.equalsSID(offloadTarget[0].mO.getSID()) && offloadTarget[0].mO instanceof EdgeDetectionManagedObject)
                    {
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,imageData,height,width,numberTimesRun}, 1, -2146483635, true, true, new Object[]{offloadTarget,searchAttributes,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,numberTimesRun,width,height,imageData,numberTimesRun}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            ((EdgeDetectionManagedObject)offloadTarget[0].mO).run(imageData, height, width, numberTimesRun, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
                        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$)};
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
                    if(offloadTarget.length>1 && !HSystem.SID.equalsSID(offloadTarget[1].mO.getSID()) && offloadTarget[1].mO instanceof EdgeDetectionManagedObject)
                    {
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,imageData,height,width,numberTimesRun}, 1, -2146483634, true, true, new Object[]{offloadTarget,searchAttributes,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,numberTimesRun,width,height,imageData,numberTimesRun}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            ((EdgeDetectionManagedObject)offloadTarget[1].mO).run(imageData, height, width, numberTimesRun, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
                        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$)};
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
                while(true)
                {
                    if(true)
                    {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483647,imageData,height,width}, 1, -2146483642, true, true, new Object[]{$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,numberTimesRun,width,height,imageData,numberTimesRun}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                        detectEdges(imageData, height, width, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                        return null;
                    }
                    if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                    {
    throw new TimeOutException();
                    }
                    numberTimesRun++;
                }
            }
            else
            {
                return null;
            }
        }
    }
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483638)
    private Object detectEdges_MANAGED_object_COMPILER_METHOD_59(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws IOException, MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((EdgeDetectionManagedObject)getFirstLatticeManagedObject()).detectEdges_MANAGED_object_COMPILER_METHOD_59($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483638,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483638))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483646);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
int width;
int height;
byte[] imageData;
                width=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                height=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                imageData=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
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
                imageData=(byte[])$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[4];
                height=(int)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[5];
                width=(int)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[6];
                $_MANAGED_object_COMPILER_DATA_$=(ByteArrayWrapper)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[0];
                $_MANAGED_object_RETURN_MANAGED_OBJECT_$=(ManagedObject)$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$[1];
                if(HSystem.offload(this, -2146483646))
                {
int[] searchAttributes=new int[5];
                    System.arraycopy(getAttributesShell($_MANAGED_object_COMPILER_DATA_$, this), 0, searchAttributes, 0, 2);
                    searchAttributes[2]=Integer.MIN_VALUE;
                    searchAttributes[4]=Integer.MIN_VALUE;
Node[] offloadTarget=latticeSearchLocalMOLink(searchAttributes, new int[0], null, new int[]{1, 1, 1, 0, 1}, 2, HSystem.defaultNumCheckNodes, false, $_MANAGED_object_COMPILER_DATA_$, this);
                    if(offloadTarget.length>0 && !HSystem.SID.equalsSID(offloadTarget[0].mO.getSID()) && offloadTarget[0].mO instanceof EdgeDetectionManagedObject)
                    {
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,imageData,height,width}, 1, -2146483641, true, true, new Object[]{offloadTarget,searchAttributes,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,width,height,imageData,numberTimesRun}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            ((EdgeDetectionManagedObject)offloadTarget[0].mO).detectEdges(imageData, height, width, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
                        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,((byte[])$_MANAGED_object_COMPILER_RETURN_VALUE_$)};
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
                    if(offloadTarget.length>1 && !HSystem.SID.equalsSID(offloadTarget[1].mO.getSID()) && offloadTarget[1].mO instanceof EdgeDetectionManagedObject)
                    {
                        if(true)
                        {
ByteArrayWrapper $_MANAGED_object_COMPILER_CALL_DATA_$=addToAggregate($_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$, new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483646,imageData,height,width}, 1, -2146483640, true, true, new Object[]{offloadTarget,searchAttributes,$_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$,width,height,imageData,numberTimesRun}, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
                            ((EdgeDetectionManagedObject)offloadTarget[1].mO).detectEdges(imageData, height, width, $_MANAGED_object_COMPILER_CALL_DATA_$, this);
;                            return null;
                        }
                        if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                        {
    throw new TimeOutException();
                        }
                        Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,((byte[])$_MANAGED_object_COMPILER_RETURN_VALUE_$)};
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
Mat imgSource=new Mat(height, width, CvType.CV_8UC3);
                imgSource.put(0, 0, imageData);
                Imgproc.cvtColor(imgSource, imgSource, Imgproc.COLOR_BGR2GRAY);
                Imgproc.Canny(imgSource, imgSource, 0.5, 1.0);
byte[] return_buff=new byte[(int)(imgSource.total()*imgSource.channels())];
                imgSource.get(0, 0, return_buff);
                Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,return_buff};
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483637)
    private Object $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_266(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws MOPermissionDeniedException, TimeOutException
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
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
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
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=true, $_MANAGED_object_COMPILER_RUN_Number_$=-2146483636)
    private Object run_MANAGED_object_COMPILER_METHOD_298(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws IOException, MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((EdgeDetectionManagedObject)getFirstLatticeManagedObject()).run_MANAGED_object_COMPILER_METHOD_298($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
        else
        {
            if(!checkMOLink(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483636,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_COMPILER_CLASS_ID_$, -2146483636))
            {
                if(!checkPermission(new Object[]{$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$, this, -2146483645,$_MANAGED_object_COMPILER_RETURN_VALUE_$,$_MANAGED_object_COMPILER_RETURN_STATE_$,$_MANAGED_object_COMPILER_DATA_$,$_MANAGED_object_RETURN_MANAGED_OBJECT_$},$_MANAGED_object_RETURN_MANAGED_OBJECT_$))
                {
    throw new MOPermissionDeniedException();
                }
                $_MANAGED_object_COMPILER_DATA_$.setRunNumber(-2146483645);
                $_MANAGED_object_COMPILER_RETURN_VALUE_$=ManagedObjectUtilities.messAgree((Object[])$_MANAGED_object_COMPILER_RETURN_VALUE_$);
boolean $_MANAGED_object_COMPILER_FIRST_LOOP_$=true;
int width;
int height;
byte[] imageData;
                width=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                height=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
                imageData=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
Object[] result=(Object[])((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$);
                numberTimesRun=(long)result[0];
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
    private Object run_MANAGED_object_COMPILER_METHOD_299(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws IOException, MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((EdgeDetectionManagedObject)getFirstLatticeManagedObject()).run_MANAGED_object_COMPILER_METHOD_299($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
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
long numberTimesRun;
int width;
int height;
byte[] imageData;
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                numberTimesRun=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                width=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
                height=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
                imageData=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
Node[] offloadTarget;
int[] searchAttributes;
                offloadTarget=(Node[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                searchAttributes=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
                Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$)};
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
    private Object run_MANAGED_object_COMPILER_METHOD_300(Object $_MANAGED_object_COMPILER_RETURN_VALUE_$, Object[] $_MANAGED_object_COMPILER_RETURN_STATE_$, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws IOException, MOPermissionDeniedException, TimeOutException
    {
        if(mOAttributes==null && getFirstLatticeManagedObject()!=null)
        {
            return ((EdgeDetectionManagedObject)getFirstLatticeManagedObject()).run_MANAGED_object_COMPILER_METHOD_300($_MANAGED_object_COMPILER_RETURN_VALUE_$, $_MANAGED_object_COMPILER_RETURN_STATE_$, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
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
long numberTimesRun;
int width;
int height;
byte[] imageData;
                $_MANAGED_object_COMPILER_INTELLIGENCE_MESSAGE_$=(Object[])$_MANAGED_object_COMPILER_RETURN_STATE_$[2];
                numberTimesRun=(long)$_MANAGED_object_COMPILER_RETURN_STATE_$[3];
                width=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[4];
                height=(int)$_MANAGED_object_COMPILER_RETURN_STATE_$[5];
                imageData=(byte[])$_MANAGED_object_COMPILER_RETURN_STATE_$[6];
Node[] offloadTarget;
int[] searchAttributes;
                offloadTarget=(Node[])$_MANAGED_object_COMPILER_RETURN_STATE_$[0];
                searchAttributes=(int[])$_MANAGED_object_COMPILER_RETURN_STATE_$[1];
Object $_MANAGED_object_COMPILER_VARIABLE_0_$=null;
                $_MANAGED_object_COMPILER_FIRST_LOOP_$=false;
                if($_MANAGED_object_COMPILER_RETURN_VALUE_$ instanceof TimeOutObject)
                {
    throw new TimeOutException();
                }
                Object[] $_MANAGED_object_COMPILER_RETURN_MESSAGE_$=new Object[]{$_MANAGED_object_COMPILER_DATA_$, this,$_MANAGED_object_RETURN_MANAGED_OBJECT_$,$_MANAGED_object_COMPILER_aggregateThenCall_Object$$_ByteArrayWrapper_ManagedObject_$,((Object)$_MANAGED_object_COMPILER_RETURN_VALUE_$)};
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
public static final int $_MANAGED_object_COMPILER_EdgeDetectionManagedObject_$=2147483647;
public static final int $_MANAGED_object_COMPILER_run_byte$$_int_int_ByteArrayWrapper_ManagedObject_$=-2146483645;
public static final int $_MANAGED_object_COMPILER_EdgeDetectionManagedObject_ManagedObject_$=-2146483648;
public static final int $_MANAGED_object_COMPILER_run_byte$$_int_int_long_ByteArrayWrapper_ManagedObject_$=-2146483647;
public static final int $_MANAGED_object_COMPILER_detectEdges_byte$$_int_int_ByteArrayWrapper_ManagedObject_$=-2146483646;
public static final int $_MANAGED_object_COMPILER_run_byte$$_int_int_$=2147483647;
public static final int $_MANAGED_object_COMPILER_detectEdges_byte$$_int_int_$=-2146483646;
public static final int $_MANAGED_object_COMPILER_EdgeDetectionManagedObject_$_MANAGED_object_COMPILER_DUMMY_VARIABLE_$_$=2147483647;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CREATE_METHOD_$_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2146483644;
public static final int $_MANAGED_object_COMPILER_$_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_ManagedObject_ByteArrayWrapper_ManagedObject_$=-2146483643;
    @$_MANAGED_OBJECT_COMPILER_ANNOTATION_$($_SEND_STOPPED_$=false, $_MANAGED_object_COMPILER_RUN_Number_$=2147483647)
    public void MANAGED_object_COMPILER_RUN(Object[] message, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject $_MANAGED_object_RETURN_MANAGED_OBJECT_$) throws Exception, MOPermissionDeniedException, TimeOutException
    {
        switch((int)message[3])
        {
            case -2146483645:
                run((byte[])message[4], (int)message[5], (int)message[6], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483647:
                run((byte[])message[4], (int)message[5], (int)message[6], (long)message[7], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483646:
                detectEdges((byte[])message[4], (int)message[5], (int)message[6], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483644:
                $_MANAGED_object_COMPILER_CREATE_METHOD_$((ManagedObject)message[4], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483643:
                $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$((ManagedObject)message[4], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483642:
                run_MANAGED_object_COMPILER_METHOD_4((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483641:
                detectEdges_MANAGED_object_COMPILER_METHOD_5((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483640:
                detectEdges_MANAGED_object_COMPILER_METHOD_6((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483639:
                run_MANAGED_object_COMPILER_METHOD_58((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483638:
                detectEdges_MANAGED_object_COMPILER_METHOD_59((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483637:
                $_MANAGED_object_COMPILER_CONSTRUCTOR_METHOD_$_MANAGED_object_COMPILER_METHOD_266((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483636:
                run_MANAGED_object_COMPILER_METHOD_298((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483635:
                run_MANAGED_object_COMPILER_METHOD_299((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            case -2146483634:
                run_MANAGED_object_COMPILER_METHOD_300((Object)message[4], (Object[])message[5], (ByteArrayWrapper)message[0], (ManagedObject)message[1]);
                break;
            default:
                super.MANAGED_object_COMPILER_RUN(message, $_MANAGED_object_COMPILER_DATA_$, $_MANAGED_object_RETURN_MANAGED_OBJECT_$);
        }
    }
}

