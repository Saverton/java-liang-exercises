/**
 * Program to display Fahrenheit to Celsius and Celsius to Fahrenheit tables.
 * 
 * @author Scott M.
 * FToCTable.java
 */

public class FToCTable {
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
     * Method to convert Fahrenheit to Celsius.
     */
    public static double FahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
    /**
     * Method to convert Celsius to Fahrenheit.
     */
    public static double CelsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }
}