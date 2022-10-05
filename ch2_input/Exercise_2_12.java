/**
 * (Physics: finding runway length) Given an airplane’s acceleration a and take-off 
 * speed v, you can compute the minimum runway length needed for an airplane to 
 * take off using the following formula:
 *                v^2
 *      length = ----
 *                2a
 * Write a program that prompts the user to enter v in meters/second (m/s) and the 
 * acceleration a in meters/second squared (m/s2), and displays the minimum runway length.
 * @author Scott M.
 */

 import java.util.Scanner;

public class Exercise_2_12 {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double speed, acceleration, length;
        System.out.print("Enter speed and acceleration: ");
        speed = kb.nextDouble();
        acceleration = kb.nextDouble();
        kb.close();
        length = Math.pow(speed, 2) / (2 * acceleration);
        System.out.print("The minimum runway length for this airplane is " + length);
    }
}
