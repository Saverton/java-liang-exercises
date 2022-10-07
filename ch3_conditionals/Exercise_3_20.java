/**
 * (Science: wind-chill temperature) Programming Exercise 2.17 gives a formula 
 * to compute the wind-chill temperature. The formula is valid for temperatures in 
 * the range between −58ºF and 41ºF and wind speed greater than or equal to 2.
 * Write a program that prompts the user to enter a temperature and a wind speed. 
 * The program displays the wind-chill temperature if the input is valid; otherwise, 
 * it displays a message indicating whether the temperature and/or wind speed is 
 * invalid.
 * @author Scott M.
 * WindChill.java
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise_3_20 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //declare windspeed and temp vars, start scanner
        Scanner kb = new Scanner (System.in);
        DecimalFormat fmt = new DecimalFormat ("0.###");
        double windChill,windSpeed, temp;
        
        //prompt user and get windspeed and temp
        System.out.print("Enter Wind Speed (mph): ");
        windSpeed = kb.nextDouble();
        System.out.print("Enter temperature (F): ");
        temp = kb.nextDouble();
        kb.close();
        
        //determine if windspeed and temp are valid
        if (windSpeed < 2)
            System.out.print("Wind Speed must be at least 2mph.");
        else if (temp < -58 || temp > 41)
            System.out.print("Temp must be between -58F and 41F.");
        else {
           //calculate and display wind chill
           windChill = 35.74 + (0.6125 * temp) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temp * Math.pow(windSpeed, 0.16));
           System.out.print("Wind Chill Temperature is " + fmt.format(windChill) + " degrees Fahrenheit.");
        }
    }
}