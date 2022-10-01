/**
 * Program to solve a 2x2 linear equation system using Kramer's rule.
 * 
 * @author Scott M.
 * Kramer.java
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Kramer {
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
        check = (a * d) - (b * c);
        //calculate answer and display result
        if (check != 0) {
            x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            y = ((a * f) - (e * c)) / ((a * d) - (b * c));
            System.out.println("x = " + x + "\ny = " + y);
        }
        else {
            System.out.print("There is no solution to this set of equations.");
        }
    }
}