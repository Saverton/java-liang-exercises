/** Method to return the fibonacci number at a specific index using either a
 * recursive or an iterative approach.
 * @author  Scott M.
 * Fibonacci.java
 */

import java.util.Scanner;

public class Fibonacci {
    private static int count = 0;
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int index;
        int[] fib;
        
        System.out.print("Enter an index: ");
        index = kb.nextInt();
        fibRec(index);
        
        System.out.print("Fibonacci number is \n\tIterative: " + fib(index) +
            "\n\tRecursive: " + count + " calls");
    }
    
    /** Return the Fibonacci number at a specific instance.
     * @params index
     * @return fibonacci
     */
    public static int fib(int index) {
        int[] fib = new int[Math.max(2, index + 1)];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= index; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
        }
        return (fib[index]);
    }
    
    /** Return the Fibonacci number at a specific instance (recursive).
     * @params index, counter
     * @return array with fibonacci number and number of times the method was called.
     */
    public static int fibRec(int index) {
        count++;
        if (index == 0)
            return 0;
        else if (index == 1)
            return 1;
        else
            return fibRec(index - 2) + fibRec(index - 1);
    }
}