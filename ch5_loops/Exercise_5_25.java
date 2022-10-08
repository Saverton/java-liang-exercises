/**
 * (Compute p) You can approximate p by using the following series:
 *             (      1     1     1     1      1          (-1)^(i + 1) )
 *      PI = 4 ( 1 - --- + --- - --- + --- - ---- + ... + ------------ )
 *             (      3     5     7     9     11            2 * i - 1  )
 * Write a program that displays the p value for i = 10000, 20000, …, and 
 * 100000.
 * @author Scott M.
 */

public class Exercise_5_25 {
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