/**
 * Program to calculate wind chill with a given temp and wind speed.
 * 
 * @author Scott M.
 * WindChill.java
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class WindChill {
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