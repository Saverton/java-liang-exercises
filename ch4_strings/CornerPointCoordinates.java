/**
 * Program to calculate the 5 corner points of a pentagon with radius r.
 * 
 * @author Scott M.
 * CornerPointCoordinates.java
 */

import java.util.Scanner;

public class CornerPointCoordinates {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create scanner, declare vars
        Scanner kb = new Scanner (System.in);
        int count;
        double radius;
        
        //get radius of bounding circle
        System.out.print("Enter the radius of the bounding circle: ");
        radius = kb.nextDouble();
        
        //display the 5 points
        System.out.println("The points of the pentagon are at: ");
        System.out.print(point(1, radius) + "\n" + point(2, radius) + "\n" + point(3, radius) + "\n" + point(4, radius) + "\n" + point(5, radius));
    }
    /**
     * Method to generate the circle's points.
     */
    public static String point(int pointNumber, double radius) {
        //create randomizer, declare vars
        double angle, xComponent, yComponent;
        
        //get angle
        angle = Math.toRadians(18) + Math.toRadians(72 * pointNumber - 1);
        
        //get x component
        xComponent = Math.cos(angle) * radius;
        
        //get y component
        yComponent = Math.sin(angle) * radius;
        
        //return x and y components
        return "(" + ((double)Math.round(xComponent * 100) / 100) + ", " + ((double)Math.round(yComponent * 100) / 100) + ")";
    }
}