/**
 * (Cost of shipping) A shipping company uses the following function to calculate 
 * the cost (in dollars) of shipping based on the weight of the package (in pounds). 
 *        { 3.5, if 0 6 w 6 = 1
 *        { 5.5, if 1 6 w 6 = 3
 * c(w) = { 8.5, if 3 6 w 6 = 10
 *        { 10.5, if 10 6 w 6 = 20
 * Write a program that prompts the user to enter the weight of the package and 
 * display the shipping cost. If the weight is greater than 50, display a message “the 
 * package cannot be shipped.”
 * @author Scott M.
 * CostOfShipping.java
 */

import java.util.Scanner;

public class Exercise_3_18 {
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
        kb.close();
        
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