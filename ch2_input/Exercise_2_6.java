/**
 * (Sum the digits in an integer) Write a program that reads an integer between 0 and 
 * 1000 and adds all the digits in the integer. For example, if an integer is 932, the 
 * sum of all its digits is 14. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_2_6 {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int integer, sum;
        System.out.print("Enter a number between 0 and 1000: ");
        integer = kb.nextInt();
        kb.close();
        sum = integer % 10;
        integer /= 10; // remove 1s place
        sum += integer % 10;
        integer /= 10; // remove 10s place
        sum += integer % 10;
        System.out.print("The sum of the digits is " + sum);
    }
}
