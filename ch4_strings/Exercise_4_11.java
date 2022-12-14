/**
 * (Decimal to hex) Write a program that prompts the user to enter an integer between 
 * 0 and 15 and displays its corresponding hex number.
 * @author Scott M.
 * DecimalToHex.java
 */

import java.util.Scanner;

public class Exercise_4_11 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create scanner, declare vars
        Scanner kb = new Scanner (System.in);
        int number;
        char hexadecimal;
        
        //get int value
        System.out.print("Enter an integer from 0 - 15: ");
        number = kb.nextInt();
        kb.close();
        
        switch (number) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: 
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: hexadecimal = (char)(number + 48);
                    break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15: hexadecimal = (char)(number + 55);
                     break;
            default: hexadecimal = ' ';
        }
        
        //root out invalid numbers
        String message = (number < 0 || number > 15) ? number + " is an invalid input." : number + " in hexadecimal is " + hexadecimal + ".";
        
        //display result
        System.out.print(message);
    }
}