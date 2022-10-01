/**
 * Program to count a specific number of a type of char in a String.
 * 
 * @author Scott M.
 * CountChars.java
 */

import java.util.Scanner;

public class CountChars {
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
        
        System.out.print(a + " occurs " + count(str, a) + " times");
    }
    /**
     * Method to count a specific type of char in a String.
     */
    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count += (str.charAt(i) == a) ? 1 : 0;
        }
        return count;
    }
}