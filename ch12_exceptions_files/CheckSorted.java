/** Program to check if a list of Strings in a text file called 'SortedStrings.txt'
 * are sorted. If not sorted, display the first two Strings that aren't sorted
 * correctly.
 * 
 * @author Scott M.
 * CheckSorted.java
 */

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class CheckSorted {
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
