/**
 * (Points nearest to each other) Listing 8.3 gives a program that finds two points in a 
 * two-dimensional space nearest to each other. Revise the program so that it finds two 
 * points in a three-dimensional space nearest to each other. Use a two-dimensional 
 * array to represent the points. Test the program using the following points:
 *      double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
 *      {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
 *      {5.5, 4, -0.5}};
 * @author Scott M.
 */

public class Exercise_8_7 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}};
        double[][] closestPoints = getClosestPoints(points);
        System.out.print("The smallest distance is between " + string3dPoint(closestPoints[0]) + " and " + string3dPoint(closestPoints[1])); 
    }
    /**
     * Calculate the distance between two points in a 3d space.
     * @param point1 double[]: first point
     * @param point2 double[]: second point
     * @return double: distance between points
     */
    public static double distance(double[] point1, double[] point2) {
        return Math.sqrt(Math.pow(point2[0] - point1[0], 2) + Math.pow(point2[1] - point1[1], 2) 
                         + Math.pow(point2[2] - point1[2], 2));
    }
    /**
     * Return an array containing the two closest points in an array of 3d points.
     * @param points double[][]: array of 3d points
     * @return double[][]: array with point 1 at index 0 and point 2 at index 1
     */
    public static double[][] getClosestPoints(double[][] points) {
        double[][] closestPoints = {points[0], points[1]};
        double minimumDistance = distance(points[0], points[1]);
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double thisDistance = distance(points[i], points[j]);
                if (thisDistance < minimumDistance) {
                    closestPoints[0] = points[i];
                    closestPoints[1] = points[j];
                    minimumDistance = thisDistance;
                }
            }
        }
        return closestPoints;
    }
    /**
     * Return a String  double array representing a 3d point with indexes 0, 1, 2 corresponding to x, y, z.
     * @param point: double[]: 3d point
     */
    public static String string3dPoint(double[] point) {
        return "(" + point[0] + ", " + point[1] + ", " + point[2] + ")";
    }
}