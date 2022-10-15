/**
 * (Central city) Given a set of cities, the central city is the city that has the shortest 
 * total distance to all other cities. Write a program that prompts the user to enter 
 * the number of the cities and the locations of the cities (coordinates), and finds 
 * the central city and its total distance to all other cities. 
 * @author Scott M.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise_8_21
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
        kb.close();
        
        distances = getDistances(cities);
        centralCityIndex = minIndex(distances);
        
        System.out.println("The central city is at (" + fmt1.format(cities[centralCityIndex][0]) + ", " + fmt1.format(cities[centralCityIndex][1]) + ")");
        System.out.print("The total distance to all other cities is " + fmt2.format(distances[centralCityIndex]));
    }
    
    /**
     * Return a double array of total distances from each city to every other city.
     * @param cities double[][]: array of cities
     * @return double[]: list of total distances from each city to every other city.
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
     * Return the minimum index of a double array.
     * @param array double[]: array to search
     * @return int: index of minimum value
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