/** Program to calculate the factorial of an entered number using recursion.
 * @author Scott M.
 * Factorial.java
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        
        System.out.print("The factorial is " + factorial(new BigInteger(kb.next())));
    }
    
    /** Recursive method to calculate the factorial of a number.
     * @params Input integer
     * @return factorial
     */
    public static BigInteger factorial(BigInteger integer) {
        if (integer.equals(BigInteger.ONE))
            return BigInteger.ONE;
        else
            return integer.multiply(factorial(integer.subtract(BigInteger.ONE)));
    }
}