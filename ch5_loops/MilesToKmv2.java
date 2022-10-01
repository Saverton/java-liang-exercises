/**
 * Program to display a conversion table from Miles to Kilometers and vice versa.
 * 
 * @author Scott M.
 * MilesToKmv2.java
 */

public class MilesToKmv2 {
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
