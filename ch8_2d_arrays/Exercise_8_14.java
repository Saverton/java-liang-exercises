/**
 * (Explore matrix) Write a program that prompts the user to enter the length of a 
 * square matrix, randomly fills in 0s and 1s into the matrix, prints the matrix, and 
 * finds the rows, columns, and diagonals with all 0s or 1s. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_14 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int size, count = 0;
        
        System.out.print("Enter the size of the square matrix: ");
        size = kb.nextInt();
        kb.close();
        
        int[][] array = genArray(size, size);
        printArray(array);
        
        for (int i = 0; i < array.length; i++) {
            if (checkRow(array, i) != -1) {
                System.out.println("All " + checkRow(array, i) + "s on row " + i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No same numbers on a row");
        }
        else {
            count = 0;
        }
        
        for (int i = 0; i < array[0].length; i++) {
            if (checkColumn(array, i) != -1) {
                System.out.println("All " + checkColumn(array, i) + "s on column " + i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No same numbers on a column");
        }
        
        if (checkDiag(array, 1) != -1) {
            System.out.println("All " + checkColumn(array, 1) + "s on the major diagonal");
        }
        else {
            System.out.println("No same numbers on major diagonal");
        }
        if (checkDiag(array, -1) != -1) {
            System.out.println("All " + checkDiag(array, -1) + "s on the sub-diagonal");
        }
        else {
            System.out.println("No same numbers on the sub-diagonal");
        }
    }
    /**
     * Check if a row in a 2d array contains entirely one element.
     * @param array int[][]: 2d integer array
     * @param row int: row index
     * @return int: returns same value found in row, -1 if values in row are not homogenous
     */
    public static int checkRow(int[][] array, int row) {
        int val = array[row][0];
        for (int i = 1; i < array[row].length; i++) {
            if (array[row][i] != val) {
                return -1;
            }
        }
        return val;
    }
    /**
     * Check if a column in a 2d array contains entirely one element.
     * @param array int[][]: 2d integer array
     * @param column int: column index
     * @return int: value found in column, -1 if values aren't homogenous
     */
    public static int checkColumn(int[][] array, int column) {
        int val = array[0][column];
        for (int i = 1; i < array.length; i++) {
            if (array[i][column] != val) {
                return -1;
            }
        }
        return val;
    }
    /**
     * Check if a diagonal contains entirely one element.
     * @param array int[][]: 2d integer array
     * @param side int: diagonal to check (1=top to bottom left to right,-1=bottom to top left to right)
     * @return int: value found in diagonal, -1 if values aren't homogenous
     */
    public static int checkDiag(int[][] array, int side) {
        int val;
        if (side == 1) {
            val = array[0][0];
            for (int i = 0; i < array.length; i++) {
                if (val != array[i][i]) {
                    return -1;
                }
            }
        }
        else {
            val = array[0][array[0].length - 1];
            for (int i = 0; i < array[0].length; i++) {
                if (val != array[i][array[i].length - 1 - i]) {
                    return -1;
                }
            }
        }
        return val;
    }
    /**
     * Return a 2d array with x columns and y rows that is populated randomly with 0s and 1s.
     * @param rows int: number of rows
     * @param columns int: number of columns
     * @return int[][]: generated array of 0s and 1s
     */
    public static int[][] genArray(int rows, int columns) {
        int[][] array = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int)(Math.random() * 2);
            }
        }
        return array;
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