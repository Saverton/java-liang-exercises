/**
 * Program to sort a 2d array primarily by row, but then by column.
 * 
 * @author Scott M.
 * Sort2dArray.java
 */

import java.util.Scanner;

public class Sort2dArray {
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
        
        sortRowSubsets(sortRows(array)) ;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    /**
     * Method to sort arrays in an array based on subsequent entries.
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
     * Method to sort rows of a 2d array by first index.
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
}