/**
 * (Geometry: point in a rectangle?) Write a program that prompts the user to enter 
 * a point (x, y) and checks whether the point is within the rectangle centered at 
 * (0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle and 
 * (6, 4) is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the 
 * rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its 
 * vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to 
 * cover all cases.) 
 * @author Scott M.
 * PointInRectangle.java
 */

import java.util.Scanner;

public class Exercise_3_23 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create scanner, declare x, y vars
        Scanner kb = new Scanner (System.in);
        double x, y;
        
        //get x and y vars
        System.out.print("Enter a point with two coordinates: ");
        x = kb.nextDouble();
        y = kb.nextDouble();
        kb.close();
        
        //if abs(x) < 5 and abs(y) < 2.5, point is in rectangle
        if (Math.abs(x) < 5 && Math.abs(y) < 2.5)
            System.out.print("The point (" + x + ", " + y + ") is in the rectangle.");
        else
            System.out.print("The point (" + x + ", " + y + ") is not in the rectangle.");
    }
}