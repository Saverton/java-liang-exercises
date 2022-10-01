/**
 * Program to approximate e for values of i = 10000, 20000,..., 100000.
 * 
 * @author Scott M.
 * ApproxE.java
 */

public class ApproxE {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        double e, factorial, x;
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