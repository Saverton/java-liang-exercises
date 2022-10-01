/**
 * Program to demonstrate differences in summations of additions of small numbers from right to left and left to right.
 * 
 * @author Scott M.
 * CancelErrors.java
 */

public class CancelErrors {
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