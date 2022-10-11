/**
 * (Assign grades) Write a program that reads student scores, gets the best score, 
 * and then assigns grades based on the following scheme:
 * Grade is A if score is >= best - 10
 * Grade is B if score is >= best - 20;
 * Grade is C if score is >= best - 30;
 * Grade is D if score is >= best - 40;
 * Grade is F otherwise.
 * The program prompts the user to enter the total number of students, then prompts 
 * the user to enter all of the scores, and concludes by displaying the grades. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_1 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int students;
        
        System.out.print("Enter the number of students: ");
        students = kb.nextInt();
        kb.close();
        
        int[] scores = new int[students];
        
        System.out.print("Enter " + students + " scores: ");
        for (int i = 0; i < students; i++) {
            scores[i] = kb.nextInt();
        }
        
        //Compare scores to max and print grade;
        printGrades(scores, getBestScore(scores));
    }
    /**
     * Return the best (highest) score from an array of integer scores.
     * @param scores int[]: array of scores
     * @return int: best score
     */
    public static int getBestScore(int[] scores) {
        int max = scores[0];
        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        
        return max;
    }
    /**
     * Print out a list of scores and their grade obtained by comparing to the best score.
     * @param scores int[]: array of scores
     * @param best int: best score
     */
    public static void printGrades(int[] scores, int best) {
        char[] grades = {'A', 'B', 'C', 'D', 'F'};
        int temp;
        
        for (int i = 0; i < scores.length; i++) {
            temp = Math.min((best - scores[i] - 1) / 10, 4);
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[temp]);
        }
    }
}