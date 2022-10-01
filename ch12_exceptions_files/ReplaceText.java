/** Program to replace an old String in a text file with a new String.
 * 
 * @author Scott M.
 * ReplaceText.java
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ReplaceText {
    /** Main method to run program. */
    public static void main(String[] args) throws IOException {
        String oldString = args[1], newString = args[2], fileString = "";
        File file = new File(args[0]);
        ArrayList<Integer> indexes = new ArrayList<>();
        
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
