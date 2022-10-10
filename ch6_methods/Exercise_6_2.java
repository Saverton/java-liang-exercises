/**
 * (Sum the digits in an integer) Write a method that computes the sum of the digits 
 * in an integer. Use the following method header:
 * public static int sumDigits(long n)
 * For example, sumDigits(234) returns 9 (2 + 3 + 4). (Hint: Use the % operator 
 * to extract digits, and the / operator to remove the extracted digit. For instance, 
 * to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10
 * (= 23). Use a loop to repeatedly extract and remove the digit until all the digits 
 * are extracted. Write a test program that prompts the user to enter an integer and 
 * displays the sum of all its digits.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_6_2 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        long num;
        
        System.out.print("Enter an Integer: ");
        num = kb.nextInt();
        kb.close();
        
        System.out.print("The sum of the digits is " + sumDigits(num));
    }
    /**
     * Sum the digits of an integer number.
     * @params int: number
     * @return int: sum of the digits
     */
    public static int sumDigits(long num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}