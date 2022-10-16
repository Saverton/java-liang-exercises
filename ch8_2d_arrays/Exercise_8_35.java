/**
 * (Largest block) Given a square matrix with the elements 0 or 1, write a program 
 * to find a maximum square submatrix whose elements are all 1s. Your program 
 * should prompt the user to enter the number of rows in the matrix. The program 
 * then displays the location of the first element in the maximum square submatrix 
 * and the number of the rows in the submatrix.
 * Your program should implement and use the following method to find the maximum 
 * square submatrix:
 *      public static int[] findLargestBlock(int[][] m)
 * The return value is an array that consists of three values. The first two values are 
 * the row and column indices for the first element in the submatrix, and the third 
 * value is the number of the rows in the submatrix.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_35
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int[][] matrix;
        int rows;
        int[] largestBlock;
        
        System.out.print("Enter the number of rows in the matrix: ");
        rows = kb.nextInt();
        matrix = new int[rows][rows];
        
        System.out.println("Enter the matrix row by row:");
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = kb.nextInt();
            }
        }
        kb.close();
        
        largestBlock = findLargestBlock(matrix);
        
        System.out.print("\nThe maximum square submatrix is at (" + largestBlock[0] + ", " + largestBlock[1] + ") with size " + largestBlock[2]);
    }
    
    /**
     * Return the largest square submatrix in a 2d array of 0s and 1s
     * @param m int[][]: array of 0s and 1s
     * @return int[]: largest square submatrix, indexes: (0=row index,1=column index,2=size of submatrix)
     */
    public static int[] findLargestBlock(int[][] m)
    {
        int[] lb = new int[3];
        for (int i = 0; i < m.length - lb[2]; i++)
        {
            for (int j = 0; j < m[i].length - lb[2]; j++)
            {
                if (m[i][j] == 1)
                {
                    for (int k = 2; Math.max(k + i, k + j) <= m.length; k++)
                    {
                        if (allOnes(m, i, j, k))
                        {
                            lb[0] = i;
                            lb[1] = j;
                            lb[2] = k;
                        }
                    }
                }
            }
        }
        return lb;
    }
    
    /**
     * Check if a submatrix contains entirely 1s
     * @param m int[][]: matrix of 0s and 1s
     * @param y int: row index of submatrix
     * @param x int: column index of submatrix
     * @param k int: size of submatrix
     * @return boolean: true = submatrix has all 1s, false otherwise
     */
    public static boolean allOnes(int[][] m, int y, int x, int k)
    {
        boolean valid = true;
        for (int i = y; valid && i < y + k; i++)
        {
            for (int j = x; valid && j < x + k; j++)
            {
                if (m[i][j] != 1)
                {
                    valid = false;
                }
            }
        }
        return valid;
    }
}