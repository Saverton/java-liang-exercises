/**
 * (Revise Listing 5.15, PrimeNumber.java) Listing 5.15 determines whether a number 
 * n is prime by checking whether 2, 3, 4, 5, 6, ..., n/2 is a divisor. If a divisor 
 * is found, n is not prime. A more efficient approach is to check whether any of the 
 * prime numbers less than or equal to 2n can divide n evenly. If not, n is prime. 
 * Rewrite Listing 5.15 to display the first 50 prime numbers using this approach. 
 * You need to use an array to store the prime numbers and later use them to check 
 * whether they are possible divisors for n.
 * @author Scott M.
 */

public class Exercise_7_6 {
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
     * Check if a number is prime, use a method by which the number is checked to be divisible by any number less than it's square root.
     * @param num int: the number to check
     * @param primes int[]: array of prime numbers before num
     * @return boolean: true = number is prime, false otherwise
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
     * Print an array with 10 elements per line.
     * @param array int[]: array of integers
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(((i + 1) % 10 == 0) ? array[i] + "\n" : array[i] + " ");
        }
    }
}