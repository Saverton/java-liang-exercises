/**
 * Program to calculate BMI from given height(in), height(ft), and weight(lbs).
 * 
 * @author Scott M.
 * BMI.java
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class BMI {
    /**
     * Main method to write program.
     */
    public static void main(String[] args)
    {
        int feet, inches, pounds, bmilvl;
        double meters, kg, bmi;
        Scanner kb = new Scanner (System.in);
        DecimalFormat fmt = new DecimalFormat ("0.###");
        
        System.out.print("Enter weight in lbs: ");
        pounds = kb.nextInt();
        System.out.print("Enter feet of height: ");
        feet = kb.nextInt();
        System.out.print("Enter inches of height: ");
        inches = kb.nextInt();
        
        inches += (12 * feet);
        meters = (2.54 * inches) / 100;
        kg = pounds * 0.45;
        bmi = kg / Math.pow(meters, 2);
        
        System.out.println("BMI is " + fmt.format(bmi));
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese (Megachungus)");
    }
}