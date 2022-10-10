/**
 * (Estimate PI) PI can be computed using the following series:
 *               (      1     1     1     1      1          (-1)^(i + 1) )
 *      m(i) = 4 ( 1 - --- + --- - --- + --- - ---- + ... + ------------ )
 *               (      3     5     7     9     11             2i - 1    )
 * Write a method that returns m(i) for a given i and write a test program that displays the following table:
 *      i       m(i)
 *      1       4.0000
 *      101     3.1515
 *      201     3.1466
 *      301     3.1449
 *      401     3.1441
 *      501     3.1436
 *      601     3.1433
 *      701     3.1430
 *      801     3.1428
 *      901     3.1427
 * @author Scott M.
 */
public class Exercise_6_14 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        System.out.printf("%-8s%-8s\n", "i", "pi(i)");
        System.out.println("----------------");
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-10d%-10.4f\n", i, pi(i));
        }
    }   
    /**
     * Return PI computed using a summation up to element i.
     * @param int: number i (complexity and accuracy of approximation)
     * @return double: approximation of PI
     */
    public static double pi(int i) {
        double pi = 0;
        for (int j = 0; j < i; j++) {
            pi = (j % 2 != 0) ? pi - 1.0 / (1 + 2 * j) : pi + 1.0 / (1 + 2 * j);
        }
        return 4 * pi;
    }
}