/** Program to check for a text file with 100 random integers written in it. If it doesn't exist
 * create one, then reads and displays the integers sorted from smallest to largest.
 * 
 * @author Scott M.
 * FileReader.java
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;

public class FileReader {
    /** Main method to run program. */
    public static void main(String[] args) throws IOException {
        File file = new File("Exercise_12_15.txt");
        if (!file.exists()) {
            System.out.println("File doesn't exist, creating file");
            PrintWriter output = new PrintWriter(file);
            for (int i = 0; i < 100; i++) {
                output.print(((int)(Math.random() * 100)) + " ");
            }
            output.close();
        }
        
        Scanner input = new Scanner(file);
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input.next());
        }
        input.close();
        
        Arrays.sort(array);
        
        for (int i: array) {
            System.out.println(i);
        }
    }
}
