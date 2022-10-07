/**
 * (Compute the perimeter of a triangle) Write a program that reads three edges for 
 * a triangle and computes the perimeter if the input is valid. Otherwise, display that 
 * the input is invalid. The input is valid if the sum of every pair of two edges is 
 * greater than the remaining edge.
 * @author Scott M.
 * TrianglePerimeter.java
 */

import java.util.Scanner;

public class Exercise_3_19 {
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
        kb.close();
        
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