/**
 * (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a 
 * 2 * 2 system of linear equations:
 * ax + by = e
 * cx + dy = f
 *           ed - bf             af - ec
 *      x = ---------       y = ---------
 *           ad - bc             ad - bc
 * The class contains:
 *  ■ Private data fields a, b, c, d, e, and f.
 *  ■ A constructor with the arguments for a, b, c, d, e, and f.
 *  ■ Six getter methods for a, b, c, d, e, and f.
 *  ■ A method named isSolvable() that returns true if ad - bc is not 0.
 *  ■ Methods getX() and getY() that return the solution for the equation.
 * Draw the UML diagram for the class and then implement the class. Write a test 
 * program that prompts the user to enter a, b, c, d, e, and f and displays the result. 
 * If ad - bc is 0, report that “The equation has no solution.” 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_9_11 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        LinearEquation eq;
        int[] constants = new int[6];
        
        System.out.print("Enter a, b, c, d, e, f: ");
        for (int i = 0; i < constants.length; i++)
        {
            constants[i] = kb.nextInt();
        }
        kb.close();
        eq = new LinearEquation(constants[0], constants[1], constants[2], constants[3], constants[4], constants[5]);
        
        if (eq.isSolvable())
        {
            System.out.print("x is " + eq.getX() + " and y is " + eq.getY());
        }
        else
        {
            System.out.print("The equation has no solution");
        }
    }
}

class LinearEquation
{
    /**
     * Object that defines a Linear Equation object
     */
    private double a, b, c, d, e, f;
    
    /**
     * Construct a new Linear equation with a, b, c, d, e, and f in:
     *      ax + by = e
     *      cx + dy = f
     * @param a int: variable "a"
     * @param b int: variable "b"
     * @param c int: variable "c"
     * @param d int: variable "d"
     * @param e int: variable "e"
     * @param f int: variable "f"
     */
    public LinearEquation(int a, int b, int c, int d, int e, int f)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    /**
     * Return variable "a" in:
     *      ax + by = e
     *      cx + dy = f
     * @return double: variable "a"
     */
    public double getA()
    {
        return this.a;
    }
    
    /**
     * Return variable "b" in:
     *      ax + by = e
     *      cx + dy = f
     * @return double: variable "b"
     */
    public double getB()
    {
        return this.b;
    }
    
    /**
     * Return variable "c" in:
     *      ax + by = e
     *      cx + dy = f
     * @return double: variable "c"
     */
    public double getC()
    {
        return this.c;
    }
    
    /**
     * Return variable "d" in:
     *      ax + by = e
     *      cx + dy = f
     * @return double: variable "d"
     */
    public double getD()
    {
        return this.d;
    }
    
    /**
     * Return variable "e" in:
     *      ax + by = e
     *      cx + dy = f
     * @return double: variable "e"
     */
    public double getE()
    {
        return this.e;
    }
    
    /**
     * Return variable "f" in:
     *      ax + by = e
     *      cx + dy = f
     * @return double: variable "f"
     */
    public double getF()
    {
        return this.f;
    }
    
    /**
     * Check if this pair of linear equations are solvable.
     * @return boolean: true = equations are solvable, false otherwise
     */
    public boolean isSolvable()
    {
        boolean solvable = true;
        if (this.a * this.d - this.b * this.c == 0)
        {
            solvable = false;
        }
        return solvable;
    }
    
    /**
     * Return "x" where:
     *           ed - bf
     *      x = ---------
     *           ad - bc
     * @return double: x
     */
    public double getX()
    {
        double x = 0;
        if (this.isSolvable())
        {
            x = (this.e * this.d - this.b * this.f) / (this.a * this.d - this.b * this.c);
        }
        return x;
    }
    
    /**
     * Return "y" where:
     *           af - ec
     *      y = ---------
     *           ad - bc
     * @return double: y
     */
    public double getY()
    {
        double y = 0;
        if (this.isSolvable())
        {
            y = (this.a * this.f - this.e * this.c) / (this.a * this.d - this.b * this.c);
        }
        return y;
    }
}