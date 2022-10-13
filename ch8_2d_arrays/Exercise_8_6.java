/**
 * (Algebra: multiply two matrices) Write a method to multiply two matrices. The 
 * header of the method is:
 *      public static double[][] multiplyMatrix(double[][] a, double[][] b)
 * To multiply matrix a by matrix b, the number of columns in a must be the same as 
 * the number of rows in b, and the two matrices must have elements of the same or 
 * compatible types. Let c be the result of the multiplication. Assume the column size 
 * of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + c + ain * bnj.
 * For example, for two 3 * 3 matrices a and b, c is
 *      (a11 a12 a13)   (b11 b12 b13)   (c11 c12 c13)
 *      (a21 a22 a23) * (b21 b22 b23) = (c21 c22 c23)
 *      (a31 a32 a33)   (b31 b32 b33)   (c31 c32 c33)
 *      where cij = ai1 * b1j + ai2 * b2j + ai3 * b3j.
 * Write a test program that prompts the user to enter two 3 * 3 matrices and 
 * displays their product.
 * @author Scott M.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise_8_6 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        double[][] mat1 = createDouble2(3, 3);
        double[][] mat2 = createDouble2(3, 3);
        
        double[][] product = multiplyMatrix(mat1, mat2);
        
        printMatrixMultiplication(mat1, mat2, product);
        
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
     * Return the product of two matrices.
     * @param a double[][]: first matrix
     * @param b double[][]: second matrix
     * @return double[][]: product matrix
     */
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        DecimalFormat fmt = new DecimalFormat("0.##");
        double[][] product = new double[a.length][a[0].length];
        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[0].length; j++) {
                product[i][j] = Double.parseDouble(fmt.format(a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j]));
            }
        }
        return product;
    }
    /**
     * Print a formatted matrix multiplication equation.
     * @param mat1 double[][]: first matrix
     * @param mat2 double[][]: second matrix
     * @param product double[][]: product matrix
     */
    public static void printMatrixMultiplication(double[][] mat1, double[][] mat2, double[][] product) {
        for (int i = 0; i < product.length; i++) {
            if (i == 1) {
                System.out.println(mat1[i][0] + " " + mat1[i][1] + " " + mat1[i][2] + " *\t" + mat2[i][0] + " " + mat2[i][1] + " " + mat2[i][2] + " =\t" + product[i][0] + " " +
                                   product[i][1] + " " + product[i][2]);
            }
            else {
                System.out.println(mat1[i][0] + " " + mat1[i][1] + " " + mat1[i][2] + "\t" + mat2[i][0] + " " + mat2[i][1] + " " + mat2[i][2] + "\t" + product[i][0] + " " +
                                   product[i][1] + " " + product[i][2]);
            }
        }
    }
}
