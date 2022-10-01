/**
 * Program to process an array to check if there are any rows, columns, or
 * diagonals with four consecutive equal entries.
 * 
 * @author Scott M.
 * FourConsecutive.java
 */

import java.util.Scanner;

public class FourConsecutive {
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
        array = new int[rows][columns];
        
        generate(array);
        Functions.printArray(array);
        System.out.print((consecutiveFour(array)) ? "There is a consecutive four" : "There isn't a consecutive four");
    }
    /**
     * Method to fill a 2 dimensional array with random ints from 0-9.
     */
    public static void generate(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * 10);
            }
        }
    }
    /**
     * Method to check for four consecutive numbers in an array.
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
}