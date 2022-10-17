/**
 * (The Stock class) Following the example of the Circle class in Section 9.2, 
 * design a class named Stock that contains:
 *  ■ A string data field named symbol for the stock’s symbol.
 *  ■ A string data field named name for the stock’s name.
 *  ■ A double data field named previousClosingPrice that stores the stock 
 * price for the previous day.
 *  ■ A double data field named currentPrice that stores the stock price for the 
 * current time.
 *  ■ A constructor that creates a stock with the specified symbol and name.
 *  ■ A method named getChangePercent() that returns the percentage changed 
 * from previousClosingPrice to currentPrice.
 * Draw the UML diagram for the class and then implement the class. Write a test 
 * program that creates a Stock object with the stock symbol ORCL, the name 
 * Oracle Corporation, and the previous closing price of 34.5. Set a new current 
 * price to 34.35 and display the price-change percentage.
 * @author Scott M.
 */

import java.text.DecimalFormat;

public class Exercise_9_2 {
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
}

class Stock
{    
    String symbol, name;
    double previousClosingPrice, currentPrice;
    
    /**
     * Construct a Stock object with a specified symbol and name
     * @param s String: stock symbol (e.g. Oracle = ORCL)
     * @param n String: name of stock
     */
    Stock(String s, String n)
    {
        symbol = s;
        name = n;
        previousClosingPrice = 1.00;
        currentPrice = 1.00;
    }
    
    /**
     * Return the percentage change between the current stock price and previous closing price.
     * @return double: change percentage
     */
    double getChangePercent()
    {
        return 100 * (currentPrice - previousClosingPrice) / previousClosingPrice;
    }
}