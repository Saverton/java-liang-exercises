/**
 * (Approximate e) Programming Exercise 5.26 approximates e using the following 
 * series:
 *           1      1      1      1            1
 * e = 1 + ---- + ---- + ---- + ---- + ... + ----
 *          1!     2!     3!     4!           i!
 * In order to get better precision, use BigDecimal with 25 digits of precision in 
 * the computation. Write a program that displays the e value for i = 100, 200, . . ., 
 * and 1000.
 * @author Scott M.
 */

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise_10_20
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        System.out.println("i\te");
        for (int i = 100; i <= 1000; i += 100)
        {
            BigDecimal e = BigDecimal.ONE;
            for (int j = 1; j <= i; j++)
            {
                BigDecimal factorial = BigDecimal.ONE;
                for (int k = j; k > 1; k--)
                {
                    factorial = factorial.multiply(new BigDecimal("" + k));
                }
                e = e.add(BigDecimal.ONE.divide(factorial, 25, RoundingMode.HALF_UP));
            }
            System.out.println(i + "\t" + e);
        }
    }
}