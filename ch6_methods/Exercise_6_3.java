/**
 * (Palindrome integer) Write the methods with the following headers
 *      // Return the reversal of an integer, i.e., reverse(456) returns 654
 *      public static int reverse(int number)
 *      // Return true if number is a palindrome
 *      public static boolean isPalindrome(int number)
 * Use the reverse method to implement isPalindrome. A number is a palindrome 
 * if its reversal is the same as itself. Write a test program that prompts the 
 * user to enter an integer and reports whether the integer is a palindrome.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_6_3 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int num;
        
        System.out.print("Enter an integer: ");
        num = kb.nextInt();
        kb.close();
        
        if (isPalindrome(num)) {
            System.out.print(num + " is a palindrome.");
        }
        else {
            System.out.print(num + " is not a palindrome.");
        }
    }
    /**
     * Method to reverse an int.
     * @param int: integer number
     * @return int: the reversed integer
     */
    public static int reverse(int num) {
        char temp;
        String reverse = "";
        while (num > 0) {
            temp = (char)('0' + (num % 10));
            reverse += temp;
            num /= 10;
        }
        return Integer.parseInt(reverse);
    }
    /**
     * Method to determine if a number is a palindrome.
     * @param int: number to check
     * @return boolean: True = the integer is a palindrome, false otherwise
     */
    public static boolean isPalindrome(int num) {
        if (num == reverse(num)) {
            return true;
        }
        else {
            return false;
        }
    }
}