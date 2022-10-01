/**
 * Program to calculate "e" to higher accuracy using the BigDecimal class.
 * 
 * @author Scott M.
 * BigE.java
 */

import java.math.BigDecimal;

public class BigE
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
                e = e.add(BigDecimal.ONE.divide(factorial, 25, BigDecimal.ROUND_HALF_UP));
            }
            System.out.println(i + "\t" + e);
        }
    }
}