/**
 * (Use the &&, || and ^ operators) Write a program that prompts the user to enter 
 * an integer and determines whether it is divisible by 5 and 6, whether it is divisible 
 * by 5 or 6, and whether it is divisible by 5 or 6, but not both. 
 * @author Scott M.
 * ConditionalOperators.java
 */

import java.util.Scanner;

public class Exercise_3_26 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create scanner, declare integer var
        Scanner kb = new Scanner (System.in);
        int integer;
        
        //get integer var
        System.out.print("Enter an integer: ");
        integer = kb.nextInt();
        kb.close();
        
        //test int / 5 & 6
        System.out.println("Is " + integer + " divisible by 5 and 6? " + (integer % 5 == 0 && integer % 6 == 0));
        
        //test int / 5 or 6
        System.out.println("Is " + integer + " divisible by 5 or 6? " + (integer % 5 == 0 || integer % 6 == 0));
        
        //test int / 5 or 6, not both
        System.out.print("Is " + integer + " divisible by 5 or 6, but not both? " + (integer % 5 == 0 ^ integer % 6 == 0));
    }
}