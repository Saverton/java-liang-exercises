/**
 * Program to compute an approximated value for PI using loops.
 * 
 * @author Scott M.
 * ComputePi2.java
 */

public class ComputePi2 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int i, j;
        double pi, sum;
        
        for (j = 10000; j <= 100000; j += 10000) {
            sum = 0;
        for (i = 1; i <= j; i++) {
            sum += Math.pow(-1, i + 1) / (2 * i - 1);
        }
        pi = 4 * sum;
        System.out.println("If 'i' is " + j + ", Pi = " + pi + ".");
        }
    }
}