/**
 * (Algebra: quadratic equations) Design a class named QuadraticEquation for 
 * a quadratic equation ax2 + bx + x = 0. The class contains:
 *  ■ Private data fields a, b, and c that represent three coefficients.
 *  ■ A constructor for the arguments for a, b, and c.
 *  ■ Three getter methods for a, b, and c.
 *  ■ A method named getDiscriminant() that returns the discriminant, which is 
 *    b2 - 4ac.
 *  ■ The methods named getRoot1() and getRoot2() for returning two roots of 
 *    the equation 
 *                    ___________
 *          -b (+-) \/ b^2 - 4ac
 * roots = -----------------------
 *                   2a
 * These methods are useful only if the discriminant is nonnegative. Let these methods 
 * return 0 if the discriminant is negative.
 * Draw the UML diagram for the class and then implement the class. Write a test 
 * program that prompts the user to enter values for a, b, and c and displays the result 
 * based on the discriminant. If the discriminant is positive, display the two roots. If 
 * the discriminant is 0, display the one root. Otherwise, display “The equation has 
 * no roots.”
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_9_10 {
    /**
     * Main method to test class.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int[] params = new int[3];
        QuadraticEquation e;
        
        System.out.print("Enter a, b, and c: ");
        for (int i = 0; i < params.length; i++)
        {
            params[i] = kb.nextInt();
        }
        kb.close();
        e = new QuadraticEquation(params[0], params[1], params[2]);
        
        if (e.getDiscriminant() > 0)
        {
            System.out.print("Roots are [" + e.getRoot1() + ", " + e.getRoot2() + "]");
        }
        else if (e.getDiscriminant() == 0)
        {
            System.out.print("Root is [" + e.getRoot1() + "]");
        }
        else
        {
            System.out.print("No real roots");
        }
    }
}

class QuadraticEquation
{
    /**
     * Class to define quadratic equation wrong.
     */
    private int a, b, c;
    
    /**
     * Construct a new quadratic equation with specified a, b, and c in:
     *      ax^2 + bx + c = 0
     * @param a int: variable "a"
     * @param b int: variable "b"
     * @param c int: variable "c"
     */
    public QuadraticEquation(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    /**
     * Return "a" in:
     *      ax^2 + bx + c = 0
     * @return int: variable "a"
     */
    public int getA()
    {
        return this.a;
    }
    
    /**
     * Return "b" in:
     *      ax^2 + bx + c = 0
     * @return int: variable "b"
     */
    public int getB()
    {
        return this.b;
    }
    
    /**
     * Return "c" in:
     *      ax^2 + bx + c = 0
     * @return int: variable "c"
     */
    public int getC()
    {
        return this.c;
    }
    
    /**
     * Return the discriminant of the quadratic equation.
     * @return double: equation discriminant
     */
    public double getDiscriminant()
    {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }
    
    /**
     * Return the first root of the quadratic eqation.
     * @return double: first root of the quadratic equation
     */
    public double getRoot1()
    {
        double root1;
        if (this.getDiscriminant() >= 0)
        {
            root1 = (-1 * this.b + Math.sqrt(this.getDiscriminant())) / (2 * a);
        }
        else
        {
            root1 = 0;
        }
        return root1;
    }
    
    /**
     * Return the second root of the quadratic eqation.
     * @return double: second root of the quadratic equation
     */
    public double getRoot2()
    {
        double root2;
        if (this.getDiscriminant() >= 0)
        {
            root2 = (-1 * this.b - Math.sqrt(this.getDiscriminant())) / (2 * a);
        }
        else
        {
            root2 = 0;
        }
        return root2;
    }
}