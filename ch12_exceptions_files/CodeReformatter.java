/** Program to reformat a java text file from next-line style to end-of-line
 * style.
 * 
 * @author Scott M.
 * CodeReformatter.java
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class CodeReformatter {
    /** Main method to run program */
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.print("No File Entered");
            System.exit(0);
        }
        File file = new File(args[0]);
        
        String finalFile = "";
        int count = 0;
        
        try (Scanner output = new Scanner(file)) {
            while (output.hasNext()) {
                String currentLine = output.nextLine();
                if (currentLine.trim().length() > 0 && currentLine.trim().charAt(0) == '{') {
                    finalFile += " {";
                }
                else {
                    finalFile += (count != 0) ? "\n" + currentLine : currentLine;
                }
                count++;
            }
        }
        
        
        try (PrintWriter input = new PrintWriter(file)) {
            input.print(finalFile);
            System.out.print("Operation Successful");
        }
        catch (Exception ex) {
            System.out.print("Operation Unsuccessful");
        }
    }
}
