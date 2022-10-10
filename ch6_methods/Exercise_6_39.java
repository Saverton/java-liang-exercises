/**
 * (Geometry: point position) Programming Exercise 3.32 shows how to test whether 
 * a point is on the left side of a directed line, on the right, or on the same line. Write
 * the methods with the following headers:
 *      /** Return true if point (x2, y2) is on the left side of the 
 *       * directed line from (x0, y0) to (x1, y1) / 
 *      public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2)
 *      /** Return true if point (x2, y2) is on the same
 *       * line from (x0, y0) to (x1, y1) / 
 *      public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2)
 *      /** Return true if point (x2, y2) is on the
 *       * line segment from (x0, y0) to (x1, y1) / 
 *      public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2)
 * Write a program that prompts the user to enter the three points for p0, p1, and p2
 * and displays whether p2 is on the left of the line from p0 to p1, right, the same 
 * line, or on the line segment.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_6_39 {
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
        kb.close();
        
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
     * Check if the point is left of the line
     * @params double: line p1 x, line p1 y, line p2 x, line p2 y, check point x, check point y
     * @return boolean: true = the point is left of the line, false otherwise
     */
    public static boolean leftOfLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0);
    }
    /**
     * Check if the point is on the line
     * @params double: line p1 x, line p1 y, line p2 x, line p2 y, check point x, check point y
     * @return boolean: true = point is on the line, false otherwise
     */
    public static boolean onSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0);
    }
    /**
     * Check if point is on the line segment
     * @params double: line p1 x, line p1 y, line p2 x, line p2 y, check point x, check point y
     * @return boolean: true = point is on the line segment, false otherwise
     */
    public static boolean onLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
        return ((((x0 <= x1 && x2 >= x0 && x2 <= x1) || (x0 >= x1 && x2 >= x1 && x2 <= x0)) && ((y0 <= y1 && y2 >= y0 && y2 <= y1) ||
        (y0 >= y1 && y2 >= y1 && y2 <= y0))) && ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0));
    }
}