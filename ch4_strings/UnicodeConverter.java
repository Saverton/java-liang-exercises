/**
 * Program to convert a char into a Unicode (from 0 to 127)
 * 
 * @author Scott M.
 * UnicodeConverter.java
 */

import java.util.Scanner;

public class UnicodeConverter {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        char console;
        String stringConsole;
        
        System.out.print("Enter a char value: ");
        stringConsole = kb.next();
        console = stringConsole.charAt(0);
        
        System.out.print(console + "'s Unicode value is " + (int)console + ".");
        
    }
}