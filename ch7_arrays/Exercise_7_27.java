/**
 * (Strictly identical arrays) The arrays list1 and list2 are strictly identical
 * if their corresponding elements are equal. Write a method that returns true if 
 * list1 and list2 are strictly identical, using the following header:
 *      public static boolean equals(int[] list1, int[] list2)
 * Write a test program that prompts the user to enter two lists of integers and displays 
 * whether the two are strictly identical. Here are the sample runs. Note that 
 * the first number in the input indicates the number of the elements in the list. This 
 * number is not part of the list.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_27 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter list1: ");
        int[] list1 = new int[kb.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = kb.nextInt();
        }
        
        System.out.print("Enter list2: ");
        int[] list2 = new int[kb.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = kb.nextInt();
        }
        kb.close();
        
        System.out.print((equals(list1, list2)) ? "Two lists are strictly identical" : "Two lists are not strictly identical");
    }
    /**
     * Check if two arrays of integers are strictly identical
     * @param list1 int[]: array of integers
     * @param list2 int[]: array of integers
     * @return boolean: true = arrays are strictly identical, false otherwise
     */
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}