/**
 * (Combine two lists) Write a method that returns the union of two array lists of 
 * integers using the following header:
 *      public static ArrayList<Integer> union(
 *          ArrayList<Integer> list1, ArrayList<Integer> list2)
 * For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is 
 * {2, 3, 1, 5, 3, 4, 6}. Write a test program that prompts the user to enter two lists, 
 * each with five integers, and displays their union. The numbers are separated by 
 * exactly one space in the output. 
 * @author Scott M.
 */

 import java.util.ArrayList;
 import java.util.Scanner;

public class Exercise_11_14 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3;
        System.out.print("Enter five integers for list1: ");
        for (int i = 0; i < 5; i++) {
            list1.add(kb.nextInt());
        }
        System.out.print("Enter five integers for list2: ");
        for (int i = 0; i < 5; i++) {
            list2.add(kb.nextInt());
        }
        kb.close();
        list3 = union(list1, list2);
        System.out.print("The combined list is ");
        for (int i = 0; i < list3.size(); i++) {
            System.out.print(" " + list3.get(i));
        }
    }

    /**
     * Return an ArrayList that is the union of two ArrayLists of Integers.
     * @param list1 ArrayList<Integer>: first arrayList
     * @param list2 ArrayList<Integer>: second arrayList
     * @return ArrayList<Integer>: unioned arrayList
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
}
