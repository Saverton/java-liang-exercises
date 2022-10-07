/**
 * (Geometry: area of a pentagon) Write a program that prompts the user to enter 
 * the length from the center of a pentagon to a vertex and computes the area of the 
 * pentagon, as shown in the following figure. 
 * The formula for computing the area of a pentagon is:
 *                 5 * s^2
 *      area = ---------------
 *             4 * tan(PI / 5)
 * where s is the length of a side. 
 * The side can be computed using the formula:
 *      side = 2 * r * sin(PI / 5)
 * where r is the length from the center of a pentagon to a vertex. Round up two digits 
 * after the decimal point.
 * @author Scott M.
 * AreaOfPentagon.java
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise_4_1 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //Start scanner and formatter, declare variables
        Scanner kb = new Scanner (System.in);
        DecimalFormat fmt = new DecimalFormat("0.##");
        double radius, side, area;
        
        //obtain the radius
        System.out.print("Enter the radius: ");
        radius = kb.nextDouble();
        kb.close();
        
        //obtain side length
        side = 2 * radius * Math.sin(Math.PI / 5);
        
        //obtain area
        area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
        
        //round area
        area = (double)Math.round(area * 100) / 100;
        
        //display area
        System.out.print("The area is " + fmt.format(area) + ".");
    }
}