/**
 * Program to find the two points in a 3d space nearest to one another
 * 
 * @author Scott M.
 * DistanceBetweenPoints.java
 */

public class DistanceBetweenPoints {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}};
        String[] stats = smallestDistance(points);
        System.out.print("The smallest distance is " + stats[0] + " between " + stats[1] + " and " + stats[2]); 
    }
    /**
     * Method to calculate the distance between two points.
     */
    public static double distance(double[][] points, int point1, int point2) {
        return Math.sqrt(Math.pow(points[point2][0] - points[point1][0], 2) + Math.pow(points[point2][1] - points[point1][1], 2) 
                         + Math.pow(points[point2][2] - points[point1][2], 2));
    }
    /**
     * Method to return the smallest distance between points.
     */
    public static String[] smallestDistance(double[][] points) {
        String[] stats = {"" + distance(points, 0, 1), points[0][0] + " " + points[0][1] + " " + points[0][2], points[1][0] + " " + points[1][1] + " " + points[1][2]};
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (distance(points, i, j) < Double.parseDouble(stats[0])) {
                    stats[0] = "" + distance(points, i, j);
                    stats[1] = points[i][0] + " " + points[i][1] + " " + points[i][2];
                    stats[2] = points[j][0] + " " + points[j][1] + " " + points[j][2];
                }
            }
        }
        return stats;
    }
}