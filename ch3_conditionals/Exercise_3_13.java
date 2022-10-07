/**
 * (Financial application: compute taxes) Listing 3.5, ComputeTax.java, gives the 
 * source code to compute taxes for single filers. Complete Listing 3.5 to compute 
 * the taxes for all filing statuses.
 * @author Scott M.
 * ComputeTaxes.java
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Exercise_3_13 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //declare scanner, money formatter, vars: status, income, tax
        Scanner kb = new Scanner (System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        int status, income;
        double tax = 0;
        
        //determine filing status (make sure valid entry) and taxable income
        System.out.println("(0-Single filer, 1-Married jointly or qualifying widow(er), 2-Married separately, 3-Head of household)");
        System.out.print("Enter filing status: ");
        status = kb.nextInt();
        if (status < 0 || status > 3)
            System.out.println("Error: invalid filing status ID.");
        System.out.print("Enter taxable income: ");
        income = kb.nextInt();
        kb.close();
        
        //switch (status): find taxes
        switch (status) {
            case 0: 
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = (8350 * 0.10) + ((income - 8350) * 0.15);
            else if (income <= 82250)
                tax = (8350 * 0.10) + ((33950 - 8350)* 0.15) + ((income - 33950) * 0.25);
            else if (income <= 171550)
                tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((82250 - 33950) * 0.25) + ((income - 82250) * 0.28);
            else if (income <= 372950)
                tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((82250 - 33950) * 0.25) + ((171550 - 82250) * 0.28) + ((income - 171550) * 0.33);
            else
                tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((82250 - 33950) * 0.25) + ((171550 - 82250) * 0.28) + ((372950 - 171550) * 0.33) + ((income - 372950) * 0.35);
            break;
            case 1:
            if (income <= 16700)
                tax = income * 0.10;
            else if (income <= 67900)
                tax = (16700 * 0.10) + ((income - 16700) * 0.15);
            else if (income <= 137050)
                tax = (16700 * 0.10) + ((67900 - 16700) * 0.15) + ((income - 67900) * 0.25);
            else if (income <= 208850)
                tax = (16700 * 0.10) + ((67900 - 16700)* 0.15) + ((137050 - 67900) * 0.25) + ((income - 137050) * 0.28);
            else if (income <= 372950)
                tax = (16700 * 0.10) + ((67900 - 16700) * 0.15) + ((137050 - 67900) * 0.25) + ((208850 - 137050) * 0.28) + ((income - 208850) * 0.33);
            else
                tax = (16700 * 0.10) + ((67900 - 16700) * 0.15) + ((137050 - 67900) * 0.25) + ((208850 - 137050) * 0.28) + ((372950 - 208850) * 0.33) + ((income - 372950) * 0.35);
            break;
            case 2:
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = (8350 * 0.10) + ((income - 8350) * 0.15);
            else if (income <= 68525)
                tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((income - 33950) * 0.25);
            else if (income <= 104425)
                tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((68525 - 33950) * 0.25) + ((income - 68525) * 0.28);
            else if (income <= 186475)
                tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((68525 - 33950) * 0.25) + ((104425 - 68525) * 0.28) + ((income - 104425) * 0.33);
            else
                tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((68525 - 33950) * 0.25) + ((104425 - 68525) * 0.28) + ((186475 - 104425) * 0.33) + ((income - 186475) * 0.35);
            break;
            case 3:
            if (income <= 11950)
                tax = income * 0.10;
            if (income <= 45500)
                tax = (11950 * 0.10) + ((income - 11950) * 0.15);
            if (income <= 117450)
                tax = (11950 * 0.10) + ((45500 - 11950) * 0.15) + ((income - 45500) * 0.25);
            if (income <= 190200)
                tax = (11950 * 0.10) + ((45500 - 11950) * 0.15) + ((117450 - 45500) * 0.25) + ((income - 117450) * 0.28);
            if (income <= 372950)
                tax = (11950 * 0.10) + ((45500 - 11950) * 0.15) + ((117450 - 45500) * 0.25) + ((190200 - 117450) * 0.28) + ((income - 190200) * 0.33);
            else
                tax = (11950 * 0.10) + ((45500 - 11950) * 0.15) + ((117450 - 45500) * 0.25) + ((190200 - 117450) * 0.28) + ((372950 - 190200) * 0.33) + ((income - 372950) * 0.35);
        }
        //display owed taxes
        System.out.print("Tax is " + money.format(tax));
    }
}