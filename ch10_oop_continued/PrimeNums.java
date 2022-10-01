/**
 * Program to create an Integer Stack that stores all prime numbers less than 120,
 * then displays the stack (in decreasing order);
 * 
 * @author Scott M.
 * PrimeNums.java
 */

public class PrimeNums
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