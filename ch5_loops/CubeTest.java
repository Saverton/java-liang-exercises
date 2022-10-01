/**
 * Program to calculate the greatest integer n that, when cubed, is less than 12,000.
 * 
 * @author Scott M.
 * CubeTest.java
 */

public class CubeTest {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int count;
        
        for (count = 1; Math.pow(count, 3) <= 12000; count++) {}
        
        count -= 1;
        System.out.print(count + " is the highest value of n such that n^3 < 12000.");
    }
}
