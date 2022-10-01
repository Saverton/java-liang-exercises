/**
 * Program to have a 10 question basic addition quiz.
 * 
 * @author Scott M.
 * AdditionQuizv2.java
 */

import java.util.Scanner;

public class AdditionQuizv2 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //Create scanner, declare vars for two values, answer, startTime, endTime, and correct count.
        Scanner kb = new Scanner (System.in);
        int val1, val2, answer, correct = 0;
        long startTime, endTime;

        //Print quiz title, start test time
        System.out.println("Addition Quiz: 10 Questions");
        startTime = System.currentTimeMillis();
        
        //Loop (x10):
        for (int i = 0; i < 10; i++) {
        //1. Generate 2 random digits between 1 and 15.
        val1 = (int)(Math.random() * 15 + 1);
        val2 = (int)(Math.random() * 15 + 1);
        //2. Prompt the user with an addition problem.
        System.out.print("What is " + val1 + " + " + val2 + "? ");
        answer = kb.nextInt();
        //3. grade the user's response and add to 'correct' variable accordingly
        if (val1 + val2 == answer) {
            correct++;
        }
        }
        
        //end test time
        endTime = System.currentTimeMillis();
        //Display correct amount and test time.
        System.out.print("\nYou got " + correct + "/10 answers correct in " + ((endTime - startTime) / 1000) + " seconds.");
    }
}