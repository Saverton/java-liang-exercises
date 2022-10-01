/**
 * Program to take an input string and display characters at odd positions.
 * 
 * @author Scott M.
 * ProcessString.java
 */

import java.util.Scanner;

public class ProcessString {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String input, output = "";
        char temp;
        
        //1. get input String.
        System.out.print("Enter a String: ");
        input = kb.nextLine();
        //2. loop string to get chars at odd positions and concat to output.
        for (int i = 1; i <= input.length(); i++) {
            if (i % 2 != 0) {
                temp = input.charAt(i - 1);
                output += temp;
            }
        }
        //3. display output string.
        System.out.print(output);
    }
}