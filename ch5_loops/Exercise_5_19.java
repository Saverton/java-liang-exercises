/**
 * (Display numbers in a pyramid pattern) Write a nested for loop that prints the 
 * following output:
 *                    1
 *                1   2  1
 *             1  2   4  2  1
 *          1  2  4   8  4  2  1
 *       1  2  4  8  16  8  4  2 1
 *     1 2  4  8 16  32 16  8  4 2 1
 *   1 2 4  8 16 32  64 32 16  8 4 2 1
 * 1 2 4 8 16 32 64 128 64 32 16 8 4 2 1
 * @author Scott M.
 */

public class Exercise_5_19 {
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