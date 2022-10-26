/** 
 * (Reformat Java source code) Write a program that converts the Java source 
 * code from the next-line brace style to the end-of-line brace style. For example, 
 * the following Java source in (a) uses the next-line brace style. Your program 
 * converts it to the end-of-line brace style in (b).
 * Your program can be invoked from the command line with the Java source
 * code file as the argument. It converts the Java source code to a new format. For 
 * example, the following command converts the Java source-code file Test.java
 * to the end-of-line brace style.
 * @author Scott M.
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class Exercise_12_12 {
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
