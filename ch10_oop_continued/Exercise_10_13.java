/**
 * (Geometry: the MyRectangle2D class) Define the MyRectangle2D class that 
 * contains:
 *  ■ Two double data fields named x and y that specify the center of the rectangle with getter and setter methods. (Assume that the rectangle sides are 
 *    parallel to x- or y- axes.)
 *  ■ The data fields width and height with getter and setter methods.
 *  ■ A no-arg constructor that creates a default rectangle with (0, 0) for (x, y) and 
 *    1 for both width and height.
 *  ■ A constructor that creates a rectangle with the specified x, y, width, and 
 *    height.
 *  ■ A method getArea() that returns the area of the rectangle.
 *  ■ A method getPerimeter() that returns the perimeter of the rectangle.
 *  ■ A method contains(double x, double y) that returns true if the 
 *    specified point (x, y) is inside this rectangle (see Figure 10.24a).
 *  ■ A method contains(MyRectangle2D r) that returns true if the specified 
 *    rectangle is inside this rectangle (see Figure 10.24b).
 *  ■ A method overlaps(MyRectangle2D r) that returns true if the specified 
 *    rectangle overlaps with this rectangle (see Figure 10.24c).
 * Draw the UML diagram for the class and then implement the class. Write a test 
 * program that creates a MyRectangle2D object r1 (new MyRectangle2D(2, 
 * 2, 5.5, 4.9)), displays its area and perimeter, and displays the result of 
 * r1.contains(3, 3), r1.contains(new MyRectangle2D(4, 5, 10.5, 
 * 3.2)), and r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)).
 * @author Scott M.
 */

public class Exercise_10_13 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Rectangle2D r1 = new Rectangle2D(2, 2, 5.5, 4.9);
        
        System.out.println("Area: " + r1.getArea() + "\tPerimeter: " + r1.getPerimeter());
        System.out.println("contains [3, 3]? " + r1.contains(new Point(3, 3)));
        System.out.println("contains rectangle x = 4, y = 5, w = 10.5, h = 3.2? " + r1.contains(new Rectangle2D(4, 5, 10.5, 3.2)));
        System.out.println("overlaps rectangle x = 3, y = 5, w = 2.3, h = 5.4? " + r1.overlaps(new Rectangle2D(3, 5, 2.3, 5.4)));
    }
}

class Rectangle2D
{
    private double width, height, x, y;
    
    /**
     * Construct a new Rectangle2D with x, y coordinates of center, width and height. 
     * @param x double: center x coordinate
     * @param y double: center y coordinate
     * @param width double: width of rectangle
     * @param height double: height of rectangle
     */
    public Rectangle2D(double x, double y, double width, double height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    /**
     * Construct a Rectangle2D centered at [0,0] with a width and height of 1.
     */
    public Rectangle2D()
    {
        this(0, 0, 1, 1);
    }
    
    /**
     * Return the center x coordinate of the rectangle.
     * @return double: center x coordinate
     */
    public double getX()
    {
        return this.x;
    }
    
    /**
     * Set a new center x position of the rectangle
     * @param x double: new center x coordinate
     */
    public void setX(double x)
    {
        this.x = x;
    }
    
    /**
     * Return the center y position of the rectangle
     * @return double: center y rectangle
     */
    public double getY()
    {
        return this.y;
    }
    
    /**
     * Set a new center y position of the rectangle
     * @param y double: new center y coordinate
     */
    public void setY(double y)
    {
        this.y = y;
    }
    
    /**
     * Return the width of the rectangle
     * @return double: width
     */
    public double getWidth()
    {
        return this.width;
    }
    
    /**
     * Set a new width of the rectangle.
     * @param width double: new width
     */
    public void setWidth(double width)
    {
        this.width = width;
    }
    
    /**
     * Return the height of the rectangle
     * @return double: height
     */
    public double getHeight()
    {
        return this.height;
    }
    
    /**
     * Set a new height of the rectangle
     * @param height double: new height
     */
    public void setHeight(double height)
    {
        this.height = height;
    }
    
    /**
     * Return the area of the rectangle
     * @return double: area
     */
    public double getArea()
    {
        return this.width * this.height;
    }
    
    /**
     * Return the perimeter of the rectangle
     * @return double: perimeter
     */
    public double getPerimeter()
    {
        return 2 * this.width + 2 * this.height;
    }
    
    /**
     * Check if the Rectangle2D contains a point.
     * @param p Point: point
     * @return boolean: true = Rectangle contains point, false otherwise
     */
    public boolean contains(Point p)
    {
        return (p.getX() > this.x - this.width / 2 && p.getX() < this.x + this.width / 2 &&
                p.getY() > this.y - this.height / 2 && p.getY() < this.y + this.height / 2);
    }
    
    /**
     * Check if the rectangle contains another rectangle
     * @param r2 Rectangle2D: another Rectangle2D
     * @return boolean: true = this rectangle contains other rectangle, false otherwise
     */
    public boolean contains(Rectangle2D r2)
    {
        return this.contains(new Point(r2.getX() - r2.getWidth(), r2.getY() - r2.getHeight())) &&
               this.contains(new Point(r2.getX() + r2.getWidth(), r2.getY() - r2.getHeight())) &&
               this.contains(new Point(r2.getX() - r2.getWidth(), r2.getY() + r2.getHeight())) &&
               this.contains(new Point(r2.getX() + r2.getWidth(), r2.getY() + r2.getHeight()));
    }
    
    /**
     * Check if this rectangle overlaps with another Rectangle2D
     * @param r2 Rectangle2D: another Rectangle2D
     * @return boolean: this rectangle overlaps the other rectangle, false otherwise
     */
    public boolean overlaps(Rectangle2D r2)
    {
        return (this.contains(new Point(r2.getX() - r2.getWidth(), r2.getY() - r2.getHeight())) ||
                this.contains(new Point(r2.getX() + r2.getWidth(), r2.getY() - r2.getHeight())) ||
                this.contains(new Point(r2.getX() - r2.getWidth(), r2.getY() + r2.getHeight())) ||
                this.contains(new Point(r2.getX() + r2.getWidth(), r2.getY() + r2.getHeight())) ||
                r2.contains(new Point(this.getX() - this.getWidth(), this.getY() - this.getHeight())) ||
                r2.contains(new Point(this.getX() + this.getWidth(), this.getY() - this.getHeight())) ||
                r2.contains(new Point(this.getX() - this.getWidth(), this.getY() + this.getHeight())) ||
                r2.contains(new Point(this.getX() + this.getWidth(), this.getY() + this.getHeight())));
    }
}