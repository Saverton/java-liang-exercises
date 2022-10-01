/**
 * Program to recreate the 0-1 matrix largest rows and columns program from chapter 8, but
 * this time using ArrayLists to store the indexes of the largest rows and columns.
 * 
 * @author Scott M.
 * Matrix1.java
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Matrix1
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int[][] matrix;
        int n, rowSize = 0, colSize = 0;
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        
        System.out.print("Enter the array size n: ");
        matrix = genMatrix(kb.nextInt());
        
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
     * Method to generate a random matrix of size n.
     * 
     * @params (array side dimension)
     * @return (random array of 0s and 1s)
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