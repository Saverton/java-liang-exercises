/**
 * (Locate the largest element) Write the following method that returns the location 
 * of the largest element in a two-dimensional array.
 * public static int[] locateLargest(double[][] a) 
 * The return value is a one-dimensional array that contains two elements. These 
 * two elements indicate the row and column indices of the largest element in the 
 * two-dimensional array. Write a test program that prompts the user to enter a two
 * dimensional array and displays the location of the largest element in the array. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_13 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int rows, columns;
        
        System.out.print("Enter the number of rows and columns in the array: ");
        rows = kb.nextInt();
        columns = kb.nextInt();
        kb.close();
        
        double[][] array = createDouble2(rows, columns);
        
        int[] results = findLargest(array);
        
        System.out.print("The location of the largest element is at (" + results[0] + ", " + results[1] + ")");
    }
    /**
     * Return the keys of the largest element in a 2d array.
     * @param array double[][]: 2d array
     * @return int[]: keys of largest element in format {<rowindex>, <columnindex>}
     */
    public static int[] findLargest(double[][] array) {
        int[] results = {0, 0};
        double largestElement = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > largestElement) {
                    results[0] = i;
                    results[1] = j;
                    largestElement = array[i][j];
                }
            }
        }
        return results;
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