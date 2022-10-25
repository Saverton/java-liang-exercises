/**
 * (Area of a convex polygon) A polygon is convex if it contains any line segments 
 * that connects two points of the polygon. Write a program that prompts the user to 
 * enter the number of points in a convex polygon, then enter the points clockwise, 
 * and display the area of the polygon. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_11_15 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Polygon p;
        System.out.print("Enter number of sides: ");
        double[][] points = new double[kb.nextInt() + 1][2];
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
        kb.close();
        p = new Polygon(points);
        System.out.print("The total area is " + p.getArea());
    }
}

class Polygon
{
    private double[][] points;
    
    /**
     * Construct a Polygon with a given array of points.
     * @param points double[][]: array of points (p[i][0]=x, p[i][1]=y)
     */
    public Polygon(double[][] points)
    {
        this.points = points;
    }
    
    /**
     * Return the array of points making up this Polygon.
     * @return double[][]: array of points
     */
    public double[][] getPoints()
    {
        return (points);
    }
    
    /**
     * Return the determinant of the list of points of this Polygon.
     * @return double: determinant
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
     * Return the area of this Polygon.
     * @return double: area
     */
    public double getArea()
    {
        return (0.5 * getDeterminant());
    }
}