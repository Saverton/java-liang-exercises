/** 
 * (Count words) Write a program that counts the number of words in President 
 * Abraham Lincoln’s Gettysburg address from 
 * http://cs.armstrong.edu/liang/data/Lincoln.txt.
 * @author Scott M.
 */

import java.util.Scanner;
import java.io.IOException;
import java.net.URL;

public class Exercise_12_19 {
    /** Main method to run program. */
    public static void main(String[] args) {
        int count = 0;
        
        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");            Scanner input = new Scanner(url.openStream());
            
            while(input.hasNext()) {
                input.next();
                count++;
            }
            
            System.out.print("The Gettysburg Address has " + count + " words");
        }
        catch (java.net.MalformedURLException ex) {
            System.out.print("URL format wrong");
            System.exit(0);
        }
        catch (IOException ex) {
            System.out.print("Website doesn't exist or cannot be accessed.");
            System.exit(0);
        }
    }
}
