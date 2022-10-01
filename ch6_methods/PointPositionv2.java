/**
 * Program to determine if a point is on the left, right or on a line.
 * 
 * @author Scott M.
 * PointPositionv2.java
 */

import java.util.Scanner;

public class PointPositionv2 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        double x0, x1, x2, y0, y1, y2;
        
        System.out.print("Enter three points for p0, p1, and p2: ");
        x0 = kb.nextDouble();
        y0 = kb.nextDouble();
        x1 = kb.nextDouble();
        y1 = kb.nextDouble();
        x2 = kb.nextDouble();
        y2 = kb.nextDouble();
        
        if (leftOfLine(x0, y0, x1, y1, x2, y2)) {
            System.out.print("(" + x2 + ", " + y2 + ") is on the left of the line between (" + x0 + ", " + y0 + ") and (" + x1 + ", " + y1 + ")");
        }
        else if (onLineSegment(x0, y0, x1, y1, x2, y2)) {
            System.out.print("(" + x2 + ", " + y2 + ") is on the line segment between (" + x0 + ", " + y0 + ") and (" + x1 + ", " + y1 + ")");
        }
        else if (onSameLine(x0, y0, x1, y1, x2, y2)) {
            System.out.print("(" + x2 + ", " + y2 + ") is on the line between (" + x0 + ", " + y0 + ") and (" + x1 + ", " + y1 + ")");
        }
        else {
            System.out.print("(" + x2 + ", " + y2 + ") is on the right of the line between (" + x0 + ", " + y0 + ") and (" + x1 + ", " + y1 + ")");
        }
    }
    /**
     * Method to check if point is on the left of the line.
     */
    public static boolean leftOfLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0);
    }
    /**
     * Method to check if point is on the line.
     */
    public static boolean onSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0);
    }
    /**
     * Method to check if point is on line segment.
     */
    public static boolean onLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
        return ((((x0 <= x1 && x2 >= x0 && x2 <= x1) || (x0 >= x1 && x2 >= x1 && x2 <= x0)) && ((y0 <= y1 && y2 >= y0 && y2 <= y1) ||
        (y0 >= y1 && y2 >= y1 && y2 <= y0))) && ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0));
    }
}