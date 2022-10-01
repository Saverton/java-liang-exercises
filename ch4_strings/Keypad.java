/**
 * Program to translate a letter to a number on an internantional standard letter/number mapping standard.
 * 
 * @author Scott M.
 * Keypad.java
 */

import java.util.Scanner;

public class Keypad {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create scanner, declare vars
        Scanner kb = new Scanner (System.in);
        char letter;
        int number;
        String input;
        
        //get letter input
        System.out.print("Enter a letter (a-z): ");
        input = kb.next();
        if (input.length() > 1) {
            System.out.print("Please enter a single character.");
            System.exit(1);
        }
        letter = Character.toLowerCase(input.charAt(0));
        
        //translate letter to number;
        switch (letter) {
            case 'a':
            case 'b':
            case 'c': number = 2;
                      break;
            case 'd':
            case 'e':
            case 'f': number = 3;
                      break;
            case 'g':
            case 'h':
            case 'i': number = 4;
                      break;
            case 'j':
            case 'k':
            case 'l': number = 5;
                      break;
            case 'm':
            case 'n':
            case 'o': number = 6;
                      break;
            case 'p':
            case 'q':
            case 'r':
            case 's': number = 7;
                      break;
            case 't': 
            case 'u':
            case 'v': number = 8;
                      break;
            case 'w':
            case 'x':
            case 'y':
            case 'z': number = 9;
                      break;
            default: System.out.print(letter + " is an invalid input.");
                     number = -1;
                     System.exit(1);
        }
        
        //display
        System.out.print("The corresponding number is " + number);
    }
}