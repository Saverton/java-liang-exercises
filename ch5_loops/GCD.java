/**
 * Program to calculate the greatest common divisor for two integers n1 and n2.
 * 
 * @author Scott M.
 * GCD.java
 */

import java.util.Scanner;

public class GCD {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        
        System.out.print("Enter two integers: ");
        int n1 = kb.nextInt();
        int n2 = kb.nextInt();
        
        int d = Math.min(n1, n2);
        int gcd = 1;
        
        for (int i = 0; i <= (d / 2 - 1); i++) {
            if (n1 % (d - i) == 0 && n2 % (d - i) == 0) {
                gcd = d - i;
                break;
            }
        }
        
        System.out.printf("The GCD of %d and %d is %d.", n1, n2, gcd);
    }
}