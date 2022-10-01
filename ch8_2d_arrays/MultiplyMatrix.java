/**
 * Program to add 2 3x3 matrices
 * 
 * @author Scott M.
 * MultiplyMatrix.java
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class MultiplyMatrix {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        double[][] mat1 = Functions.createDouble2(3, 3);
        double[][] mat2 = Functions.createDouble2(3, 3);
        
        double[][] product = multiplyMatrix(mat1, mat2);
        
        printMatrixMultiplication(mat1, mat2, product);
        
    }
    /**
     * Method to product two matrices.
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
     * Method to print a formatted multiplied matrix
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
