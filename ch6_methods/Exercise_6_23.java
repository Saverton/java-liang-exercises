/**
 * (Occurrences of a specified character) Write a method that finds the number of 
 * occurrences of a specified character in a string using the following header:
 *      public static int count(String str, char a)
 * For example, count("Welcome", 'e') returns 2. Write a test program that 
 * prompts the user to enter a string followed by a character and displays the number 
 * of occurrences of the character in the string.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_6_23 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String str;
        char a;
        
        System.out.print("Enter a string: ");
        str = kb.nextLine();
        System.out.print("Enter a char: ");
        a = kb.next().charAt(0);
        kb.close();
        
        System.out.print(a + " occurs " + count(str, a) + " times");
    }
    /**
     * return the number of times a char occurs in a given string.
     * @params String: string, char: character to count;
     * @return number of times char shows up in string
     */
    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count += (str.charAt(i) == a) ? 1 : 0;
        }
        return count;
    }
}