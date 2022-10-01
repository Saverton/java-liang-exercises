/**
 * Program to calculate shipping costs based on package weight.
 * 
 * @author Scott M.
 * CostOfShipping.java
 */

import java.util.Scanner;

public class CostOfShipping {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create scanner and money formatter, declare weight and cost vars
        Scanner kb = new Scanner (System.in);
        int weight;
        
        //prompt user to enter weight, get weight
        System.out.print("Enter package weight in lbs: ");
        weight = kb.nextInt();
        
        //calculate shipping cost or if package cannot be shipped (w > 20)
        if (weight < 0)
            System.out.print("Weight cannot be negative.");
        else if (weight <= 1)
            System.out.print("Cost is $3.50");
        else if (weight <= 3)
            System.out.print("Cost is $5.50");
        else if (weight <= 10)
            System.out.print("Cost is $8.50");
        else if (weight <= 20)
            System.out.print("Cost is $10.50");
        else
            System.out.print("Cannot be shipped: over 20lbs.");
    }
}