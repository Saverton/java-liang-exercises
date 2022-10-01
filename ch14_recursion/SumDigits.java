/** Program to sum the digits in an integer.
 * 
 * @author Scott M.
 * SumDigits.java
 */

import java.util.Scanner;

public class SumDigits {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        System.out.print("Sum of digits is " + sumDigits(kb.nextLong()));
    }
    
    /** Return the sum of digits (recursively)
     * @params integer
     * @return sum of digits
     */
    public static long sumDigits(long n)
    {
        if (n == 0)
            return 0;
        else
            return (n % 10) + sumDigits((long)(n / 10));
    }
}