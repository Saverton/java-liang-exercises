/**
 * Class to define the Queue object type, similar to the Stack class but using
 * a first-in-first-out order to retrieve data.
 * 
 * @author Scott M.
 * Queue.java
 */

public class Queue
{
    private int[] elements;
    private int size;
    
    public Queue()
    {
        this.elements = new int[8];
        this.size = 0;
    }
    
    public void enqueue(int val)
    {
        if (this.size + 1 > this.elements.length)
        {
            int[] temp = new int[this.elements.length * 2];
            System.arraycopy(this.elements, 0, temp, 0, this.elements.length);
            this.elements = temp;
        }
        this.elements[size] = val;
        this.size++;
    }
    
    public int dequeue()
    {
        int val = this.elements[0];
        this.size = Math.max(0, this.getSize() - 1);
        for (int i = 0; i < this.getSize(); i++)
        {
            this.elements[i] = this.elements[i + 1];
        }
        this.elements[this.getSize()] = 0;
        return val;
    }
    
    public void empty()
    {
        this.elements = new int[0];
        this.size = 0;
    }
    
    public int getSize()
    {
        return this.size;
    }
}