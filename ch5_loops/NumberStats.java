/**
 * Program to calculate and display the mean and standard deviation of 10 numbers.
 * 
 * @author Scott M.
 * NumberStats.java
 */

import java.util.Scanner;

public class NumberStats {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        double input, summation = 0, mean, standardDeviation, squareSummation = 0;
        
        //1. Collect and summate the 10 numbers.
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            input = kb.nextDouble();
            summation += input;
            squareSummation += Math.pow(input, 2);
        }
        //2. Calculate the mean.
        mean = (double)summation / 10;
        //3. Calculate the standard deviation.
        standardDeviation = Math.sqrt((squareSummation - Math.pow(summation, 2) / 10) / (10 - 1));
        //4. Display the mean and standard deviation.
        System.out.println("The mean is " + mean);
        System.out.printf("The standard deviation is %7.5f", standardDeviation);
    }
}