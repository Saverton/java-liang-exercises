/**
 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.
 * java, to fix the possible loss of accuracy when converting a float value to an int
 * value. Read the input as a string such as "11.56". Your program should extract 
 * the dollar amount before the decimal point and the cents after the decimal amount 
 * using the indexOf and substring methods.
 * @author Scott M.
 * ComputeChange3.java
 */

import java.util.Scanner;

public class Exercise_4_26 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //declare vars import scanner and format
        Scanner kb = new Scanner (System.in);
        String cash, dollars, changeString;
        int change, quarters, dimes, nickels, pennies;
        
        //get cash val
        System.out.print("Enter a value in cash: ");
        cash = kb.nextLine();
        kb.close();
        dollars = cash.substring(0, cash.indexOf('.'));
        changeString = cash.substring(cash.indexOf('.') + 1);
        
        //calc dollars, quarters, dimes, nickles, pennies
        System.out.printf("$%s can be broken as: ", cash);
        if (Integer.parseInt(dollars) == 1)
            System.out.println("\n" + dollars + " dollar");
        else if (Integer.parseInt(dollars) >= 0)
            System.out.println("\n" + dollars + " dollars");
        change = Integer.parseInt(changeString);
        quarters = (change) / 25;
        if (quarters == 1)
            System.out.println(quarters + " quarter");
        else if (quarters >= 0)
            System.out.println(quarters + " quarters");
        change -= (quarters * 25);
        dimes = (change) / 10;
        if (dimes == 1)
            System.out.println(dimes + " dime");
        else if (dimes >= 0)
            System.out.println(dimes + " dimes");
        change -= (dimes * 10);
        nickels = (change) / 5;
        if (nickels == 1)
            System.out.println(nickels + " nickel");
        change -= (nickels * 5);
        pennies = (change);
        if (pennies == 1)
            System.out.println(pennies + " penny");
        else if (pennies >= 0)
            System.out.println(pennies + " pennies");
    }
}