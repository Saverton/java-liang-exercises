/**
 * (Game: heads or tails) Write a program that lets the user guess whether the flip of 
 * a coin results in heads or tails. The program randomly generates an integer 0 or 1,
 * which represents head or tail. The program prompts the user to enter a guess and 
 * reports whether the guess is correct or incorrect.
 * @author Scott M.
 * HorT.java
 */

import java.util.Scanner;

public class Exercise_3_14 {
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
        kb.close();
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