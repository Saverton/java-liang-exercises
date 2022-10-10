/**
 * (Conversions between Celsius and Fahrenheit) Write a class that contains the following two methods:
 *      /** Convert from Celsius to Fahrenheit /
 *      public static double celsiusToFahrenheit(double celsius)
 *      /** Convert from Fahrenheit to Celsius /
 *      public static double fahrenheitToCelsius(double fahrenheit)
 * The formula for the conversion is:
 *      fahrenheit = (9.0 / 5) * celsius + 32
 *      celsius = (5.0 / 9) * (fahrenheit – 32)
 * Write a test program that invokes these methods to display the following tables:
 *      Celsius  Fahrenheit  |   Fahrenheit  Celsius
 *      40.0     104.0       |   120.0       48.89
 *      39.0     102.2       |   110.0       43.33
 *      ...
 *      32.0     89.6        |   40.0        4.44
 *      31.0     87.8        |   30.0        -1.11
 * @author Scott M.
 */

public class Exercise_6_8 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        double fahrenheit = 120.0, celsius = 40.0;
        System.out.printf("%-10s%-10s | %10s%10s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
        System.out.println("-----------------------------------------");
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.1f%-10.1f | %10.1f%10.2f\n", celsius - i, CelsiusToFahrenheit(celsius - i), fahrenheit - (10 * i), FahrenheitToCelsius(fahrenheit - (10 * i)));
        }
    }
    /**
     * Return the Celsius equivalent of a fahrenheit temperature.
     * @param double: temperature (in fahrenheit)
     * @return double: temperature (in celsius)
     */
    public static double FahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
    /**
     * Return the Fahrenheit equivalent of a celsius temperature.
     * @param double: temperature (in celsius)
     * @return double: temperature (in fahrenheit)
     */
    public static double CelsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }
}