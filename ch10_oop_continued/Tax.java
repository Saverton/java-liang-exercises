/**
 * The tax class has data fields for the tax bracket (int[][]), rates (double[]),
 * Filing status (int), and taxable Income (double); Behaviors can get or set each
 * data field as well as return the tax that this individual owes.
 * 
 * @author Scott M.
 * Tax.java
 */

public class Tax
{
    private static final int SINGLE_FILER = 0, MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1, MARREIED_SEPARATELY = 2, HEAD_OF_HOUSEHOLD = 3;
    private static final int[][] DEFAULT_BRACKET_2001 = {
        {27050, 45200, 22600, 36250},
        {65550, 109250, 54625, 36251},
        {136750, 166500, 83250, 151650},
        {297350, 297350, 148675, 297350},
    };
    private static final double[] DEFAULT_RATES_2001 = {0.15, 0.275, 0.305, 0.355, 0.391};
    private int filingStatus;
    private int[][] bracket;
    private double[] rates;
    private double taxableIncome;
    
    public Tax(int filingStatus, int[][] bracket, double[] rates, double taxableIncome)
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
        if (this.bracket.length != this.rates.length)
        {
            this.bracket = DEFAULT_BRACKET_2001;
            this.rates = DEFAULT_RATES_2001;
        }
        this.taxableIncome = taxableIncome;
    }
    
    public Tax()
    {
        this(0, DEFAULT_BRACKET_2001, DEFAULT_RATES_2001, 100000);
    }
    
    public int getFilingStatus()
    {
        return this.filingStatus;
    }
    
    public void setFilingStatus(int newStatus)
    {
        if (newStatus >= 0 && newStatus <= 3)
        {
            this.filingStatus = newStatus;
        }
    }
    
    public int[][] getBracket()
    {
        return this.bracket;
    }
    
    public void setBracket(int[][] bracket)
    {
        this.bracket = bracket;
    }
    
    public double[] getRates()
    {
        return this.rates;
    }
    
    public void setRates(double[] rates)
    {
        this.rates = rates;
    }
    
    public double getTaxableIncome()
    {
        return this.taxableIncome;
    }
    
    public void setTaxableIncome(double taxableIncome)
    {
        this.taxableIncome = taxableIncome;
    }
    
    public double getTax()
    {
        return this.getTax(this.filingStatus);
    }
    
    public double getTax(int filingStatus)
    {
        int rate = 0;
        for (int i = 0; i < bracket[filingStatus].length; i++)
        {
            if (this.taxableIncome > bracket[filingStatus][i])
            {
                rate++;
            }
            else
            {
                break;
            }
        }
        return this.taxableIncome * rates[rate];        
    }
}