/**
 * Program to compute the change for a given cash value.
 * 
 * @author Scott M.
 * ComputeChange2.java
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class ComputeChange2 {
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