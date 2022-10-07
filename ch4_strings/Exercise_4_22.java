/**
 * (Check substring) Write a program that prompts the user to enter two strings and 
 * reports whether the second string is a substring of the first string.
 * @author Scott M.
 * Substring.java
 */

import java.util.Scanner;

public class Exercise_4_22 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String input1, input2;
        
        System.out.print("Enter a String: ");
        input1 = kb.nextLine();
        System.out.print("Enter another String: ");
        input2 = kb.nextLine();
        kb.close();
        
        if (input1.contains(input2)) {
            System.out.print("\"" + input2 + "\" is a substring of \"" + input1 + "\".");
        }
        else {
            System.out.print("\"" + input2 + "\" is not a substring of \"" + input1 + "\".");
        }
    }
}