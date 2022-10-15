/**
 * (Identical arrays) The two-dimensional arrays m1 and m2 are identical if they 
 * have the same contents. Write a method that returns true if m1 and m2 are identical, 
 * using the following header:
 *      public static boolean equals(int[][] m1, int[][] m2)
 * Write a test program that prompts the user to enter two 3 * 3 arrays of integers 
 * and displays whether the two are identical.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_29
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
        
        System.out.print("Enter list2: ");
        for (int i = 0; i < m2.length; i++)
        {
            for (int j = 0; j < m2[i].length; j++)
            {
                m2[i][j] = kb.nextInt();
            }
        }
        kb.close();
        
        if (equals(m1, m2))
        {
            System.out.print("The two arrays are identical");
        }
        else
        {
            System.out.print("The two arrays are not identical");
        }
    }
    
    /**
     * Check whether two arrays are identical, but don't necessarily have each element in the same exact order.
     * @param m1 int[][]: first array
     * @param m2 int[][]: second array
     * @return boolean: true = arrays are identical, false otherwise
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
                    if (!search(m2, m1[i][j]))
                    {
                        equal = false;
                    }
                }
            }
        }
        return equal;
    }
    
    /**
     * Check if a 2d array contains a specific key, and remove it when found.
     * @param array int[][]: 2d array to search
     * @param key int: key to search for
     * @return boolean: true = key was found and removed, false otherwise
     */
    public static boolean search(int[][] array, int key)
    {
        boolean found = false;
        for (int i = 0; !found && i < array.length; i++)
        {
            for (int j = 0; !found && j < array.length; j++)
            {
                if (array[i][j] == key)
                {
                    found = true;
                    array[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        return found;
    }
}