/** 
 * (Process scores in a text file on the Web) Suppose that the text file on the 
 * Web http://cs.armstrong.edu/liang/data/Scores.txt contains an unspecified number 
 * of scores. Write a program that reads the scores from the file and displays their 
 * total and average. Scores are separated by blanks.
 * @author Scott M.
 */

import java.util.Scanner;
import java.net.URL;
import java.util.ArrayList;

public class Exercise_12_23 {
    /** Main method to run program. */
    public static void main(String[] args) {
        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
            Scanner input = new Scanner(url.openStream());
            ArrayList<Integer> scores = new ArrayList<>();
            
            while (input.hasNext()) {
                scores.add(input.nextInt());
            }
            input.close();
            
            System.out.println("Total is " + sum(scores));
            System.out.print("Average is " + average(scores));
        }
        catch (java.net.MalformedURLException ex) {
            System.out.print("Website URL is not formatted correctly.");
            System.exit(0);
        }
        catch (java.io.IOException ex) {
            System.out.print("File cannot be read");
            System.exit(0);
        }
        
    }
    
    /** 
     * Return the sum of all elements in an Integer array list.
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