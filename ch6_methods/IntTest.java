/**
 * Program to test if nextInt() method clears spaces.
 * 
 * @author Scott M.
 */

import java.util.Scanner;

public class IntTest {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int val1, val2, val3;
        String str;
        System.out.print("Enter 3 values: ");
        val1 = kb.nextInt();
        val2 = kb.nextInt();
        val3 = kb.nextInt();
        System.out.print("Now enter a String, or can you??? ");
        str = kb.nextLine();
        System.out.print("\n\n\"" + str + "\"");
    }
}