/**
 * Program to count the letters in a string.
 * 
 * @author Scott M.
 * CountLetters.java
 */

import java.util.Scanner;

public class CountLetters {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String s;
        
        System.out.print("Enter a string: ");
        s = kb.nextLine();
        
        System.out.print("There are " + countLetters(s) + " letters");
    }
    /**
     * Method to count the number of letters in a string.
     */
    public static int countLetters(String s) {
        int letters = 0;
        for (int i = 0; i < s.length(); i++) {
            letters += (Character.toUpperCase(s.charAt(i)) >= 'A' && Character.toUpperCase(s.charAt(i)) <= 'Z') ? 1 : 0;
        }
        return letters;
    }
}