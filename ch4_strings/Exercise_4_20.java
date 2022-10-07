/**
 * (Process a string) Write a program that prompts the user to enter a string and displays
 * its length and its first character.
 * @author Scott M.
 */

 import  java.util.Scanner;

public class Exercise_4_20 {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input;

        System.out.print("Enter a string: ");
        input = kb.nextLine();
        kb.close();

        System.out.println("length is " + input.length());
        System.out.print("first character is " + input.charAt(0));
    }
}
