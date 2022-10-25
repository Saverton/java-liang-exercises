/**
 * (Addition quiz) Rewrite Listing 5.1 RepeatAdditionQuiz.java to alert the user 
 * if an answer is entered again. Hint: use an array list to store answers. 
 * @author Scott M.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise_11_16
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
                    System.out.println("You already entered " + answer + ".");
                else
                    answers.add(answer);
            } while (!answers.contains(question[0] + question[1]));
            System.out.println("You got it!");
            if (answers.size() == 1)
                correct++;
        }
        kb.close();
        
        System.out.print("\n" + correct + "/" + QUESTIONS + " correct");
    }
}