/**
 * (Algebra: solve quadratic equations) Write a method for solving a quadratic 
 * equation using the following header:
 *      public static int solveQuadratic(double[] eqn, double[] roots)
 * The coefficients of a quadratic equation ax2 + bx + c = 0 are passed to the 
 * array eqn and the real roots are stored in roots. The method returns the number 
 * of real roots. See Programming Exercise 3.1 on how to solve a quadratic 
 * equation.
 * Write a program that prompts the user to enter values for a, b, and c and displays 
 * the number of real roots and all real roots.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_25 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double[] eqn = new double[3];
        double[] roots = new double[2];
        
        System.out.print("Enter a, b, and c, for ax^2 + bx + c: ");
        for (int i = 0; i < 3; i++) {
            eqn[i] = kb.nextDouble();
        }
        kb.close();
        
        System.out.println((solveQuadratic(eqn, roots) == 1) ? "Equation has " + solveQuadratic(eqn, roots) + " real root" : "Equation has " + solveQuadratic(eqn, roots) + " real roots");
        System.out.println((roots[0] != 0) ? "Root 1 is " + roots[0] : "");
        System.out.print((roots[1] != 0 && roots[0] != roots[1]) ? "Root 2 is " + roots[1] : "");
    }
    /**
     * Return the number of roots a quadratic rquation has by solving the quadratic equation. Roots are put into a passed array of size 2.
     * @param eqn double[]: array representing equation ax^2 + bx + c = 0 (a, b, c -> indexes 0, 1, 2)
     * @param roots double[]: empty array that will receive the values of the roots
     * @return int: number of roots that the equation has
     */
    public static int solveQuadratic(double[] eqn, double[] roots) {
        if (Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2]) < 0) {
            return 0;
        }
        roots[0] = ((-1 * eqn[1]) + Math.sqrt(Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2]))) / (2 * eqn[0]);
        roots[1] = ((-1 * eqn[1]) - Math.sqrt(Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2]))) / (2 * eqn[0]);
        return (roots[0] == roots[1]) ? 1 : 2;
    }
}