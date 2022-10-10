/**
 * (Phone keypads) The international standard letter/number mapping for telephones 
 * is shown in Programming Exercise 4.15. Write a method that returns a number, 
 * given an uppercase letter, as follows:
 * int getNumber(char uppercaseLetter)
 * Write a test program that prompts the user to enter a phone number as a string. 
 * The input number may contain letters. The program translates a letter (uppercase 
 * or lowercase) to a digit and leaves all other characters intact. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_6_21 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String input, number = "";
        
        System.out.print("Enter a string: ");
        input = kb.nextLine();
        kb.close();
        
        //process the phone number char by char
        for (int i = 0; i < input.length(); i++) {
            if (Character.toUpperCase(input.charAt(i)) >= 'A' && Character.toUpperCase(input.charAt(i)) <= 'Z') {
                number += getNumber(Character.toUpperCase(input.charAt(i)));
            }
            else {
                number += input.charAt(i);
            }
        }
        
        System.out.print(number);
    }
    /**
     * Return the keypad number corresponding to a given letter.
     * @param char: uppercase letter
     * @return int: keypad number
     */
    public static int getNumber(char uppercaseLetter) {
        int number;
        switch (uppercaseLetter) {
            case 'A':
            case 'B':
            case 'C': number = 2;
                break;
            case 'D':
            case 'E':
            case 'F': number = 3;
                break;
            case 'G':
            case 'H':
            case 'I': number = 4;
                break;
            case 'J':
            case 'K':
            case 'L': number = 5;
                break;
            case 'M':
            case 'N':
            case 'O': number = 6;
                break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S': number = 7;
                break;
            case 'T':
            case 'U':
            case 'V': number = 8;
                break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z': number = 9;
                break;
            default: number = 0;
        }
        return number;
    }
}