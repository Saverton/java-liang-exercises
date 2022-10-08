/**
 * (Compute e) You can approximate e using the following series:
 *                1      1      1      1            1
 *      e = 1 + ---- + ---- + ---- + ---- + ... + ----
 *               1!     2!     3!     4!           i!
 * Write a program that displays the e value for i = 10000, 20000, …, and 
 * 100000. 
 * @author Scott M.
 */

public class Exercise_5_26 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        double e, factorial;
        for (int i = 10000; i <= 100000; i += 10000) {
            e = 1;
            for (int j = 1; j <= i; j++) {
                factorial = 1;
                for (int k = j; k > 0; k--) {
                    factorial *= k;
                }
                e += 1 / factorial;;
            }
            System.out.println("e for i = " + i + " is " + e + ".");
        }
    }
}