/**
 * (Sort ArrayList) Write the following method that sorts an ArrayList of 
 * numbers:
 *      public static void sort(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter 5 numbers, stores them in an 
 * array list, and displays them in increasing order
 * @author Scott M.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_11 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter 5 Integers: ");
        for (int i = 0; i < 5; i++) {
            list.add(kb.nextInt());
        }
        kb.close();
        sort(list);
        System.out.print(list);
    }

    /**
     * Sort an arrayList of integers.
     * @params list ArrayList<Integer>: integer list
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
}
