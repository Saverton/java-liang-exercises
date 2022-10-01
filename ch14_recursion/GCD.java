/** Program to calculate the GCD of two integers recursively.
 * 
 * @author Scott M.
 * GCD.java
 */

import java.util.Scanner;

public class GCD {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter two integers: ");
        
        System.out.print("The GCD is " + gcd(kb.nextLong(), kb.nextLong()));
    }
    
    /** Return the GCD of two longs.
     * @params two integers
     * @return GCD
     */
    public static long gcd(long m, long n) {
        if (m % n == 0)
            return n;
        else
            return gcd(n, m % n);
    }
}