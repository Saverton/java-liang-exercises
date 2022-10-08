/**
 * (Find the largest n such that n3 6 12,000) Use a while loop to find the largest 
 * integer n such that n3 is less than 12,000.
 * @author Scott M.
 */

public class Exercise_5_13 {
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
