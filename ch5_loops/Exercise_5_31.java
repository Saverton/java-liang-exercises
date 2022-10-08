/**
 * (Financial application: compute CD value) Suppose you put $10,000 into a CD 
 * with an annual percentage yield of 5.75%. After one month, the CD is worth
 *      10000 + 10000 * 5.75 / 1200 = 10047.92
 * After two months, the CD is worth
 *      10047.91 + 10047.91 * 5.75 / 1200 = 10096.06
 * After three months, the CD is worth
 *      10096.06 + 10096.06 * 5.75 / 1200 = 10144.44
 * and so on.
 *  Write a program that prompts the user to enter an amount (e.g., 10000), the 
 * annual percentage yield (e.g., 5.75), and the number of months (e.g., 18) and 
 * displays a table as shown in the sample run.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_5_31 {
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
        kb.close();
        System.out.printf("\n%-10s%-10s\n", "Month", "CD Value");
        
        for (int month = 1; month <= term; month++) {
            value += value * (rate / 1200);
            System.out.printf("%-10d$%-10.2f\n", month, value);
        }
    }
}