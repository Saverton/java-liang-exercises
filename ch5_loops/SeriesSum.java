/**
 * Program to sum a series of numbers.
 * 
 * @author Scott M.
 * SeriesSum.java
 */

public class SeriesSum {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int numerator = 1, denominator = 3;
        double sum = 0;
        while (denominator <= 99 && numerator <= 97) {
            sum += (double)numerator / denominator;
            numerator += 2;
            denominator += 2;
        }
        System.out.print("The sum is: " + sum);
    }
}