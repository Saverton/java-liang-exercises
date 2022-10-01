/**
 * Program to see if a char is a vowel or a consonant.
 * 
 * @author Scott M.
 */

import java.util.Scanner;

public class VowelOrConsonant {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create a scanner, declare vars
        Scanner kb = new Scanner (System.in);
        String input, message;
        char letter;
        
        //get char input
        System.out.print("Enter a letter: ");
        input = kb.next();
        if (input.length() > 1) {
            System.out.print("Please enter one character.");
            System.exit(1);
        }
        letter = input.charAt(0);
        
        //determine if it is a letter
        letter = Character.toLowerCase(letter);
        if (letter <= 'a' || letter >= 'z') {
            System.out.print("Please enter a letter.");
            System.exit(1);
        }
        
        //is it a vowel, else consonant
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            message = input + " is a vowel!";
        }
        else {
            message = input + " is a consonant!";
        }
        
        //display
        System.out.print(message);
    }
}