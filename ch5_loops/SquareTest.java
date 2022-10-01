/**
 * Program to calculate the smallest integer n that, when squared, is greater than 3,000.
 * 
 * @author Scott M.
 * SquareTest.java
 */

public class SquareTest {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int count;
        
        for (count = 1; Math.pow(count, 2) <= 12000; count++) {}
        
        System.out.print(count + " is the lowest value of n such that n^2 > 12000.");
    }
}