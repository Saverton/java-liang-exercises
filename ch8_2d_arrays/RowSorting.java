/**
 * Program to take a user entered array (size 3x3) and create a cloned version
 * with each row sorted in increasing numerical order.
 * 
 * @author Scott M.
 * RowSorting.java
 */

import java.util.Scanner;

public class RowSorting
{
    /**
     * Main method to run program
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
        
        sortedArray = sortRows(array);
        
        System.out.println("\nThe row-sorted array is");
        for (double[] i: sortedArray)
        {
            for (double j: i)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * Method to sort the rows of a 2d array.
     */
    public static double[][] sortRows(double[][] array)
    {
        double[][] sorted = new double[array.length][array[0].length];
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                sorted[i][j] = array[i][j];
            }
        }
        
        for (int i = 0; i < sorted.length; i++)
        {
            for (int j = 0; j < sorted[i].length; j++)
            {
                int minIndex = getMinIndex(sorted[i], j);
                double temp = sorted[i][j];
                sorted[i][j] = sorted[i][minIndex];
                sorted[i][minIndex] = temp;
            }
        }
        return sorted;
    }
    
    /**
     * Method to get the minimum index of an array from starting value j
     */
    public static int getMinIndex(double[] array, int j)
    {
        double min = array[j];
        int minIndex = j;
        for (int i = j + 1; i < array.length; i++)
        {
            if (array[i] < min)
            {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}