/**
 * (Check SSN) Write a program that prompts the user to enter a Social Security 
 * number in the format DDD-DD-DDDD, where D is a digit. Your program should 
 * check whether the input is valid.
 * @author Scott M.
 * SSNVerify.java
 */

import java.util.Scanner;

public class Exercise_4_21 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create scanner, declare vars
        Scanner kb = new Scanner (System.in);
        String input;
        
        //prompt entry of SSN
        System.out.print("Enter an SSN (DDD-DD-DDDD): ");
        input = kb.nextLine();
        kb.close();
        
        //check if inputs @ 0,1,2,4,5,7,8,9,10 are digits and 3,6 are '-'s
        if (Character.isDigit(input.charAt(0)) && Character.isDigit(input.charAt(1)) && Character.isDigit(input.charAt(2)) && (input.charAt(3) == '-') && 
            Character.isDigit(input.charAt(4)) && Character.isDigit(input.charAt(5)) && (input.charAt(6) == '-') && Character.isDigit(input.charAt(7)) &&
            Character.isDigit(input.charAt(8)) && Character.isDigit(input.charAt(9)) && Character.isDigit(input.charAt(10))) {
            System.out.print(input + " is a valid SSN.");
        }
        else {
            System.out.print(input + " is not a valid SSN.");
        }
    }
}