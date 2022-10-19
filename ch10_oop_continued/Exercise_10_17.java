/**
 * (Square numbers) Find the first ten square numbers that are greater than 
 * Long.MAX_VALUE. A square number is a number in the form of n2. 
 * For example, 4, 9, and 16 are square numbers. Find an efficient approach to run your 
 * program fast.
 * @author Scott M.
 */

import java.math.BigInteger;

public class Exercise_10_17
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        BigInteger[] ints = new BigInteger[10];
        BigInteger val = new BigInteger("" + (long)Math.sqrt(Long.MAX_VALUE));
        
        for (int i = 0; i < ints.length; i++)
        {
            while (val.pow(2).compareTo(new BigInteger("" + Long.MAX_VALUE)) < 0)
            {
                val = val.add(BigInteger.ONE);
            }
            ints[i] = val.pow(2);
            val = val.add(BigInteger.ONE);
        }
        
        for (int i = 0; i < ints.length; i++)
        {
            System.out.println(ints[i]);
        }
    }
}