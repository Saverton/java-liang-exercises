/**
 * (Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the 
 * isPrime(int number) method for testing whether a number is prime. Use this 
 * method to find the number of prime numbers less than 10000.
 * @author Scott M.
 */

public class Exercise_6_10 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 10000; i++) {
            if (isPrime(i)){
                count++;
            }
        }
        System.out.print("There are " + count + " prime numbers less than 10,000");
    }
    /**
     * Check if a number is prime.
     * @param int: number
     * @return boolean: true = the number is prime, false otherwise
     */
    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}