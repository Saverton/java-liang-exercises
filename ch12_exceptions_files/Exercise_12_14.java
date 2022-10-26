/** 
 * (Process scores in a text file) Suppose that a text file contains an unspecified 
 * number of scores separated by blanks. Write a program that prompts the user 
 * to enter the file, reads the scores from the file, and displays their total and 
 * average.
 * @author Scott M.
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Exercise_12_14 {
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
    
    /** 
     * Return the sum of all elements in an integer ArrayList.
     * @param arr ArrayList<Integer>: list of Integers
     * @return int: sum
     */
    public static int sum(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }
    
    /** 
     * Return the average (mean) of all elements in an Integer ArrayList.
     * @param arr ArrayList<Integer>: list of Integers
     * @return double: average
     */
    public static double average(ArrayList<Integer> arr) {
        return ((double)sum(arr) / arr.size());
    }
}
