/**
 * (Sort students) Write a program that prompts the user to enter the number of students, 
 * the students’ names, and their scores, and prints student names in decreasing 
 * order of their scores.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_17 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int scoresCount;
        
        System.out.print("Enter the total number of scores: ");
        scoresCount = kb.nextInt();
        
        int[] scores = new int[scoresCount];
        String[] names = new String[scoresCount];
        
        System.out.print("Enter the names: ");
        for (int i = 0; i < names.length; i++) {
            names[i] = kb.next();
        }
        System.out.print("Enter the scores in the order of the names: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = kb.nextInt();
        }
        kb.close();

        sortScores(scores, names);
        
        printScores(scores, names);
    }
    /**
     * Sort an array of scores, keep twin array of names consistent with it's indexes.
     * @param scores int[]: integer array of test scores
     * @param names String[]: String array of student names
     */
    public static void sortScores(int[] scores, String[] names) {
        int currentScore;
        String currentName;
        
        for (int i = 0; i < scores.length; i++) {
            currentScore = scores[i];
            currentName = names[i];
            for (int j = 1; j <= i; j++) {
                if (currentScore < scores[i - j]) {
                    scores[i - j + 1] = scores[i - j];
                    scores[i - j] = currentScore;
                    names[i - j + 1] = names[i - j];
                    names[i - j] = currentName;
                }
                else {
                    break;
                }
            }
        }
    }
    /**
     * Print student names and their corresponding test scores from an array of names and scores.
     * @param scores int[]: integer array of student scores
     * @param names String[]: String array of student names
     */
    public static void printScores(int[] scores, String[] names) {
        System.out.printf("%-10s: %s\n", "Name", "Score");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10s: %3d\n", names[i], scores[i]);
        }
    }
}