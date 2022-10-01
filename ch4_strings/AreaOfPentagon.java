/**
 * Program to calculate the area of a Pentagon given the length of its raidus.
 * 
 * @author Scott M.
 * AreaOfPentagon.java
 */

import java.util.Scanner;

public class AreaOfPentagon {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //Start scanner and formatter, declare variables
        Scanner kb = new Scanner (System.in);
        double radius, side, area;
        
        //obtain the radius
        System.out.print("Enter the radius: ");
        radius = kb.nextDouble();
        
        //obtain side length
        side = 2 * radius * Math.sin(Math.PI / 5);
        
        //obtain area
        area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
        
        //round area
        area = (double)Math.round(area * 100) / 100;
        
        //display area
        System.out.print("The area is " + area + ".");
    }
}