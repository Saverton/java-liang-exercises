/**
 * Program to intake a matrix of 0s and 1s from the user, and assume that the matrix
 * follows a rule that all rows and columns must have an even number of 1s. The program
 * will return the first cell in the matrix that disobeys this rule.
 * 
 * @author Scott M.
 * FlippedCell.java
 */

import java.util.Scanner;

public class FlippedCell
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int[][] matrix = new int[6][6];
        int[] output = new int[2];
        boolean errorFound = false;
        
        System.out.println("Enter a 6x6 matrix row by row:");
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = kb.nextInt();
            }
        }
        
        for (int i = 0; !errorFound && i < matrix.length; i++)
        {
            if (!checkArray(matrix[i]))
            {
                for (int j = 0; !errorFound && j < matrix[i].length; j++)
                {
                    int[] temp = new int[matrix.length];
                    for (int k = 0; k < matrix.length; k++)
                    {
                        temp[k] = matrix[k][j];
                    }
                    if (!checkArray(temp))
                    {
                        output[0] = i;
                        output[1] = j;
                        errorFound = true;
                    }   
                }
            }
        }
        
        if (errorFound)
        {
            System.out.print("The flipped cell is at (" + output[0] + ", " + output[1] + ")");
        }
        else
        {
            System.out.print("No errors found");
        }
    }
    
    /**
     * Method to return if a row has an even number of 1s
     */
    public static boolean checkArray(int[] array)
    {
        int count = 0;
        for (int i: array)
        {
            if (i == 1)
            {
                count++;
            }
        }
        if (count % 2 == 0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}