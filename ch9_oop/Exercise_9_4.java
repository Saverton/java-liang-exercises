/**
 * (Use the Random class) Write a program that creates a Random object with seed 
 * 1000 and displays the first 50 random integers between 0 and 100 using the 
 * nextInt(100) method
 * @author Scott M.
 */

import java.util.Random;

public class Exercise_9_4
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Random r = new Random(1000);
        for (int i = 0; i < 50; i++)
        {
            System.out.println(r.nextInt(100));
        }
    }
}