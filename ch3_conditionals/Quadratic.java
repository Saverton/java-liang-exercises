/**
 * Program to calculate roots from a quadratic equation.
 * 
 * @author Scott M.
 * Quadratic.java
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Quadratic
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner (System.in);
        DecimalFormat fmt = new DecimalFormat ("0.#####");
        double a, b, c, disc, roota, rootb;
        //get inputs
        System.out.print("Enter a, b, and c from a quadratic equation in standard form (ax^2 + bx + c): ");
        a = kb.nextDouble();
        b = kb.nextDouble();
        c = kb.nextDouble();
        //disc? unreal/
        disc = Math.pow(b, 2) - (4 * a * c);
        if (disc < 0) {
            System.out.println("This equation has no real roots.");
        }
        else if (disc == 0) {
            roota = (-1 * b) / (2 * a);
            System.out.println("This equation has one root at x = " + roota);
        }
        else {
            roota = ((-1 * b) + Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5)) / (2 * a);
            rootb = ((-1 * b) - Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5)) / (2 * a);
            System.out.println("The equation has 2 roots at x = " + fmt.format(roota) + " and x = " + fmt.format(rootb));
        }
    }
}