/** 
 * (Data sorted?) Write a program that reads the strings from file SortedStrings.
 * txt and reports whether the strings in the files are stored in increasing order. 
 * If the strings are not sorted in the file, displays the first two strings that are out 
 * of the order.
 * @author Scott M.
 */

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise_12_21 {
    /** Main method to run program. */
    public static void main(String[] args) {
        try {
            File file = new File(args[0]);
            Scanner input = new Scanner(file);
            ArrayList<String> strings = new ArrayList<>();
            boolean sorted = true;
            
            while (input.hasNext()) {
                strings.add(input.nextLine());
            }
            input.close();
            
            for (int i = 1; i < strings.size(); i++) {
                if (strings.get(i).compareTo(strings.get(i - 1)) < 0) {
                    System.out.print(strings.get(i - 1) + "\n" + strings.get(i));
                    sorted = false;
                }
            }
            
            if (sorted)
                System.out.print("The list is sorted.");
        }
        catch (java.io.IOException ex) {
            System.out.print("File not found.");
        }
    }
}
