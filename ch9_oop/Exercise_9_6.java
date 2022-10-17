/**
 * (Stopwatch) Design a class named StopWatch. The class contains:
 *  ■ Private data fields startTime and endTime with getter methods.
 *  ■ A no-arg constructor that initializes startTime with the current time.
 *  ■ A method named start() that resets the startTime to the current time.
 *  ■ A method named stop() that sets the endTime to the current time.
 *  ■ A method named getElapsedTime() that returns the elapsed time for the 
 * stopwatch in milliseconds.
 * Draw the UML diagram for the class and then implement the class. Write a test 
 * program that measures the execution time of sorting 100,000 numbers using 
 * selection sort.
 * @author Scott M.
 */

import java.util.Random;

public class Exercise_9_6 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        StopWatch timer = new StopWatch();
        final int ARRAY_LENGTH = 100000;
        int[] array = new int[ARRAY_LENGTH];
        Random gen = new Random();
        
        for (int i = 0; i < array.length; i++)
        {
            array[i] = gen.nextInt(100);
        }
        
        timer.start();
        selectionSort(array);
        timer.stop();
        
        System.out.print("Time in seconds was " + (timer.getElapsedTime() / 1000.0));
    }

    /**
     * Sort an integer array using the selection sort.
     * @param array int[]: integer array
     */
    public static void selectionSort(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            int min = array[i];
            int pos = i;
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] < min)
                {
                    min = array[j];
                    pos = j;
                }
            }
            int temp = array[i];
            array[i] = array[pos];
            array[pos] = temp;
        }
    }
    
}

class StopWatch
{
    private long startTime;
    private long endTime;
    
    /**
     * Construct a new StopWatch object with a startTime of the current time.
     */
    public StopWatch()
    {
        startTime = new java.util.Date().getTime();
    }
    
    /**
     * Start the StopWatch by resetting the startTime to the current time.
     */
    public void start()
    {
        startTime = new java.util.Date().getTime();
    }
    
    /**
     * Stop the StopWatch by setting the endTime to the current time.
     */
    public void stop()
    {
        endTime = new java.util.Date().getTime();
    }
    
    /**
     * Return the elapsed time of the stopwatch.
     * @return long: elapsed time in milliseconds.
     */
    public long getElapsedTime()
    {
        return endTime - startTime;
    }
    
    /**
     * Return the start time of the stopwatch.
     * @return long: start time in milliseconds
     */
    public long getStartTime()
    {
        return startTime;
    }
    
    /**
     * Return the end time of the stopwatch.
     * @return long: end time in milliseconds
     */
    public long getEndTime()
    {
        return endTime;
    }
}