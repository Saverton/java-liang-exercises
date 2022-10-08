/**
 * (Statistics: compute mean and standard deviation) In business applications, you 
 * are often asked to compute the mean and standard deviation of data. The mean is 
 * simply the average of the numbers. The standard deviation is a statistic that tells
 * you how tightly all the various data are clustered around the mean in a set of data. 
 * For example, what is the average age of the students in a class? How close are the 
 * ages? If all the students are the same age, the deviation is 0.
 * Write a program that prompts the user to enter ten numbers, and displays the 
 * mean and standard deviations of these numbers using the following formula:
 *                                                      _________________
 *              x1 + x2 + ... + xn                     / (x1^2 + x2^2 + ... + xn^2) - (x1 + x2 + ... + xn)^2 / n
 *      mean = --------------------     deviation =   / ---------------------------------------------------------
 *                      n                           \/                            n - 1
 * @author Scott M.
 * NumberStats.java
 */

import java.util.Scanner;

public class Exercise_5_45 {
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
        kb.close();
        //2. Calculate the mean.
        mean = (double)summation / 10;
        //3. Calculate the standard deviation.
        standardDeviation = Math.sqrt((squareSummation - Math.pow(summation, 2) / 10) / (10 - 1));
        //4. Display the mean and standard deviation.
        System.out.println("The mean is " + mean);
        System.out.printf("The standard deviation is %7.5f", standardDeviation);
    }
}