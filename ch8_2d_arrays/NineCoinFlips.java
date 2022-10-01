/**
 * Program to simulate 9 coin flip outcomes by inputting an integer from 0 to 511 and finding the corresponding sequence of outcomes.
 * 
 * @author Scott M.
 * NineCoinFlips.java
 */

import java.util.Scanner;

public class NineCoinFlips {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int number;
        String binary;
        
        System.out.print("Enter a number between 0 and 511: "); 
        number = kb.nextInt();
        
        binary = Integer.toBinaryString(number);
        System.out.println(binary);
        while (binary.length() < 9) {
            binary = "0" + binary;
        }
        System.out.println(binary);
        
        printHOrT(binary);
    }
    /**
     * Method to convert binary string into H or T array.
     */
    public static void printHOrT(String binary) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((binary.charAt(i * 3 + j) == '0') ? "H " : "T ");
            }
            System.out.println();
        }
    }
}