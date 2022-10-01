/**
 * Program to sort chars in a string.
 * 
 * @author Scott M.
 * StringSort.java
 */

import java.util.Scanner;

public class StringSort {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String sorted;
        
        System.out.print("Enter a string: ");
        sorted = sortString(kb.nextLine());
        
        System.out.print(sorted);
    }
    /**
     * Method to sort a string.
     */
    public static String sortString(String input) {
        String output = "";
        int index;
        char temp;
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