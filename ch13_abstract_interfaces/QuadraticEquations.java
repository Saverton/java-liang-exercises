/** Program to solve quadratic equations in the 0 = ax^2 + bx + c form. uses
 * the complex class in the case of a discriminant that is less than 0.
 * 
 * @author Scott M.
 * QuadraticEquations.java
 */

import java.util.Scanner;

public class QuadraticEquations {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double a, b, c;
        Number[] roots;
        
        System.out.print("Enter a, b, and c: ");
        a = kb.nextDouble();
        b = kb.nextDouble();
        c = kb.nextDouble();
        
        roots = solve(a, b, c);
        
        switch (roots.length) {
            case 1: System.out.print("The root is "); break;
            case 2: System.out.print("The roots are "); break;
        }
        for (int i = 0; i < roots.length; i++) {
            System.out.print((i + 1 < roots.length) ? roots[i] + " and " : roots[i]);
        }
    }
    
    /** solve a quadratic equation given a, b, and c
     * @params a, b, c
     * @return solution to the quadratic equation
     */
    public static Number[] solve(double a, double b, double c) {
        Number[] roots;
        if (getDiscriminant(a, b, c) > 0) {
            roots = new Number[2];
            roots[0] = new Double((-1 * b + Math.sqrt(getDiscriminant(a, b, c))) / (2 * a));
            roots[1] = new Double((-1 * b - Math.sqrt(getDiscriminant(a, b, c))) / (2 * a));
        }
        else if (getDiscriminant(a, b, c) == 0) {
            roots = new Number[1];
            roots[0] = new Double((-1 * b + Math.sqrt(getDiscriminant(a, b, c))) / (2 * a));
        }
        else {
            roots = new Number[2];
            roots[0] = new Complex(-1 * b, Math.sqrt(Math.abs(getDiscriminant(a, b, c)))).divide(new Complex(2 * a, 0));
            roots[1] = new Complex(-1 * b, -1 * Math.sqrt(Math.abs(getDiscriminant(a, b, c)))).divide(new Complex(2 * a, 0));
        }
        return roots;
    }
    
    /** return the discriminant of a quadratic equation given
     * a, b, and c.
     * @params a, b, c
     * @return discriminant
     */
    public static double getDiscriminant(double a, double b, double c) {
        return (Math.pow(b, 2) - 4 * a * c);
    }
}