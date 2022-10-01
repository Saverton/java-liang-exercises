/**
 * Program to make a simple guessing heads or tails game
 * 
 * @author Scott M.
 * HorT.java
 */

import java.util.Scanner;

public class HorT {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //declare vars and start scanner
        int flip, guess;
        Scanner kb = new Scanner (System.in);
        
        //prompt user to enter a guess
        System.out.print("(0-Heads, 1-Tails)\nEnter a guess: ");
        guess = kb.nextInt();
        if (guess != 0 && guess != 1)
            System.out.print("Error: Invalid guess ID");
        else {
        
        //generate h or t
        flip = (int)(Math.random() * 10) % 2;
        
        //check guess
        if (flip == guess)
            System.out.print("You guessed correctly");
        else
            System.out.print("You did not guess correctly");
        }
    }
}