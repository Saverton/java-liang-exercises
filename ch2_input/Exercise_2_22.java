/**
 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.java, 
 * to fix the possible loss of accuracy when converting a double value to an 
 * int value. Enter the input as an integer whose last two digits represent the cents. 
 * For example, the input 1156 represents 11 dollars and 56 cents.
 * @author Scott M.
 */

 import java.util.Scanner;

public class Exercise_2_22 {
    /** Main method to run program */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int amount, dollars, quarters, dimes, nickels, pennies;
        System.out.print("Enter an amount as an integer: ");
        amount = kb.nextInt();
        kb.close();
        dollars = amount / 100;
        amount %= 100; // amount in cents
        quarters = amount / 25;
        amount %= 25;
        dimes = amount / 10;
        amount %= 10;
        nickels = amount / 5;
        amount %= 5;
        pennies = amount;
        System.out.println("Your amount " + amount + " consists of");
        System.out.println("\t" + dollars + " dollars");
        System.out.println("\t" + quarters + " quarters");
        System.out.println("\t" + dimes + " dimes");
        System.out.println("\t" + nickels + " nickels");
        System.out.println("\t" + pennies + " pennies");
    }
}