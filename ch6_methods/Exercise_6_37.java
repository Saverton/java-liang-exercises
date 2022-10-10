/**
 * (Format an integer) Write a method with the following header to format the integer with the specified width.
 *      public static String format(int number, int width)
 * The method returns a string for the number with one or more prefix 0s. The size 
 * of the string is the width. For example, format(34, 4) returns 0034 and format(34, 5) returns 00034. 
 * If the number is longer than the width, the method
 * returns the string representation for the number. For example, format(34, 1)
 * returns 34.
 * Write a test program that prompts the user to enter a number and its width and 
 * displays a string returned by invoking format(number, width).
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_6_37 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int number, length;
        
        System.out.print("Enter an integer: ");
        number = kb.nextInt();
        System.out.print("Enter the width: ");
        length = kb.nextInt();
        kb.close();
        
        System.out.print("Formatted integer is " + format(number, length));
    }
    /**
     * Return a formatted integer to match a certain length.
     * @param int: number, desired length
     * @return String: formatted integer with the desired length
     */
    public static String format(int number, int length) {
        String output = "" + number;
        
        while (output.length() < length) {
            output = "0" + output;
        }
        
        return output;
    }
}