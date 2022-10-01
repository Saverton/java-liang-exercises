/** Program to replace an old String in a text file with a new String.
 * 
 * @author Scott M.
 * ReplaceDir.java
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ReplaceDir {
    /** Main method to run program. */
    public static void main(String[] args) throws IOException {
        String oldString = args[1], newString = args[2];
        File file = new File(args[0]);
        File[] directory = file.listFiles();
        
        for (int i = 0; i < directory.length; i++) {
            if (!directory[i].canRead() || !directory[i].canWrite())
                continue;
            ArrayList<Integer> indexes = new ArrayList<>();
            String fileString = "";
            try (Scanner input = new Scanner(directory[i])) {
                while (input.hasNext()) {
                    fileString += input.nextLine() + "\n";
                }
            }
            catch (IOException ex) {
                System.out.print("File does not exist or is unreadable");
                System.exit(0);
            }
            
            try (PrintWriter output = new PrintWriter(directory[i])) {
                int lastIndex = 0;
                for (int j = 0; j < fileString.length() - oldString.length(); j++) {
                    if (fileString.substring(j, j + oldString.length()).contains(oldString)) {
                        output.print(fileString.substring(lastIndex, j) + newString);
                        lastIndex = j + newString.length();
                        j = lastIndex - 1;
                    }
                }
                output.print(fileString.substring(lastIndex));
            }
        }
    }
}
