/**
 * Class to create a rectangle Object that has data fields for width and height as well
 * as methods to calculate the area and perimeter of the rectangle.
 * 
 * @author Scott M.
 * Rectangle.java
 */

import java.text.DecimalFormat;

public class Rectangle
{
    /**
     * Main method to test Rectangle Class.
     */
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);
        DecimalFormat fmt = new DecimalFormat("0.##");
        
        System.out.println("Rect\tWidth\tHeight\tArea\tPerim");
        System.out.println("r1\t" + r1.width + "\t" + r1.height + "\t" + fmt.format(r1.getArea()) + "\t" + r1.getPerimeter());
        System.out.println("r2\t" + r2.width + "\t" + r2.height + "\t" + fmt.format(r2.getArea()) + "\t" + r2.getPerimeter());
    }
    
    double width;
    double height;
    
    Rectangle()
    {
        width = 1;
        height = 1;
    }
    
    Rectangle(double w, double h)
    {
        width = w;
        height = h;
    }
    
    double getArea()
    {
        return width * height;
    }
    
    double getPerimeter()
    {
        return 2 * width + 2 * height;
    }
}