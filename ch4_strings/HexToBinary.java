/**
 * Program to convert a Hexadecimal digit into Binary.
 * 
 * @author Scott M.
 * HexToBinary.java
 */

import java.util.Scanner;

public class HexToBinary {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create a scanner, declare variables
        Scanner kb = new Scanner (System.in);
        String input;
        char hexadecimal;
        int decimal = 0, binary;
        
        //get the hex input
        System.out.print("Enter a Hexadecimal value from 0-F: ");
        input = kb.next();
        
        //determine if input is valid
        if (input.length() > 1) {
            System.out.print("Error: Please enter one character only.");
            System.exit(1);
        }
        
        //convert hex to decimal
        hexadecimal = input.charAt(0);
        if (Character.isDigit(hexadecimal)) {
            decimal = hexadecimal - '0';
        }
        else if (hexadecimal >= 'A' && hexadecimal <= 'F') {
            decimal = hexadecimal - 'A' + 10;
        }
        else {
            System.out.print("Error: Invalid hexadecimal value.");
            System.exit(1);
        }
        
        //convert decimal to binary
        binary = 0;
        if (decimal % 2 != 0) {
            binary += 1;
        }
        if (decimal == 2 || decimal == 3 || decimal == 6 || decimal == 7 || decimal == 10 || decimal == 11 || decimal >= 14) {
            binary += 10;
        }
        if ((decimal >= 4 && decimal <= 7) || decimal >= 12) {
            binary += 100;
        }
        if (decimal >= 8) {
            binary += 1000;
        }
        
        //display
        System.out.printf("%c in binary is %-4d", hexadecimal, binary);
    }
}