/**
 * Program to add 2 3x3 matrices
 * 
 * @author Scott M.
 * AddMatrix.java
 */

import java.util.Scanner;

public class AddMatrix {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        double[][] mat1 = Functions.createDouble2(3, 3);
        double[][] mat2 = Functions.createDouble2(3, 3);
        
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
     * Method to sum two matrices.
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
}