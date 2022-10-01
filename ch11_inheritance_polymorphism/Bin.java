/**
 * Bin class represents a bin that can carry 10lbs of items. Each bin has an ArrayList
 * of Integers representing the weight of each of its contents.
 * 
 * @author Scott M.
 * Bin.java
 */

import java.util.ArrayList;

public class Bin
{
    private ArrayList<Integer> contents;
    public static final int MAX_CAPACITY = 10;
    
    /**
     * construct a bin with empty contents.
     */
    public Bin()
    {
        contents = new ArrayList<>();
    }
    
    /**
     * return the ArrayList of contents.
     * 
     * @return (box content)
     */
    public ArrayList<Integer> getContents()
    {
        return (contents);
    }
    
    /**
     * return the total weight in the box.
     * 
     * @return (total weight)
     */
    public int getWeight()
    {
        return (MyArrayList.sum(contents));
    }
    
    /**
     * add an item to the bin, returns true if item is boxed, false if it doesn't
     * fit.
     * 
     * @params (weight of item to be added)
     * @return (true: item was packed, false: item wasn't packed)
     */
    public boolean pack(int w)
    {
        boolean packed = false;
        
        if (getWeight() + w < MAX_CAPACITY)
        {
            contents.add(w);
            packed = true;
        }
        
        return packed;
    }
    
    /**
     * return a string with the weights of all contents.
     * 
     * @return (string of all content weights)
     */
    public String toString()
    {
        String output = "weight ";
        
        for (int i = 0; i < contents.size(); i++)
        {
            output += contents.get(i);
        }
        
        return output;
    }
}