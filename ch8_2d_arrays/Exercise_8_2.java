/**
 * (Sum the major diagonal in a matrix) Write a method that sums all the numbers 
 * in the major diagonal in an n * n matrix of double values using the following 
 * header:
 *      public static double sumMajorDiagonal(double[][] m)
 * Write a test program that reads a 4-by-4 matrix and displays the sum of all its 
 * elements on the major diagonal. 
 * @author Scott M.
 */

 import java.util.Scanner;

public class Exercise_8_2 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        double[][] array = createDouble2(4, 4);
        
        System.out.print("Sum of the elements in the major diagonal is " + sumMajorDiag(array));
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
}