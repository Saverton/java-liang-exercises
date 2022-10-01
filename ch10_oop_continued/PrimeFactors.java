/**
 * Program to intake an integer value from the user, create a stack object containing
 * all of it's prime factors, then display that stack by popping it.
 * 
 * @author Scott M.
 * PrimeFactors.java
 */

import java.util.Scanner;

public class PrimeFactors
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        StackOfIntegers myStack = new StackOfIntegers();
        int value;
        
        System.out.print("Enter an integer: ");
        value = kb.nextInt();

        for (int i = 2; value > 1; i++)
        {
            if (MyInteger.isPrime(i) && value % i == 0)
            {
                value /= i;
                myStack.push(i);
                i--;
                continue;
            }
        }
        
        System.out.print("Smallest prime factors are ");
        for (int i = 0; i < myStack.getSize(); )
        {
            System.out.print((myStack.getSize() > 1) ? myStack.pop() + ", " : myStack.pop());
        }
    }
}