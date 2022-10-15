/**
 * (Markov matrix) An n * n matrix is called a positive Markov matrix if each 
 * element is positive and the sum of the elements in each column is 1. Write the 
 * following method to check whether a matrix is a Markov matrix. 
 *      public static boolean isMarkovMatrix(double[][] m)
 * Write a test program that prompts the user to enter a 3 * 3 matrix of double 
 * values and tests whether it is a Markov matrix.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_25
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
            kb.close();
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
     * Check if a given 2d array is considered a markov matrix by the rules:
     *  1. each element is positive.
     *  2. the sum of the elements in each column is 1.
     * @param matrix double[][]: 2d array or matrix
     * @return boolean: true = matrix is markov matrix, false otherwise
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