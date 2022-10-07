/**
 * (Find the Unicode of a character) Write a program that receives a character and 
 * displays its Unicode.
 * @author Scott M.
 * UnicodeConverter.java
 */

import java.util.Scanner;

public class Exercise_4_9 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        char console;
        String stringConsole;
        
        System.out.print("Enter a char value: ");
        stringConsole = kb.next();
        kb.close();
        console = stringConsole.charAt(0);
        
        System.out.print(console + "'s Unicode value is " + (int)console + ".");
        
    }
}