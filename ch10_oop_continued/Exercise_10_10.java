/**
 * (The Queue class) Section 10.6 gives a class for Stack. Design a class named 
 * Queue for storing integers. Like a stack, a queue holds elements. In a stack, the 
 * elements are retrieved in a last-in first-out fashion. In a queue, the elements are 
 * retrieved in a first-in first-out fashion. The class contains:
 *  ■ An int[] data field named elements that stores the int values in the 
 *    queue.
 *  ■ A data field named size that stores the number of elements in the queue.
 *  ■ A constructor that creates a Queue object with default capacity 8.
 *  ■ The method enqueue(int v) that adds v into the queue.
 *  ■ The method dequeue() that removes and returns the element from the 
 *    queue.
 *  ■ The method empty() that returns true if the queue is empty.
 *  ■ The method getSize() that returns the size of the queue.
 * Draw an UML diagram for the class. Implement the class with the initial array 
 * size set to 8. The array size will be doubled once the number of the elements 
 * exceeds the size. After an element is removed from the beginning of the array, 
 * you need to shift all elements in the array one position the left. Write a test 
 * program that adds 20 numbers from 1 to 20 into the queue and removes these 
 * numbers and displays them.
 * @author Scott M.
 */

public class Exercise_10_10 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Queue q = new Queue();
        int sum = 0;
        for (int i = 1; i <= 20; i++)
        {
            sum += i;
            q.enqueue(sum);
        }
        
        while (q.getSize() > 0)
        {
            System.out.print(q.dequeue() + " ");
        }
    }
}

class Queue
{
    private int[] elements;
    private int size;
    
    /**
     * construct a new empty Queue.
     */
    public Queue()
    {
        this.elements = new int[8];
        this.size = 0;
    }
    
    /**
     * Append a new value onto the end of a queue.
     * @param val int: value to add
     */
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
    
    /**
     * Return the first element in the queue, remove that element from the queue.
     * @return int: element
     */
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
    
    /**
     * Remove all elements from the queue
     */
    public void empty()
    {
        this.elements = new int[0];
        this.size = 0;
    }
    
    /**
     * Return the size (number of elements) in the queue.
     * @return int: size of queue
     */
    public int getSize()
    {
        return this.size;
    }
}