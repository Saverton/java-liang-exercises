/**
 * The program will first intake four coordinate points from the user that define an
 * abstract quadrilateral shape. The program will divide this quadrilateral into
 * 4 distinct triangles using the intersection of opposite lines, then find the areas of
 * these 4 triangles and display them in increasing order.
 * 
 * @author Scott M.
 * PolygonSubareas.java
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class PolygonSubareas
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat ("0.##");
        double[][] points = new double[4][2];
        double[] intersection = new double[2];
        double[] areas = new double[4];
        
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4:\n\t");
        for (int i = 0; i < points.length; i++)
        {
            for (int j = 0; j < points[i].length; j++)
            {
                points[i][j] = kb.nextDouble();
            }
        }
        
        //sets up points array for intersection points method
        for (int i = 0; i < points[1].length; i++)
        {
            double temp = points[1][i];
            points[1][i] = points[2][i];
            points[2][i] = temp;
        }
        
        intersection = getIntersectingPoint(points);
        
        //return points to normal positions
        for (int i = 0; i < points[1].length; i++)
        {
            double temp = points[1][i];
            points[1][i] = points[2][i];
            points[2][i] = temp;
        }
        
        for (int i = 0; i < areas.length; i++)
        {
            double[][] temp = new double[3][2];
            for (int j = 0; j < temp.length; j++)
            {
                for (int k = 0; k < temp[j].length; k++)
                {
                    if (j == 2)
                    {
                        temp[j][k] = intersection[k];
                    }
                    else
                    {
                        temp[j][k] = points[(i + j) % areas.length][k];
                    }
                }
            }
            areas[i] = getTriangleArea(temp);
        }
        
        selectionSort(areas);
        
        System.out.print("The areas are");
        for (double i: areas)
        {
            System.out.print(" " + fmt.format(i));
        }
    }
    
    /**
     * Method to find and return the intersection point of a set of 4 points
     */
    public static double[] getIntersectingPoint(double[][] p)
    {
        double[][] a = new double[2][2];
        double[] b = new double [2];
        
        a[0][0] = p[0][1] - p[1][1];
        a[0][1] = -1 * (p[0][0] - p[1][0]);
        a[1][0] = p[2][1] - p[3][1];
        a[1][1] = -1 * (p[2][0] - p[3][0]);
        
        b[0] = a[0][0] * p[0][0] + a[0][1] * p[0][1];
        b[1] = a[1][0] * p[2][0] + a[1][1] * p[2][1];
        
        return linearEquation(a, b);
    }
    
    /**
     * Method to solve a linear equation using Crammer's rule
     */
    public static double[] linearEquation(double[][] a, double[] b)
    {
        double[] solution = new double[2];
        if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0)
        {
            solution = null;
        }
        else
        {
            solution[0] = (b[0] * a[1][1] - a[0][1] * b[1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
            solution[1] = (b[1] * a[0][0] - a[1][0] * b[0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        }
        return solution;
    }
    
    /**
     * Method to get the area of a triangle given its vertex points
     */
    public static double getTriangleArea(double[][] p)
    {
        double area, s, product;
        double[] sides = new double[3];
        if (sameLine(p))
        {
            area = 0;
        }
        else
        {
            for (int i = 0; i < sides.length; i++)
            {
                sides[i] = Math.sqrt(Math.pow(p[(i + 1) % sides.length][0] - p[i][0], 2) + Math.pow(p[(i + 1) % sides.length][1] - p[i][1], 2));
            }
            s = (sides[0] + sides[1] + sides[2]) / 2;
            product = s;
            for (int i = 0; i < sides.length; i++)
            {
                product *= (s - sides[i]);
            }
            area = Math.sqrt(product);
        }
        return area;
    }
    
    /**
     * Method to find if a certain amount of points are on the same line.
     */
    public static boolean sameLine(double[][] points) 
    {
        double slope = (points[1][1] - points[0][1]) / (points[1][0] - points[0][0]);
        
        for (int i = 2; i < points.length; i++) 
        {
            if (slope != (points[i][1] - points[0][1]) / (points[i][0] - points[0][0])) 
            {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Method to perform a simple selection sort.
     */
    public static double[] selectionSort(double[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            double min = a[i];
            int minIndex = i;
            for (int j = i; j < a.length; j++)
            {
                if (a[j] < min)
                {
                    min = a[j];
                    minIndex = j;
                }
            }
            double temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        return a;
    }
}