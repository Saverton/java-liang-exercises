/**
 * (Convert feet into meters) Write a program that reads a number in feet, converts it 
 * to meters, and displays the result. One foot is 0.305 meter.  
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_2_3 {
    /** Main method to run program */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double feet, meters;
        System.out.print("Enter a value for feet: ");
        feet = kb.nextDouble();
        kb.close();
        meters = feet * 0.305;
        System.out.print(feet + " feet is " + meters + " meters");
    }
}
