/**
 * Program to create Regular Polygon object with data fields for the number of sides
 * n, length of sides, and the x and y positions of the center.
 * 
 * @author Scott M.
 * RegularPolygon.java
 */

public class RegularPolygon
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        RegularPolygon[] rp = new RegularPolygon[3];
        rp[0] = new RegularPolygon();
        rp[1] = new RegularPolygon(6, 4);
        rp[2] = new RegularPolygon(10, 4, 5.6, 7.8);
        
        for (int i = 0; i < rp.length; i++)
        {
            printPolygon(rp[i]);
        }
    }
    
    public static void printPolygon(RegularPolygon rp)
    {
        System.out.println("Perimeter: " + rp.getPerimeter() + "\tArea: " + rp.getArea());
    }
    
    /**
     * Regular Polygon Object
     */
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;
    
    public RegularPolygon(int n, double side, double x, double y)
    {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    
    public RegularPolygon(int n, double side)
    {
        this(n, side, 0, 0);
    }
    
    public RegularPolygon()
    {
        this(3, 1, 0, 0);
    }
    
    public int getN()
    {
        return this.n;
    }
    
    public double getSides()
    {
        return this.side;
    }
    
    public double getX()
    {
        return this.x;
    }
    
    public double getY()
    {
        return this.y;
    }
    
    public void setN(int n)
    {
        this.n = n;
    }
    
    public void setSides(double side)
    {
        this.side = side;
    }
    
    public void setXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public double getPerimeter()
    {
        return side * n;
    }
    
    public double getArea()
    {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}