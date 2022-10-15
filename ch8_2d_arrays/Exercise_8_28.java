/**
 * (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
 * identical if their corresponding elements are equal. Write a method that returns 
 * true if m1 and m2 are strictly identical, using the following header:
 *      public static boolean equals(int[][] m1, int[][] m2)
 * Write a test program that prompts the user to enter two 3 * 3 arrays of 
 * integers and displays whether the two are strictly identical. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_28
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        
        System.out.print("Enter list1: ");
        for (int i = 0; i < m1.length; i++)
        {
            for (int j = 0; j < m1[i].length; j++)
            {
                m1[i][j] = kb.nextInt();
            }
        }
        kb.close();
        
        System.out.print("Enter list2: ");
        for (int i = 0; i < m2.length; i++)
        {
            for (int j = 0; j < m2[i].length; j++)
            {
                m2[i][j] = kb.nextInt();
            }
        }
        
        if (equals(m1, m2))
        {
            System.out.print("The two arrays are strictly identical");
        }
        else
        {
            System.out.print("The two arrays are not strictly identical");
        }
    }
    
    /**
     * Check if two 2d arrays are strictly identical.
     * @param m1 int[][]: first 2d array
     * @param m2 int[][]: second 2d array
     * @return boolean: true = arrays are strictly identical, false otherwise
     */
    public static boolean equals(int[][] m1, int[][] m2)
    {
        boolean equal = true;
        if (m1.length != m2.length || m1[0].length != m2[0].length)
        {
            equal = false;
        }
        else
        {
            for (int i = 0; equal && i < m1.length; i++)
            {
                for (int j = 0; equal && j < m1[i].length; j++)
                {
                    if (m1[i][j] != m2[i][j])
                    {
                        equal = false;
                    }
                }
            }
        }
        
        return equal;
    }
}