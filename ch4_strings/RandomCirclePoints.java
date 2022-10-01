/**
 * Program to calculate 3 random points on a circle.
 * 
 * @author Scott M.
 * RandomCirclePoints.java
 */

import java.util.Random;

public class RandomCirclePoints {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //display random points 1, 2, and 3
        System.out.println("Point #1 is at " + point() + ".");
        System.out.println("Point #2 is at " + point() + ".");
        System.out.println("Point #3 is at " + point() + ".");
    }
    
    /**
     * Method to generate the random points.
     */
    public static String point() {
        //create randomizer, declare vars
        Random gen = new Random();
        double angle, xComponent, yComponent;
        final int RADIUS = 40;
        
        //generate random angle in degrees
        angle = gen.nextInt(360);
        
        //convert to radians
        angle = Math.toRadians(angle);
        
        //get x component
        xComponent = Math.cos(angle) * RADIUS;
        
        //get y component
        yComponent = Math.sin(angle) * RADIUS;
        
        //return x and y components
        return "(" + xComponent + ", " + yComponent + ")";
    }
}