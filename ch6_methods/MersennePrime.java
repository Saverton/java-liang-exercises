/**
 * Program to display all Mersenne Prime numbers with p <= 31.
 * 
 * @author Scott M.
 * MersennePrime.java
 */

public class MersennePrime {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\n", "p", "2^p - 1");
        System.out.println("--------------------");
        
        for (int p = 2; p <= 31; p++) {
            if (PalindromicPrime.isPrime(p)){
                System.out.printf("%-10d%-10d\n", p, mersenne(p));
            }
        }
    }
    /**
     * Method to execute function 2^p - 1 on prime numbers.
     */
    public static int mersenne(int p) {
        return (int)(Math.pow(2, p)) - 1;
    }
}