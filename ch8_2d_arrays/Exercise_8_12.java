/**
 * (Financial application: compute tax) Rewrite Listing 3.5, ComputeTax.java, 
 * using arrays. For each filing status, there are six tax rates. Each rate is applied 
 * to a certain amount of taxable income. For example, from the taxable income of 
 * $400,000 for a single filer, $8,350 is taxed at 10%, (33,950 - 8,350) at 15%, 
 * (82,250 - 33,950) at 25%, (171,550 - 82,550) at 28%, (372,550 - 82,250) at 
 * 33%, and (400,000 - 372,950) at 36%. The six rates are the same for all filing 
 * statuses, which can be represented in the following array:
 *      double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
 * The brackets for each rate for all the filing statuses can be represented in a two 
 * dimensional array as follows:
 *      int[][] brackets = {
 *      {8350, 33950, 82250, 171550, 372950}, // Single filer
 *      {16700, 67900, 137050, 20885, 372950}, // Married jointly
 *                                             // -or qualifying widow(er)
 *      {8350, 33950, 68525, 104425, 186475}, // Married separately
 *      {11950, 45500, 117450, 190200, 372950} // Head of household
 *      };
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_12
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner (System.in);
        double taxOwed, grossPay;
        int filingStatus;
        
        System.out.println("(0-single filer, 1-married jointly or qualifying widow(er),\n 2-married separately, 3-head of household)");
        System.out.print("Enter the filing Status: ");
        filingStatus = kb.nextInt();
        System.out.print("Enter taxable income: ");
        grossPay = kb.nextDouble();
        kb.close();
        taxOwed = calculateTax(filingStatus, grossPay);
        System.out.print("Tax is " + taxOwed);
    }
    /**
     * Return the federal income tax owed given a filing status and gross pay.
     */
    public static double calculateTax(int filingStatus, double grossPay)
    {
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        double[][] brackets = {
            {8350, 33950, 82250, 372950},
            {16700, 67900, 137050, 20885, 372950},
            {8350, 33950, 68525, 104425, 186475},
            {11950, 45500, 117450, 190200, 372950}
        };
        int count = 0;
        double remainingPay = grossPay, taxOwed = 0;
        while (remainingPay > 0) 
        {
            if (grossPay < brackets[filingStatus][count]) {
                taxOwed += remainingPay;
                remainingPay = 0;
            }
            else {
                taxOwed += rates[count] * (brackets[filingStatus][count] - ((count > 0) ? brackets[filingStatus][count - 1] : 0));
                remainingPay -= (brackets[filingStatus][count] - ((count > 0) ? brackets[filingStatus][count - 1] : 0));
            }
            count++;
        }
        return taxOwed;
    }
}
