/**
 * (Science: wind-chill temperature) How cold is it outside? The temperature alone is not enough to provide the answer. 
 * Other factors including wind speed, relative humidity, and sunshine play important roles in determining coldness outside. 
 * In 2001, the National Weather Service (NWS) implemented the new wind-chill temperature to measure the coldness using 
 * temperature and wind speed. The formula is:
 *      temperature(with wind chill) = 35.74 + 0.6215ta - 35.75v^(0.16) + 0.4275tav^(0.16)
 * where ta is the outside temperature measured in degrees Fahrenheit and v is the 
 * speed measured in miles per hour. The formula 
 * cannot be used for wind speeds below 2 mph or temperatures below -58 ºF or 
 * above 41ºF.
 * Write a program that prompts the user to enter a temperature between -58 ºF and 
 * 41ºF and a wind speed greater than or equal to 2 and displays the wind-chill temperature.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_2_17 {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double realTemperature, windSpeed, windChillTemperature;
        System.out.print("Enter the temperature in Fahrenheit between -58\u00b0F and 41\u00b0F: ");
        realTemperature = kb.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        windSpeed = kb.nextDouble();
        kb.close();
        windChillTemperature = 35.74 + (0.6215 * realTemperature) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * realTemperature * Math.pow(windSpeed, 0.16));
        System.out.print("The wind chill index is " + windChillTemperature);
    }
}