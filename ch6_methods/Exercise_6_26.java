/**
 * (Palindromic prime) A palindromic prime is a prime number and also palindromic. 
 * For example, 131 is a prime and also a palindromic prime, as are 313 and 
 * 757. Write a program that displays the first 100 palindromic prime numbers. 
 * Display 10 numbers per line, separated by exactly one space, as follows:
 * 2 3 5 7 11 101 131 151 181 191
 * 313 353 373 383 727 757 787 797 919 929
 * ...
 * @author Scott M.
 */

public class Exercise_6_26 {
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
    /**
     * Return whether or not a number is a palindrome.
     * @param int: number
     * @return boolean: true = number is a palindrome, false otherwise
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