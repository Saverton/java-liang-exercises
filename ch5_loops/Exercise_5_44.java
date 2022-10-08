/**
 * (Computer architecture: bit-level operations) A short value is stored in 16 bits. 
 * Write a program that prompts the user to enter a short integer and displays the 16
 * bits for the integer.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_5_44 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int count = 0, zeros = 0, value, holdVal;
        String shortString = "";
        
        System.out.print("Enter an integer: ");
        value = kb.nextInt();
        kb.close();
        holdVal = value;
        
        while (holdVal > 0) {
            count++;
            holdVal = holdVal >> 1;
        }
        System.out.println(count + " bits");
        zeros = 16 - count;
        
        for (int i = 0; i < zeros; i++) {
            shortString += "0";
        }
        shortString += Integer.toBinaryString(value);
        System.out.print("The bits are " + shortString);
    }
}