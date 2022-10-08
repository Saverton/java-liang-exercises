/**
 * (Compute the greatest common divisor) Another solution for Listing 5.9 to find 
 * the greatest common divisor of two integers n1 and n2 is as follows: First find d
 * to be the minimum of n1 and n2, then check whether d, d-1, d-2, . . . , 2, or 1 is 
 * a divisor for both n1 and n2 in this order. The first such common divisor is the 
 * greatest common divisor for n1 and n2. Write a program that prompts the user to 
 * enter two positive integers and displays the gcd.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_5_14 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        
        System.out.print("Enter two integers: ");
        int n1 = kb.nextInt();
        int n2 = kb.nextInt();
        kb.close();
        
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