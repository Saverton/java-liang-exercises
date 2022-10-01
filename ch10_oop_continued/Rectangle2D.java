/**
 * Class to define the Rectangle2D object type.
 * 
 * @author Scott M.
 * Rectangle2D.java
 */

public class Rectangle2D
{
    private double width, height, x, y;
    
    /**
     * Constructor to build a rectangle at a specified center and dimensions
     * 
     * @params (x pos of center) (y pos of center) (width of rectangle)
     *         (height of rectangle)
     */
    public Rectangle2D(double x, double y, double width, double height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    /**
     * Overloaded no-arg constructor at x,y (0, 0) with width and height of 1.
     */
    public Rectangle2D()
    {
        this(0, 0, 1, 1);
    }
    
    /**
     * Method to get the x pos of the rectangle.
     * 
     * @return (x position of rectangle)
     */
    public double getX()
    {
        return this.x;
    }
    
    /**
     * Method to set the x pos of the rectangle.
     * 
     * @params (new x pos of the rectangle)
     */
    public void setX(double x)
    {
        this.x = x;
    }
    
    /**
     * Method to get the y pos of the rectangle.
     * 
     * @return (y pos of rectangle)
     */
    public double getY()
    {
        return this.y;
    }
    
    /**
     * Method to set the y pos of the rectangle.
     * 
     * @params (new y pos of the rectangle)
     */
    public void setY(double y)
    {
        this.y = y;
    }
    
    /**
     * Method to get the width of the rectangle.
     * 
     * @return (the width of the rectangle)
     */
    public double getWidth()
    {
        return this.width;
    }
    
    /**
     * Method to set the width of the rectangle.
     * 
     * @params (new width of rectangle)
     */
    public void setWidth(double width)
    {
        this.width = width;
    }
    
    /**
     * Method to get the height of the rectangle.
     * 
     * @return (the height of the rectangle)
     */
    public double getHeight()
    {
        return this.height;
    }
    
    /**
     * Method to set the height of the rectangle.
     * 
     * @params (new height of rectangle)
     */
    public void setHeight(double height)
    {
        this.height = height;
    }
    
    /**
     * Method to get the Area of the rectangle.
     * 
     * @return (the area of the rectangle)
     */
    public double getArea()
    {
        return this.width * this.height;
    }
    
    /**
     * Method to get the perimeter of the rectangle.
     * 
     * @return (perimeter of the rectangle)
     */
    public double getPerimeter()
    {
        return 2 * this.width + 2 * this.height;
    }
    
    /**
     * Method to check if a Point is inside the rectangle.
     * 
     * @return (true: the point is inside the rect. false: the point is not inside
     *          the rect.)
     */
    public boolean contains(Point p)
    {
        return (p.getX() > this.x - this.width / 2 && p.getX() < this.x + this.width / 2 &&
                p.getY() > this.y - this.height / 2 && p.getY() < this.y + this.height / 2);
    }
    
    /**
     * Method to check if a rectangle is contained inside this rectangle
     * 
     * @params (the rectangle that is or is not inisde this one)
     * @return (true: the rectangle is inside this rectangle, false: the rectangle
     *          is not inside this rectangle)
     */
    public boolean contains(Rectangle2D r2)
    {
        return this.contains(new Point(r2.getX() - r2.getWidth(), r2.getY() - r2.getHeight())) &&
               this.contains(new Point(r2.getX() + r2.getWidth(), r2.getY() - r2.getHeight())) &&
               this.contains(new Point(r2.getX() - r2.getWidth(), r2.getY() + r2.getHeight())) &&
               this.contains(new Point(r2.getX() + r2.getWidth(), r2.getY() + r2.getHeight()));
    }
    
    /**
     * Method to check if a rectangle overlaps with this rectangle.
     * 
     * @params (the rectangle that is or is not overlapping this one)
     * @return (true: the rectangles overlap, false: the rectangles don't overlap)
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