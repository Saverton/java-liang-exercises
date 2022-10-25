/**
 * (Algebra: perfect square) Write a program that prompts the user to enter an integer 
 * m and find the smallest integer n such that m * n is a perfect square. (Hint:
 * Store all smallest factors of m into an array list. n is the product of the factors that 
 * appear an odd number of times in the array list. For example, consider m = 90,
 * store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times 
 * in the array list. So, n is 10.)
 * @author Scott M.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise_11_17
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
        kb.close();
        
        factors = getFactors(m);
        n = getN(factors);
        System.out.println("The smallest number n for m * n to be a perfect square is " +
                         n);
        System.out.print("m * n is " + n * m);
    }
    
    /**
     * Return an ArrayList of prime factors of an integer.
     * @param m int: integer
     * @return ArrayList<Integer>: list of factors
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
     * Return n, the product of all integers that appear an odd amount of times in an ArrayList.
     * @param factors ArrayList<Integer>: list of prime factors
     * @return int: n
     */
    public static int getN(ArrayList<Integer> factors)
    {
        int n = 1;
        
        for (int i = min(factors); i <= max(factors); i++)
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

    /**
     * Return the maximum value in an ArrayList of Integers.
     * @param list ArrayList<Integer>: list of Integers
     * @return Integer: max element
     */
    public static Integer max(ArrayList<Integer> list)
    {
        if (list.size() == 0 || list == null)
        {
            return null;
        }
        int max = list.get(0);
        
        for (int i = 1; i < list.size(); i++)
        {
            if (list.get(i) > max)
            {
                max = list.get(i);
            }
        }
        
        return max;
    }   

    /**
     * Return the minimum element of an Integer ArrayList.
     * @param list ArrayList<Integer>: list of Integers
     * @return Integer: min element
     */
    public static Integer min(ArrayList<Integer> list)
    {
        if (list.size() == 0 || list == null)
        {
            return null;
        }
        int min = list.get(0);
        
        for (int i = 1; i < list.size(); i++)
        {
            if (list.get(i) < min)
            {
                min = list.get(i);
            }
        }
        
        return min;
    }
}