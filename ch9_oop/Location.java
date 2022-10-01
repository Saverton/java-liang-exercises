/**
 * Program to define a Location object that saves the row, column, and value
 * of the max index in a 2d array.
 * 
 * @author Scott M.
 * Location.java
 */

import java.util.Scanner;

public class Location
{
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
        
        Location l1 = locateLargest(array);
        l1.printLocation();
    }
    
    /**
     * Method to create a location object for the largest value in a 2d array
     * of doubles.
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
    
    /**
     * Class to define Location object
     */
    public int row, column;
    public double maxValue;
    
    public Location(int row, int column, double maxValue)
    {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }
    
    public void printLocation()
    {
        System.out.println("The location of the largest element is " + this.maxValue + " at (" + this.row + ", " + this.column + ")");
    }
}