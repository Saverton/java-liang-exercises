/**
 * Program to display feet to meters and meters to feet tables.
 * 
 * @author Scott M.
 * FToMTable.java
 */

public class FToMTable {
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
     * Method to convert Feet to meters.
     */
    public static double FeetToMeters(double feet) {
        return 0.305 * feet;
    }
    /**
     * Method to convert meters to feet.
     */
    public static double MetersToFeet(double meters) {
        return 3.279 * meters;
    }
}
