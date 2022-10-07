/**
 * (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in 
 * which all sides are of the same length and all angles have the same degree (i.e., the 
 * polygon is both equilateral and equiangular). The formula for computing the area 
 * of a regular polygon is:
 *                 n * s^2
 *      Area = ---------------
 *             4 * tan(PI / 5)
 * Here, s is the length of a side. Write a program that prompts the user to enter the 
 * number of sides and their length of a regular polygon and displays its area. 
 * @author Scott M.
 * AreaOfRegularPolygon.java
 */

import java.util.Scanner;

public class Exercise_4_5 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create scanner and declare vars
        Scanner kb = new Scanner (System.in);
        int sides;
        double length, area;
        
        //get the amount of sides n and the length of sides s
        System.out.print("Enter the number of sides: ");
        sides = kb.nextInt();
        System.out.print("Enter the length of the sides: ");
        length = kb.nextDouble();
        kb.close();
        
        //calculate the area
        area = (sides * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / sides));
        
        //display area
        System.out.print("The regular polygon's area is " + area + ".");
    }
}