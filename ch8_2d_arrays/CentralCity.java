/**
 * Program to determine the central city, the city with the lowest total distance
 * to all other cities, of a list of X city coordinates input
 * by the user, then returns that city with its total distance to all other
 * cities.
 * 
 * @author Scott M.
 * CentralCity.java
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class CentralCity
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner (System.in);
        DecimalFormat fmt1 = new DecimalFormat ("0.#");
        DecimalFormat fmt2 = new DecimalFormat ("0.##");
        double[][] cities;
        double[] distances;
        int numCities, centralCityIndex;
        
        System.out.print("Enter the number of cities: ");
        numCities = kb.nextInt();
        cities = new double[numCities][2];
        
        System.out.print("Enter the coordinates of the cities:\n\t");
        for (int i = 0; i < cities.length; i++)
        {
            for (int j = 0; j < cities[i].length; j++)
            {
                cities[i][j] = kb.nextDouble();
            }
        }
        
        distances = getDistances(cities);
        centralCityIndex = minIndex(distances);
        
        System.out.println("The central city is at (" + fmt1.format(cities[centralCityIndex][0]) + ", " + fmt1.format(cities[centralCityIndex][1]) + ")");
        System.out.print("The total distance to all other cities is " + fmt2.format(distances[centralCityIndex]));
    }
    
    /**
     * Method to get total distances to each coordinate point from one index of an array.
     */
    public static double[] getDistances(double[][] cities)
    {
        double[] distances = new double[cities.length];
        for (int i = 0; i < cities.length; i++)
        {
            double sum = 0;
            for (int j = 0; j < cities.length; j++)
            {
                sum += Math.sqrt(Math.pow(cities[j][0] - cities[i][0], 2) + Math.pow(cities[j][1] - cities[i][1], 2));
            }
            distances[i] = sum;
        }
        return distances;
    }
    
    /**
     * Method to return the minimum index of a 1d array
     */
    public static int minIndex(double[] array)
    {
        double min = array[0];
        int pos = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < min)
            {
                min = array[i];
                pos = i;
            }
        }
        return pos;
    }
}