/** Program to implement the Rational class to find h and k for vertex form equations
 * from a standard form quadratic equation.
 * 
 * @author Scott M.
 * VertexFormEquations.java
 */

import java.util.Scanner;

public class VertexFormEquations {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double a, b, c;
        
        System.out.print("Enter a, b, and c: ");
        a = kb.nextDouble();
        b = kb.nextDouble();
        c = kb.nextDouble();
        
        System.out.print("h is " + getH(a, b) + " k is " + getK(a, b, c));
    }
    
    /** Return h
     * @params a, b, c
     * @return Rational h
     */
    public static Rational getH(double a, double b) {
        return (new Rational((long)(-1 * b * 10), (long)(2 * a * 10)));
    }
    
    /** Return k
     * @params a, b, c
     * @return Rational k
     */
    public static Rational getK(double a, double b, double c) {
        return (new Rational((long)((4 * a * c - Math.pow(b, 2)) * 10), (long)(4 * a * 10)));
    }
}