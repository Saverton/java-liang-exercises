/**
 * (Sort characters in a string) Write a method that returns a sorted string using the 
 * following header:
 *      public static String sort(String s)
 * For example, sort("acb") returns abc.
 * Write a test program that prompts the user to enter a string and displays the sorted 
 * string.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_34 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String sorted;
        
        System.out.print("Enter a string: ");
        sorted = sortString(kb.nextLine());
        kb.close();
        
        System.out.print(sorted);
    }
    /**
     * Return the alphabetically sorted version of a string.
     * @param input String: string to sort
     * @return String: sorted string
     */
    public static String sortString(String input) {
        int index;
        //Sorting method
        for (int i = 1; i < input.length(); i++) {
            index = i;
            for (int j = i; j >= 0; j--) {
                if (input.charAt(i) < input.charAt(j)) {
                    index = j;
                }
            }
            input = input.substring(0, index) + input.charAt(i) + input.substring(index, i) + input.substring(i + 1);
        }
        return input;
    }
}