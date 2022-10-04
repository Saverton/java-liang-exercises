/**
 * (Science: calculating energy) Write a program that calculates the energy needed 
 * to heat water from an initial temperature to a final temperature. Your program 
 * should prompt the user to enter the amount of water in kilograms and the initial 
 * and final temperatures of the water. The formula to compute the energy is
 *      Q = M * (finalTemperature – initialTemperature) * 4184
 * where M is the weight of water in kilograms, temperatures are in degrees Celsius, 
 * and energy Q is measured in joules.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_2_10 {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double massOfWater, initialTemperature, finalTemperature, energyRequired;
        System.out.print("Enter the amount of water in kilograms: ");
        massOfWater = kb.nextDouble();
        System.out.print("Enter the initial temperature: ");
        initialTemperature = kb.nextDouble();
        System.out.print("Enter the final temperature: ");
        finalTemperature = kb.nextDouble();
        kb.close();
        energyRequired = massOfWater * (finalTemperature - initialTemperature) * 4184;
        System.out.print("The energy needed is " + energyRequired);
    }
}