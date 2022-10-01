/**
 * Program to find the smallest integer n that, when multiplied with a user entered
 * integer m is a perfect square.
 * 
 * @author Scott M.
 * PerfectSquare.java
 */

import java.util.Scanner;
import java.util.ArrayList;

public class PerfectSquare
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        ArrayList<Integer> factors;
        int m, n;
        
        System.out.print("Enter an integer m: ");
        m = kb.nextInt();
        
        factors = getFactors(m);
        
        System.out.println("The smallest number n for m * n to be a perfect square is " +
                         getN(factors));
        System.out.print("m * n is " + getN(factors) * m);
    }
    
    /**
     * Method to return an array list of all factors for an integer m.
     * 
     * @params (integer m)
     * @return (arrayList of factors)
     */
    public static ArrayList<Integer> getFactors(int m)
    {
        ArrayList<Integer> factors = new ArrayList<>();
        
        if (MyInteger.isPrime(m))
        {
            factors.add(m);
        }
        else
        {
            for (int i = m / 2; i > 1; i--)
            {
                if (MyInteger.isPrime(i) && m % i == 0)
                {
                    factors.add(i);
                    m /= i;
                    i++;
                }
            }
        }
        factors.add(1);
        
        return factors;
    }
    
    /**
     * Method to find the product of all elements of an array list that appear
     * an odd number of times.
     * 
     * @params (ArrayList of integers)
     * @return (product of all odd elements)
     */
    public static int getN(ArrayList<Integer> factors)
    {
        int n = 1;
        
        for (int i = MyArrayList.min(factors); i <= MyArrayList.max(factors); i++)
        {
            int count = 0;
            
            for (int j = 0; j < factors.size(); j++)
            {
                if (factors.get(j) == i)
                {
                    count++;
                }
            }
            
            if (MyInteger.isOdd(count))
            {
                n *= i;
            }
        }
        
        return n;
    }
}