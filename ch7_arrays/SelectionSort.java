/**
 * Program to use a revised selection sort.
 * 
 * @author Scott M.
 * SelectionSort.java
 */

import java.util.Scanner;

public class SelectionSort {
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
        
        array = selectionSort(array);
        
        Reverse.printArray(array);
    }
    /**
     * Method to perform a selection sort.
     */
    public static int[] selectionSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int currentMax = array[i];
            int currentMaxIndex = i;
            
            //find currentMax and currentMaxIntex
            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < array[j]) {
                    currentMax = array[j];
                    currentMaxIndex = j;
                }
            }
            
            //if the currentMaxIndex is different than the current index, switch the maxIndex with the currentIndex
            if (currentMaxIndex != i) {
                array[currentMaxIndex] = array[i];
                array[i] = currentMax;
            }
        }
        return array;
    }
}