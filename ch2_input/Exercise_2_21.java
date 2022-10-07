/**
 * (Financial application: calculate future investment value) Write a program that 
 * reads in investment amount, annual interest rate, and number of years, and displays 
 * the future investment value using the following formula:
 *      futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)
 * @author Scott M.
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Exercise_2_21 {
    /** Main method to run program */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        double investment, annualInterestRate, monthlyInterestRate, futureInvestmentValue;
        int numberOfYears;
        System.out.print("Enter investment amount: ");
        investment = kb.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        annualInterestRate = kb.nextDouble();
        System.out.print("Enter number of years: ");
        numberOfYears = kb.nextInt();
        kb.close();
        monthlyInterestRate = annualInterestRate / (12 * 100);
        futureInvestmentValue = investment * Math.pow((1 + monthlyInterestRate), numberOfYears * 12);
        System.out.print("Accumulated value is " + money.format(futureInvestmentValue));
    }
}