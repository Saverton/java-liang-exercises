/**
 * Program where Students names and test scores are input via scanner, sorted in descending order of scores, and printed as such.
 * 
 * @author Scott M.
 * Students.java
 */

import java.util.Scanner;

public class Students {
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
        
        sortScores(scores, names);
        
        printScores(scores, names);
    }
    /**
     * Method to sort students scores descendingly and match names accordingly.
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
     * Method to print names and their respective scores.
     */
    public static void printScores(int[] scores, String[] names) {
        System.out.printf("%-10s: %s\n", "Name", "Score");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10s: %3d\n", names[i], scores[i]);
        }
    }
}