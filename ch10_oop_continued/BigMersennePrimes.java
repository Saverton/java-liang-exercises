/**
 * Program to find and display all Mersenne primes (2^p - 1) for values of p from 2 - 100.
 * 
 * @author Scott M.
 * BigMersennePrimes.java
 */

import java.math.BigInteger;

public class BigMersennePrimes
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