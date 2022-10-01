/**
 * (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following 2 * 2 system of linear equation:
 * 
 * ax + by = e      ed - bf         af - ec
 *              x = -------     y = -------
 * cx + dy = f      ad - bc         ad - bc
 * 
 * Write a program that solves the following equation and displays the value for x and y:
 *     3.4x + 50.2y = 44.5
 *     2.1x + .55y = 5.9
 * @author Scott M.
 */

public class Exercise_1_13 {
    /** Main method to run program. */
    public static void main(String[] args) {
        System.out.println("Equation 1 : " + "3.4x + 50.2y = 44.5");
        System.out.println("Equation 2 : " + "2.1x + .55y = 5.9");
        System.out.println(" x = " + ((44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 2.1 * 50.2)));
        System.out.println(" y = " + ((3.4 * 5.9 - 2.1 * 44.5) / (3.4 * 0.55 - 2.1 * 50.2)));
    }
}
