/** 
 * (Ranking summary) Write a program that uses the files described in Programming Exercise 12.31 
 * and displays a ranking summary table for the first five girl’s and boy’s names as follows:
 *      Year     Rank 1      Rank 2  Rank 3  Rank 4  Rank 5  Rank 1  Rank 2  Rank 3  Rank 4      Rank 5
 *      2010     Isabella    Sophia  Emma    Olivia  Ava     Jacob   Ethan   Michael Jayden      William
 *      2009     Isabella    Emma    Olivia  Sophia  Ava     Jacob   Ethan   Michael Alexander   William
 *      ...
 *      2001     Emily       Madison Hannah  Ashley  Alexis  Jacob   Michael Matthew Joshua      Christopher
 * @author Scott M.
 */

import java.io.File;
import java.util.Scanner;

public class Exercise_12_32 {
    /** Main method to run program. */
    public static void main(String[] args) {
        File directory = new File("D:\\Book_Projects_Ch12\\baby_names");
        File[] files = directory.listFiles();
        
        System.out.printf("%-6s", "Year");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++)
                System.out.printf("%-15s", "Rank " + (j + 1));
        }
        System.out.println();
        
        for (int i = 0; i < files.length; i++) {
            System.out.printf("%-6s\t", files[i].getName().substring(15, 19));
            try (Scanner input = new Scanner(files[i])) {
                String[] male = new String[5];
                String[] female = new String[5];
                for (int j = 0; j < 5 && input.hasNext(); j++) {
                    input.next();
                    male[j] = input.next();
                    female[j] = input.next();
                }
                
                for (String name: female)
                    System.out.printf("%-15s", name);
                for (String name: male)
                    System.out.printf("%-15s", name);
            }
            catch (java.io.IOException ex) {
                System.out.print(" File cannot be read.");
            }
            finally {
                System.out.println();
            }
        }
    }
}