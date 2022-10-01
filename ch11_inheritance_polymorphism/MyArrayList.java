/**
 * My implementation of various method(s) dealing with Array Lists.
 * 
 * @author Scott M.
 * MyArrayList.java
 */

import java.util.ArrayList;

public class MyArrayList
{
    /**
     * Main method to test program.
     */
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3;
        
        for (int i = 0; i < 10; i++)
        {
            list.add(i);
        }
        System.out.println(list);
        
        System.out.println("Max value is " + max(list));
        
        shuffle(list);
        System.out.println(list);
        
        sort(list);
        System.out.println(list);
        
        System.out.println("Sum is: " + sum(list));
        
        for (int i = 0; i < 10; i++)
        {
            list.add(i);
        }
        shuffle(list);
        System.out.println(list);
        
        removeDuplicates(list);
        System.out.println(list);
        
        for (int i = 5; i < 15; i++)
        {
            list2.add(i);
        }
        System.out.println(list2);
        list3 = union(list, list2);
        System.out.print(list3);
    }
    
    /**
     * Method to retrieve the maximum value in an array list of Integer objects.
     * 
     * @params (Array List of integers)
     * @return (maximum integer in Array List)
     */
    public static Integer max(ArrayList<Integer> list)
    {
        if (list.size() == 0 || list == null)
        {
            return null;
        }
        int max = list.get(0);
        
        for (int i = 1; i < list.size(); i++)
        {
            if (list.get(i) > max)
            {
                max = list.get(i);
            }
        }
        
        return max;
    }
    
    /**
     * Method to retrieve the maximum value in an array list of Integer objects.
     * 
     * @params (Array List of integers)
     * @return (maximum integer in Array List)
     */
    public static Integer min(ArrayList<Integer> list)
    {
        if (list.size() == 0 || list == null)
        {
            return null;
        }
        int min = list.get(0);
        
        for (int i = 1; i < list.size(); i++)
        {
            if (list.get(i) < min)
            {
                min = list.get(i);
            }
        }
        
        return min;
    }
    
    /**
     * Method to shuffle the elements of an ArrayList of Integers.
     * 
     * @params (ArrayList to be shuffled)
     */
    public static void shuffle(ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            int indexToSwitch = (int)(Math.random() * (list.size() - 1));
            Integer temp = new Integer(list.get(i));
            list.set(i, list.get(indexToSwitch));
            list.set(indexToSwitch, temp);
        }
    }
    
    /**
     * Method to sort an ArrayList of Integers.
     * 
     * @params (ArrayList to be sorted)
     */
    public static void sort(ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size() - 1; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++)
            {
                if (list.get(j) < list.get(minIndex))
                {
                    minIndex = j;
                }
            }
            int temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }
    
    /**
     * Method to sum all elements in an ArrayList of Integers.
     * 
     * @params (ArrayList to be summed)
     * @return (sum of elements)
     */
    public static int sum(ArrayList<Integer> list)
    {
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
        {
            sum += list.get(i);
        }
        return (sum);
    }
    
    /**
     * Method to remove duplicate values in an ArrayList of Integers.
     * 
     * @params (ArrayList of Integers)
     */
    public static void removeDuplicates(ArrayList<Integer> list)
    {
        for (int i = list.size() - 1; i >= 0; i--)
        {
            int temp = list.get(i);
            list.remove(i);
            if (!list.contains(new Integer(temp)))
            {
                list.add(i, temp);
            }
        }
    }
    
    /**
     * Method to combine two Integer arrayLists into one.
     * 
     * @params (arrayList1, arrayList2)
     * @return (combined arrayList)
     */
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        ArrayList<Integer> list3 = new ArrayList<>();
        
        for (int i = 0; i < Math.max(list1.size(), list2.size()); i++)
        {
            if (i < list1.size())
            {
                list3.add(i, list1.get(i));
            }
            if (i < list2.size())
            {
                list3.add(list2.get(i));
            }
        }
        
        return list3;
    }
    
    /**
     * Method that returns an array list of chars from a String.
     * 
     * @params (any String)
     * @return (ArrayList of chars representing String)
     */
    public static ArrayList<Character> toCharacterArray(String s)
    {
        ArrayList<Character> chars = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++)
        {
            chars.add(s.charAt(i));
        }
        
        return chars;
    }
}