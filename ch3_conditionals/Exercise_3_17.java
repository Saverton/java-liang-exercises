/**
 * (Game: scissor, rock, paper) Write a program that plays the popular scissor-rock-paper 
 * game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can 
 * wrap a rock.) The program randomly generates a number 0, 1, or 2 representing 
 * scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or 
 * 2 and displays a message indicating whether the user or the computer wins, loses, 
 * or draws. 
 * @author Scott M.
 * RockPaperScissors.java
 */

import java.util.Scanner;

public class Exercise_3_17 {
    /**
     * Main method to run program
     */
    public static void main(String[] args) {
        //create scanner and declare vars
        Scanner kb = new Scanner (System.in);
        int user, computer;
        
        //prompt user to enter rock paper or scissors, get entry
        System.out.print("(0-Rock, 1-Paper, 2-Scissors)\nEnter your move: ");
        user = kb.nextInt();
        kb.close();
        if (user < 0 || user > 2)
            System.out.print("Error: Please enter either 0, 1, or 2.");
        else {
            
            //generate random entry for computer
            computer = (int)(Math.random() * 3);
            
            //find out who wins
            if (user == 0) {
                if (computer == 0)
                    System.out.print("Both user and computer chose Rock");
                else if (computer == 1)
                    System.out.print("Computer beats user with Paper on Rock");
                else 
                    System.out.print("User beats computer with Rock on Scissors");
            }
            if (user == 1) {
                if (computer == 0)
                    System.out.print("User beats computer with Paper on Rock");
                else if (computer == 1)
                    System.out.print("Both user and computer chose Paper");
                else 
                    System.out.print("Computer beats user with Scissors on Paper");
            }
            if (user == 2) {
                if (computer == 0)
                    System.out.print("Computer beats user with Rock on Scissors");
                else if (computer == 1)
                    System.out.print("User beats computer with Scissors on Paper");
                else 
                    System.out.print("Both user and computer choose Scissors");
            }
        }
    }
}