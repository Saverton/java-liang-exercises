/**
 * Program to convert Chinese RMB to USD or vice versa.
 * 
 * @author Scott M.
 * CurrencyExchange.java
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class CurrencyExchange {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //start scanner, declare usd, rmb, rate, and exch vars
        Scanner kb = new Scanner (System.in);
        DecimalFormat money = new DecimalFormat ("0.##");
        double usd, rmb, rate;
        int exch;
        
        //get rate
        System.out.print("Enter the exchange rate from USD to RMB: ");
        rate = kb.nextDouble();
        
        //find exch
        System.out.print("Enter 0 if exchanging USD to RMB or 1 vice versa: ");
        exch = kb.nextInt();
        
        if (exch == 0) {
            //if usd -> rmb, get usd, calc, and display rmb
            System.out.print("Enter USD: ");
            usd = kb.nextDouble();
            rmb = usd * rate;
            System.out.print(money.format(rmb) + " yuan.");
        }
        else if (exch == 1) {
            //if rmb -> usd, get rmb, calc, display usd
            System.out.print("Enter RMB: ");
            rmb = kb.nextDouble();
            usd = rmb / rate;
            System.out.print("$" + money.format(usd));
        }
        else
            System.out.print("Error: incorrect input; try 0 or 1.");
    }
}