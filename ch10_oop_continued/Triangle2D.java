/**
 * Triangle 2D class defines a 2D triangle object by it's three points.
 * 
 * @author Scott M.
 * Triangle2D.java
 */

public class Triangle2D
{
    private Point[] points = new Point[3];
    
    /**
     * Constructor to create a Triangle2D object from 3 points.
     * @params (points 1, 2, 3 that define the corners of the triangle);
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
     * Constructor passed with no args; sets a Triangle2D object with points
     * [0, 0], [1, 1], and [2, 5]
     */
    public Triangle2D()
    {
        this(new Point(0, 0), new Point(1, 1), new Point(2, 5));
    }
    
    /**
     * Method to get the point at a specified index.
     * @params (point index (0, 1, 2 -> 1, 2, 3))
     * @return (point to be returned)
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
     * Method to set a specified point.
     * @params (point index to be set (0, 1, 2 -> 1, 2, 3) (What the point should be set to)
     */
    public void setPoint(int index, Point newP)
    {
        if (index >= 0 && index <= 2)
        {
            points[index] = newP;
        }
    }
    
    /**
     * Method to return the area of the triangle object. If area is 0, the three points are on the same line.
     * @return (the area of the triangle)
     */
    public double getArea()
    {
        double s = (this.getPerimeter()) / 2;
        return Math.sqrt(s * (s - new Line(points[0], points[1]).getLength()) * 
                             (s - new Line(points[1], points[2]).getLength()) * 
                             (s - new Line(points[0], points[2]).getLength()));
    }
    
    /**
     * Method to return the perimeter of the triangle object.
     * @return (the perimeter of the triangle)
     */
    public double getPerimeter()
    {
        return (new Line(points[0], points[1]).getLength() + new Line(points[1], points[2]).getLength() + new Line(points[0], points[2]).getLength());
    }
    
    /**
     * Method to check whether a point is inside the triangle.
     * @params (the point in question)
     * @return (true: point is inside the triangle, false: point is not inside the triangle)
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
     * Method to check whether another Triangle2D is inside this Triangle2D
     * @params (the other triangle)
     * @return (true: the other triangle is inside, false: the other triangle is not inside)
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
     * Method to check whether or not another Triangle2D overlaps this Triangle2D.
     * @params (the other triangle)
     * @return (true: the other triangle overlaps, false: the other triangle doesn't overlap)
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