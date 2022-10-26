/** 
 * (Replace text) Listing 12.16, ReplaceText.java, gives a program that replaces 
 * text in a source file and saves the change into a new file. Revise the program to 
 * save the change into the original file. For example, invoking
 *      java Exercise12_16 file oldString newString
 * replaces oldString in the source file with newString.
 * @author Scott M.
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise_12_16 {
    /** Main method to run program. */
    public static void main(String[] args) throws IOException {
        String oldString = args[1], newString = args[2], fileString = "";
        File file = new File(args[0]);
        
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                fileString += input.nextLine() + "\n";
            }
        }
        catch (IOException ex) {
            System.out.print("File does not exist or is unreadable");
            System.exit(0);
        }
        
        try (PrintWriter output = new PrintWriter(file)) {
            int lastIndex = 0;
            for (int i = 0; i < fileString.length() - oldString.length(); i++) {
                if (fileString.substring(i, i + oldString.length()).contains(oldString)) {
                    output.print(fileString.substring(lastIndex, i) + newString);
                    lastIndex = i + newString.length();
                    i = lastIndex - 1;
                }
            }
            output.print(fileString.substring(lastIndex));
        }
    }
}
