/** 
 * (Remove text) Write a program that removes all the occurrences of a specified 
 * string from a text file. For example, invoking
 * java Exercise12_11 John filename
 * removes the string John from the specified file. Your program should get the 
 * arguments from the command line.
 * @author Scott M.
 */

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class Exercise_12_11 {
    /** Main method to run program. */
    public static void main(String[] args) throws IOException {
        File file = new File(args[1]);
        String phrase = args[0];
        
        String newFile = "";
        
        try (Scanner output = new Scanner(file)) {
            while (output.hasNext()) {
                String currentLine = output.nextLine();
                int phraseIndex = getPhraseIndex(currentLine, phrase);
                while (phraseIndex != -1) {
                    currentLine = currentLine.substring(0, phraseIndex) +
                                  currentLine.substring(phraseIndex + phrase.length());
                    phraseIndex = getPhraseIndex(currentLine, phrase);
                }
                newFile += currentLine + "\n";
            }
        }
        
        try (PrintWriter input = new PrintWriter(file)) {
            input.print(newFile);
            System.out.print("Operation successful");
        }
    }
    
    /**
     * Return the index of a phrase within a larger String.
     * @param str String: larger string
     * @param phrase String: phrase to search for
     * @return int: phrase index
     */
    public static int getPhraseIndex(String str, String phrase) {
        for (int i = 0; i < str.length() - phrase.length() + 1; i++) {
            if (str.substring(i, i + phrase.length()).equals(phrase))
                return i;
        }
        return -1;
    }
}
