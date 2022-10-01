/**
 * Program to calculate the Great Circle Distance between 2 points on a sphere.
 * 
 * @author Scott M.
 * GreatCircleDistance.java
 */

import java.util.Scanner;

public class GreatCircleDistance {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //start scanner, declare vars
        Scanner kb = new Scanner (System.in);
        double latitude1, longitude1, latitude2, longitude2, distance;
        final double RADIUS = 6371.01;
        
        //get latitude and longitude for points 1 and 2
        System.out.print("Enter the latitude and longitude for point 1: ");
        latitude1 = kb.nextDouble();
        longitude1 = kb.nextDouble();
        System.out.print("Enter the latitude and longitude for point 2: ");
        latitude2 = kb.nextDouble();
        longitude2 = kb.nextDouble();
        
        //check if entries are valid
        if (latitude1 < -90 || latitude1 > 90 || latitude2 < -90 || latitude2 > 90 || longitude1 < -180 || longitude1 > 180 || longitude2 < -180 || 
            longitude2 > 180) {
                System.out.print("Error: Latitude values must be in between -90 and 90 and Longitude values must be between -180 and 180.");
            }
        else {
        //convert degrees to radians
        latitude1 = Math.toRadians(latitude1);
        longitude1 = Math.toRadians(longitude1);
        latitude2 = Math.toRadians(latitude2);
        longitude2 = Math.toRadians(longitude2);
        
        //calculate the distance in km
        distance = RADIUS * Math.acos((Math.sin(latitude1)) * Math.sin(latitude2) + Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2));
        
        //display distance
        System.out.print("The distance between the two points is " + distance + " km.");
        }
    }
}