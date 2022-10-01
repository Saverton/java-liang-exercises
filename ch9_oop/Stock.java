/**
 * Class to define a Stock object with data fields for symbol, name, previous closing price, 
 * and current price along with a method to find the percent change in the price from the
 * previous closing price to the current price.
 * 
 * @author Scott M.
 * Stock.java
 */

import java.text.DecimalFormat;
public class Stock
{
    /**
     * Main method to test Stock class
     */
    public static void main(String[] args)
    {
        DecimalFormat fmt = new DecimalFormat("0.##");
        Stock orcl = new Stock("ORCL", "Oracle Corporation");
        orcl.previousClosingPrice = 34.5;
        orcl.currentPrice = 34.35;
        
        System.out.print("The price change percentage for " + orcl.symbol + " was " + fmt.format(orcl.getChangePercent()) + "%");
    }
    
    /**
     * Stock Object
     */
    String symbol, name;
    double previousClosingPrice, currentPrice;
    
    Stock(String s, String n)
    {
        symbol = s;
        name = n;
        previousClosingPrice = 1.00;
        currentPrice = 1.00;
    }
    
    double getChangePercent()
    {
        return 100 * (currentPrice - previousClosingPrice) / previousClosingPrice;
    }
}