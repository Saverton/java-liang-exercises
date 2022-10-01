/**
 * Program to take a user defined 2d array and sort each column in ascending numerical
 * order.
 * 
 * @author Scott M.
 * ColumnSorting.java
 */

import java.util.Scanner;

public class ColumnSorting
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
     * Method to create a clone of an array and return a sorted version of that
     * array.
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