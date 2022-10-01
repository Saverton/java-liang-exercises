/** Program to count the case-insensitive occurrences of each letter in a user-entered
 * text file.
 * 
 * @author Scott M.
 * CountLetters.java
 */

import java.util.Scanner;
import java.io.File;

public class CountLetters {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        File file;
        String fileName;
        int[] letters = new int[26];
        
        System.out.print("Enter a filename: ");
        fileName = kb.nextLine();
        file = new File(fileName);
        
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String thisLine = input.nextLine();
                System.out.println(thisLine);
                for (int i = 0; i < thisLine.length(); i++) {
                    char character = thisLine.charAt(i);
                    if (Character.isLetter(character))
                        letters[Character.toUpperCase(character) - 'A']++;
                }
            }
        }
        catch (java.io.IOException ex) {
            System.out.print("File cannot be read");
            System.exit(0);
        }
        
        for (int i = 0; i < letters.length; i++) {
            System.out.println("Number of " + (char)(i + 'A') + "'s: " + letters[i]);
        }
    }
}