/**
 * (Display four patterns using loops) Use nested loops that display the following
 * patterns in four separate programs:
 *      Pattern A 
 *      1
 *      1 2
 *      1 2 3
 *      1 2 3 4
 *      1 2 3 4 5
 *      1 2 3 4 5 6
 * @author Scott M.
 */

public class Exercise_5_18_A {
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