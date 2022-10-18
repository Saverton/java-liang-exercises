/**
 * (Displaying the prime numbers) Write a program that displays all the prime 
 * numbers less than 120 in decreasing order. Use the StackOfIntegers class 
 * to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in 
 * reverse order.
 * @author Scott M.
 */

public class Exercise_10_6
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        StackOfIntegers primes = new StackOfIntegers();
        
        for (int i = 1; i < 120; i++)
        {
            if (MyInteger.isPrime(i))
            {
                primes.push(i);
            }
        }
        
        System.out.println("Prime numbers from 120 to 1:");
        while (primes.getSize() > 0)
        {
            System.out.print((primes.getSize() > 1) ? primes.pop() + ", " : primes.pop());
        }
    }
}