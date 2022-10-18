/**
 * (Geometry: the bounding rectangle) A bounding rectangle is the minimum rectangle 
 * that encloses a set of points in a two-dimensional plane, as shown in 
 * Figure 10.24d. Write a method that returns a bounding rectangle for a set of 
 * points in a two-dimensional plane, as follows:
 *      public static MyRectangle2D getRectangle(double[][] points)
 * The Rectangle2D class is defined in Programming Exercise 10.13. Write a 
 * test program that prompts the user to enter five points and displays the bounding 
 * rectangle’s center, width, and height.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_10_15
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
        kb.close();
        
        boundingRect = new Rectangle2D(getCenterPoint(points, 0), getCenterPoint(points, 1), getColumnMax(points, 0) - getColumnMin(points, 0), 
                                       getColumnMax(points, 1) - getColumnMin(points, 1));
        System.out.print("The bounding rectangle's center (" + boundingRect.getX() + ", " + boundingRect.getY() + "), width " + boundingRect.getWidth() +
                         ", height " + boundingRect.getHeight());
    }
    
    /**
     * Return the maximum element of a column in a 2d double array.
     * @param arr double[][]: 2d array
     * @param col int: column index
     * @return double: max element
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
     * Return the minimum element of a column in a 2d double array.
     * @param arr double[][]: 2d array
     * @return col int: column index
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
     * Return the average of the maximum and minimum of a column (center point) in a 2d array.
     * @param arr double[][]: 2d array
     * @param col int: column index
     * @return double: center point
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
     * Return the maximum element of a double array.
     * @param arr double[]: array
     * @return double: maximum element
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
     * Return the minimum element of a double array.
     * @param arr double[]: array
     * @return double: minimum element
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