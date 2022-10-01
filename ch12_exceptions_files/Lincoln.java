/** Program to count the amount of words in Lincoln's Gettysburg address.
 * 
 * @author Scott M.
 * Lincoln.java
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Lincoln {
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
