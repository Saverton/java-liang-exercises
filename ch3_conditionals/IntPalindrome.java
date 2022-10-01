/**
 * Program to find if a 3 digit integer is a palindrome.
 * 
 * @author Scott M.
 * IntPalindrome.java
 */

import java.util.Scanner;

public class IntPalindrome {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //declare scanner, integer, d1, d3 vars
        Scanner kb = new Scanner (System.in);
        int uInt, d1, d3;
        
        //prompt user and get 3 digit integer
        System.out.print("Enter a 3-digit integer: ");
        uInt = kb.nextInt();
        //check if uInt has 3 digits
        if ((uInt / 1000 != 0)) {
            System.out.print("Not a 3-digit integer, system failure :(");
        }
        else {
        //find d1 and d3
        d1 = uInt % 10;
        d3 = uInt / 100;
        
        //if d1=d3, palindrome
        if (d1 == d3)
            System.out.print(uInt + " is a palindrome");
        else 
            System.out.print(uInt + " is not a palindrome");
        }
    }
}