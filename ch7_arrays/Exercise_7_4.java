/**
 * (Analyze scores) Write a program that reads an unspecified number of scores and 
 * determines how many scores are above or equal to the average and how many 
 * scores are below the average. Enter a negative number to signify the end of the 
 * input. Assume that the maximum number of scores is 100.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_4 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int length = 0, sum = 0, count = 0;
        double average;
        int[] scores = new int[100];
        
        //1. Input the scores in the array;
        System.out.print("Enter up to 100 scores (input ends with negative): ");
        for (int i = 0; i < 100; i++) {
            scores[i] = kb.nextInt();
            if (scores[i] < 0) {
                break;
            }
            length++;
        }
        kb.close();
        
        //2. Calculate the average score;
        for (int i = 0; i < length; i++) {
            sum += scores[i];
        }
        average = (double)sum / length;
        
        //3. Count how many scores are above average;
        for (int i = 0; i < length; i++) {
            count += (scores[i] > average) ? 1 : 0;
        }
        
        //4. Display Results;
        System.out.println("The average is " + average);
        System.out.print("The number of scores above average is " + count);
    }
}