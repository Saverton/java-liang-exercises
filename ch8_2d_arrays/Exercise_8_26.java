/**
 * (Row sorting) Implement the following method to sort the rows in a two 
 * dimensional array. A new array is returned and the original array is intact.
 *      public static double[][] sortRows(double[][] m)
 * Write a test program that prompts the user to enter a 3 * 3 matrix of double 
 * values and displays a new row-sorted matrix.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_26
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
        kb.close();
        
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
     * Return a 2d array that has each row sorted in sequential order.
     * @param array double[][]: 2d double array
     * @return double[][]: 2d double array with rows sorted
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
     * Return the minimum index of an array starting from a specific index.
     * @param array double[]: array to search
     * @param j int: starting index
     * @return int: minumum index after starting index
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