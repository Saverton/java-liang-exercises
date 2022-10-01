/**
 * Program to display a conversion table from Miles to Kilometers.
 * 
 * @author Scott M.
 * MilesToKm.java
 */

public class MilesToKm {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //display title
        System.out.printf("%-10s%-10s", "Miles", "Kilometers");
        
        //Loop(x10):
        for (int mile = 1; mile < 11; mile++) {
        //1. Calculate kilometers
        double km = mile * 1.609;
        //2. Display miles and kms
        System.out.printf("\n%-10d%-10.2f", mile, km);
        }
    }
}
