/**
 * (Convert pounds into kilograms) Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, converts it 
 * to kilograms, and displays the result. One pound is 0.454 kilograms.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_2_4 {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double pounds, kilograms;
        System.out.print("Enter a number in pounds: ");
        pounds = kb.nextDouble();
        kb.close();
        kilograms = pounds * 0.454;
        System.out.print(pounds + " pounds is " + kilograms + " kilograms");
    }
}
