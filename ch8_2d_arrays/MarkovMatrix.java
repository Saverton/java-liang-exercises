/**
 * Program to determine if a user entered 3x3 matrix is classified as a "Markov Matrix"
 * in which each element is positive and the sum of each column is equal to 1.
 * 
 * @author Scott M.
 * MarkovMatrix.java
 */

import java.util.Scanner;

public class MarkovMatrix
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        
        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = kb.nextDouble();
            }
        }
        
        if (isMarkovMatrix(matrix))
        {
            System.out.print("It is a Markov matrix");
        }
        else
        {
            System.out.print("It is not a Markov matrix");
        }
    }
    
    /**
     * Method to determine if a matrix is a Markov matrix
     */
    public static boolean isMarkovMatrix(double[][] matrix)
    {
        boolean output = true;
        for (int j = 0; output && j < matrix[0].length; j++)
        {
            double sum = 0;
            for (int i = 0; output && i < matrix.length; i++)
            {
                if (matrix[i][j] < 0 || matrix[i][j] > 1)
                {
                    output = false;
                }
                else
                {
                    sum += matrix[i][j];
                }
            }
            if (sum != 1)
            {
                output = false;
            }
        }
        return output;
    }
}