/**
 * (Remove package statement) Suppose you have Java source files under the 
 * directories chapter1, chapter2, . . . , chapter34. Write a program to 
 * remove the statement package chapteri; in the first line for each Java 
 * source file under the directory chapteri. Suppose chapter1, chapter2,
 * . . . , chapter34 are under the root directory srcRootDirectory. The root 
 * directory and chapteri directory may contain other folders and files. Use 
 * the following command to run the program:
 *      java Exercise_12_20 srcRootDirectory
 * @author Scott M.
 */

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class Exercise_12_20 {
    /** Main method to run program. */
    public static void main(String[] args) throws IOException {
        File directory = new File(args[0]);
        String dirName = directory.getName();
        Scanner read;
        PrintWriter write;
        File[] files = new File[1];
        if (directory.exists() && directory.isDirectory())
             files = directory.listFiles();
        else {
            System.out.print("File does not exist or is not a directory.");
            System.exit(1);
        }
        
        for (File file: files) {
            if (!file.canRead() || !file.canWrite())
                continue;
            boolean inserted = false;
            String fileString = "";
            read = new Scanner(file);
            while (read.hasNext() && !inserted) {
                String thisLine = read.nextLine();
                if (thisLine.contains("package " + dirName))
                    continue;
                fileString += thisLine + "\n";
            }
            read.close();
        
            write = new PrintWriter(file);
            write.print(fileString);
            write.close();
            
            System.out.println("File " + file.getName() + " successful");
        }
        
        System.out.println("Program complete.");
    }
}
