/**
 * Program to display the amount of bits used to store a short integer.
 * 
 * @author Scott M.
 * ShortInt.java
 */

import java.util.Scanner;

public class ShortInt {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int count = 0, zeros = 0, value, holdVal;
        String shortString = "";
        
        System.out.print("Enter an integer: ");
        value = kb.nextInt();
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