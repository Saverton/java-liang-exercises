/**
 * (Find the smallest n such that n2 7 12,000) Use a while loop to find the smallest 
 * integer n such that n2 is greater than 12,000.
 * @author Scott M.
 */

public class Exercise_5_12 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int count;
        
        for (count = 1; Math.pow(count, 2) <= 12000; count++) {}
        
        System.out.print(count + " is the lowest value of n such that n^2 > 12000.");
    }
}