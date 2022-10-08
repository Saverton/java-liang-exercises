/** Program to count the number of instances of a keyword in a directory using
 * recursion.
 * 
 * @author Scott M.
 * CountWords.java
 */

import java.util.Scanner;
import java.io.File;

public class CountWords {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String directory, keyword;
        
        System.out.print("Enter a directory or file: ");
        directory = kb.nextLine();
        System.out.print("Enter a keyword to search for: ");
        keyword = kb.next();
        
        System.out.print(countWords(new File(directory), keyword) + " instance(s) of " + keyword);
    }
    
    /** Return the number of instances of a keyword in a directory.
     * @params File or Directory to measure: java.io.File, keyword: String
     * @return Number of files: int
     */
    public static int countWords(File file, String keyword) {
        int instances = 0;
        
        if (file.isDirectory()) {
            File[] fileList = file.listFiles();
            for (int i = 0; i < fileList.length; i++) {
                instances += countWords(fileList[i], keyword);
            }
        }
        else if (file.isFile() && file.canRead()) {
            try {
                Scanner fileRead = new Scanner(file);
                while (fileRead.hasNext()) {
                    String tempLine = fileRead.nextLine();
                    while (tempLine.contains(keyword)) {
                        instances++;
                        tempLine = tempLine.substring(tempLine.indexOf(keyword) + keyword.length());
                    }
                }
            }
            catch (java.io.FileNotFoundException ex) {
                
            }
        }
        
        return (instances);
    }
}
