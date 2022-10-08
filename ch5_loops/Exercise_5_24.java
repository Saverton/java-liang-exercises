/**
 * (Sum a series) Write a program to sum the following series:
 *       1     3     5     7      9     11           95     97
 *      --- + --- + --- + --- + ---- + ---- + ... + ---- + ----
 *       3     5     7     9     11     13           97     99
 * @author Scott M.
 */

public class Exercise_5_24 {
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