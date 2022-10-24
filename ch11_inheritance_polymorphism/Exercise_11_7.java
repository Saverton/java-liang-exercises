/**
 * (Shuffle ArrayList) Write the following method that shuffles the elements in 
 * an ArrayList of integers.
 * @author Scott M. 
 */

 import java.util.ArrayList;
 import java.util.Scanner;

public class Exercise_11_7 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = getUserCreatedArrayList();
        shuffle(list);
        System.out.print("Shuffled list is:\n" + list);
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
     * Method to shuffle the elements of an ArrayList of Integers.
     * 
     * @params (ArrayList to be shuffled)
     */
    public static void shuffle(ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            int indexToSwitch = (int)(Math.random() * (list.size() - 1));
            int temp = list.get(i);
            list.set(i, list.get(indexToSwitch));
            list.set(indexToSwitch, temp);
        }
    }
}