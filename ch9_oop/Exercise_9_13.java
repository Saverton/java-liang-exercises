/**
 * (The Location class) Design a class named Location for locating a maximal 
 * value and its location in a two-dimensional array. The class contains public data 
 * fields row, column, and maxValue that store the maximal value and its indices 
 * in a two-dimensional array with row and column as int types and maxValue as 
 * a double type.
 * Write the following method that returns the location of the largest element in a 
 * two-dimensional array:
 *      public static Location locateLargest(double[][] a) 
 * The return value is an instance of Location. Write a test program that prompts 
 * the user to enter a two-dimensional array and displays the location of the largest 
 * element in the array.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_9_13 {
    /**
     * Main method to test class.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        double[][] array;
        
        System.out.print("Enter the number of rows and columns in the array: ");
        array = new double[kb.nextInt()][kb.nextInt()];
        
        System.out.println("Enter the array:");
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] = kb.nextDouble();
            }
        }
        kb.close();
        
        Location l1 = locateLargest(array);
        System.out.print("The location of the largest element is " + l1);
    }

    /**
     * Return the Location of the largest element in a 2d double array as a Location object.
     * @param a double[][]: 2d double array
     * @return Location: location of largest element
     */
    public static Location locateLargest(double[][] a)
    {
        double max = a[0][0];
        int[] pos = {0, 0};
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                if (a[i][j] > max)
                {
                    max = a[i][j];
                    pos[0] = i;
                    pos[1] = j;
                }
            }
        }
        return new Location(pos[0], pos[1], max);
    }
}

class Location
{
    public int row, column;
    public double value;
    
    /**
     * Construct a new Location object with a row index, column index, and the value at this location.
     * @param row
     * @param column
     * @param value
     */
    public Location(int row, int column, double value)
    {
        this.row = row;
        this.column = column;
        this.value = value;
    }
    
    /**
     * Return a String with information about this location formatted as:
     *      <value> at (<row>, <column>)
     * @return String: string with location info
     */
    public String toString()
    {
        return (this.value + " at (" + this.row + ", " + this.column + ")");
    }
}