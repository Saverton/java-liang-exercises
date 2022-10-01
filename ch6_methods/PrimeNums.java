/**
 * Program to calculate the number of prime numbers less than 10,000.
 * 
 * @author Scott M.
 * PrimeNums.java
 */

public class PrimeNums {
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
     * Method to find if a number is prime.
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