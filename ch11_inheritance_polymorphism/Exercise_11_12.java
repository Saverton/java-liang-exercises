/**
 * (Sum ArrayList) Write the following method that returns the sum of all numbers 
 * in an ArrayList:
 *      public static double sum(ArrayList<Double> list)
 * Write a test program that prompts the user to enter 5 numbers, stores them in an 
 * array list, and displays their sum.
 * @author Scott M.
 */

 import java.util.Scanner;
 import java.util.ArrayList;

public class Exercise_11_12 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            list.add(kb.nextInt());
        }
        kb.close();
        System.out.print("Sum of elements is " + sum(list));
    }

    /**
     * Return the sum of all elements in an array List.
     * @param list ArrayList<Integer>: integer list
     * @return int: sum of elements
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
}
