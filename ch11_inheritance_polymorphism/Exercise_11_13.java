/**
 * (Remove duplicates) Write a method that removes the duplicate elements from 
 * an array list of integers using the following header:
 *      public static void removeDuplicate(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter 10 integers to a list and displays 
 * the distinct integers separated by exactly one space.
 * @author Scott M.
 */

 import java.util.ArrayList;
 import java.util.Scanner;

public class Exercise_11_13 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(kb.nextInt());
        }
        kb.close();
        removeDuplicates(list);
        System.out.print("The distinct integers are ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
    }

    /**
     * Remove all duplicate elements from an ArrayList of Integers.
     * @param list ArrayList<Integer>: list
     */
    public static void removeDuplicates(ArrayList<Integer> list)
    {
        for (int i = list.size() - 1; i >= 0; i--)
        {
            int temp = list.get(i);
            list.remove(i);
            if (!list.contains(temp))
            {
                list.add(i, temp);
            }
        }
    }
}
