/**
 * (Revise selection sort) In Section 7.11, you used selection sort to sort an array. 
 * The selection-sort method repeatedly finds the smallest number in the current 
 * array and swaps it with the first. Rewrite this program by finding the largest number 
 * and swapping it with the last. Write a test program that reads in ten double 
 * numbers, invokes the method, and displays the sorted numbers.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_20 {
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
        
        array = selectionSort(array);
        
        printArray(array);
    }
    /**
     * Return a sorted array of integers using a selection sort.
     * @param array int[]: array of integers
     * @return int[]: sorted array
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
    /**
     * Print out each element of an array separated by commas
     * @param int[]: array of integers
     */
    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print((i == list.length - 1) ? list[i] : list[i] + ", ");
        }
    }
}