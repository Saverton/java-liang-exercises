/**
 * Program to display a specific pattern (B).
 * 
 * @author Scott M.
 * Pattern2.java
 */

public class Pattern2 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        System.out.println("Pattern B:");
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
