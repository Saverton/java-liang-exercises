/**
 * (Sort two-dimensional array) Write a method to sort a two-dimensional array 
 * using the following header:
 *      public static void sort(int m[][])
 *  The method performs a primary sort on rows and a secondary sort on columns. 
 * For example, the following array 
 *      {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
 * will be sorted to 
 *      {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
 * @author Scott M.
 * Sort2dArray.java
 */

import java.util.Scanner;

public class Exercise_8_16 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[][] array = new int[6][2];
        
        System.out.print("Enter a 2d arrray (6 rows, 2 columns): ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = kb.nextInt();
            }
        }
        kb.close();
        
        Sort2dArray(array);
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    /**
     * Return a 2d integer array sorted such that any rows that share first indexes will be sorted by subsequent indexes.
     * @param array int[][]: array to sort similar rows
     * @return int[][]: sorted array
     * Precondition: array must already be sorted by first indexes of sub-arrays
     */
    public static int[][] sortRowSubsets(int[][] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (array[j][0] == array[j - 1][0]) {
                if (array[j][1] < array[j - 1][1]) {
                    int[] temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
                else {
                    break;
                }
            }
        }
        return array;
    }
    /**
     * Return a 2d integer array sorted by the first index of each row.
     * @param array int[][]: array to sort
     * @return int[][]: sorted array
     */
    public static int[][] sortRows(int[][] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j][0] > array[j - 1][0]) {
                    break;
                }
                int[] temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }
        return array;
    }
    /**
     * Sort a 2d array by indexes of each sub-array without sorting the sub-arrays.
     * @param array int[][]: array to sort
     * @return int[][]: sorted array
     */
    public static int[][] Sort2dArray(int[][] array) {
        return sortRowSubsets(sortRows(array));
    }
}