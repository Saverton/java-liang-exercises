/**
 * (Largest rows and columns) Write a program that randomly fills in 0s and 1s
 * into an n-by-n matrix, prints the matrix, and finds the rows and columns with the 
 * most 1s. (Hint: Use two ArrayLists to store the row and column indices with 
 * the most 1s.) 
 * @author Scott M.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise_11_9
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int[][] matrix;
        int rowSize = 0, colSize = 0;
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        
        System.out.print("Enter the array size n: ");
        matrix = genMatrix(kb.nextInt());
        kb.close();
        
        System.out.println("The random array is");
        
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        for (int i = 0; i < matrix.length; i++)
        {
            int temp = 0;
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (matrix[i][j] == 1)
                {
                    temp++;
                }
            }
            if (temp > rowSize)
            {
                rowSize = temp;
                row.clear();
                row.add(i);
            }
            else if (temp == rowSize)
            {
                row.add(i);
            }
        }
        
        for (int j = 0; j < matrix[0].length; j++)
        {
            int temp = 0;
            for (int i = 0; i < matrix.length; i++)
            {
                if (matrix[i][j] == 1)
                {
                    temp++;
                }
            }
            if (temp > colSize)
            {
                colSize = temp;
                col.clear();
                col.add(j);
            }
            else if (temp == colSize)
            {
                col.add(j);
            }
        }
        
        System.out.println("The largest row index: " + row.toString());
        System.out.println("The largest column index: " + col.toString());
    }
    
    /**
     * Return a randomly generated binary matrix of size n by n.
     * @param n int: array size
     * @return int[][]: binary matrix
     */
    public static int[][] genMatrix(int n)
    {
        int[][] matrix = new int[n][n];
        
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }
        
        return matrix;
    }
}