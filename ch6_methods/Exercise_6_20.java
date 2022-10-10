/**
 * (Count the letters in a string) Write a method that counts the number of letters in 
 * a string using the following header:
 *      public static int countLetters(String s)
 * Write a test program that prompts the user to enter a string and displays the number 
 * of letters in the string.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_6_20 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String s;
        
        System.out.print("Enter a string: ");
        s = kb.nextLine();
        kb.close();
        
        System.out.print("There are " + countLetters(s) + " letters");
    }
    /**
     * return the number of letters (a-zA-Z) in a string
     * @param String: string
     * @return int: number of letters
     */
    public static int countLetters(String s) {
        int letters = 0;
        for (int i = 0; i < s.length(); i++) {
            letters += (Character.toUpperCase(s.charAt(i)) >= 'A' && Character.toUpperCase(s.charAt(i)) <= 'Z') ? 1 : 0;
        }
        return letters;
    }
}