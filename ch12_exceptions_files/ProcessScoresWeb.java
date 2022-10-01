/** Program to process a list of Scores taken from the web.
 * 
 * @author Scott M.
 * ProcessScoresWeb.java
 */

import java.util.Scanner;
import java.net.URL;
import java.util.ArrayList;

public class ProcessScoresWeb {
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