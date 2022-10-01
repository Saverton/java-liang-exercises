/**
 * Program to convert an ACII code into a 'char' data type.
 * 
 * @author Scott M.
 * ACIIConverter.java
 */

import java.util.Scanner;

public class ACIIConverter {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int code;
        
        System.out.print("Enter a number between 0 and 127");
        code = kb.nextInt();
        
        System.out.print(code + " is the ACII code for \"" + (char)code + "\".");
    }
}