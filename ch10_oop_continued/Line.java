/**
 * Class to define the Line object.
 * 
 * @author Scott M.
 * Line.java
 */

public class Line
{
    private Point p1, p2;
    
    /**
     * Constructor to make a line object with two specified endpoints.
     * @params (first endpoint, instance of Point class) (second endpoint, instance of Point class)
     */
    public Line(Point p1, Point p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    /**
     * Method to get endpoint 1.
     * @return (first endpoint)
     */
    public Point getP1()
    {
        return p1;
    }
    
    /**
     * Method to get endpoint 2.
     * @return (second endpoint)
     */
    public Point getP2()
    {
        return p2;
    }
    
    /**
     * Method to get length of the line segment from point 1 to point 2.
     * @return (distance between p1 and p2, length of line segment)
     */
    public double getLength()
    {
        return Math.sqrt(Math.pow(this.p2.getX() - this.p1.getX(), 2) + Math.pow(this.p2.getY() - this.p1.getY(), 2));
    }
    
    /**
     * Method to get the slope of the line.
     * @return (slope of the line)
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
     * Method to check if a specific point is on the line.
     * @params (point to be checked)
     * @return (true: point is on line, false: point is not on line)
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
     * Method to check if a point is on the line segment from p1 to p2.
     * @params (point to be checked)
     * @return (true: point is on the line segment, false: point is not on the segment)
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
     * Method to check if a point is on the ray from p1 through p2.
     * 
     * @params (point to be checked)
     * @return (true: point is on the ray, false: point is not on the ray)
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
     * Method to check where/if this line segment intersects with another.
     * @params (line to compare with for an intersection point)
     * @return (Point of intersection, null if no intersection)
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
     * Method to check if two line segments intersect one another.
     * 
     * @params (line object to compare with for intersection)
     * @return (true: the line segments intersect, false: the line segments don't intersect)
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
     * Method to find if a ray from origin p1 passing through p2 intersects with
     * another segment.
     * 
     * @params (line object to check for intersection)
     * @return (true: the ray intersects the segment, false: the ray doesn't intersect
     * with the segment)
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