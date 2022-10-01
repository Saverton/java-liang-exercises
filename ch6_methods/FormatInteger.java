/**
 * Program to format an integer with zeros to be a certain length.
 * 
 * @author Scott M.
 * FormatInteger.java
 */

import java.util.Scanner;

public class FormatInteger {
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
        
        System.out.print("Formatted integer is " + format(number, length));
    }
    /**
     * Method to format an integer to be a certain length.
     */
    public static String format(int number, int length) {
        String output = "" + number;
        
        while (output.length() < length) {
            output = "0" + output;
        }
        
        return output;
    }
}