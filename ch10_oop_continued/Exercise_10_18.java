/**
 * (Large prime numbers) Write a program that finds five prime numbers larger 
 * than Long.MAX_VALUE.
 * @author Scott M.
 */

import java.math.BigInteger;

public class Exercise_10_18 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        BigInteger[] primes = new BigInteger[5];
        BigInteger counter = new BigInteger("" + Long.MAX_VALUE);

        for (int i = 0; i < primes.length; i++) {
            // keep incrementing counter until it is prime
            while(!counter.isProbablePrime(10)) {
                counter = counter.add(BigInteger.ONE);
            }
            primes[i] = new BigInteger(counter.toString()); // copy the prime BigInteger into the list of primes
            counter = counter.add(BigInteger.ONE); // ensure that new numbers are found by not repeating a prime check on the current number
        }

        System.out.println("The first five prime numbers after " + Long.MAX_VALUE + " are:");
        System.out.print("[");
        for (int i = 0; i < primes.length; i++) {
            System.out.print(((i == 0) ? "" : ", ") + primes[i]);
        }
        System.out.print("]");
    }
}
