/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RT;

import java.io.Serializable;

import MO.ManagedObject;

/**
 *
 * @author C
 */

public class Node implements Comparable<Node>, Serializable
{
    
    public ManagedObject mO;
    public long[] distance=new long[]{Long.MAX_VALUE, Long.MAX_VALUE};
    public long[] rangeDist=new long[]{Long.MAX_VALUE, Long.MAX_VALUE};
    public long addedTime;
    public long numTimesBest;
    public Node parentNode=null;
    
    public Node(ManagedObject mo)
    {
        mO=mo;
        addedTime=System.nanoTime();
        numTimesBest=1;
    }
    
    public Node(ManagedObject mo, long time)
    {
        mO=mo;
        addedTime=time;
        numTimesBest=1;        
    }
    
    @Override
    public int compareTo(Node n2) 
    {
    	if(mO.compareTo(n2.mO)==0)
    	{
    		return 0;
    	}
    	else if(rangeDist[1]>n2.rangeDist[1])
        {
            return 1;     
        }
        else if(rangeDist[1]<n2.rangeDist[1])
        {
            return -1;
        }
        else if(rangeDist[0]>n2.rangeDist[0])
        {
            return 1;     
        }
        else if(rangeDist[0]<n2.rangeDist[0])
        {
            return -1;
        }
        else if(distance[1]>n2.distance[1])
        {
            return 1;     
        }
        else if(distance[1]<n2.distance[1])
        {
            return -1;
        }
        else if(distance[0]>n2.distance[0])
        {
            return 1;     
        }
        else if(distance[0]<n2.distance[0])
        {
            return -1;
        }
        else 
        {
        	return mO.compareTo(n2.mO);     
        }     
    }
 
}
