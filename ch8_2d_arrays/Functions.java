/**
 * Program to perform basic multidimensional array functions.
 * 
 * @author Scott M.
 * Functions.java
 */

import java.util.Scanner;

public class Functions {
    /**
     * Method to create an int two-dimensional array with a scanner
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
        return array;
    }
    /**
     * Method to create an double two-dimensional array with a scanner
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
        return array;
    }
    /**
     * Method to sum a row in an int array.
     */
    public static int sumRowInt(int[][] array, int row) {
        int sum = 0;
        for (int i = 0; i < array[row].length; i++) {
            sum += array[row][i];
        }
        return sum;
    }
    /**
     * Method to sum a row in a double array.
     */
    public static double sumRowDouble(double[][] array, int row) {
        double sum = 0;
        for (int i = 0; i < array[row].length; i++) {
            sum += array[row][i];
        }
        return sum;
    }
    /**
     * Method to sum a column in an int array.
     */
    public static int sumColumnInt(int[][] array, int column) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][column];
        }
        return sum;
    }
    /**
     * Method to sum a column in a double array.
     */
    public static double sumColumnDouble(double[][] array, int column) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][column];
        }
        return sum;
    }
    /**
     * Method to sum the major diagonal in an int array.
     */
    public static int sumMajorDiagInt(int[][] array) {
        int sum = 0;
        for (int i = 0; i < Math.min(array.length, array[0].length); i++) {
            sum += array[i][i];
        }
        return sum;
    }
    /**
     * Method to sum the major diagonal in a double array.
     */
    public static double sumMajorDiagDouble(double[][] array) {
        double sum = 0;
        for (int i = 0; i < Math.min(array.length, array[0].length); i++) {
            sum += array[i][i];
        }
        return sum;
    }
    /**
     * Method to find minimum of an int array.
     */
    public static int minInt(int[] array, int startingIndex) {
        int min = startingIndex;
        for (int j = startingIndex; j < array.length; j++) {
            if (array[j] < array[min]) {
                min = j;
            }
        }
        return min;
    }
    /**
     * Method to find minimum index of a double array.
     */
    public static int minDouble(double[] array, int startingIndex) {
        int min = startingIndex;
        for (int j = startingIndex; j < array.length; j++) {
            if (array[j] < array[min]) {
                min = j;
            }
        }
        return min;
    }
    /**
     * Method to sort a single dimensional int array.
     */
    public static void sortIntArray(int[] array, int startingIndex) {
        for (int i = startingIndex; i < array.length; i++) {
            int min = minInt(array, 0), temp;
            
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    /**
     * Method to sort a single dimensional double array.
     */
    public static void sortDoubleArray(double[] array, int startingIndex) {
        for (int i = startingIndex; i < array.length; i++) {
            int min = minDouble(array, 0); 
            double temp;
            
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    /**
     * Method to fill an array with a single element.
     */
    public static void fill(int[][] array, int element) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = element;
            }
        }
    }
    /**
     * Method to print an int multidimensional Array.
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
     * Method to print a double multidimensional Array.
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
     * Method to generate a multidimensional array of 0s and 1s.
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