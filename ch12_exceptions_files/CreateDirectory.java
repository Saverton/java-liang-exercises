/** Program to create a directory of a user-entered name.
 * 
 * @author Scott M.
 * CreateDirectory.java
 */

import java.io.File;
import java.util.Scanner;

public class CreateDirectory {
    /** Main method to run program. */
    public static void main(String[] args) {
        String fileName;
        File directory;
        File thisFile = new File("CreateDirectory.java");
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter a name for the directory: ");
        fileName = kb.nextLine();
        
        directory = new File(thisFile.getParent(), fileName);
        if (directory.exists())
            System.out.print("Directory already exists");
        else if (directory.mkdir())
            System.out.print("Directory created successfully");
        else
            System.out.print("Directory unable to be created");
    }
}