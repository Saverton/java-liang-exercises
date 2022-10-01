/**
 * Program to create a Stopwatch class that can measure the execution time of other
 * programs.
 * 
 * @author Scott M.
 * StopWatch.java
 */

import java.util.Date;
import java.util.Random;

public class StopWatch
{
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
    
    /**
     * Class to define a StopWatch object
     */
    private long startTime;
    private long endTime;
    
    public StopWatch()
    {
        startTime = new java.util.Date().getTime();
    }
    
    public void start()
    {
        startTime = new java.util.Date().getTime();
    }
    
    public void stop()
    {
        endTime = new java.util.Date().getTime();
    }
    
    public long getElapsedTime()
    {
        return endTime - startTime;
    }
    
    public long getStartTime()
    {
        return startTime;
    }
    
    public long getEndTime()
    {
        return endTime;
    }
}