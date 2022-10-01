/**
 * Class to define the Stack of Integers object
 * 
 * @author Scott M.
 * StackOfIntegers.java
 */

public class StackOfIntegers
{
    /**
     * Data fields
     */
    private int[] stack;
    private int size;
    public static final int DEFAULT_SIZE = 16;
    
    /**
     * Behaviors
     */
    public StackOfIntegers(int capacity)
    {
        this.stack = new int[capacity];
        this.size = 0;
    }
    
    public StackOfIntegers()
    {
        this(DEFAULT_SIZE);
    }
    
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
    
    public int pop()
    {
        return this.stack[--size];
    }
    
    public int getSize()
    {
        return this.size;
    }
    
    public int peek()
    {
        return this.stack[size - 1];
    }
}