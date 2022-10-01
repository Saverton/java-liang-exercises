/** Program to replace all instances of a keyword in a directory using
 * recursion.
 * 
 * @author Scott M.
 * ReplaceWords.java
 */

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class ReplaceWords {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String directory, oldWord, newWord;
        
        System.out.print("Enter a directory or file: ");
        directory = kb.nextLine();
        System.out.print("Enter a word to replace: ");
        oldWord = kb.next();
        kb.nextLine();
        System.out.print("Enter a new word to replace the old word with: ");
        newWord = kb.next();
        
        replaceWords(new File(directory), oldWord, newWord);
        System.out.print("Process complete");
    }
    
    /** Return the number of instances of a keyword in a directory.
     * @params File or Directory to measure: java.io.File, old word to replace: String, word to replace with: String
     */
    public static void replaceWords(File file, String oldWord, String newWord) {
        if (file.isDirectory()) {
            File[] fileList = file.listFiles();
            for (int i = 0; i < fileList.length; i++) {
                replaceWords(fileList[i], oldWord, newWord);
            }
        }
        else if (file.isFile() && file.canRead()) {
            try {
                int instances = 0;
                Scanner fileRead = new Scanner(file);
                String fileString = "";
                
                while (fileRead.hasNext()) {
                    String tempLine = fileRead.nextLine();
                    while (tempLine.contains(oldWord)) {
                        instances++;
                        tempLine = tempLine.substring(0, tempLine.indexOf(oldWord)) + newWord + tempLine.substring(tempLine.indexOf(oldWord) + oldWord.length());
                    }
                    fileString += tempLine + "\n";
                }
                fileRead.close();
                
                try (PrintWriter replaceText = new PrintWriter(file)) {
                    replaceText.print(fileString);
                    System.out.println("Replaced " + instances + " instance(s) in " + file.getName());
                }
            }
            catch (java.io.FileNotFoundException ex) {
            }
        }
    }
}
