/**
 * (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a 
 * subtraction question. Revise the program to randomly generate an addition question
 * with two integers less than 100.
 * @author Scott M.
 * Quadratic.java
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise_3_10
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner (System.in);
        DecimalFormat fmt = new DecimalFormat ("0.#####");
        double a, b, c, discriminant, roota, rootb;
        //get inputs
        System.out.print("Enter a, b, c: ");
        a = kb.nextDouble();
        b = kb.nextDouble();
        c = kb.nextDouble();
        kb.close();
        discriminant = Math.pow(b, 2) - (4 * a * c);
        if (discriminant < 0) {
            System.out.println("This equation has no real roots");
        }
        else if (discriminant == 0) {
            roota = (-1 * b) / (2 * a);
            System.out.println("This equation has one root " + roota);
        }
        else {
            roota = ((-1 * b) + Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5)) / (2 * a);
            rootb = ((-1 * b) - Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5)) / (2 * a);
            System.out.println("The equation has 2 roots at " + fmt.format(roota) + " and " + fmt.format(rootb));
        }
    }
}