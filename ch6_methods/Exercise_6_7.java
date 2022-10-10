/**
 * (Financial application: compute the future investment value) Write a method that 
 * computes future investment value at a given interest rate for a specified number 
 * of years. The future investment is determined using the formula in Programming 
 * Exercise 2.21.
 * Use the following method header:
 *      public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
 * For example, futureInvestmentValue(10000, 0.05/12, 5) returns 
 * 12833.59.
 * Write a test program that prompts the user to enter the investment amount (e.g., 
 * 1000) and the interest rate (e.g., 9%) and prints a table that displays future value 
 * for the years from 1 to 30
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_6_7 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        final int YEARS = 30;
        double investment, rate;
        
        System.out.print("The amount invested: ");
        investment = kb.nextDouble();
        System.out.print("Annual interest rate: ");
        rate = kb.nextDouble();
        kb.close();
        
        System.out.printf("%-10s%-10s\n", "Years", "Future Value");
        for (int i = 1; i <= YEARS; i++) {
            System.out.printf("%-10d$%-4.2f\n", i, futureValue(investment, rate/1200, i));
        }
    }
    /**
     * Method that calculates the future value of an investment.
     * @params double: initial investment, monthly interest rate, the time from now to check future value (in years)
     * @return double: future investment value
     */
    public static double futureValue(double investment, double mRate, int year) {
        return (investment * Math.pow((1 + mRate), year*12));
    }
}