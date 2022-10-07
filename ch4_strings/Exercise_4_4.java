/**
 * (Geometry: area of a hexagon) The area of a hexagon can be computed using the 
 * following formula (s is the length of a side):
 *                 6 * s^2
 *      Area = ---------------
 *             4 * tan(PI / 6)
 * Write a program that prompts the user to enter the side of a hexagon and displays 
 * its area.
 * @author Scott M.
 * AreaOfHexagon.java
 */

import java.util.Scanner;

public class Exercise_4_4 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //start scanner and declare vars
        Scanner kb = new Scanner (System.in);
        double side, area;
        
        //get side length
        System.out.print("Enter a side length: ");
        side = kb.nextDouble();
        kb.close();
        
        //calculate area
        area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
        
        //display area
        System.out.print("The area of the Hexagon is " + ((double)Math.round(area * 100) / 100) + ".");
    }
}