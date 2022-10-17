/**
 * (The Rectangle class) Following the example of the Circle class in Section 9.2, 
 * design a class named Rectangle to represent a rectangle. The class contains:
 *  ■ Two double data fields named width and height that specify the width and 
 * height of the rectangle. The default values are 1 for both width and height.
 *  ■ A no-arg constructor that creates a default rectangle.
 *  ■ A constructor that creates a rectangle with the specified width and height.
 *  ■ A method named getArea() that returns the area of this rectangle.
 *  ■ A method named getPerimeter() that returns the perimeter.
 * Draw the UML diagram for the class and then implement the class. Write a test 
 * program that creates two Rectangle objects—one with width 4 and height 40
 * and the other with width 3.5 and height 35.9. Display the width, height, area, 
 * and perimeter of each rectangle in this order.
 * @author Scott M.
 */

import java.text.DecimalFormat;

public class Exercise_9_1 {
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
}

class Rectangle
{   
    double width;
    double height;
    
    /**
     * Construct a default rectangle with a width and height of 1
     */
    Rectangle()
    {
        width = 1;
        height = 1;
    }
    
    /**
     * Construct a rectangle with a specific width and height
     * @param w double: width
     * @param h double: height
     */
    Rectangle(double w, double h)
    {
        width = w;
        height = h;
    }
    
    /**
     * Return the area of a rectangle object.
     * @return double: area of rectangle
     */
    double getArea()
    {
        return width * height;
    }
    
    /**
     * Return the perimeter of a rectangle object/
     * @return double: perimeter of rectangle
     */
    double getPerimeter()
    {
        return 2 * width + 2 * height;
    }
}