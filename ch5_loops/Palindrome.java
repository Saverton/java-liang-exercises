/**
 * Program to evaluate whether or not a string is a palindrome.
 * 
 * @author Scott M.
 * Palindrome.java
 */

import java.util.Scanner;

public class Palindrome {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int count;
        char front, back;
        String input, message = "";
        
        System.out.print("Enter a string to be evaluated as a palindrome: ");
        input = kb.nextLine();
        
        count = 0;
        
        while (count < input.length() - 1 - count) {
            if (Character.toUpperCase(input.charAt(count)) == (Character.toUpperCase(input.charAt(input.length() - 1 - count)))) {
                count++;
            }
            else {
                break;
            }
        }
        
        message = (count >= input.length() - 1 - count) ? "\"" + input + "\" is a palindrome." : "\"" + input + "\" is not a palindrome.";
        
        System.out.print(message);
    }
}