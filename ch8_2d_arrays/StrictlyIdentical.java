/**
 * Program to intake 2 3x3 arrays from the user, then determine if these
 * two arrays are strictly identical, meaning each corresponding element 
 * is the same in both arrays.
 * 
 * @author Scott M.
 * StrictlyIdentical.java
 */

import java.util.Scanner;

public class StrictlyIdentical
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
            System.out.print("The two arrays are strictly identical");
        }
        else
        {
            System.out.print("The two arrays are not strictly identical");
        }
    }
    
    /**
     * Method to evaluate whether or not two 2d arrays are identical.
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