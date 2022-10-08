/**
 * (Financial application: loan amortization schedule) The monthly payment for a 
 * given loan pays the principal and the interest. The monthly interest is computed 
 * by multiplying the monthly interest rate and the balance (the remaining principal).
 * The principal paid for the month is therefore the monthly payment minus 
 * the monthly interest. Write a program that lets the user enter the loan amount, 
 * number of years, and interest rate and displays the amortization schedule for the loan. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_5_22 {
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
        kb.close();
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