/**
 * (Sum elements column by column) Write a method that returns the sum of all the 
 * elements in a specified column in a matrix using the following header:
 *      public static double sumColumn(double[][] m, int columnIndex)
 * Write a test program that reads a 3-by-4 matrix and displays the sum of each 
 * column.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_1 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create the matrix
        double[][] matrix = createDouble2(3, 4);
        
        //sum the columns
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));
        }
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
}