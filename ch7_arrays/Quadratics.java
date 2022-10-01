/**
 * Program to get inputs for a quadratic equation, return the number of real roots, and then print those roots.
 * 
 * @author Scott M.
 * Quadratics.java
 */

import java.util.Scanner;

public class Quadratics {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double[] eqn = new double[3];
        double[] roots = new double[2];
        int rootCount;
        
        System.out.print("Enter a, b, and c, for ax^2 + bx + c: ");
        for (int i = 0; i < 3; i++) {
            eqn[i] = kb.nextDouble();
        }
        
        System.out.println((solveQuadratic(eqn, roots) == 1) ? "Equation has " + solveQuadratic(eqn, roots) + " real root" : "Equation has " + solveQuadratic(eqn, roots) + " real roots");
        System.out.println((roots[0] != 0) ? "Root 1 is " + roots[0] : "");
        System.out.print((roots[1] != 0 && roots[0] != roots[1]) ? "Root 2 is " + roots[1] : "");
    }
    /**
     * Method to return number of real roots.
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