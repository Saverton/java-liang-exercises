/** 
 * (Write/read data) Write a program to create a file named Exercise12_15.txt if 
 * it does not exist. Write 100 integers created randomly into the file using text 
 * I/O. Integers are separated by spaces in the file. Read the data back from the 
 * file and display the data in increasing order.
 * @author Scott M.
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;

public class Exercise_12_15 {
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
