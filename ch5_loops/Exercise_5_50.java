/**
 * (Count uppercase letters) Write a program that prompts the user to enter a string 
 * and displays the number of the uppercase letters in the string.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_5_50 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String input;
        int upperCase = 0;
        char temp;
        
        //1. Get input String.
        System.out.print("Enter a String: ");
        input = kb.nextLine();
        kb.close();
        //2. Process each letter of String using a loop to determine if letters are Upper Case or not.
        for (int i = 0; i < input.length(); i++) {
            temp = input.charAt(i);
            if (Character.isUpperCase(temp)) {
                upperCase++;
            }
        }
        //3. Display the total amount of Upper Case letters.
        System.out.print("The number of uppercase letters is " + upperCase);
    }
}