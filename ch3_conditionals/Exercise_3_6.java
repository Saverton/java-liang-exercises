/**
 * Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to 
 * let the user enter weight, feet, and inches. For example, if a person is 5 feet and 10 
 * inches, you will enter 5 for feet and 10 for inches. 
 * @author Scott M.
 * BMI.java
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise_3_6 {
    /**
     * Main method to write program.
     */
    public static void main(String[] args)
    {
        int feet, inches, pounds;
        double meters, kg, bmi;
        Scanner kb = new Scanner (System.in);
        DecimalFormat fmt = new DecimalFormat ("0.###");
        
        System.out.print("Enter weight in lbs: ");
        pounds = kb.nextInt();
        System.out.print("Enter feet of height: ");
        feet = kb.nextInt();
        System.out.print("Enter inches of height: ");
        inches = kb.nextInt();
        kb.close();
        
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