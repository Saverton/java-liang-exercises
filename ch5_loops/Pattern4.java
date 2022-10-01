/**
 * Program to display a specific pattern (D).
 * 
 * @author Scott M.
 * Pattern4.java
 */

public class Pattern4 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        System.out.println("Pattern D:");
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = i + 1; k <= 6; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
