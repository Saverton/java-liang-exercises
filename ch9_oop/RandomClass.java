/**
 * Program to test the Random class by generating the first 50 ints using the
 * seed "1000"
 * 
 * @author Scott M.
 * RandomClass.java
 */

import java.util.Random;

public class RandomClass
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