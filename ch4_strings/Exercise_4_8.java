/**
 * (Find the character of an ASCII code) Write a program that receives an ASCII code 
 * (an integer between 0 and 127) and displays its character. 
 * @author Scott M.
 * ACIIConverter.java
 */

import java.util.Scanner;

public class Exercise_4_8 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int code;
        
        System.out.print("Enter a number between 0 and 127");
        code = kb.nextInt();
        kb.close();
        
        System.out.print(code + " is the ACII code for \"" + (char)code + "\".");
    }
}