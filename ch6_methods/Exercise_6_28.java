/**
 * (Mersenne prime) A prime number is called a Mersenne prime if it can be written 
 * in the form 2^p - 1 for some positive integer p. Write a program that finds all 
 * Mersenne primes with p … 31 and displays the output as follows:
 *      p    2^p–1
 *      2    3
 *      3    7
 *      5    31
 *      ...
 * @author Scott M.
 */

public class Exercise_6_28 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\n", "p", "2^p - 1");
        System.out.println("--------------------");
        
        for (int p = 2; p <= 31; p++) {
            if (isPrime(p)){
                System.out.printf("%-10d%-10d\n", p, mersenne(p));
            }
        }
    }
    /**
     * return a mersenne 2^p - 1 for a positive integer p
     * @param int: positive integer
     * @return int: mersenne number
     */
    public static int mersenne(int p) {
        return (int)(Math.pow(2, p)) - 1;
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