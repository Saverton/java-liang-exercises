/**
 * (Game: find the flipped cell) Suppose you are given a 6-by-6 matrix filled with 
 * 0s and 1s. All rows and all columns have an even number of 1s. Let the user flip 
 * one cell (i.e., flip from 1 to 0 or from 0 to 1) and write a program to find which 
 * cell was flipped. Your program should prompt the user to enter a 6-by-6 array 
 * with 0s and 1s and find the first row r and first column c where the even number 
 * of the 1s property is violated (i.e., the number of 1s is not even). The flipped cell 
 * is at (r, c). 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_23
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
        kb.close();
        
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
     * Check if an array has an even number of 1s.
     * @param array int[]: array to check
     * @return boolean: true = array has even number of 1s, false otherwise
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