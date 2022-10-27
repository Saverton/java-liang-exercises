/** 
 * (Baby name popularity ranking) The popularity ranking of baby names from 
 * years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames and stored 
 * in files named babynameranking2001.txt, babynameranking2002.txt, . . . , 
 * babynameranking2010.txt. Each file contains one thousand lines. Each line 
 * contains a ranking, a boy’s name, number for the boy’s name, a girl’s name, 
 * and number for the girl’s name. For example, the first two lines in the file 
 * babynameranking2010.txt are as follows:
 * So, the boy’s name Jacob and girl’s name Isabella are ranked #1 and the boy’s 
 * name Ethan and girl’s name Sophia are ranked #2. 21,875 boys are named 
 * Jacob and 22,731 girls are named Isabella. Write a program that prompts the 
 * user to enter the year, gender, and followed by a name, and displays the ranking 
 * of the name for the year.
 * @author Scott M.
 */

import java.io.File;
import java.util.Scanner;

public class Exercise_12_31 {
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
        kb.close();
        
        int number = -1;
        try (Scanner input = new Scanner(file)) {
            boolean found = false;
            while (input.hasNext()) {
                String thisLine = input.nextLine();
                Scanner temp = new Scanner(thisLine);
                temp.next();
                if (sex == 'M') {
                    temp.next();
                }
                else if (sex == 'F') {
                    temp.next();
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
                temp.close();
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