/**
 * Program to perform basic multidimensional array functions.
 * 
 * @author Scott M.
 * Functions.java
 */

import java.util.Scanner;

public class Library {
    /**
     * Return a 2d array of integers populated with user-entered data.
     * @param rows int: number of rows
     * @param columns int: number of columns
     * @return int[][]: 2d array of integers
     */
    public static int[][] createInt2(int rows, int columns) {
        Scanner kb = new Scanner (System.in);
        int[][] array = new int[rows][columns];
        
        System.out.println("Enter " + rows + " rows and " + columns + " columns:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = kb.nextInt();
            }
        }
        kb.close();
        return array;
    }
    /**
     * Return a 2d array of doubles populated with user-entered data.
     * @param rows int: number of rows
     * @param columns int: number of columns
     * @return double[][]: 2d array of doubles
     */
    public static double[][] createDouble2(int rows, int columns) {
        Scanner kb = new Scanner (System.in);
        double[][] array = new double[rows][columns];
        
        System.out.println("Enter " + rows + " rows and " + columns + " columns:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = kb.nextDouble();
            }
        }
        kb.close();
        return array;
    }
    /**
     * Return the sum of a specific row in a 2d integer array.
     * @param array int[][]: 2d integer array
     * @param row int: row index to sum
     * @return int: sum of row
     */
    public static int sumRow(int[][] array, int row) {
        int sum = 0;
        for (int i = 0; i < array[row].length; i++) {
            sum += array[row][i];
        }
        return sum;
    }
    /**
     * Return the sum of a specific row in a 2d double array.
     * @param array double[][]: 2d double array
     * @param row int: row index to sum
     * @return double: sum of row
     */
    public static double sumRow(double[][] array, int row) {
        double sum = 0;
        for (int i = 0; i < array[row].length; i++) {
            sum += array[row][i];
        }
        return sum;
    }
    /**
     * Return the sum of a specific column in a 2d integer array.
     * @param array int[][]: 2d integer array
     * @param column int: column index to sum
     * @return int: sum of column
     */
    public static int sumColumn(int[][] array, int column) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][column];
        }
        return sum;
    }
    /**
     * Return the sum of a specific column in a 2d double array.
     * @param array double[][]: 2d double array
     * @param column int: column index to sum
     * @return double: sum of column
     */
    public static double sumColumn(double[][] array, int column) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][column];
        }
        return sum;
    }
    /**
     * Return the sum of the major diagonal in a 2d integer array
     * @param array int[][]: 2d integer array
     * @return int: sum of major diagonal
     */
    public static int sumMajorDiag(int[][] array) {
        int sum = 0;
        for (int i = 0; i < Math.min(array.length, array[0].length); i++) {
            sum += array[i][i];
        }
        return sum;
    }
    /**
     * Return the sum of the major diagonal in a 2d double array
     * @param array double[][]: 2d double array
     * @return double: sum of major diagonal
     */
    public static double sumMajorDiag(double[][] array) {
        double sum = 0;
        for (int i = 0; i < Math.min(array.length, array[0].length); i++) {
            sum += array[i][i];
        }
        return sum;
    }
    /**
     * Return the index of the minimum value in an integer array.
     * @param array int[]: array of integers
     * @param startingIndex int: index to begin searching
     * @return int: index of minimum value
     */
    public static int minIndex(int[] array, int startingIndex) {
        int min = startingIndex;
        for (int j = startingIndex; j < array.length; j++) {
            if (array[j] < array[min]) {
                min = j;
            }
        }
        return min;
    }
    /**
     * Return the minimum value in an double array.
     * @param array double[]: array of doubles
     * @param startingIndex int: index to begin searching
     * @return int: index of minimum value
     */
    public static int minIndex(double[] array, int startingIndex) {
        int min = startingIndex;
        for (int j = startingIndex; j < array.length; j++) {
            if (array[j] < array[min]) {
                min = j;
            }
        }
        return min;
    }
    /**
     * Sort a single dimensional integer array.
     * @param array int[]: array of integers
     * @param startingIndex int: index to begin sorting from
     */
    public static void sortArray(int[] array, int startingIndex) {
        for (int i = startingIndex; i < array.length; i++) {
            int min = minIndex(array, 0), temp;
            
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    /**
     * Sort a single dimensional double array.
     * @param array double[]: array of doubles
     * @param startingIndex int: index to begin sorting from
     */
    public static void sortArray(double[] array, int startingIndex) {
        for (int i = startingIndex; i < array.length; i++) {
            int min = minIndex(array, 0); 
            double temp;
            
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    /**
     * Fill a 2d integer array with a single element
     * @param array int[][]: 2d array of integers
     * @param element int: element to fill array with
     */
    public static void fill(int[][] array, int element) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = element;
            }
        }
    }
    /**
     * Fill a 2d double array with a single element
     * @param array double[][]: 2d array of doubles
     * @param element double: element to fill array with
     */
    public static void fill(double[][] array, double element) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = element;
            }
        }
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
    /**
     * Print a 2d double array
     * @param array double[][]: 2d double array
     */
    public static void printArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
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
}