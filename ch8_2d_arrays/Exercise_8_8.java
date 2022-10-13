/**
 * (All closest pairs of points) Revise Listing 8.3, FindNearestPoints.java, to 
 * display all closest pairs of points with the same minimum distance. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_8 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        double[][] points = createPoints(8);
        
        double[][][] closestPoints = findClosestPoints(points);
        
        printClosestPoints(closestPoints);
    }
    /**
     * Return an array of 2d points of a specified size populated with user input.
     * @param numOfPoints int: number of points to input
     * @return double[][]: Array of points
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
        kb.close();
        
        return points;
    }
    /**
     * Return an array of all points that share the closest distances.
     * @param points double[][]: array of points
     * @return double[][][]: array of all point paurs with the smallest distance between them.
     */
    public static double[][][] findClosestPoints(double[][] points) {
        double[][][] closestPoints = new double[points.length][2][2];
        int count = 0; // count of the number of points share the closest distance
        double closestDistance = Double.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double thisDistance = distance(points[i], points[j]);
                if (doubleEquals(thisDistance, closestDistance) || thisDistance < closestDistance) {
                    if (thisDistance < closestDistance) {
                        count = 0;
                        closestDistance = thisDistance;
                    }
                    closestPoints[count][0] = points[i];
                    closestPoints[count][1] = points[j];
                    count++;
                }
            }
        }
        return trim3d(closestPoints, count);
    }
    /**
     * Return the distance between two points on a 2d coordinate grid.
     * @param point1 double[]: first point
     * @param point2 double[]: second point
     * @return double: distance between the points
     */
    public static double distance(double[] point1, double[] point2) {
        return Math.sqrt(Math.pow(point1[0] - point2[0], 2) + Math.pow(point1[1] - point2[1], 2));
    }
    /**
     * Retrun a trimmed a 3d double array with a specific size
     * @param array double[][][]: 3d array of doubles
     * @param size int: new size of array
     * @return double[][][]: new array of smaller size
     */
    public static double[][][] trim3d(double[][][] array, int size) {
        double[][][] trimmedArray = new double[size][array[0].length][array[0][0].length];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    trimmedArray[i][j][k] = array[i][j][k];
                }
            }
        }
        return trimmedArray;
    }
    /**
     * Print out an array of the closest points, then print out their distance.
     * @param closestPoints double[][]: array of points
     */
    public static void printClosestPoints(double[][][] closestPoints) {
        for (int i = 0; i < closestPoints.length; i++) {
            System.out.println("The closest two points are " + string2dPoint(closestPoints[i][0]) + " and " + string2dPoint(closestPoints[i][1]));
        }
        System.out.print("Their distance is " + distance(closestPoints[0][0], closestPoints[0][1]));
    }
    /**
     * Return a String representing a 2d coordinate where indexes 0, 1 correspond to x, y.
     * @param point double[]: point
     * @return String: string of point formatted "(<x>, <y>)"
     */
    public static String string2dPoint(double[] point) {
        return "(" + point[0] + ", " + point[1] + ")";
    }
    /**
     * Check if two double values are equal when rounded to the nearest 1/1000 or 0.001.
     * @param num1 double: first number
     * @param num2 double: second number
     * @return boolean: true = the numbers are essentially equal, false otherwise
     */
    public static boolean doubleEquals(double num1, double num2) {
        return (Math.round(num1 * 1000) == Math.round(num2 * 1000));
    }
}