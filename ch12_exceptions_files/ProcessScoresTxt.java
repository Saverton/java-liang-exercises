/** Program to process a list of scores from a text file of an
 * undefined length.
 * 
 * @author Scott M.
 * ProcessScoresTxt.java
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ProcessScoresTxt {
    /** Main method to run program. */
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        ArrayList<Integer> scores = new ArrayList<>();
        
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                try {
                    scores.add(Integer.parseInt(input.next()));
                }
                catch (NumberFormatException ex) {
                    System.out.print("invalid score, skipping");
                }
            }
        }
        catch (Exception ex) {
            System.out.print("File reading error; terminating program.");
            System.exit(0);
        }
        
        System.out.println("Total scores are " + sum(scores));
        System.out.println("Average score is " + average(scores));
    }
    
    /** Return sum of ints in an array list */
    public static int sum(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }
    
    /** Return average value in array list of integers */
    public static double average(ArrayList<Integer> arr) {
        return ((double)sum(arr) / arr.size());
    }
}
