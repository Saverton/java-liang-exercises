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

class Line
{
    private Point p1, p2;
    
    /**
     * Construct a new Line with a start and end point.
     * @param p1 Point: start point
     * @param p2 Point: end point
     */
    public Line(Point p1, Point p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    /**
     * Return the start point.
     * @return Point: start point
     */
    public Point getP1()
    {
        return p1;
    }
    
    /**
     * Return the end point
     * @return Point: end point
     */
    public Point getP2()
    {
        return p2;
    }
    
    /**
     * Return the length of the line segment from point 1 to point 2.
     * @return double: length of line segment
     */
    public double getLength()
    {
        return Math.sqrt(Math.pow(this.p2.getX() - this.p1.getX(), 2) + Math.pow(this.p2.getY() - this.p1.getY(), 2));
    }
    
    /**
     * Return the slope of the line.
     * @return double: slope
     */
    public double getSlope()
    {
        double slope;
        if (this.p1.getX() == this.p2.getX())
        {
            slope = 0;
        }
        else
        {
            slope = (this.p2.getY() - this.p1.getY()) / (this.p2.getX() - this.p1.getX());
        }
        return slope;
    }
    
    /**
     * Check if a specific point is on the line.
     * @param p3 Point: 3rd point
     * @return boolean: true = point is on the line, false otherwise
     */
    public boolean hasPoint(Point p3)
    {
        boolean hasPoint;
        if (this.getSlope() == 0)
        {
            if ((this.p1.getX() == p3.getX() && this.p2.getX() == p3.getX()) || (this.p1.getY() == p3.getY() && this.p2.getY() == p3.getY()))
            {
                hasPoint = true;
            }
            else
            {
                hasPoint = false;
            }
        }
        else
        {
            hasPoint = Math.round(this.getSlope() * 10000) == Math.round(new Line(this.p1, p3).getSlope() * 10000);
        }
        return hasPoint;
    }
    
    /**
     * Check if a point is on the line segment between point 1 and point 2.
     * @param p3 Point: 3rd point
     * @return boolean: true = point is on line segment, false otherwise
     */
    public boolean hasPointOnSegment(Point p3)
    {
        boolean hasPoint = true;
        if (!this.hasPoint(p3))
        {
            hasPoint = false;
        }
        if (hasPoint && (p3.getX() < Math.min(this.p1.getX(), this.p2.getX()) || p3.getX() > Math.max(this.p1.getX(), this.p2.getX())))
        {
            hasPoint = false;
        }
        if (hasPoint && (p3.getY() < Math.min(this.p1.getY(), this.p2.getY()) || p3.getY() > Math.max(this.p1.getY(), this.p2.getY())))
        {
            hasPoint = false;
        }
        return hasPoint;
    }
    
    /**
     * Check if a point is on the Ray extending from point 1 infinitely in the direction of point 2.
     * @param p3 Point: 3rd point
     * @return boolean: true = point is on ray, false otherwise
     */
    public boolean hasPointOnRay(Point p3)
    {
        boolean hasPoint = true;
        double xRel, yRel;
        xRel = this.p1.getX() - this.p2.getX();
        yRel = this.p1.getY() - this.p2.getY();
        if (!this.hasPoint(p3))
        {
            hasPoint = false;
        }
        if (xRel < 0 && yRel < 0)
        {
            if (p3.getX() < this.p1.getX() || p3.getY() < this.p1.getY())
            {
                hasPoint = false;
            }
        }
        else if (xRel > 0 && yRel < 0)
        {
            if (p3.getX() > this.p1.getX() || p3.getY() < this.p1.getY())
            {
                hasPoint = false;
            }
        }
        else if (xRel > 0 && yRel > 0)
        {
            if (p3.getX() > this.p1.getX() || p3.getY() > this.p1.getY())
            {
                hasPoint = false;
            }
        }
        else if (xRel < 0 && yRel > 0)
        {
            if (p3.getX() < this.p1.getX() || p3.getY() > this.p1.getY())
            {
                hasPoint = false;
            }
        }
        return hasPoint;
    }
    
    /**
     * Return the point at which this line intersects with another, null if lines don't intersect.
     * @param l2 Line: second line
     * @return Point: intersection, null if doesn't exist
     */
    public Point getIntersection(Line l2)
    {
        double[] inputs = new double[6];
        inputs[0] = this.p1.getY() - this.p2.getY();
        inputs[1] = -1 * (this.p1.getX() - this.p2.getX());
        inputs[2] = l2.p1.getY() - l2.p2.getY();
        inputs[3] = -1 * (l2.p1.getX() - l2.p2.getX());
        inputs[4] = (this.p1.getY() - this.p2.getY()) * this.p1.getX() - (this.p1.getX() - this.p2.getX()) * this.p1.getY();
        inputs[5] = (l2.p1.getY() - l2.p2.getY()) * l2.p1.getX() - (l2.p1.getX() - l2.p2.getX()) * l2.p1.getY();
        LinearEquation intersection = new LinearEquation(inputs);
        if (!intersection.isSolvable())
        {
            return null;
        }
        else
        {
            return new Point(intersection.getX(), intersection.getY());
        }
    }
    
    /**
     * Check if this Line segment intersects with another Line Segment. 
     * @param l2 Line: second line
     * @return boolean: true = line segments intersect, false otherwise
     */
    public boolean segmentIntersects(Line l2)
    {
        boolean intersects = true;
        Point ip = getIntersection(l2);
        if (ip == null)
        {
            intersects = false;
        }
        if (intersects && (!this.hasPointOnSegment(ip) || !l2.hasPointOnSegment(ip)))
        {
            intersects = false;
        }
        return intersects;
    }
    
    /**
     * Check if this ray extending from point 1 infinitely towards point 2 intersects with a ray created in the same way from another Line object.
     * @param l2 Line: second line
     * @return boolean: true = the rays intersect, false otherwise
     */
    public boolean rayIntersects(Line l2)
    {
        boolean intersects = true;
        Point ip = getIntersection(l2);
        if (ip == null)
        {
            intersects = false;
        }
        if (intersects && (!this.hasPointOnRay(ip) || !l2.hasPointOnSegment(ip)))
        {
            intersects = false;
        }
        return intersects;
    }
}

class LinearEquation
{
    /**
     * Object that defines a Linear Equation object
     */
    private double a, b, c, d, e, f;
    
    /**
     * Construct a new Linear equation with a, b, c, d, e, and f in:
     *      ax + by = e
     *      cx + dy = f
     * @param vars double...: list of 6 doubles
     */
    public LinearEquation(double... vars)
    {
        this.a = vars[0];
        this.b = vars[1];
        this.c = vars[2];
        this.d = vars[3];
        this.e = vars[4];
        this.f = vars[5];
    }
    
    /**
     * Return variable "a" in:
     *      ax + by = e
     *      cx + dy = f
     * @return double: variable "a"
     */
    public double getA()
    {
        return this.a;
    }
    
    /**
     * Return variable "b" in:
     *      ax + by = e
     *      cx + dy = f
     * @return double: variable "b"
     */
    public double getB()
    {
        return this.b;
    }
    
    /**
     * Return variable "c" in:
     *      ax + by = e
     *      cx + dy = f
     * @return double: variable "c"
     */
    public double getC()
    {
        return this.c;
    }
    
    /**
     * Return variable "d" in:
     *      ax + by = e
     *      cx + dy = f
     * @return double: variable "d"
     */
    public double getD()
    {
        return this.d;
    }
    
    /**
     * Return variable "e" in:
     *      ax + by = e
     *      cx + dy = f
     * @return double: variable "e"
     */
    public double getE()
    {
        return this.e;
    }
    
    /**
     * Return variable "f" in:
     *      ax + by = e
     *      cx + dy = f
     * @return double: variable "f"
     */
    public double getF()
    {
        return this.f;
    }
    
    /**
     * Check if this pair of linear equations are solvable.
     * @return boolean: true = equations are solvable, false otherwise
     */
    public boolean isSolvable()
    {
        boolean solvable = true;
        if (this.a * this.d - this.b * this.c == 0)
        {
            solvable = false;
        }
        return solvable;
    }
    
    /**
     * Return "x" where:
     *           ed - bf
     *      x = ---------
     *           ad - bc
     * @return double: x
     */
    public double getX()
    {
        double x = 0;
        if (this.isSolvable())
        {
            x = (this.e * this.d - this.b * this.f) / (this.a * this.d - this.b * this.c);
        }
        return x;
    }
    
    /**
     * Return "y" where:
     *           af - ec
     *      y = ---------
     *           ad - bc
     * @return double: y
     */
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