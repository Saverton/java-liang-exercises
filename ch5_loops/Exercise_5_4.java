/**
 * (Conversion from miles to kilometers) Write a program that displays the following 
 * table (note that 1 mile is 1.609 kilometers):
 *      Miles   Kilometers
 *      1       1.609
 *      2       3.218
 *      ...
 *      9       14.481
 *      10      16.090
 * @author Scott M.
 */

public class Exercise_5_4 {
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
