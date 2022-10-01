/** Program to display a ranking table for the top 5 Male and Female baby names for
 * the years 2001-2010.
 * 
 * @author Scott M.
 * RankingTable.java
 */

import java.io.File;
import java.util.Scanner;

public class RankingTable {
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