/**
 * Program to make a simple addition quiz.
 * 
 * @author Scott M.
 * GameAdd3.java
 */

import java.util.Scanner;

public class GameAdd3 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //define vars and scanner
        Scanner kb = new Scanner (System.in);
        int rand1, rand2, rand3, answer, check;
        
        //choose 3 random integers
        rand1 = (int)(Math.random() * 10);
        rand2 = (int)(Math.random() * 10);
        rand3 = (int)(Math.random() * 10);
        
        //prompt question and get user answer
        System.out.print("What is " + rand1 + " + " + rand2 + " + " + rand3 + "? ");
        answer = kb.nextInt();
        check = rand1 + rand2 + rand3;
        
        //check answer & give results
        if (answer == check) {
            System.out.println("That is correct!");
        }
        else {
            System.out.println("That is incorrect. " + rand1 + " + " + rand2 + " + " + rand3 + " = " + check);
        }
    }
}