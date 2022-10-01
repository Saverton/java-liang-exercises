/**
 * Program to create and test an object representing a linear equation with data fields for
 * the coefficients of each equation (form: ax + by + c) and behavior to solve the equation.
 * 
 * @author Scott M.
 * LinearEquation.java
 */

import java.util.Scanner;

public class LinearEquation
{
    /**
     * Object that defines a Linear Equation object
     */
    private double a, b, c, d, e, f;
    
    public LinearEquation(int a, int b, int c, int d, int e, int f)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public LinearEquation(double[] inputs)
    {
        this.a = inputs[0];
        this.b = inputs[1];
        this.c = inputs[2];
        this.d = inputs[3];
        this.e = inputs[4];
        this.f = inputs[5];
    }
    
    public double getA()
    {
        return this.a;
    }
    
    public double getB()
    {
        return this.b;
    }
    
    public double getC()
    {
        return this.c;
    }
    
    public double getD()
    {
        return this.d;
    }
    
    public double getE()
    {
        return this.e;
    }
    
    public double getF()
    {
        return this.f;
    }
    
    public boolean isSolvable()
    {
        boolean solvable = true;
        if (this.a * this.d - this.b * this.c == 0)
        {
            solvable = false;
        }
        return solvable;
    }
    
    public double getX()
    {
        double x = 0;
        if (this.isSolvable())
        {
            x = (this.e * this.d - this.b * this.f) / (this.a * this.d - this.b * this.c);
        }
        return x;
    }
    
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