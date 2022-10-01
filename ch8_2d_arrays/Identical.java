/**
 * Program to intake 2 3x3 arrays from the user and determine if they hold identical contents,
 * regardless of the order of said contents.
 * 
 * @author Scott M.
 * Identical.java
 */

import java.util.Scanner;

public class Identical
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
     * Method to evaluate whether or not 2 arrays are identical in contents, regardless
     * of the order of said contents.
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
     * Method to return true or false if an array contains a specific key, then removes
     * that key from the array.
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