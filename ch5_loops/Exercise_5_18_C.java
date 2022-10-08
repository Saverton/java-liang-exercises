/**
 * (Display four patterns using loops) Use nested loops that display the following 
 * patterns in four separate programs:
 *      Pattern C
 *                1
 *              2 1
 *            3 2 1
 *          4 3 2 1
 *        5 4 3 2 1
 *      6 5 4 3 2 1
 * @author Scott M.
 */

public class Exercise_5_18_C {
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
