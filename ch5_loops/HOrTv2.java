/**
 * Program to do coin flips for Heads or Tails 1 million times and report the results.
 * 
 * @author Scott M.
 * HOrTv2.java
 */

public class HOrTv2 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int heads = 0, tails = 0;
        
        for (int i = 1; i <= 1000000; i++) {
            if (Math.random() >= 0.5) {
                heads++;
            }
            else {
                tails++;
            }
        }
        
        System.out.printf("Heads was flipped %,d times and Tails was flipped %,d times.", heads, tails);
    }
}