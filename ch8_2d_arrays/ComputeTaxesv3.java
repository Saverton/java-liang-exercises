/**
 * Program to calculate federal income taxes based on user input gross taxable income.
 * 
 * @author Scott M.
 * ComputeTaxesv3.java
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class ComputeTaxesv3
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner (System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        double taxOwed, grossPay;
        
        System.out.println("Enter 3 individuals' gross pay, and see their respective net pay and federal tax liability.\n");
        
        for (int i = 1; i <= 3; i++)
        {
            System.out.print("Person " + i + ":\tGross Pay: ");
            grossPay = kb.nextDouble();
            taxOwed = calculateTax(grossPay);
            System.out.println("\t\tNet Pay: " + money.format(grossPay - taxOwed) + "\t Federal Tax Owed: " + money.format(taxOwed) + "\n");
        }
    }
    /**
     * Method to calculate the tax owed on a certain amount of gross pay.
     */
    public static double calculateTax(double grossPay)
    {
        double[][] taxes = 
        {{0, 0}, {9875, 0.1}, {40125, 0.12}, {85525, 0.22}, {163300, 0.24}, {207350, 0.32}, {518400, 0.35}, {Math.pow(10, 9), 0.37}};
        int count = 1;
        double remainingPay = grossPay, taxOwed = 0;
        while (remainingPay > 0) 
        {
            if (grossPay < taxes[count][0])
            {
                taxOwed += remainingPay * taxes[count][1];
            }
            else
            {
                taxOwed += (taxes[count][0] - taxes[count - 1][0]) * taxes[count][1];
            }
            remainingPay -= (taxes[count][0] - taxes[count -1][0]);
            count++;
        }
        return taxOwed;
    }
}
