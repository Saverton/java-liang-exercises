/**
 * Program to input a 3x4 matrix and sum the elements by column.
 * 
 * @author Scott M.
 * SumOfColumns.java
 */

import java.util.Scanner;

public class SumOfColumns {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create the matrix
        double[][] matrix = Functions.createDouble2(3, 4);
        
        //sum the columns
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + Functions.sumColumnDouble(matrix, i));
        }
    }
}