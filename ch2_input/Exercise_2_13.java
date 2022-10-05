/**
 * (Financial application: compound value) Suppose you save $100 each month 
 * into a savings account with the annual interest rate 5%. Thus, the monthly interest
 *  rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
 *      100 * (1 + 0.00417) = 100.417
 * After the second month, the value in the account becomes
 *      (100 + 100.417) * (1 + 0.00417) = 201.252 
 * After the third month, the value in the account becomes
 *      (100 + 201.252) * (1 + 0.00417) = 302.507 
 * and so on.
 * Write a program that prompts the user to enter a monthly saving amount and 
 * displays the account value after the sixth month. 
 * @author Scott M.
 */

 import java.util.Scanner;
 import java.text.NumberFormat;

public class Exercise_2_13 {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        double savingAmount, accountValue = 0;
        final double MONTHLY_INTEREST = 0.05 / 12;
        System.out.print("Enter the monthly saving amount: ");
        savingAmount = kb.nextDouble();
        kb.close();
        accountValue = (savingAmount + accountValue) * (1 + MONTHLY_INTEREST); // month 1
        accountValue = (savingAmount + accountValue) * (1 + MONTHLY_INTEREST); // month 2
        accountValue = (savingAmount + accountValue) * (1 + MONTHLY_INTEREST); // month 3
        accountValue = (savingAmount + accountValue) * (1 + MONTHLY_INTEREST); // month 4
        accountValue = (savingAmount + accountValue) * (1 + MONTHLY_INTEREST); // month 5
        accountValue = (savingAmount + accountValue) * (1 + MONTHLY_INTEREST); // month 6
        System.out.print("After the sixth month, the account value is " + money.format(accountValue));
    }
}