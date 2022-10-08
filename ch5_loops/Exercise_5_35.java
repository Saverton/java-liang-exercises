/**
 * (Summation) Write a program to compute the following summation:
 *         1          1           1                   1
 *      ------- + --------- + --------- + ... + -------------
 *             _     _     _     _     _           ___     ___
 *      1 + \/2   \/2 + \/3   \/3 + \/4         \/624 + \/625
 * @author Scott M.
 */

public class Exercise_5_35 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int d1, d2;
        double sum = 0;
        for (d1 = 1; d1 < 625; d1++) {
            d2 = d1 + 1;
            sum += 1 / (Math.pow(d1, 0.5) + Math.pow(d2, 0.5));
        }
        System.out.print("The sum is " + sum);
    }
}