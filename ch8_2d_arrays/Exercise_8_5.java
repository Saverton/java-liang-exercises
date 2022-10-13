/**
 * (Algebra: add two matrices) Write a method to add two matrices. The header of 
 * the method is as follows:
 * public static double[][] addMatrix(double[][] a, double[][] b) 
 * In order to be added, the two matrices must have the same dimensions and the 
 * same or compatible types of elements. Let c be the resulting matrix. Each element 
 * cij is aij + bij. For example, for two 3 * 3 matrices a and b, c is
 *      (a11 + a12 + a13)   (b11 + b12 + b13)   ((a11 + b11) (a12 + b12) (a13 + b13))
 *      (a21 + a22 + a23) + (b21 + b22 + b23) = ((a21 + b21) (a22 + b22) (a23 + b23))
 *      (a31 + a32 + a33)   (b31 + b32 + b33)   ((a31 + b31) (a32 + b32) (a33 + b33))
 * Write a test program that prompts the user to enter two 3 * 3 matrices and 
 * displays their sum.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_5 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        double[][] mat1 = createDouble2(3, 3);
        double[][] mat2 = createDouble2(3, 3);
        
        double[][] sum = addMatrix(mat1, mat2);
        
        for (int i = 0; i < sum.length; i++) {
            if (i == 1) {
                System.out.println(mat1[i][0] + " " + mat1[i][1] + " " + mat1[i][2] + " +\t" + mat2[i][0] + " " + mat2[i][1] + " " + mat2[i][2] + " =\t" + sum[i][0] + " " +
                                   sum[i][1] + " " + sum[i][2]);
            }
            else {
                System.out.println(mat1[i][0] + " " + mat1[i][1] + " " + mat1[i][2] + "\t" + mat2[i][0] + " " + mat2[i][1] + " " + mat2[i][2] + "\t" + sum[i][0] + " " +
                                   sum[i][1] + " " + sum[i][2]);
            }
        }
        
    }
    /**
     * Return the sum of two matrices.
     * @param a double[][]: first matrix
     * @param b double[][]: second matrix
     * @return double[][]: sum matrix
     */
    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] sum = new double[3][3];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
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