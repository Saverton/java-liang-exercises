/**
 * (Financial: credit card number validation) Credit card numbers follow certain patterns. 
 * A credit card number must have between 13 and 16 digits. It must start with:
 *  ■ 4 for Visa cards
 *  ■ 5 for Master cards
 *  ■ 37 for American Express cards
 *  ■ 6 for Discover cards
 * In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card 
 * numbers. The algorithm is useful to determine whether a card number is entered 
 * correctly or whether a credit card is scanned correctly by a scanner. Credit card 
 * numbers are generated following this validity check, commonly known as the 
 * Luhn check or the Mod 10 check, which can be described as follows (for illustration, 
 * consider the card number 4388576018402626):
 * 1. Double every second digit from right to left. If doubling of a digit results in a 
 *  two-digit number, add up the two digits to get a single-digit number.
 *      4388 5760 1840 2626
 *      ^ ^  ^ ^  ^ ^  ^ ^
 *      4 * 2 = 8
 *      8 * 2 = 16 (1 + 6 = 7)
 *      5 * 2 = 10 (1 + 0 = 1)
 *      6 * 2 = 12 (1 + 2 = 3)
 *      1 * 2 = 2
 *      4 * 2 = 8
 *      2 * 2 = 4
 *      2 * 2 = 4
 * 2. Now add all single-digit numbers from Step 1.
 *      4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37
 * 3. Add all digits in the odd places from right to left in the card number.
 *      6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
 * 4. Sum the results from Step 2 and Step 3.
 *      37 + 38 = 75
 * 5. If the result from Step 4 is divisible by 10, the card number is valid; otherwise, 
 *  it is invalid. For example, the number 4388576018402626 is invalid, but the 
 *  number 4388576018410707 is valid.
 * Write a program that prompts the user to enter a credit card number as a long
 * integer. Display whether the number is valid or invalid. Design your program to 
 * use the following methods:
 *      /** Return true if the card number is valid /
 *      public static boolean isValid(long number) 
 *      /** Get the result from Step 2 /
 *      public static int sumOfDoubleEvenPlace(long number) 
 *      /** Return this number if it is a single digit, otherwise,
 *          return the sum of the two digits /
 *      public static int getDigit(int number)
 *      /** Return sum of odd-place digits in number /
 *      public static int sumOfOddPlace(long number) 
 *      /** Return true if the digit d is a prefix for number /
 *      public static boolean prefixMatched(long number, int d) 
 *      /** Return the number of digits in d /
 *      public static int getSize(long d) 
 *      /** Return the first k number of digits from number. If the 
 *          number of digits in number is less than k, return number. /
 *      public static long getPrefix(long number, int k) 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_6_31 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String number, message;
        
        System.out.print("Enter a credit card number as a long integer: \n\t");
        number = kb.next();
        kb.close();
        
        message = number + ((isValid(number)) ? " is valid." : " is invalid.");
        System.out.print(message);
    }
    /**
     * Check if a credit card number is valid.
     * @preconditions ccn must be in the form ################ (not #### #### #### ####)
     * @param String: credit card number
     * @return boolean: true = ccn is valid, false otherwise
     */
    public static boolean isValid(String number) {
        return ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0 && (prefixMatched(number, 4) || prefixMatched(number, 5) ||
        prefixMatched(number,6) || prefixMatched(number, 37))) ? true : false;
    }
    /**
     * Return the sum of every other digit doubled in the credit card number.
     * @param String: credit card number
     * @return int: sum of the even places doubled
     */
    public static int sumOfDoubleEvenPlace(String number) {
        int sum = 0;
        
        for (int i = 0; i < number.length(); i += 2) {
            sum += getDigit((number.charAt(i) - '0') * 2);
        }
        
        return sum;
    }
    /**
     * Take in an integer 0 <= x < 100, and return the sum of the digits.
     * @param int: number
     * @return int: sum of the digits
     */
    public static int getDigit(int number) {
        return (number / 10) + (number % 10);
    }
    /**
     * Sum all of the odd place digits in a credit card number.
     * @param String: credit card number
     * @return int: sum of the odd digits
     */
    public static int sumOfOddPlace(String number) {
        int sum = 0;
        
        for (int i = 1; i < number.length(); i += 2) {
            sum += number.charAt(i) - '0';
        }
        
        return sum;
    }
    /**
     * check if a credit card number contains a certain integer prefix.
     * @param String: credit card number, int: prefix
     * @return boolean: true = ccn contains prefix, false otherwise
     */
    public static boolean prefixMatched(String number, int d) {
        return (number.startsWith("" + d)) ? true : false;
    }
}