/**
 * (Order three cities) Write a program that prompts the user to enter three cities and 
 * displays them in ascending order. 
 * @author Scott M.
 * OrderCities.java
 */

import java.util.Scanner;

public class Exercise_4_24 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String city1, city2, city3, citya, cityb, cityc;
        
        System.out.print("Enter a city: ");
        city1 = kb.nextLine();
        System.out.print("Enter a second city: ");
        city2 = kb.nextLine();
        System.out.print("Enter a third city: ");
        city3 = kb.nextLine();
        kb.close();
        
        if (city1.compareToIgnoreCase(city2) < 0) {
            citya = city1;
            cityb = city2;
        }
        else {
            citya = city2;
            cityb = city1;
        }
        if (citya.compareToIgnoreCase(city3) < 0) {
            if (cityb.compareTo(city3) < 0) {
                cityc = city3;
            }
            else {
                cityc = cityb;
                cityb = city3;
            }
        }
        else {
            cityc = cityb;
            cityb = citya;
            citya = city3;
        }
        
        System.out.print("The cities in alphabetical order are: " + citya + ", " + cityb + ", " + cityc + ".");
    }
}