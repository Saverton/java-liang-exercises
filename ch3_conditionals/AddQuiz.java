/**
 * Program to make a simple addition quiz game.
 * 
 * @author Scott M.
 * AddQuiz.java
 */

import java.util.Scanner;

public class AddQuiz {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //import scanner and declare variables
        Scanner kb = new Scanner (System.in);
        int i1, i2, answer, check, correct;
        correct = 0;
        
        //first question: Prompt answer, get answer, check answer, give result
        i1 = (int)(Math.random() * 100);
        i2 = (int)(Math.random() * 100);
        System.out.print(i1 + " + " + i2 + " = ");
        answer = kb.nextInt();
        check = i1 + i2;
        if (answer == check)
            correct++;
        //2nd Q
        i1 = (int)(Math.random() * 100);
        i2 = (int)(Math.random() * 100);
        System.out.print(i1 + " + " + i2 + " = ");
        answer = kb.nextInt();
        check = i1 + i2;
        if (answer == check)
            correct++;
        //3rd Q
        i1 = (int)(Math.random() * 100);
        i2 = (int)(Math.random() * 100);
        System.out.print(i1 + " + " + i2 + " = ");
        answer = kb.nextInt();
        check = i1 + i2;
        if (answer == check)
            correct++;
        //Final results
        System.out.print("\nYou have gotten " + correct + "/3 correct.");
    }
}