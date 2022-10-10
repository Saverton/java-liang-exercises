/**
 * (Sum series) Write a method to compute the following series:
 *              1     2             i
 *      m(i) = --- + --- + ... + -------
 *              2     3           i + 1
 * Write a test program that displays the following table:
 *      i    m(i)
 *      1    0.5000
 *      2    1.1667
 *      ...
 *      19   16.4023
 *      20   17.3546
 * @author Scott M.
 */

public class Exercise_6_13 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\n", "i", "m(i)");
        System.out.println("--------------------");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-10d%10.4f\n", i, sum(i));
        }
    }
    /**
     * return the sum of the series:
     *              1     2             i
     *      m(i) = --- + --- + ... + -------
     *              2     3           i + 1
     * @param int: number "i"
     * @return double: the sum of the series
     */
    public static double sum(int i) {
        double sum = 0;
        for (int j = 1; j <= i; j++) {
            sum += (double)j / (j + 1);
        }
        return sum;
    }
}