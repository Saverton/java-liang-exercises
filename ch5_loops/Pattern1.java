/**
 * Program to display a specific pattern (A).
 * 
 * @author Scott M.
 * Pattern1.java
 */

public class Pattern1 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        System.out.println("Pattern A:");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}