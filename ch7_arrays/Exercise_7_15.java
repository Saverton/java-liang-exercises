/**
 * (Eliminate duplicates) Write a method that returns a new array by eliminating the 
 * duplicate values in the array using the following method header:
 *      public static int[] eliminateDuplicates(int[] list)
 * Write a test program that reads in ten integers, invokes the method, and displays 
 * the result.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_15 {
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
        
        System.out.print("New array is ");
        printArray(eliminateDuplicates(array));
    }
    /**
     * Remove any duplicate elements in an array of integers.
     * @param list int[]: array of integers
     * @return int[]: array without duplicate elements
     */
    public static int[] eliminateDuplicates(int[] list) {
        int count = 0;
        //1. Process each element of the array
        for (int i = 0; i < list.length; i++) {
            //2. Check if an element is found earlier in the array.
            if (searchArrayPortion(list, list[i], 0, i) == -1) {
                //3. If not, add it to the resulting array.
                list[count] = list[i];
                count++;
            }
        }
        //4. Return resulting array.
        return arraySegment(list, 0, count);
    }
    /**
     * Return the index of a specific key in an array in the range from index a (inclusive) to index b (non-inclusive).
     * @param array int[]: array of integers
     * @param key int: key to search for
     * @param a int: starting index
     * @param b int: ending index
     * @return int: index of first instance of key, -1 if key isn't found
     */
    public static int searchArrayPortion(int[] array, int key, int a, int b) {
        for (int i = a; i < b; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
    /**
     * Return a segment of an integer array from a given starting index (inclusive) to an ending index (non-inclusive).
     * @param array int[]: array of integers
     * @param a int: starting index
     * @param b int: ending index
     * @return int[]: segment of original array
     */
    public static int[] arraySegment(int[] array, int a, int b) {
        int[] newArray = new int[b - a];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i + a];
        }
        return newArray;
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