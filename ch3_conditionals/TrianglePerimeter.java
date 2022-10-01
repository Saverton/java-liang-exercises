/**
 * Program to calculate perimeter of a triangle with given side lengths.
 * 
 * @author Scott M.
 * TrianglePerimeter.java
 */

import java.util.Scanner;

public class TrianglePerimeter {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create scanner and declare a b and c vars
        Scanner kb = new Scanner (System.in);
        double a, b ,c;
        
        //prompt user and get side lengths
        System.out.print("Enter side lengths a, b, and c (Shortest to longest): ");
        a = kb.nextDouble();
        b = kb.nextDouble();
        c = kb.nextDouble();
        
        //determine if side lengths are valid
        if (a <= 0 || b <= 0 || c <= 0)
            System.out.print("Error: 0 or Negative side length.");
        else if (a + b <= c)
            System.out.print("Error: Invalid side lengths, no possible triangle.");
        else {
        //calculate and display perimeter
        System.out.print("The perimeter of this traingle is " + (a + b + c) + ".");
        }
    }
}