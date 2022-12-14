/**
 * (Financial application: print a tax table) Listing 3.5 gives a program to compute 
 * tax. Write a method for computing tax using the following header:
 *      public static double computeTax(int status, double taxableIncome)
 * Use this method to write a program that prints a tax table for taxable income from 
 * $50,000 to $60,000 with intervals of $50 for all the following statuses:
 *      Taxable| Single      Married Joint   Married     Head of 
 *      Income |             or Qualifying   Separate    a House
 *             |             Widow(er)
 *      -----------------------------------------------------------
 *      50000    8688        6665            8688        7353
 *      50050    8700        6673            8700        7365
 *      ...
 *      59950    11175       8158            11175       9840
 *      60000    11188       8165            11188       9853
 * @author Scott M.
 */

public class Exercise_6_15 {
    /**
     * Main method to write program.
     */
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "Taxable", "Single", "Married Joint", "Married", "Head of");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "Income", "", "or Qualifying", "Separate", "a House");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "", "", "Widow(er)", "", "");
        System.out.println("----------------------------------------------------------------------");
        
        for (double income = 50000; income <= 60000; income += 50) {
            System.out.printf("$%-14.2f$%-14.2f$%-14.2f$%-14.2f$%-14.2f\n", income, computeTax(0, income), computeTax(1, income), computeTax(2, income), computeTax(3, income));
        }
    }
    /**
     * Compute the owed federal income tax given one's filing status and yearly income.
     * @params int: filing status (0=SINGLE, 1=MARRIED_JOINT, 2=MARRIED_SEPARATE, 3=HEAD_OF_HOUSE), double: yearly income
     * @return double: the federal income tax owed
     */
    public static double computeTax(int status, double income) {
        double tax;
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
            else if (income <= 45500)
                tax = (11950 * 0.10) + ((income - 11950) * 0.15);
            else if (income <= 117450)
                tax = (11950 * 0.10) + ((45500 - 11950) * 0.15) + ((income - 45500) * 0.25);
            else if (income <= 190200)
                tax = (11950 * 0.10) + ((45500 - 11950) * 0.15) + ((117450 - 45500) * 0.25) + ((income - 117450) * 0.28);
            else if (income <= 372950)
                tax = (11950 * 0.10) + ((45500 - 11950) * 0.15) + ((117450 - 45500) * 0.25) + ((190200 - 117450) * 0.28) + ((income - 190200) * 0.33);
            else
                tax = (11950 * 0.10) + ((45500 - 11950) * 0.15) + ((117450 - 45500) * 0.25) + ((190200 - 117450) * 0.28) + ((372950 - 190200) * 0.33) + ((income - 372950) * 0.35);
            break;
            default: tax = 0;
        }
        return tax;
    }
}
