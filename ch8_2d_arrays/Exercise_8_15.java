/**
 * (Geometry: same line?) Programming Exercise 6.39 gives a method for testing 
 * whether three points are on the same line.
 * Write the following method to test whether all the points in the array points are 
 * on the same line.
 *      public static boolean sameLine(double[][] points)
 * Write a program that prompts the user to enter five points and displays whether 
 * they are on the same line. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_15 {
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
        kb.close();
        
        System.out.print((onSameLine(points)) ? "The five points are on the same line" : "The five points are not on the same line");
    }
    /**
     * Check if an array of points are all on the same line in a 2d coordinate grid
     * @param points double[][]: array of points {{p1x, p1y}, {p2x, p2y}, ...}
     * @return boolean: true = the points are all on the same line, false otherwise
     * Precondition: there must be at least 2 points in the points array
     */
    public static boolean onSameLine(double[][] points) {
        double slope = (points[1][1] - points[0][1]) / (points[1][0] - points[0][0]);
        
        for (int i = 2; i < points.length; i++) {
            if (Math.abs(slope - ((points[i][1] - points[0][1]) / (points[i][0] - points[0][0]))) > 0.001) {
                return false;
            }
        }
        return true;
    }
}