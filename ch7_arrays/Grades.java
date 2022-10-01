/**
 * Program to grade a list of test scores out of the best score in the bunch.
 * 
 * @author Scott M.
 * Grades.java
 */

import java.util.Scanner;

public class Grades {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int students;
        
        System.out.print("Enter the number of students: ");
        students = kb.nextInt();
        
        int[] scores = new int[students];
        
        System.out.print("Enter " + students + " scores: ");
        for (int i = 0; i < students; i++) {
            scores[i] = kb.nextInt();
        }
        
        //Compare scores to max and print grade;
        printGrades(scores, getBestScore(scores));
    }
    /**
     * Method to get the best score from an array of scores.
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
     * Method to compare scores to max score and print grade.
     */
    public static void printGrades(int[] scores, int best) {
        char[] grades = {'A', 'B', 'C', 'D', 'F'};
        int temp;
        
        for (int i = 0; i < scores.length; i++) {
            temp = (best - scores[i] - 1) / 10;
            if (temp > 4) {
                temp = 4;
            }
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[temp]);
        }
    }
}