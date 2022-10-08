/**
 * (Conversion from kilograms to pounds and pounds to kilograms) Write a program
 * that displays the following two tables side by side:
 *      Kilograms    Pounds  |   Pounds  Kilograms
 *      1            2.2     |   20      9.09
 *      3            6.6     |   25      11.36
 *      ...
 *      197          433.4   |   510     231.82
 *      199          437.8   |   515     234.09
 * @author Scott M.
 */

public class Exercise_5_5 {
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
