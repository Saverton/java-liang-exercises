/** Program to add a package statement to all files under a directory.
 * @author Scott M.
 * RemovePackageStatement.java
 */

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class RemovePackageStatement {
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
            while (read.hasNext()) {
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
