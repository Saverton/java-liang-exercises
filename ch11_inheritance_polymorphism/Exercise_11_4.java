/**
 * (Maximum element in ArrayList) Write the following method that returns the 
 * maximum value in an ArrayList of integers. The method returns null if the 
 * list is null or the list size is 0.
 *      public static Integer max(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter a sequence of numbers ending 
 * with 0, and invokes this method to return the largest number in the input.
 * @author Scott M.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_4 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = getUserCreatedArrayList();
        System.out.print("Maximum element is " + max(list));
    }

    /**
     * Return an array list created with user input.
     * @return ArrayList<Integer>: created list
     */
    public static ArrayList<Integer> getUserCreatedArrayList() {
        Scanner kb = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int input;
        System.out.println("Enter a list of integers ending with 0:");
        do {
            input = kb.nextInt();
            list.add(input);
        } while(input != 0);
        kb.close();
        return list;
    }

    /**
     * Return the maximum value in an ArrayList of Integers.
     * @param list ArrayList<Integer>: list of Integers
     * @return Integer: max element
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
}