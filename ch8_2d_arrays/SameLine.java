/**
 * Program to find if 5 points are on the same line or not.
 * 
 * @author Scott M.
 * SameLine.java
 */

import java.util.Scanner;

public class SameLine {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double[][] points = new double[5][2];
        
        System.out.print("Enter 5 points: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = kb.nextDouble();
            }
        }
        
        System.out.print((sameLine5(points)) ? "The five points are on the same line" : "The five points are not on the same line");
    }
    /**
     * Method to find if 5 points are on the same line.
     */
    public static boolean sameLine5(double[][] points) {
        double slope = (points[1][1] - points[0][1]) / (points[1][0] - points[0][0]);
        
        for (int i = 2; i < points.length; i++) {
            if (slope != (points[i][1] - points[0][1]) / (points[i][0] - points[0][0])) {
                return false;
            }
        }
        return true;
    }
}