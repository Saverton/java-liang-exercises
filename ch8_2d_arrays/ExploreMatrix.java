/**
 * Program to generate a random array of 0s and 1s and return all rows and columns with solely 0s or 1s.
 * 
 * @author Scott M.
 * ExploreMatrix.java
 */

import java.util.Scanner;

public class ExploreMatrix {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int size, count = 0;
        
        System.out.print("Enter the size of the square matrix: ");
        size = kb.nextInt();
        
        int[][] array = Functions.genArray(size, size);
        Functions.printArray(array);
        
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
     * Method to check if a row in a two dimensional array is all the same element.
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
     * Method to check if a column in a two dimensional array is all the same element.
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
     * Method to check the diagonals for all of one value, then return that value.
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
}