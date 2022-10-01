/**
 * Program to use methods to reverse a number and determine if its a palindrome.
 * 
 * @author Scott M.
 * NumPalindrome.java
 */

import java.util.Scanner;

public class NumPalindrome {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int num;
        
        System.out.print("Enter an integer: ");
        num = kb.nextInt();
        
        if (isPalindrome(num)) {
            System.out.print(num + " is a palindrome.");
        }
        else {
            System.out.print(num + " is not a palindrome.");
        }
    }
    /**
     * Method to reverse an int.
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