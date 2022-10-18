/**
 * (Geometry: the Triangle2D class) Define the Triangle2D class that contains:
 *  ■ Three points named p1, p2, and p3 of the type MyPoint with getter and 
 *    setter methods. MyPoint is defined in Programming Exercise 10.4.
 *  ■ A no-arg constructor that creates a default triangle with the points (0, 0), (1,
 *    1), and (2, 5).
 *  ■ A constructor that creates a triangle with the specified points.
 *  ■ A method getArea() that returns the area of the triangle.
 *  ■ A method getPerimeter() that returns the perimeter of the triangle.
 *  ■ A method contains(MyPoint p) that returns true if the specified point 
 *    p is inside this triangle (see Figure 10.22a).
 *  ■ A method contains(Triangle2D t) that returns true if the specified 
 *    triangle is inside this triangle (see Figure 10.22b).
 *  ■ A method overlaps(Triangle2D t) that returns true if the specified 
 *    triangle overlaps with this triangle (see Figure 10.22c).
 * Draw the UML diagram for the class and then implement the class. Write 
 * a test program that creates a Triangle2D objects t1 using the constructor 
 * new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), 
 * new MyPoint(5, 3.5)), displays its area and perimeter, and displays the 
 * result of t1.contains(3, 3), r1.contains(new Triangle2D(new 
 * MyPoint(2.9, 2), new MyPoint(4, 1), MyPoint(1, 3.4))), and t1.
 * overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, 
 * -3), MyPoint(2, 6.5))).
 * @author Scott M.
 */

public class Exercise_10_12 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Triangle2D t1 = new Triangle2D(new Point(2.5, 2), new Point(4.2, 3), new Point(5, 4));
        
        System.out.println("Area: " + t1.getArea() + "\tPerimeter: " + t1.getPerimeter());
        System.out.println("contains [3, 3]? " + t1.contains(new Point(3, 3)));
        System.out.println("contains Triangle: [2.9, 2], [4, 1], [1, 3.4]? " + t1.contains(new Triangle2D(new Point(2.9, 2), new Point(4, 1), new Point(1, 3.4))));
        System.out.println("overlaps Triangle: [2, 5.5], [4, -3], [2, 6.5]? " + t1.overlaps(new Triangle2D(new Point(2, 5.5), new Point(4, -3), new Point(2, 6.5))));
    }
}

class Triangle2D
{
    private Point[] points = new Point[3];
    
    /**
     * Construct a Triangle2D object from 3 points.
     * @param p1 Point: first point
     * @param p2 Point: second point
     * @param p3 Point: third point
     */
    public Triangle2D(Point p1, Point p2, Point p3)
    {
        if (new Line(p1, p2).hasPoint(p3))
        {
            points[0] = new Point(0, 0);
            points[1] = new Point(1, 1);
            points[2] = new Point(2, 5);
        }
        else
        {
            points[0] = p1;
            points[1] = p2;
            points[2] = p3;
        }
    }
    
    /**
     * Construct a Triangle2D object with points [0, 0], [1, 1], and [2, 5]
     */
    public Triangle2D()
    {
        this(new Point(0, 0), new Point(1, 1), new Point(2, 5));
    }
    
    /**
     * Method to get one of the triangle's vertex points given an index of one of the points.
     * @param index int: index of point
     * @return Point: vertex point of triangle
     */
    public Point getPoint(int index)
    {
        Point p;
        if (index >= 0 && index <= 2)
        {
            p = points[index];
        }
        else
        {
            p = null;
        }
        return p;
    }
    
    /**
     * Set a specific vertex point on the triangle.
     * @param index int: index of the point to reset
     * @param newP Point: point to replace at this index
     */
    public void setPoint(int index, Point newP)
    {
        if (index >= 0 && index <= 2)
        {
            points[index] = newP;
        }
    }
    
    /**
     * Return the area of the triangle.
     * @return double: area of Triangle
     */
    public double getArea()
    {
        double s = (this.getPerimeter()) / 2;
        return Math.sqrt(s * (s - new Line(points[0], points[1]).getLength()) * 
                             (s - new Line(points[1], points[2]).getLength()) * 
                             (s - new Line(points[0], points[2]).getLength()));
    }
    
    /**
     * Return the perimeter of the Triangle
     * @return double: perimeter of Triangle
     */
    public double getPerimeter()
    {
        return (new Line(points[0], points[1]).getLength() + new Line(points[1], points[2]).getLength() + new Line(points[0], points[2]).getLength());
    }
    
    /**
     * Check if a certain point is contained within this Triangle2d
     * @param p Point: point
     * @return boolean: true = point is inside the triangle, false otherwise
     */
    public boolean contains(Point p)
    {
        boolean contained = true;
        if (p.getX() < Math.min(Math.min(this.points[0].getX(), this.points[1].getX()), this.points[2].getX()) ||
            p.getX() > Math.max(Math.max(this.points[0].getX(), this.points[1].getX()), this.points[2].getX()) ||
            p.getY() < Math.min(Math.min(this.points[0].getY(), this.points[1].getY()), this.points[2].getY()) ||
            p.getY() > Math.max(Math.max(this.points[0].getY(), this.points[1].getY()), this.points[2].getY()))
        {
            contained = false;
        }
        for (int i = 0; contained && i < this.points.length; i++)
        {
            if (new Line(p, this.points[i]).rayIntersects(new Line(this.points[(i + 1) % 3], this.points[(i + 2) % 3])))
            {
                contained = false;
            }
        }
        return contained;
    }
    
    /**
     * Check if another Triangle2d is contained in this Triangle2d.
     * @param t2 Triangle2D: other Triangle
     * @return booelan: true = the other triangle is contained, false otherwise
     */
    public boolean contains(Triangle2D t2)
    {
        boolean contains = true;
        for (int i = 0; i < t2.points.length; i++)
        {
            if (!this.contains(t2.points[i]))
            {
                contains = false;
            }
        }
        return contains;
    }
    
    /**
     * Check if another Triangle2d overlaps with this triangle2d.
     * @param t2 Triangle2D: other Triangle
     * @return boolean: true = the other triangle overlaps, false otherwise
     */
    public boolean overlaps(Triangle2D t2)
    {
        boolean overlaps = true;
        if (this.contains(t2))
        {
            overlaps = false;
        }
        int intersections = 0;
        for (int i = 0; i < this.points.length; i++)
        {
            Line temp = new Line(this.points[i], this.points[(i + 1) % 3]);
            for (int j = 0; j < t2.points.length; j++)
            {
                if (temp.segmentIntersects(new Line(t2.points[j], t2.points[(j + 1) % 3])))
                {
                    intersections++;
                }
            }
        }
        if (intersections == 0)
        {
            overlaps = false;
        }
        return overlaps;
    }
}