/**
 * Program to find and display the largest common prefix between two strings.
 * 
 * @author Scott M.
 * CommonPrefix.java
 */

import java.util.Scanner;

public class CommonPrefix {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String input1, input2, prefix = "", message = "";
        
        //1. Get the first String and then the second String.
        System.out.print("Enter the first string: ");
        input1 = kb.nextLine();
        System.out.print("Enter the second string: ");
        input2 = kb.nextLine();
        //2. Use a loop to process characters of each string comparing them. If the first characters don't match, change the message. 
        //   When chars match, add them to the prefix.
        for (int i = 0; i < Math.min(input1.length(), input2.length()); i++) {
            if (input1.charAt(i) == input2.charAt(i)) {
                prefix += input1.charAt(i);
            }
            else {
                if (i < 1) {
                    message = input1 + " and " + input2 + " have no common prefix";
                    break;
                }
                message = "The common prefix is " + prefix;
                break;
            }
            if (i == Math.min(input1.length(), input2.length()) - 1) {
                message = "The common prefix is " + prefix;
                break;
            }
        }
        //3. Display the prefix with the message.
        System.out.print(message);
    }
}