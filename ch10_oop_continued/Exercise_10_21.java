/**
 * (Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE
 * that are divisible by 5 or 6.
 * @author Scott M.
 */

import java.math.BigInteger;

public class Exercise_10_21
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        BigInteger[] ints = new BigInteger[10];
        BigInteger val = new BigInteger("" + Long.MAX_VALUE);
        
        for (int i = 0; i < ints.length; i++)
        {
            while (!(val.remainder(new BigInteger("5")).equals(new BigInteger("0")) || val.remainder(new BigInteger("6")).equals(new BigInteger("0"))))
            {
               val = val.add(BigInteger.ONE);
            }
            ints[i] = val;
            val = val.add(BigInteger.ONE);
        }
        
        for (int i = 0; i < ints.length; i++)
        {
            System.out.println(ints[i]);
        }
    }
}