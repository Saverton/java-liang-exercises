/** Program to get the number of files in a directory using recursion.
 * 
 * @author Scott M.
 * CountFiles.java
 */

import java.util.Scanner;
import java.io.File;

public class CountFiles {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String directory;
        
        System.out.print("Enter a directory or file: ");
        directory = kb.nextLine();
        
        System.out.print(countFiles(new File(directory)) + " file(s)");
    }
    
    /** Return the number of files in a directory.
     * @params File or Directory to measure: java.io.File
     * @return Number of files: int
     */
    public static int countFiles(File file) {
        int numOfFiles = 0;
        
        if (file.isDirectory()) {
            File[] fileList = file.listFiles();
            for (int i = 0; i < fileList.length; i++) {
                numOfFiles += countFiles(fileList[i]);
            }
        }
        else if (file.isFile()) {
            numOfFiles += 1;
        }
        
        return (numOfFiles);
    }
}
