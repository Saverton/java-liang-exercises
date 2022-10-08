/**
 * Demonstrate cancellation errors) A cancellation error occurs when you are 
 * manipulating a very large number with a very small number. The large number 
 * may cancel out the smaller number. For example, the result of 100000000.0 + 
 * 0.000000001 is equal to 100000000.0. To avoid cancellation errors and obtain 
 * more accurate results, carefully select the order of computation. For example, in 
 * computing the following series, you will obtain more accurate results by computing 
 * from right to left rather than from left to right:
 *           1     1           1
 *      1 + --- + --- + ... + ---
 *           2     3           n
 * @author Scott M.
 */

public class Exercise_5_23 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int denominator;
        double sum = 0;
        
        for (denominator = 1; denominator <= 50000; denominator++) {
            sum += 1.0 / denominator;
        }
        System.out.println("Left to right: sum = " + sum);
        
        for (denominator = 50000; denominator > 0; denominator --) {
            sum += 1.0 / denominator;
        }
        System.out.print("Right to left: sum = " + sum);
    }
}