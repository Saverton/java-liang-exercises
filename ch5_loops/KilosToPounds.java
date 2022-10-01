/**
 * Program to display a conversion table from Kilograms to Pounds.
 * 
 * @author Scott M.
 * KilosToPounds.java
 */

public class KilosToPounds {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //display title
        System.out.printf("%-10s%-10s", "Kilograms", "Pounds");
        
        //Loop(x200):
        for (int kilo = 1; kilo < 200; kilo++) {
        //1. Calculate pounds
        double lbs = kilo * 2.2;
        //2. Display Kilos and pounds
        System.out.printf("\n%-10d%-10.2f", kilo, lbs);
        }
    }
}