/**
 * (Cost of driving) Write a program that prompts the user to enter the distance to 
 * drive, the fuel efficiency of the car in miles per gallon, and the price per gallon, 
 * and displays the cost of the trip. 
 * @author Scott M.
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Exercise_2_23 {
    /** Main method to run program */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        double distance, fuelEfficiency, pricePerGallon, tripCost;
        System.out.print("Enter the driving distance: ");
        distance = kb.nextDouble();
        System.out.print("Enter miles per gallon: ");
        fuelEfficiency = kb.nextDouble();
        System.out.print("Enter price per gallon: ");
        pricePerGallon = kb.nextDouble();
        kb.close();
        tripCost = (distance / fuelEfficiency) * pricePerGallon;
        System.out.print("The cost of driving is " + money.format(tripCost));
    }
}