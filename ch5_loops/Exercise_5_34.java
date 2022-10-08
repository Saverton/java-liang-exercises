/**
 * (Game: scissor, rock, paper) Programming Exercise  3.17 gives a program that 
 * plays the scissor-rock-paper game. Revise the program to let the user continuously 
 * play until either the user or the computer wins more than two times than its 
 * opponent.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_5_34 {
    /**
     * Main method to run program
     */
    public static void main(String[] args) {
        //create scanner and declare vars
        Scanner kb = new Scanner (System.in);
        int user, computer, cWins = 0, uWins = 0;
        
        //prompt user to enter rock paper or scissors, get entry
        while (cWins != uWins + 2 || uWins != cWins + 2) {
                System.out.print("(0-Rock, 1-Paper, 2-Scissors)\nEnter your move: ");
            user = kb.nextInt();
            if (user < 0 || user > 2)
                System.out.println("Error: Please enter either 0, 1, or 2.");
            else {
                
                //generate random entry for computer
                computer = (int)(Math.random() * 3);
                
                //find out who wins
                if (user == 0) {
                    if (computer == 0)
                        System.out.print("Both user and computer chose Rock");
                    else if (computer == 1) {
                        System.out.print("Computer beats user with Paper on Rock");
                        cWins++;
                    }
                    else {
                        System.out.print("User beats computer with Rock on Scissors");
                        uWins++;
                    }
                }
                else if (user == 1) {
                    if (computer == 0) {
                        System.out.print("User beats computer with Paper on Rock");
                        uWins++;
                    }
                    else if (computer == 1)
                        System.out.print("Both user and computer chose Paper");
                    else {
                        System.out.print("Computer beats user with Scissors on Paper");
                        cWins++;
                    }
                }
                else {
                    if (computer == 0) {
                        System.out.print("Computer beats user with Rock on Scissors");
                        cWins++;
                    }
                    else if (computer == 1) {
                        System.out.print("User beats computer with Scissors on Paper");
                        uWins++;
                    }
                    else 
                        System.out.print("Both user and computer choose Scissors");
                }
                System.out.println();
            }
        }
        kb.close();
        
        if (cWins > uWins) {
            System.out.print("\nThe computer Wins!");
        }
        else {
            System.out.print("\nThe computer Wins!");
        }
    }
}