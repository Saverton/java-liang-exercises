/**
 * Program to generate an addition quiz with 10 questions, has the user enter
 * answers until they are correct.
 * 
 * @author Scott M.
 * AdditionQuiz2.java
 */

import java.util.Scanner;
import java.util.ArrayList;

public class AdditionQuiz2
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        final int QUESTIONS = 10, MAX_COMPONENT = 10;
        int correct = 0;
        Scanner kb = new Scanner(System.in);
        
        for (int i = 1; i <= QUESTIONS; i++) {
            int[] question = new int[2];
            ArrayList<Integer> answers = new ArrayList<>();
            
            for (int j = 0; j < 2; j++)
                question[j] = (int)(Math.random() * MAX_COMPONENT);
                
            do {
                int answer;
                if (answers.size() > 0)
                    System.out.print("Wrong answer. Try again. ");
                System.out.print("What is " + question[0] + " + " + question[1] + "? ");
                answer = kb.nextInt();
                if (answers.contains(answer))
                    System.out.println("Already entered " + answer + ".");
                else
                    answers.add(answer);
            } while (!answers.contains(question[0] + question[1]));
            if (answers.size() == 1)
                correct++;
        }
        
        System.out.print("\n" + correct + "/" + QUESTIONS + " correct");
    }
}