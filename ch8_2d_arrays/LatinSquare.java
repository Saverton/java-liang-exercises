/**
 * Program to have the user enter a size for a 2d array representing a latin square.
 * The program will determine whether or not the square is a latin square.
 * 
 * @author Scott M.
 * LatinSquare.java
 */

import java.util.Scanner;

public class LatinSquare
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        char[][] square;
        int n;
        
        System.out.print("Enter number n: ");
        n = kb.nextInt();
        square = new char[n][n];
        
        System.out.println("Enter " + n + " rows of letters separated by spaces:");
        for (int i = 0; i < square.length; i++)
        {
            for (int j = 0; j < square[i].length; j++)
            {
                square[i][j] = kb.next().charAt(0);
                if (square[i][j] > (65 + n) || square[i][j] < 65)
                {
                    System.out.print("Wrong input: the letters must be from " + (char)65 + " to " + (char)(65 + n));
                    System.exit(1);
                }
            }
        }
        
        if (isLatinSquare(square))
        {
            System.out.print("The input array is a latin square");
        }
        else
        {
            System.out.print("The input array is not a latin square");
        }
    }
    
    /**
     * Method to determine if a 2d array of letters is a latin square
     */
    public static boolean isLatinSquare(char[][] s)
    {
        boolean valid = true;
        for (int i = 0; valid && i < s.length; i++)
        {
            if (!isLatinRow(s[i]))
            {
                valid = false;
            }
        }
        
        for (int j = 0; valid && j < s[0].length; j++)
        {
            char[] temp = new char[s.length];
            for (int i = 0; valid && i < s.length; i++)
            {
                temp[i] = s[i][j];
            }
            if (!isLatinRow(temp))
            {
                valid = false;
            }
        }
        return valid;
    }
    
    /**
     * Method to determine if an array of chars has unique chars
     */
    public static boolean isLatinRow(char[] r)
    {
        boolean valid = true;
        char[] temp = new char[r.length];
        for (int i = 0; valid && i < r.length; i++)
        {
            if (contains(temp, r[i]))
            {
                valid = false;
            }
            else
            {
                temp[i] = r[i];
            }
        }
        return valid;
    }
    
    /**
     * Method to check if an array contains a certain key
     */
    public static boolean contains(char[] t, char k)
    {
        boolean contains = false;
        for (int i = 0; !contains && i < t.length; i++)
        {
            if (t[i] == k)
            {
                contains = true;
            }
        }
        return contains;
    }
}