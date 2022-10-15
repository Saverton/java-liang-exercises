/**
 * (Column sorting) Implement the following method to sort the columns in a two
 * dimensional array. A new array is returned and the original array is intact.
 *      public static double[][] sortColumns(double[][] m)
 * Write a test program that prompts the user to enter a 3 * 3 matrix of double 
 * values and displays a new column-sorted matrix.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_27
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        double[][] array = new double[3][3];
        double[][] sortedArray;
        
        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] = kb.nextDouble();
            }
        }
        kb.close();
        
        sortedArray = sortColumns(array);
        
        System.out.println("\nThe column-sorted array is");
        for (double[] i: sortedArray)
        {
            for (double j: i)
            {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
    
    /**
     * Return a nondestructively sorted array that has each column sorted in sequential order.
     * @param array double[][]: array to sort
     * @return double[][]: array with sorted columns
     */
    public static double[][] sortColumns(double[][] array)
    {
        double[][] sorted = new double[array.length][array[0].length];
        
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                sorted[i][j] = array[i][j];
            }
        }
        
        for (int j = 0; j < sorted[0].length; j++)
        {
            for (int i = 0; i < sorted.length; i++)
            {
                double min = sorted[i][j];
                int minIndex = i;
                for (int k = i + 1; k < sorted.length; k++)
                {
                    if (sorted[k][j] < min)
                    {
                        min = sorted[k][j];
                        minIndex = k;
                    }
                }
                double temp = sorted[i][j];
                sorted[i][j] = sorted[minIndex][j];
                sorted[minIndex][j] = temp;
            }
        }
        return sorted;
    }
}