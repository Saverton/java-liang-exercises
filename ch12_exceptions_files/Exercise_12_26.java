/** 
 * (Create a directory) Write a program that prompts the user to enter a directory 
 * name and creates a directory using the File’s mkdirs method. The program 
 * displays the message “Directory created successfully” if a directory is created 
 * or “Directory already exists” if the directory already exists.
 * @author Scott M.
 */

import java.io.File;
import java.util.Scanner;

public class Exercise_12_26 {
    /** Main method to run program. */
    public static void main(String[] args) {
        String fileName;
        File directory;
        File thisFile = new File("CreateDirectory.java");
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter a name for the directory: ");
        fileName = kb.nextLine();
        kb.close();
        
        directory = new File(thisFile.getParent(), fileName);
        if (directory.exists())
            System.out.print("Directory already exists");
        else if (directory.mkdir())
            System.out.print("Directory created successfully");
        else
            System.out.print("Directory unable to be created");
    }
}