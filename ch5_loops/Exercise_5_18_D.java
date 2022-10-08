/**
 * (Display four patterns using loops) Use nested loops that display the following 
 * patterns in four separate programs:
 *      Pattern D
 *      1 2 3 4 5 6
 *        1 2 3 4 5
 *          1 2 3 4
 *            1 2 3
 *              1 2
 *                1
 * @author Scott M.
 */

public class Exercise_5_18_D {
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
