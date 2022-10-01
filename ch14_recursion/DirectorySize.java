/** Program to get the size of a directory using an iterative approach.
 * 
 * @author Scott M.
 * DirectorySize.java
 */

import java.util.Scanner;
import java.io.File;

public class DirectorySize {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String directory;
        
        System.out.print("Enter a directory or file: ");
        directory = kb.nextLine();
        
        System.out.print(getSize(new File(directory)) + " bytes");
    }
    
    /** Return the size of a file/directory in bytes.
     * @params File or Directory to measure: java.io.File
     * @return File size in bytes: long
     */
    public static long getSize(File file) {
        long size = 0;
        
        if (file.isDirectory()) {
            File[] list = file.listFiles();
            for (int i = 0; i < list.length; i++) {
                if (list[i].isFile()) {
                    size += list[i].length();
                }
                else if (list[i].isDirectory()) {
                    File[] list2 = list[i].listFiles();
                    for (int j = 0; j < list2.length; j++) {
                        if (list2[j].isFile()) {
                            size += list[i].length();
                        }
                        else if (list[i].isDirectory()) {
                            System.out.println("File too deep for nonrecursive method.");
                        }
                    }
                }
            }
        }
        else {
            size += file.length();
        }
        
        return (size);
    }
}