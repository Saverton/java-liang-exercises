/**
 * (Mersenne prime) A prime number is called a Mersenne prime if it can be written 
 * in the form 2p - 1 for some positive integer p. Write a program that finds 
 * all Mersenne primes with p … 100 and displays the output as shown below. 
 *          p   2^p – 1
 *          2   3
 *          3   7
 *          5   31
 *          ...
 * @author Scott M.
 */

import java.math.BigInteger;

public class Exercise_10_19
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        BigInteger[] primes = new BigInteger[99];
        int p;
        
        for (int i = 0; i < primes.length; i++)
        {
            p = i + 2;
            if (new BigInteger("2").pow(p).subtract(BigInteger.ONE).isProbablePrime(1))
            {
                primes[i] = new BigInteger("2").pow(p).subtract(BigInteger.ONE);
            }
        }
        
        System.out.print("p\t2^p - 1\n\n");
        for (int i = 0; i < primes.length; i++)
        {
            if (primes[i] != null)
            {
                System.out.print((i + 2) + "\t");
                System.out.println(primes[i]);
            }
        }
    }
}