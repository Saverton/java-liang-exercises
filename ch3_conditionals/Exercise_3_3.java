/**
 * (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using 
 * Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts 
 * the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report 
 * that “The equation has no solution.”
 * @author Scott M.
 * Kramer.java
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise_3_3 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //declare vars and scanner and format
        Scanner kb = new Scanner (System.in);
        DecimalFormat fmt = new DecimalFormat ("0.###");
        double a, b, c, d, e, f, x, y, check;
        
        //prompt user and get a,b,c,d,e,f
        System.out.println("Format: ax + by = e\n        cx + dy = f");
        System.out.print("Enter double values for a, b, c, d, e, f: ");
        a = kb.nextDouble();
        b = kb.nextDouble();
        c = kb.nextDouble();
        d = kb.nextDouble();
        e = kb.nextDouble();
        f = kb.nextDouble();
        kb.close();
        check = (a * d) - (b * c);
        //calculate answer and display result
        if (check != 0) {
            x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            y = ((a * f) - (e * c)) / ((a * d) - (b * c));
            System.out.println("x = " + fmt.format(x) + "\ny = " + fmt.format(y));
        }
        else {
            System.out.print("There is no solution to this set of equations.");
        }
    }
}