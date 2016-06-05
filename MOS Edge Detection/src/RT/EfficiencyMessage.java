/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RT;

import java.io.Serializable;

/**
 *
 * @author C
 */
public class EfficiencyMessage implements Serializable, Comparable<EfficiencyMessage> 
{

    public Object[] effMessage;
    
    public EfficiencyMessage(Object[] eM)
    {
        effMessage=eM;
    }
    
    @Override
    public int compareTo(EfficiencyMessage eM) 
    {
        return (int)((long)effMessage[9]-(long)eM.effMessage[9]);
    }
    
}
