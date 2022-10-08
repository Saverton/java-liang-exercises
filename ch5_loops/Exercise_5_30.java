/**
 * (Financial application: compound value) Suppose you save $100 each month 
 * into a savings account with the annual interest rate 5%. So, the monthly interest 
 * rate is 0.05 / 12 = 0.00417. After the first month, the value in the account 
 * becomes
 *      100 * (1 + 0.00417) = 100.417
 * After the second month, the value in the account becomes
 *      (100 + 100.417) * (1 + 0.00417) = 201.252
 * After the third month, the value in the account becomes
 *      (100 + 201.252) * (1 + 0.00417) = 302.507
 * and so on.
 * Write a program that prompts the user to enter an amount (e.g., 100), the annual 
 * interest rate (e.g., 5), and the number of months (e.g., 6) and displays the amount 
 * in the savings account after the given month.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_5_30 {
    /**
     * Main method to run Program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        double deposit, mRate, balance = 0;
        int rate, term;
        
        System.out.print("Enter the amount to be deposited per month: ");
        deposit = kb.nextDouble();
        System.out.print("Enter the annual interest rate (e.g. 10% => 10): ");
        rate = kb.nextInt();
        System.out.print("Enter the amount of months to calculate: ");
        term = kb.nextInt();
        kb.close();
        mRate = (double)rate / 1200;
        
        for (int month = 1; month <= term; month++) {
            balance += deposit;
            balance *= (1 + mRate);
            System.out.printf("Month %d: Balance = $%-4.2f\n", month, balance);
        }
    }
}