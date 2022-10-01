/**
 * Program to host a lottery game with a 2 digit lottery number with 2 different digits.
 * 
 * @author Scott M.
 * Lottery2.java
 */

import java.util.Scanner;

public class Lottery2 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int digit1, digit2, guess1, guess2;
        String guess;
        
        //1. Guess digits.
        System.out.print("Enter your 2 digit guess: ");
        guess = kb.next();
        guess1 = (int)guess.charAt(0) - '0';
        guess2 = (int)guess.charAt(1) - '0';
        
        //2. Generate 2 different digits.
        digit1 = (int)(Math.random() * 10);
        digit2 = (int)(Math.random() * 10);
        while (digit2 == digit1) {
            digit2 = (int)(Math.random() * 10);
        }
        System.out.println("Winning Number: " + digit1 + digit2);
        
        //3. Check digits.
        if (guess1 == digit1 && guess2 == digit2) {
            System.out.print("Total match: You win $10,000");
        }
        else if (guess1 == digit2 && guess2 == digit1) {
            System.out.print("All digits match: You win $3,000");
        }
        else if ((guess1 == digit1 ^ guess2 == digit2) || (guess1 == digit2 ^ guess2 == digit1)) {
            System.out.print("One digit matches: You win $1,000");
        }
        else {
            System.out.print("No match: You lose.");
        }
    }
}