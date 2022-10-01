/**
 * Program to show the points with the least distance between them and display all points sharing the shortest distance.
 * 
 * @author Scott M.
 * ClosestPoints.java
 */

import java.util.Scanner;

public class ClosestPoints {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        double[][] points = createPoints(8);
        
        double[][] closestPoints = findClosestPoints(points);
        
        printClosestPoints(closestPoints);
    }
    /**
     * Method to create an array of points.
     */
    public static double[][] createPoints(int numOfPoints) {
        Scanner kb = new Scanner(System.in);
        double[][] points = new double[numOfPoints][2];
        
        System.out.print("Enter 8 points: ");
        for (int i = 0; i < numOfPoints; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = kb.nextDouble();
            }
        }
        
        return points;
    }
    /**
     * Method to create an array of the points with the smallest distances in between them.
     */
    public static double[][] findClosestPoints(double[][] points) {
        double[][] closestPoints = new double[points.length][6];
        closestPoints[0][4] = distance(points, 0, 1);
        int closestCount = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (distance(points, i, j) < closestPoints[0][4]) {
                    closestCount = 0;
                    clearArray(closestPoints);
                    closestPoints[0][4] = distance(points, i, j);
                    closestPoints[closestCount][0] = points[i][0];
                    closestPoints[closestCount][1] = points[i][1];
                    closestPoints[closestCount][2] = points[j][0];
                    closestPoints[closestCount][3] = points[j][1];
                    closestCount++;
                }
                else if (distance(points, i, j) == closestPoints[0][4]) {
                    closestPoints[closestCount][0] = points[i][0];
                    closestPoints[closestCount][1] = points[i][1];
                    closestPoints[closestCount][2] = points[j][0];
                    closestPoints[closestCount][3] = points[j][1];
                    closestCount++;
                }
            }
        }
        closestPoints[0][5] = closestCount;
        return closestPoints;
    }
    /**
     * Method to find the distance between 2 points on a 2d coordinate grid.
     */
    public static double distance(double[][] points, int p1, int p2) {
        return Math.sqrt(Math.pow(points[p1][0] - points[p2][0], 2) + Math.pow(points[p1][1] - points[p2][1], 2));
    }
    /**
     * Method to fill an array with 0s
     */
    public static double[][] clearArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = 0;
            }
        }
        return array;
    }
    /**
     * Method to print out the list of closest points.
     */
    public static void printClosestPoints(double[][] closestPoints) {
        for (int i = 0; i < closestPoints[0][5]; i++) {
            System.out.println("The closest two points are (" + closestPoints[i][0] + ", " + closestPoints[i][1] + ") and (" + closestPoints[i][2] + ", " 
                                + closestPoints[i][3] + ")");
        }
        System.out.print("Their distance is " + closestPoints[0][4]);
    }
}