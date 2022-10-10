/**
 * (Twin primes) Twin primes are a pair of prime numbers that differ by 2. For example, 
 * 3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are twin primes. 
 * Write a program to find all twin primes less than 1,000. Display the output as follows:
 * (3, 5)
 * (5, 7)
 * ...
 * @author Scott M.
 */

public class Exercise_6_29 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (isTwinPrime(i)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
    /**
     * Method to check if a number has a twin prime.
     * @param int: number
     * @return boolean: true = number has a twin prime, false otherwise
     */
    public static boolean isTwinPrime(int num) {
        return isPrime(num) && isPrime(num + 2);
    }
    /**
     * Return whether or not a number is prime.
     * @param int: number
     * @return boolean: true = number is prime, false otherwise
     */
    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2.0; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}