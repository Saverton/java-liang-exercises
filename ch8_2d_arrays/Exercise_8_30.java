/**
 * (Algebra: solve linear equations) Write a method that solves the following 
 * 2 * 2 system of linear equations:
 * a00x + a01y = b0          b0a11 - b1a01               b1a00 - b0a10
 * a10x + a11y = b1     x = -----------------       y = -----------------
 *                           a00a11 - a01a10             a00a11 - a01a10
 * The method header is
 *      public static double[] linearEquation(double[][] a, double[] b)
 * The method returns null if a00a11 - a01a10 is 0. Write a test program that 
 * prompts the user to enter a00, a01, a10, a11, b0, and b1, and displays the result. If 
 * a00a11 - a01a10 is 0, report that “The equation has no solution.” 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_30
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
        kb.close();

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
     * Return an array of roots for a given linear equation, solved using Cramer's rule.
     * @param a double[][]: array containing a, b, c, d (left sides)
     * @param b double[][]: array containing e, f (right sides)
     * @return double[]: array of roots of equation, null if no real roots
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