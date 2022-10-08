/**
 * (Conversion from miles to kilometers) Write a program that displays the following 
 * two tables side by side:
 * Miles Kilometers | Kilometers Miles
 * 1 1.609 | 20 12.430
 * 2 3.218 | 25 15.538
 * ...
 * 9 14.481 | 60 37.290
 * 10 16.090 | 65 40.398
 * @author Scott M.
 */

public class Exercise_5_6 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //display title
        System.out.printf("%-10s%-10s | %-10s%-10s", "Miles", "Kilometers", "Kilometers", "Miles");
        
        //Loop(x10):
        for (int mile = 1; mile < 11; mile++) {
        //1. Calculate kilometers
        double km = mile * 1.609;
        int km2 = 15 + mile * 5;
        double mile2 = km2 / 1.609;
        //2. Display miles and kms
        System.out.printf("\n%-10d%-10.3f | %-10d%-10.3f", mile, km, km2, mile2);
        }
    }
}
