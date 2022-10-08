/**
 * (Conversion from kilograms to pounds) Write a program that displays the following 
 * table (note that 1 kilogram is 2.2 pounds):
 *      Kilograms   Pounds
 *      1           2.2
 *      3           6.6
 *      ...
 *      197         433.4
 *      199         437.8
 * @author Scott M.
 */

public class Exercise_5_3 {
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