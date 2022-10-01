/**
 * Program to read an array of scores of an unspecified length less than 100. The program will calculate the average score and then print how many
 * scores are above the average score.
 * 
 * @author Scott M.
 * Scores.java
 */

import java.util.Scanner;

public class Scores {
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