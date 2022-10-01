/**
 * Program to compare various interest rates on a loan of a user given amount over a user given term.
 * 
 * @author Scott M.
 * CompareInterest.java
 */

import java.util.Scanner;

public class CompareInterest {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int years;
        double loan, monthRate, monthPay, totalPay;
        
        System.out.print("Enter the loan amount: ");
        loan = kb.nextDouble();
        System.out.print("Enter term in years: ");
        years = kb.nextInt();
        
        System.out.printf("%-15s %-15s %-15s\n", "Interest Rate", "Monthly Payment", "Total Payment");
        for (double rate = 5; rate <= 8; rate += 0.125) {
            monthRate = rate / 1200;
            monthPay = loan * monthRate / (1 - 1 / Math.pow(1 + monthRate, years * 12));
            totalPay = monthPay * years * 12;
            System.out.printf("%-5.3f%%%10s$%-14.2f $%-14.2f\n", rate, "", monthPay, totalPay);
        }
    }
}