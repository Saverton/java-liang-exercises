/** 
 * (Count characters, words, and lines in a file) Write a program that will count 
 * the number of characters, words, and lines in a file. Words are separated by 
 * whitespace characters. The file name should be passed as a command-line 
 * argument, as shown in Figure 12.13.
 * @author Scott M.
 */

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Exercise_12_13 {
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
                    thisLine.next();
                    words++;
                }
                thisLine.close();
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
