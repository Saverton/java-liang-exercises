/**
 * Program to use the Bin class to find a way to pack a user defined amount of objects
 * of user defined weight.
 * 
 * @author Scott M.
 * BinPacking.java
 */

import java.util.ArrayList;
import java.util.Scanner;

public class BinPacking
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        ArrayList<Bin> bins = new ArrayList<>();
        int[] items;
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter the number of objects: ");
        items = new int[kb.nextInt()];
        
        System.out.print("Enter the weights of the objects: ");
        for (int i = 0; i < items.length; i++)
        {
            items[i] = kb.nextInt();
        }
        
        bins.add(new Bin());
        for (int i = 0; i < items.length; i++)
        {
            for (int j = 0; j < bins.size(); j++)
            {
                if (bins.get(j).pack(items[i]))
                {
                    break;
                }
                else if (j + 1 == bins.size())
                {
                    bins.add(new Bin());
                }
            }
        }
        
        for (int i = 0; i < bins.size(); i++)
        {
            System.out.println("Container " + (i + 1) + " contains objects with " +
                               bins.get(i).toString());
        }
    }
}