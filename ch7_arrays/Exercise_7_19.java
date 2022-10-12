/**
 * (Sorted?) Write the following method that returns true if the list is already sorted 
 * in increasing order.
 *      public static boolean isSorted(int[] list)
 * Write a test program that prompts the user to enter a list and displays whether 
 * the list is sorted or not. Here is a sample run. Note that the first number in the 
 * input indicates the number of the elements in the list. This number is not part 
 * of the list. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_19 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int[] array = new int[10];
        
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = kb.nextInt();
        }
        kb.close();
        
        System.out.print((isSorted(array)) ? "The list is sorted" : "The list is not sorted");
    }
    /**
     * Check if an array is sorted in increasing numerical order.
     * @param array int[]: integer array
     * @return boolean: true = array is sorted, false otherwise
     */
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}