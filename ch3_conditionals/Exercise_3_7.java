/**
 * (Financial application: monetary units) Modify Listing 2.10, ComputeChange.java,
 * to display the nonzero denominations only, using singular words for single 
 * units such as 1 dollar and 1 penny, and plural words for more than one unit such 
 * as 2 dollars and 3 pennies
 * @author Scott M.
 * ComputeChange2.java
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Exercise_3_7 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //declare vars import scanner and format
        Scanner kb = new Scanner (System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        double cash;
        int dollars, quarters, dimes, nickels, pennies;
        
        //get cash val
        System.out.print("Enter a value in cash: ");
        cash = kb.nextDouble();
        kb.close();
        
        //calc dollars, quarters, dimes, nickles, pennies
        System.out.println(money.format(cash) + " can be broken as: ");
        dollars = (int)(cash);
        if (dollars == 1)
            System.out.println(dollars + " dollar");
        else if (dollars != 0)
            System.out.println(dollars + " dollars");
        cash -= dollars;
        quarters = (int)(cash * 100) / 25;
        if (quarters == 1)
            System.out.println(quarters + " quarter");
        else if (quarters != 0)
            System.out.println(quarters + " quarters");
        cash -= (quarters * .25);
        dimes = (int)(cash * 100) / 10;
        if (dimes == 1)
            System.out.println(dimes + " dime");
        else if (dimes != 0)
            System.out.println(dimes + " dimes");
        cash -= (dimes * .1);
        nickels = (int)(cash * 100) / 5;
        if (nickels == 1)
            System.out.println(nickels + " nickel");
        cash -= (nickels * 0.05);
        pennies = (int)(cash * 101);
        if (pennies == 1)
            System.out.println(pennies + " penny");
        else if (pennies != 0)
            System.out.println(pennies + " pennies");
    }
}