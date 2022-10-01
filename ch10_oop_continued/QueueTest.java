/**
 * Program to test the Queue class by creating a Queue of length 20 with the summation
 * of that number. Then, dequeue each element and display.
 * 
 * @author Scott M.
 * QueueTest.java
 */

public class QueueTest
{
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