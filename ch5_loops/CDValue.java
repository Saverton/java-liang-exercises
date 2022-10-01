/**
 * Program to calculate the balance in a CD with initial deposit p with annual
 * interest rate r.
 * 
 * @author Scott M.
 * CDValue.java
 */

import java.util.Scanner;

public class CDValue {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        double value, rate;
        int term;
        
        System.out.print("Enter the initial deposit value: ");
        value = kb.nextDouble();
        System.out.print("Enter the annual interest rate (10% = 10): ");
        rate = kb.nextDouble();
        System.out.print("Enter the amount of months the CD lasts: ");
        term = kb.nextInt();
        System.out.printf("\n%-10s%-10s\n", "Month", "CD Value");
        
        for (int month = 1; month <= term; month++) {
            value += value * (rate / 1200);
            System.out.printf("%-10d$%-10.2f\n", month, value);
        }
    }
}