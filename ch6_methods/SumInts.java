/**
 * Program to find the sum of digits in an int using a method.
 * 
 * @author Scott M.
 * SumInts.java
 */

import java.util.Scanner;

public class SumInts {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        long num;
        
        System.out.print("Enter an Integer: ");
        num = kb.nextInt();
        
        System.out.print("The sum of the digits is " + sumDigits(num));
    }
    public static int sumDigits(long num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}