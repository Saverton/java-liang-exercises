/** 
 * (Financial application: calculate tips) Write a program that reads the subtotal 
 * and the gratuity rate, then computes the gratuity and total. For example, if the 
 * user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
 * as gratuity and $11.5 as total.  
 * @author Scott M.
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Exercise_2_5 {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance(); 
        double subtotal, gratuityRate, gratuity, total;
        System.out.print("Enter the subtotal and a gratuity rate: ");
        subtotal = kb.nextDouble();
        gratuityRate = kb.nextDouble() / 100; // set as a percentage proportion for calculations
        kb.close();
        gratuity = subtotal * gratuityRate;
        total = subtotal + gratuity;
        System.out.print("The gratuity is " + money.format(gratuity) + " and total is " + money.format(total));
    }
}
