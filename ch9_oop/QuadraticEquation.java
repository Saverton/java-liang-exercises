/**
 * Class to create quadratic equation objects in the form ax^2 + bx + c = 0. Has parameters for a, b, and c
 * as well as behavior to get the discriminant, as well as for each root.
 * 
 * @author Scott M.
 * QuadraticEquation.java
 */

import java.util.Scanner;

public class QuadraticEquation
{
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
    
    /**
     * Class to define quadratic equation wrong.
     */
    private int a, b, c;
    
    public QuadraticEquation(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int getA()
    {
        return this.a;
    }
    
    public int getB()
    {
        return this.b;
    }
    
    public int getC()
    {
        return this.c;
    }
    
    public double getDiscriminant()
    {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }
    
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