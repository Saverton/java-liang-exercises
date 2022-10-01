/**
 * Program to display all sets of twin primes less than 1,000.
 * 
 * @author Scott M.
 * TwinPrime.java
 */

public class TwinPrime {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (PalindromicPrime.isPrime(i) && isTwinPrime(i)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
    /**
     * Method to check if prime + 2 is prime.
     */
    public static boolean isTwinPrime(int num) {
        num += 2;
        return PalindromicPrime.isPrime(num);
    }
}