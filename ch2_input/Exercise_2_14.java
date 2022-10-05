/**
 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of 
 * health on weight. It can be calculated by taking your weight in kilograms and 
 * dividing by the square of your height in meters. Write a program that prompts the 
 * user to enter a weight in pounds and height in inches and displays the BMI. Note 
 * that one pound is 0.45359237 kilograms and one inch is 0.0254 meters. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_2_14 {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double heightInches, heightMeters, weightPounds, weightKilograms, bmi;
        final double METERS_PER_INCH = 0.0254, KILOGRAMS_PER_POUND = 0.45359237;
        System.out.print("Enter your weight in pounds: ");
        weightPounds = kb.nextDouble();
        System.out.print("Enter your height in inches: ");
        heightInches = kb.nextDouble();
        kb.close();
        weightKilograms = weightPounds * KILOGRAMS_PER_POUND;
        heightMeters = heightInches * METERS_PER_INCH;
        bmi = weightKilograms / (Math.pow(heightMeters, 2));
        System.out.print("BMI is " + bmi);
    }
}