/**
 * Program to check if a credit card number is valid.
 * 
 * @author Scott M.
 * CCNValidation.java
 */

import java.util.Scanner;

public class CCNValidation {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String number, message;
        
        System.out.print("Enter a credit card number as a long integer: \n\t");
        number = kb.next();
        
        message = (isValid(number)) ? number + " is valid." : number + " is invalid.";
        System.out.print(message);
    }
    /**
     * Return true if card # is valid.
     */
    public static boolean isValid(String number) {
        return ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0 && (prefixMatched(number, 4) || prefixMatched(number, 5) ||
        prefixMatched(number,6) || prefixMatched(number, 37))) ? true : false;
    }
    /**
     * Get the sum of the doubles of every even place in the CCN.
     */
    public static int sumOfDoubleEvenPlace(String number) {
        int sum = 0;
        
        for (int i = 0; i < number.length(); i += 2) {
            sum += getDigit((number.charAt(i) - '0') * 2);
        }
        
        return sum;
    }
    /**
     * If single digit, return that digit, if multi digit, return sum of digits.
     */
    public static int getDigit(int number) {
        return (number / 10) + (number % 10);
    }
    /**
     * Sum the odd place digits of the number.
     */
    public static int sumOfOddPlace(String number) {
        int sum = 0;
        
        for (int i = 1; i < number.length(); i += 2) {
            sum += number.charAt(i) - '0';
        }
        
        return sum;
    }
    /**
     * Check if number contains prefix.
     */
    public static boolean prefixMatched(String number, int d) {
        return (number.startsWith("" + d)) ? true : false;
    }
}