/**
 * Program to display a conversion table from Kilograms to Pounds and vice versa.
 * 
 * @author Scott M.
 * KilosToPoundsv2.java
 */

public class KilosToPoundsv2 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //display title
        System.out.printf("%-10s%-10s | %-10s%-10s", "Kilograms", "Pounds", "Pounds", "Kilograms");
        
        //Loop(x200):
        for (int kilo = 1; kilo < 200; kilo++) {
        //1. Calculate pounds
        double lbs = kilo * 2.2;
        int lbs2 = 20 + (kilo - 1) * 5;
        double kilo2 = lbs2 / 2.2;
        //2. Display Kilos and pounds
        System.out.printf("\n%-10d%-10.1f | %-10d%-10.2f", kilo, lbs, lbs2, kilo2);
        }
    }
}
