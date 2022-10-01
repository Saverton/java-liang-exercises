/**
 * Program to find and display the first 10 integers with 50 digits that are divisible by
 * either 2 or 3.
 * 
 * @author Scott M.
 * BigIntsDivisible.java
 */

import java.math.BigInteger;

public class BigIntsDivisible
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        BigInteger[] ints = new BigInteger[10];
        String bigInt = "1";
        for (int i = 0; i < 49; i++)
        {
            bigInt += "0";
        }
        
        BigInteger val = new BigInteger(bigInt);
        for (int i = 0; i < ints.length; i++)
        {
            while (!(val.remainder(new BigInteger("2")).equals(new BigInteger("0")) || val.remainder(new BigInteger("3")).equals(new BigInteger("0"))))
            {
               val = val.add(new BigInteger("1"));
            }
            ints[i] = val;
            val = val.add(new BigInteger("1"));
        }
        
        for (int i = 0; i < ints.length; i++)
        {
            System.out.println(ints[i]);
        }
    }
}