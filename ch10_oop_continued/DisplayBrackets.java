/**
 * Program to display tax brackets from 2001 and 2009 using the Tax class.
 * 
 * @author Scott M.
 * DisplayBrackets.java
 */

public class DisplayBrackets
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        final int[][] BRACKET_2009 = {
            {8350, 16700, 8350, 11950},
            {33950, 67900, 33950, 45500},
            {82250, 137050, 68525, 117450},
            {171550, 208850, 104425, 190200},
            {372950, 372950, 186475, 372950}
        };
        final double[] RATES_2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        Tax tax2001 = new Tax();
        Tax tax2009 = new Tax(0, BRACKET_2009, RATES_2009, 100000);
        
        displayBracket(tax2001, 50000, 60000, "2001");
        System.out.println();
        displayBracket(tax2009, 50000, 60000, "2009");
    }
    
    public static void displayBracket(Tax taxYear, int start, int finish, String year)
    {
        String[] bracket = new String[(finish - start) / 1000];
        for (int i = 0; i < bracket.length; i++)
        {
            taxYear.setTaxableIncome(start + i * 1000);
            bracket[i] = String.format("$%-6.2f\t", taxYear.getTaxableIncome());
            for (int j = 0; j < 4; j++)
            {
                bracket[i] += String.format("$%-9.2f\t", taxYear.getTax(j));
            }
        }
        System.out.println("Tax bracket for " + year + " from $" + start + " to $" + finish);
        System.out.println("Income\t\tSingle\t\tMarried Joint\tMarried Sep.\tHead of House");
        for (int i = 0; i < bracket[0].length(); i++)
        {
            System.out.print('-');
        }
        System.out.println();
        for (int i = 0; i < bracket.length; i++)
        {
            System.out.println(bracket[i]);
        }
    }
}