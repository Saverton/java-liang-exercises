/**
 * (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in 
 * a double value from the console, then converts it to Fahrenheit and displays the 
 * result. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_2_1 {
    /** Main method to run program */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.print("Enter a degree in Celsius : ");
        celsius = kb.nextDouble();
        kb.close();
        fahrenheit = (celsius * 1.8) + 32;
        System.out.print(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}