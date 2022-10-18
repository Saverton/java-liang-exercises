/**
 * (Financial: the Tax class) Programming Exercise 8.12 writes a program for 
 * computing taxes using arrays. Design a class named Tax to contain the following instance data fields:
 *  ■ int filingStatus: One of the four tax-filing statuses: 0—single filer, 1—
 *    married filing jointly or qualifying widow(er), 2—married filing separately, 
 *    and 3—head of household. Use the public static constants SINGLE_FILER
 *    (0), MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER) (1), MARRIED_
 *    SEPARATELY (2), HEAD_OF_HOUSEHOLD (3) to represent the statuses.
 *  ■ int[][] brackets: Stores the tax brackets for each filing status.
 *  ■ double[] rates: Stores the tax rates for each bracket.
 *  ■ double taxableIncome: Stores the taxable income.
 * Provide the getter and setter methods for each data field and the getTax()
 * method that returns the tax. Also provide a no-arg constructor and the constructor 
 * Tax(filingStatus, brackets, rates, taxableIncome).
 * Draw the UML diagram for the class and then implement the class. Write a test 
 * program that uses the Tax class to print the 2001 and 2009 tax tables for taxable 
 * income from $50,000 to $60,000 with intervals of $1,000 for all four statuses. 
 * The tax rates for the year 2009 were given in Table 3.2. The tax rates for 2001 
 * are shown in Table 10.1.
 * @author Scott M.
 */

public class Exercise_10_8 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int[][] TAX_BRACKET_2009 = {
            {8350, 33950, 82250, 171550, 372950},
            {16700, 67900, 137050, 208850, 372950},
            {8350, 33950, 68525, 104425, 186475},
            {11950, 45500, 117450, 190200, 372950}
        };
        double[] RATE_TABLE_2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        System.out.println("2001 Bracket:");
        printTaxTable(Tax.DEFAULT_BRACKET_2001, Tax.DEFAULT_RATES_2001, 50000, 60000);
        System.out.println("\n2009 Bracket:");
        printTaxTable(TAX_BRACKET_2009, RATE_TABLE_2009, 50000, 60000);
    }

    /**
     * Print a tax table given a bracket, rate table, starting income, and ending income
     * @param bracket int[][]: tax bracket
     * @param rateTable double[]: table of tax rates
     * @param startIncome int: income to start table
     * @param endIncome int: income to end table
     */
    public static void printTaxTable(int[][] bracket, double[] rateTable, int startIncome, int endIncome) {
        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n","TAXABLE INCOME", "SINGLE", "MARRIED JOINTLY", "MARRIED SEPARATE", "HEAD OF HOUSEHOLD");
        for (int i = startIncome; i <= endIncome; i += 1000) {
            Tax rowOfTax = new Tax(Tax.SINGLE, bracket, rateTable, (double)i);
            System.out.printf("$%-19.2f$%-19.2f$%-19.2f$%-19.2f$%-19.2f\n", (double)i, rowOfTax.getTax(Tax.SINGLE), 
                rowOfTax.getTax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER), rowOfTax.getTax(Tax.MARREIED_SEPARATELY), 
                rowOfTax.getTax(Tax.HEAD_OF_HOUSEHOLD));
        }
    }
}

class Tax
{
    public static final int SINGLE = 0, MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1, MARREIED_SEPARATELY = 2, HEAD_OF_HOUSEHOLD = 3;
    public static final int[][] DEFAULT_BRACKET_2001 = {
        {27050, 45200, 22600, 36250},
        {65550, 109250, 54625, 36251},
        {136750, 166500, 83250, 151650},
        {297350, 297350, 148675, 297350},
    };
    public static final double[] DEFAULT_RATES_2001 = {0.15, 0.275, 0.305, 0.355, 0.391};
    private int filingStatus;
    private int[][] bracket;
    private double[] rates;
    private double taxableIncome;
    
    /**
     * Construct a new Tax object with a specific filing status, tax bracket, rate list, and taxable income amount
     * @param filingStatus int: integer corresponding to filing status
     * @param taxableIncome double: taxable income
     */
    public Tax(int filingStatus, int[][]bracket, double[] rates, double taxableIncome)
    {
        if (filingStatus >= 0 && filingStatus <= 3)
        {
            this.filingStatus = filingStatus;
        }
        else
        {
            this.filingStatus = 0;
        }
        this.bracket = bracket;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }
    
    /**
     * Construct a defualt Tax object with SINGLE filing status, 2001 brackets and rates, and a taxable income of $100,000.00
     */
    public Tax()
    {
        this(0, DEFAULT_BRACKET_2001, DEFAULT_RATES_2001, 100000);
    }
    
    /**
     * Return the Tax object's filing status
     * @return int: filing status
     */
    public int getFilingStatus()
    {
        return this.filingStatus;
    }
    
    /**
     * Set the tax object's filing status
     * @param newStatus int: new filing status
     */
    public void setFilingStatus(int newStatus)
    {
        if (newStatus >= 0 && newStatus <= 3)
        {
            this.filingStatus = newStatus;
        }
    }
    
    /**
     * Return the tax object's bracket
     * @return int[][]: tax bracket
     */
    public int[][] getBracket()
    {
        return this.bracket;
    }
    
    /**
     * Set the tax object's tax bracket
     * @param bracket int[][]: tax bracket
     */
    public void setBracket(int[][] bracket)
    {
        this.bracket = bracket;
    }
    
    /**
     * Return the tax object's rates table
     * @return double[]: tax rate table
     */
    public double[] getRates()
    {
        return this.rates;
    }
    
    /**
     * Set the tax object's rate table
     * @param rates double[]: tax rate table
     */
    public void setRates(double[] rates)
    {
        this.rates = rates;
    }
    
    /**
     * Return the tax object's taxable income.
     * @return double: taxable income
     */
    public double getTaxableIncome()
    {
        return this.taxableIncome;
    }
    
    /**
     * Set the tax object's taxable income
     * @param taxableIncome double: taxable income
     */
    public void setTaxableIncome(double taxableIncome)
    {
        this.taxableIncome = taxableIncome;
    }
    
    /**
     * Return the owed income tax
     * @return double: owed income tax
     */
    public double getTax()
    {
        return this.getTax(this.filingStatus);
    }
    
    /**
     * Return the owed income tax with a specified filing status.
     * @param filingStatus int: integer corresponding to filing status
     * @return double: income tax owed
     */
    public double getTax(int filingStatus)
    {
        double owedTax = 0, uncountedIncome = this.taxableIncome;
        for (int i = 0; i < bracket[filingStatus].length; i++)
        {
            if (i + 1 == bracket[filingStatus].length || this.taxableIncome <= bracket[filingStatus][i]) {
                owedTax += uncountedIncome * rates[i];
                break;
            }
            else {
                owedTax += (bracket[filingStatus][i] - ((i == 0) ? 0 : bracket[filingStatus][i - 1])) * rates[i];
                uncountedIncome = this.taxableIncome - bracket[filingStatus][i];
            }
        }
        return owedTax;        
    }
}