package RT;

import java.util.Arrays;

public class IDIntegerArrayWrapper 
{
	
	int[] intArr;

    public IDIntegerArrayWrapper(int[] intAr)
    {
        intArr=new int[15];
        intArr[0]=intAr[0];
        intArr[1]=intAr[1];
        intArr[2]=intAr[3];
        System.arraycopy(intAr, 5, intArr, 3, intArr.length-3);
    }

    @Override
    public boolean equals(Object other)
    {
        if (!(other instanceof IDIntegerArrayWrapper))
        {
            return false;
        }
        return Arrays.equals(intArr, ((IDIntegerArrayWrapper)other).intArr);
    }

    @Override
    public int hashCode()
    {
        return Arrays.hashCode(intArr);
    }

}
