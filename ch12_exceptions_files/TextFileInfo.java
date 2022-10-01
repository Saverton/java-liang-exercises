/** Program to take a text file and return basic information about it.
 * 
 * @author Scott M.
 * TextFileInfo.java
 */

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class TextFileInfo {
    /** Main method to run program */
    public static void main(String[] args) throws IOException {
        File file;
        int characters = 0, words = 0, lines = 0;
        
        if (args.length == 0) {
            System.out.print("No file entered");
            System.exit(0);
        }
        file = new File(args[0]);
        
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String currentLine = input.nextLine();
                Scanner thisLine = new Scanner(currentLine);
                while (thisLine.hasNext()) {
                    String currentWord = thisLine.next();
                    words++;
                }
                characters += currentLine.length();
                lines++;
            }
        }
        catch (Exception ex) {
            System.out.print("File reading error; terminating program.");
            System.exit(0);
        }
        
        System.out.print("File " + file.getName() + " has\n" + characters + " characters\n" +
                         words + " words\n" + lines + " lines");
    }
}
