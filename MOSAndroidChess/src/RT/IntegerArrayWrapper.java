package RT;

import java.io.Serializable;
import java.util.Arrays;

public final class IntegerArrayWrapper implements Serializable 
{
	
    int[] intArr;

    public IntegerArrayWrapper(int[] intAr)
    {
        intArr=intAr;
    }

    @Override
    public boolean equals(Object other)
    {
        if (!(other instanceof IntegerArrayWrapper))
        {
            return false;
        }
        return Arrays.equals(intArr, ((IntegerArrayWrapper)other).intArr);
    }

    @Override
    public int hashCode()
    {
        return Arrays.hashCode(intArr);
    }
    
}
