/**
 * Program to display a specific pattern (C).
 * 
 * @author Scott M.
 * Pattern3.java
 */

public class Pattern3 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        System.out.println("Pattern C:");
        for (int i = 5; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = 6 - i; k > 0; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
