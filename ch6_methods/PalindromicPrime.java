/**
 * Program to display 100 palindromic prime numbers.
 * 
 * @author Scott M.
 * PalindromicPrime.java
 */

public class PalindromicPrime {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; count < 100; i++) {
            if (isPrime(i) && isPalindrome(i)) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
    /**
     * Method to check if a number is prime.
     */
    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2.0; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    /**
     * Method to check if a number is a palindrome.
     */
    public static boolean isPalindrome(int num) {
        String str = "" + num;
        
        for (int i = 0; i + 1 <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}