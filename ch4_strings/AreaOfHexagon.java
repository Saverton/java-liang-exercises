/**
 * Program to calculate the area of a hexagon using a given side length.
 * 
 * @author Scott M.
 * AreaOfHexagon.java
 */

import java.util.Scanner;

public class AreaOfHexagon {
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
        
        //calculate area
        area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
        
        //display area
        System.out.print("The area of the Hexagon is " + ((double)Math.round(area * 100) / 100) + ".");
    }
}