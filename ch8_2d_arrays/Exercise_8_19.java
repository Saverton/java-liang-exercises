/**
 * (Pattern recognition: four consecutive equal numbers) Write the following 
 * method that tests whether a two-dimensional array has four consecutive numbers 
 * of the same value, either horizontally, vertically, or diagonally. 
 *      public static boolean isConsecutiveFour(int[][] values) 
 * Write a test program that prompts the user to enter the number of rows and columns 
 * of a two-dimensional array and then the values in the array and displays 
 * true if the array contains four consecutive numbers with the same value.
 * Otherwise, display false.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_19 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int rows, columns;
        int[][] array;
        
        System.out.print("Enter the number of rows followed by the number of columns in the array: ");
        rows = kb.nextInt();
        columns = kb.nextInt();
        kb.close();
        
        array = generate2dArray(rows, columns);
        printArray(array);
        System.out.print((consecutiveFour(array)) ? "There is a consecutive four" : "There isn't a consecutive four");
    }
    /**
     * Return a 2d array with a given number of rows and columns populated with random integers from 0-9
     * @param rows int: number of rows
     * @param columns int: number of columns
     * @return int[][]: generated array
     */
    public static int[][] generate2dArray(int rows, int columns) {
        int[][] array = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * 10);
            }
        }
        return array;
    }
    /**
     * Check if a 2d array of integers has any set of consecutive four numbers vertically, horizontally, or diagonally.
     * @param array int[][]: array to check
     * @return boolean: true = consecutive four is found, false otherwise
     */
    public static boolean consecutiveFour(int[][] array) {
        if (array.length < 4 || array[0].length < 4) {
            return false;
        }
        
        //check rows
        for (int i = 0; i < array.length; i++) {
            int val = array[i][0], consecCount = 1;
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] == val) {
                    consecCount++;
                } else {
                    consecCount = 1;
                    val = array[i][j];
                }
                if (consecCount == 4) {
                    return true;
                }
            }
        }
        
        //check columns
        for (int i = 0; i < array[0].length; i++) {
            int val = array[0][i], consecCount = 1;
            for (int j = 1; j < array.length; j++) {
                if (array[j][i] == val) {
                    consecCount++;
                } else {
                    consecCount = 1;
                    val = array[j][i];
                }
                if (consecCount == 4) {
                    return true;
                }
            }
        }
        
        //check major diagonals
        int numDiags = (array.length + array[0].length) - 7;
        for (int i = 0; i < numDiags; i++) {
            int j = (array.length - 4 - i >= 0) ? array.length - 4 - i : 0;
            int k = (array.length - 4 - i >= 0) ? 0 : Math.abs(array.length - 4 - i);
            int consecCount = 0, val = array[j][k];
            for ( ; j < array.length && k < array[j].length; j++, k++) {
                if (array[j][k] == val) {
                    consecCount++;
                } else {
                    consecCount = 1;
                    val = array[j][k];
                }
                if (consecCount == 4) {
                    return true;
                }
            }
        }
        
        //check sub diagonals
        for (int i = 0; i < numDiags; i++) {
            int j = (3 + i < array.length) ? 3 + i : array.length - 1;
            int k = (3 + i < array.length) ? 0 : (3 + i) - (array.length - 1);
            int consecCount = 0, val = array[j][k];
            for ( ; j >= 0 && k < array[j].length; j--, k++) {
                if (array[j][k] == val) {
                    consecCount++;
                } else {
                    consecCount = 1;
                    val = array[j][k];
                }
                if (consecCount == 4) {
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * Print a 2d integer array.
     * @param array int[][]: 2d array of integers
     */
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}