/**
 * (Conversions between feet and meters) Write a class that contains the following 
 * two methods:
 *      /** Convert from feet to meters /
 *      public static double footToMeter(double foot)
 *      /** Convert from meters to feet /
 *      public static double meterToFoot(double meter)
 * The formula for the conversion is:
 *      meter = 0.305 * foot
 *      foot = 3.279 * meter
 * Write a test program that invokes these methods to display the following tables:
 *      Feet     Meters  |   Meters  Feet
 *       1.0     0.305   |   20.0    65.574
 *       2.0     0.610   |   25.0    81.967
 *       ...
 *       9.0     2.745   |   60.0    196.721
 *      10.0     3.050   |   65.0    213.115
 * @author Scott M.
 */

public class Exercise_6_9 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        double meters = 15;
        System.out.printf("%-10s%-10s | %10s%10s\n", "Feet", "Meters", "Meters", "Feet");
        System.out.println("-----------------------------------------");
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-10.1f%-10.3f | %10.1f%10.3f\n", i, FeetToMeters(i), meters + (5 * i), MetersToFeet(meters + (5 * i)));
        }
    }
    /**
     * Return the equivalent distance in meters.
     * @param double: distance (in feet)
     * @return double: distance (in meters)
     */
    public static double FeetToMeters(double feet) {
        return 0.305 * feet;
    }
    /**
     * Return the equivalent distance in feet.
     * @param double: distance (in meters)
     * @return double: distance (in feet)
     */
    public static double MetersToFeet(double meters) {
        return 3.279 * meters;
    }
}
