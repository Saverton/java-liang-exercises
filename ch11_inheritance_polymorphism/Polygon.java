/**
 * Polygon class represents a convex polygon defined by a list of points going counterclockwise around the polygon starting and ending with the same point.
 * 
 * @author Scott M.
 * Polygon.java
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Polygon
{
    private double[][] points;
    private static Scanner kb = new Scanner(System.in);
    
    /**
     * construct a polygon by inputting number of sides and points.
     */
    public Polygon()
    {
        System.out.print("Enter number of sides: ");
        points = new double[kb.nextInt() + 1][2];
        System.out.println("Enter an array of coordinates starting with point1, then going clockwise around the polygon:");
        for (int i = points.length - 1; i > 0; i--)
        {
            for (int j = 0; j < points[i].length; j++)
            {
                double temp = kb.nextDouble();
                points[i][j] = temp;
                if (i == points.length - 1)
                {
                    points[0][j] = temp;;
                }
            }
        }
    }
    
    /**
     * construct a polygon with a specified Array of points.
     * 
     * @params (points)
     */
    public Polygon(double[][] points)
    {
        this.points = points;
    }
    
    /**
     * Method to return the Array of points that defines the polygon.
     * 
     * @return (array of points)
     */
    public double[][] getPoints()
    {
        return (points);
    }
    
    /**
     * Method to get the determinant of the points list.
     * 
     * @return (determinant)
     */
    private double getDeterminant()
    {
        double determinant = 0;
        
        for (int j = 0; j < 2; j++)
        {
            double temp = 0;
            for (int i = 0; i < points.length - 1; i++)
            {
                temp += points[i][j] * points[i + 1][(j + 1) % 2];
            }
            if (j == 1)
            {
                temp *= -1;
            }
            determinant += temp;
        }
        
        return determinant;
    }
    
    /**
     * Method to get the area of the polygon.
     * 
     * @return (area of polygon)
     */
    public double getArea()
    {
        return (0.5 * getDeterminant());
    }
}