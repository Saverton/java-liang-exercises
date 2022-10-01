/** Program to remove all instances of a specified String from a text file.
 * 
 * @author Scott M.
 * TextRemover.java
 */

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class TextRemover {
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
    
    /** Method to get the index of a certain phrase in a String */
    public static int getPhraseIndex(String str, String phrase) {
        for (int i = 0; i < str.length() - phrase.length() + 1; i++) {
            if (str.substring(i, i + phrase.length()).equals(phrase))
                return i;
        }
        return -1;
    }
}
