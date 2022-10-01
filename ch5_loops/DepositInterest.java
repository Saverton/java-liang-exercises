/**
 * Program to calculate balance into an account that has a constant monthly deposit, an annual interest rate, and a term.
 * 
 * @author Scott M.
 * DepositInterest.java
 */

import java.util.Scanner;

public class DepositInterest {
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
        mRate = (double)rate / 1200;
        
        for (int month = 1; month <= term; month++) {
            balance += 100;
            balance *= (1 + mRate);
            System.out.printf("Month %d: Balance = $%-4.2f\n", month, balance);
        }
    }
}