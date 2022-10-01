/** Program to get the ranking of a certain baby name in a certain year from 2001 to
 * 2010 based on text files ranking the top 100 male and female baby names in those
 * years.
 * 
 * @author Scott M.
 * NameRanking.java
 */

import java.io.File;
import java.util.Scanner;

public class NameRanking {
    /** Main method to run program. */
    public static void main(String[] args) {
        File directory = new File("D:\\Book_Projects_Ch12\\baby_names");
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter the year: ");
        int year = kb.nextInt();
        kb.nextLine();
        
        File file = new File(directory, "babynameranking" + year + ".txt");
        
        System.out.print("Enter the gender: ");
        char sex = kb.nextLine().charAt(0);
        
        System.out.print("Enter the name: ");
        String name = kb.nextLine();
        
        int number = -1;
        try (Scanner input = new Scanner(file)) {
            boolean found = false;
            while (input.hasNext()) {
                String thisLine = input.nextLine();
                Scanner temp = new Scanner(thisLine);
                temp.next();
                String thisName = "";
                if (sex == 'M') {
                    thisName = temp.next();
                }
                else if (sex == 'F') {
                    thisName = temp.next();
                }
                if (thisLine.contains(name)) {
                    int index = thisLine.length();
                    for (int i = 0; i < thisLine.length(); i++) {
                        if (Character.isLetter(thisLine.charAt(i))) {
                            index = i;
                            break;
                        }
                    }
                    number = Integer.parseInt(thisLine.substring(0, index).trim());
                    found = true;
                    break;
                }
            }
            if (!found)
                System.out.print("This name is not on the list");
            else {
                System.out.print(name + " is ranked #" + number + " for " + year);
            }
        }
        catch (java.io.IOException ex) {
            System.out.print("File is unreadable");
            System.exit(0);
        }
    }
}