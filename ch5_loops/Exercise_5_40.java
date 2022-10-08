/**
 * (Simulation: heads or tails) Write a program that simulates flipping a coin one 
 * million times and displays the number of heads and tails.
 * @author Scott M.
 */

public class Exercise_5_40 {
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