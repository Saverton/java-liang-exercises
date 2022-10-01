/**
 * Program to calculate the area of a polygon with n sides of length s.
 * 
 * @author Scott M.
 * AreaOfRegularPolygon.java
 */

import java.util.Scanner;

public class AreaOfRegularPolygon {
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
        
        //calculate the area
        area = (sides * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / sides));
        
        //display area
        System.out.print("The regular polygon's area is " + area + ".");
    }
}