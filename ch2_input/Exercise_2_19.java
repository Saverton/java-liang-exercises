/**
 * (Geometry: area of a triangle) Write a program that prompts the user to enter 
 * three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area. 
 * The formula for computing the area of a triangle is
 *      s = (side1 + side2 + side3)/2;
 *               ___________________________________
 *      area = \/ s(s - side1)(s - side2)(s - side3)
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_2_19 {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double x1, y1, x2, y2, x3, y3, side1, side2, side3, s, area;
        System.out.print("Enter three points for a triangle: ");
        x1 = kb.nextDouble();
        y1 = kb.nextDouble();
        x2 = kb.nextDouble();
        y2 = kb.nextDouble();
        x3 = kb.nextDouble();
        y3 = kb.nextDouble();
        kb.close();
        side1 = Math.pow((Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)), 0.5);
        side2 = Math.pow((Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2)), 0.5);
        side3 = Math.pow((Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)), 0.5);
        s = (side1 + side2 + side3)/2;
        area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
        System.out.print("The area of the triangle is " + area);
    }
}
