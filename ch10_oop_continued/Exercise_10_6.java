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

class StackOfIntegers
{
    private int[] stack;
    private int size;
    public static final int DEFAULT_SIZE = 16;
    
    /**
     * Construct a new Stack of Integers with a specific capacity.
     * @param capacity int: stack capacity
     */
    public StackOfIntegers(int capacity)
    {
        this.stack = new int[capacity];
        this.size = 0;
    }
    
    /**
     * Construct a default stack of Integers with a capacity of 16.
     */
    public StackOfIntegers()
    {
        this(DEFAULT_SIZE);
    }
    
    /**
     * Push a new value into the stack of integers.
     * @param val int: integer value
     */
    public void push(int val)
    {
        if (this.size + 1 > this.stack.length)
        {
            int[] newStack = new int[this.stack.length * 2];
            System.arraycopy(this.stack, 0, newStack, 0, this.stack.length);
            this.stack = newStack;
        }
        this.stack[this.size] = val;
        this.size++;
    }
    
    /**
     * Return and remove the top item in the stack.
     * @return int: integer
     */
    public int pop()
    {
        return this.stack[--size];
    }
    
    /**
     * Return the size of this Stack of Integers.
     * @return int: stack size
     */
    public int getSize()
    {
        return this.size;
    }
    
    /**
     * Return the top item in the stack without removing it.
     * @return int: integer
     */
    public int peek()
    {
        return this.stack[size - 1];
    }
}