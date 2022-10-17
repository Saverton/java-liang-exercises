/**
 * (Displaying the prime factors) Write a program that prompts the user to enter 
 * a positive integer and displays all its smallest factors in decreasing order. For 
 * example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
 * 2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and 
 * retrieve and display them in reverse order.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_10_5
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
        kb.close();

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