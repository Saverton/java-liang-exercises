/**
 * Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a threedigit number. The program prompts the user to enter a three-digit number and 
 * determines whether the user wins according to the following rules:
 * 1. If the user input matches the lottery number in the exact order, the award is 
 * $10,000.
 * 2. If all digits in the user input match all digits in the lottery number, the award is 
 * $3,000.
 * 3. If one digit in the user input matches a digit in the lottery number, the award is 
 * $1,000.
 * @author Scott M.
 * Lottery.java
 */

import java.util.Scanner;

public class Exercise_3_15 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //start scanner, declare vars
        Scanner kb = new Scanner (System.in);
        int guess, win, win1, win2, win3, g1, g2, g3;
        
        //prompt user to guess 3 digits
        System.out.print("Enter your 3 digit lottery number: ");
        guess = kb.nextInt();
        kb.close();
        if (guess < 0 || guess >= 1000)
            System.out.print("Error: Invalid guess");
        else {
        //generate rand digits
        win = (int)(Math.random() * 1000);
        win1 = win % 10;
        win2 = (win / 10) % 10;
        win3 = (win / 100) % 10;
        g1 = guess % 10;
        g2 = (guess / 10) % 10;
        g3 = (guess / 100) % 10;
        
        //check answer
            //if total match, win 10k
        if (guess == win)
            System.out.print("Congratulations, you got a total match: +10,000 Social Credit");
            //if digits match, but wrong order, win 3k
        else if ((g1 == win1 && g2 == win3 && g3 == win2) || (g1 == win2 && g2 == win1 && g3 == win3) || (g1 == win2 && g2 == win3 && g3 == win1) ||
        (g1 == win3 && g2 == win2 && g3 == win1) || (g1 == win3 && g2 == win1 && g3 == win2))
            System.out.print("Congratulations, you matched all the digits: +3,000 Social Credit");
            //if one digit match, win 1k
        else if ((g1 == win1 || g1 == win2 || g1 == win3) || (g2 == win1 || g2 == win2 || g2 == win3) || (g3 == win1 || g3 == win2 || g3 == win3))
            System.out.print("Congratulations, you matched at least one digit: +1,000 Social Credit");
            //else lose
        else
            System.out.print("Uh-oh! You lose! -999,999,999 Social Credt >:)");
        }
    }
}