/**
 * Program to reverse a string.
 * 
 * @author Scott M.
 * ReverseString.java
 */

import java.util.Scanner;

public class ReverseString {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String input, output = "";
        int length;
        char temp;
        
        //1. Get the user to input a string.
        System.out.print("Enter a String: ");
        input = kb.nextLine();
        //2. Find length of the string.
        length = input.length();
        //3. Use a loop to take the last letter of the string -1 each time and add it to the output string.
        for (int i = length - 1; i >= 0; i--) {
            temp = input.charAt(i);
            output += temp;
        }
        //4. Display the output string.
        System.out.print("The reversed String is " + output);
    }
}