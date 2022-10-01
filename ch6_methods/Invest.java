/**
 * Program to compute future investment values.
 * 
 * @author Scott M.
 * Invest.java
 */

import java.util.Scanner;

public class Invest {
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
        
        System.out.printf("%-10s%-10s\n", "Years", "Future Value");
        for (int i = 1; i <= YEARS; i++) {
            System.out.printf("%-10d$%-4.2f\n", i, futureValue(investment, rate/1200, i));
        }
    }
    /**
     * Method to calculate future values of investment.
     */
    public static double futureValue(double investment, double mRate, int year) {
        return (investment * Math.pow((1 + mRate), year*12));
    }
}