/**
 * Program to solve a system of 2 linear equations in the form ax + by = c, where the user
 * enters a 2d array for the coefficients of each equation.
 * 
 * @author Scott M.
 * LinearEquations.java
 */

import java.util.Scanner;

public class LinearEquations
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        double[][] a = new double[2][2];
        double[] b = new double[2];
        double[] solution;
        
        System.out.println("Equation form\n\tax + by = e\n\tcx + dy = f");
        System.out.print("Enter a, b, c, d, e, f: ");
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                a[i][j] = kb.nextDouble();
            }
        }
        for (int i = 0; i < b.length; i++)
        {
            b[i] = kb.nextDouble();
        }
        
        solution = linearEquation(a, b);
        
        if (solution == null)
        {
            System.out.print("The equation has no solution");
        }
        else
        {
            System.out.print("x is " + solution[0] + " and y is " + solution[1]);
        }
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
}