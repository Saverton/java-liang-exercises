/**
 * Program to check if a list is sorted or not.
 * 
 * @author Scott M.
 * Sorted.java
 */

import java.util.Scanner;

public class Sorted {
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
        
        System.out.print((isSorted(array)) ? "The list is sorted" : "The list is not sorted");
    }
    /**
     * Method to check if an array is sorted or not.
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