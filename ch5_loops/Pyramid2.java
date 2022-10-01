/**
 * Program to display a big 8-layer pyramid with powers of 2.
 * 
 * @author Scott M.
 * Pyramid2.java
 */

public class Pyramid2 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int line = 1, display;
        while (line <= 8) {
            //1. Enter a number of spaces (8 - line).
            for (int i = 1; i <= 8 - line; i++) {
                System.out.print("    ");
            }
            //2. Enter numbers (Math.pow(2, j++) until column 8)
            for (int j = 0; j <= line - 1; j++) {
                display = (int)Math.pow(2, j);
                System.out.printf("%4d", display);
            }
            //3. Enter decreasing numbers (Math.pow(2, j--) until column (9 - line)
            for (int k = line - 1; k > 0; k--) {
                display = (int)Math.pow(2, k - 1);
                System.out.printf("%4d", display);  
            }
            //4. Println down
            System.out.println();
            line++;
        }
    }
}