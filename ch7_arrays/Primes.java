/**
 * Program to use a more efficient approach to finding prime numbers.
 * 
 * @author Scott M.
 * Primes.java
 */

public class Primes {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
         int[] primes = new int[50];
         int num = 2;
         
         //1. Check numbers starting from 2, check if sqrt is divisible by any number in the primes array.
         for (int i = 0; i < 50; num++) {
             if (isPrime(num, primes)) {
                 primes[i] = num;
                 i++;
             }
         }
         
         //2. Print primes array
         printArray(primes);
    }
    /**
     * Method to determine if a number is prime by seeing if any primes less than sqrt(n) can divide n.
     */
    public static boolean isPrime(int num, int[] primes) {
        for (int i = 0; i < 50; i++) {
            if (primes[i] != 0 && primes[i] <= Math.sqrt(num) && num % primes[i] == 0) {
                return false;
            }
        }
        return true;
    }
    /**
     * Method to print an array with 10 elements per line.
     */
    public static void printArray(int[] primes) {
        for (int i = 0; i < primes.length; i++) {
            System.out.print(((i + 1) % 10 == 0) ? primes[i] + "\n" : primes[i] + " ");
        }
    }
}