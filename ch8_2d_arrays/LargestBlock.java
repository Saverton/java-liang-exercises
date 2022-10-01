/**
 * Program to have the user enter a size and fill an array row by row with 0s and 1s.
 * The program will then find the largest block of 1s in the array.
 * 
 * @author Scott M.
 * LargestBlock.java
 */

import java.util.Scanner;

public class LargestBlock
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
        
        largestBlock = findLargestBlock(matrix);
        
        System.out.print("\nThe maximum square submatrix is at (" + largestBlock[0] + ", " + largestBlock[1] + ") with size " + largestBlock[2]);
    }
    
    /**
     * Method to find the largest square submatrix in a larger matrix of 0s and 1s
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
     * Method to determine if a submatrix has all 1s
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