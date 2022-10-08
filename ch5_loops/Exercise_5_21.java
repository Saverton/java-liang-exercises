/**
 * (Financial application: compare loans with various interest rates) Write a program 
 * that lets the user enter the loan amount and loan period in number of years 
 * and displays the monthly and total payments for each interest rate starting from 
 * 5% to 8%, with an increment of 1/8. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_5_21 {
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
        kb.close();
        
        System.out.printf("%-15s %-15s %-15s\n", "Interest Rate", "Monthly Payment", "Total Payment");
        for (double rate = 5; rate <= 8; rate += 0.125) {
            monthRate = rate / 1200;
            monthPay = loan * monthRate / (1 - 1 / Math.pow(1 + monthRate, years * 12));
            totalPay = monthPay * years * 12;
            System.out.printf("%-5.3f%%%10s$%-14.2f $%-14.2f\n", rate, "", monthPay, totalPay);
        }
    }
}