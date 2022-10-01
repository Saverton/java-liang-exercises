/**
 * Program to find and display the first 10 square numbers greater than Long.MAX.
 * 
 * @author Scott M.
 * BigSquareInts.java
 */

import java.math.BigInteger;

public class BigSquareInts
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        BigInteger[] ints = new BigInteger[10];
        BigInteger val = new BigInteger("" + (long)Math.sqrt(Long.MAX_VALUE));
        int square = (int)Math.floor(Math.sqrt(Long.MAX_VALUE));
        
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