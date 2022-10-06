/**
 * (Financial application: calculate interest) If you know the balance and the annual 
 * percentage interest rate, you can compute the interest on the next monthly payment using the following formula:
 * interest = balance * (annualInterestRate/1200)
 * Write a program that reads the balance and the annual percentage interest rate and 
 * displays the interest for the next month.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_2_20 {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double balance, interestRate, monthlyInterestRate, interest;
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        balance = kb.nextDouble();
        interestRate = kb.nextDouble();
        kb.close();
        monthlyInterestRate = interestRate / 1200;
        interest = balance * monthlyInterestRate;
        System.out.print("The interest is " + interest);
    }
}