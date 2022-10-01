/**
 * Program to find the bounding rectangle of a 2D array of 5 coordinate points.
 * 
 * @author Scott M.
 * BoundingRectangle.java
 */

import java.util.Scanner;

public class BoundingRectangle
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        double[][] points = new double[5][2];
        Rectangle2D boundingRect;
        
        System.out.print("Enter 5 points: ");
        for (int i = 0; i < points.length; i++)
        {
            for (int j = 0; j < points[i].length; j++)
            {
                points[i][j] = kb.nextDouble();
            }
        }
        
        boundingRect = new Rectangle2D(getCenterPoint(points, 0), getCenterPoint(points, 1), getColumnMax(points, 0) - getColumnMin(points, 0), 
                                       getColumnMax(points, 1) - getColumnMin(points, 1));
        System.out.print("The bounding rectangle's center (" + boundingRect.getX() + ", " + boundingRect.getY() + "), width " + boundingRect.getWidth() +
                         ", height " + boundingRect.getHeight());
    }
    
    /**
     * Method to get the max value of a column in a 2D array
     * 
     * @params (the 2D array to be examined) (the column that will be processed)
     * @return (max of the column)
     */
    public static double getColumnMax(double[][] arr, int col)
    {
        double[] temp = new double[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            temp[i] = arr[i][col];
        }
        return getMax(temp);
    }
    
    /**
     * Method to get the min value of a column in a 2D array
     * 
     * @params (the 2D array to be examined) (the column that will be processed)
     * @return (min of the column)
     */
    public static double getColumnMin(double[][] arr, int col)
    {
        double[] temp = new double[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            temp[i] = arr[i][col];
        }
        return getMin(temp);
    }
    
    /**
     * Method to find the center value (average of max and min) for a certain column
     * in a 2D double array.
     * 
     * @params (the 2D array to be examined) (the column that will be processed)
     * @return (the center point between the max and min of the column)
     */
    public static double getCenterPoint(double[][] arr, int col)
    {
        double[] temp = new double[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            temp[i] = arr[i][col];
        }
        return (getMax(temp) + getMin(temp)) / 2;
    }
    
    /**
     * Method to return the max value of an array
     * 
     * @params (the array to be examined)
     * @return (the max value)
     */
    public static double getMax(double[] arr)
    {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    
    /**
     * Method to return the min value of an array
     * 
     * @params (the array to be examined)
     * @return (the min value)
     */
    public static double getMin(double[] arr)
    {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }
}