/**
 * Program to calculate and display the Interest and pricipal paid as well as the remaining balance for each payment of a loan
 * of user specified amount, term, and rate.
 * 
 * @author Scott M.
 * LoanAmortization.java
 */

import java.util.Scanner;

public class LoanAmortization {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int payment, term, rate;
        double monthPay, totalPay, monthRate, loan, interest, principal, balance;
        
        System.out.print("Enter the loan amount: ");
        loan = kb.nextDouble();
        System.out.print("Enter the term in years: ");
        term = kb.nextInt();
        System.out.print("Enter the annual interest rate (e.g. 10% => 10): ");
        rate = kb.nextInt();
        System.out.println();
        
        monthRate = (double)rate / 1200;
        monthPay = loan * monthRate / (1 - 1 / Math.pow(1 + monthRate, term * 12));
        totalPay = monthPay * term * 12;
        balance = loan;
        
        System.out.printf("Monthly Payment: $%4.2f\n", monthPay);
        System.out.printf("Total Payment: $%4.2f\n\n", totalPay);
        
        System.out.printf("%-15s%-15s%-15s%-15s\n", "Payment #", "Interest", "Principal", "Balance");
        
        for (payment = 1; payment <= term * 12; payment++) {
            interest = monthRate * balance;
            principal = monthPay - interest;
            balance -= principal;
            System.out.printf("%-15d$%-14.2f$%-14.2f$%-14.2f\n", payment, interest, principal, balance);
        }
    }
}