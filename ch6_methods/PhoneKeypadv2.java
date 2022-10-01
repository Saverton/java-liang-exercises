/**
 * Program to output a numerical phone number for phone number containing an alphabetical sequence.
 * 
 * @author Scott M.
 * PhoneKeypadv2.java
 */

import java.util.Scanner;

public class PhoneKeypadv2 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String input, number = "";
        
        System.out.print("Enter a string: ");
        input = kb.nextLine();
        
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
     * Program to get a number from an uppercase letter based on the international phone keypad standard (Ex. 4.15).
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