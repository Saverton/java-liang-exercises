/**
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter the 
 * side of a hexagon and displays its area. The formula for computing the area of a 
 * hexagon is 
 *                 ___
 *         ( 3 * \/ 3 )
 *  Area = (----------) * s^2
 *         (    2     )
 * 
 * where s is the length of a side.
 * @author Scott M.
 */

 import java.util.Scanner;

public class Exercise_2_16 {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double side, area;
        System.out.print("Enter the side: ");
        side = kb.nextDouble();
        kb.close();
        area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2);
        System.out.print("The area of the hexagon is " + area);
    }
}