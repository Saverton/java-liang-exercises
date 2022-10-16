/**
 * (Latin square) A Latin square is an n-by-n array filled with n different Latin letters, 
 * each occurring exactly once in each row and once in each column. Write a
 * program that prompts the user to enter the number n and the array of characters, 
 * as shown in the sample output, and checks if the input array is a Latin square. 
 * The characters are the first n characters starting from A.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_36
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
        kb.close();
        
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
     * Check if a 2d array of characters is a latin square.
     * @param s char[][]: 2d array of characters
     * @return boolean: true = character array is a latin square, false otherwise
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
     * Check if an array of characters is a row in a latin square.
     * @param r char[]: array of chars
     * @return boolean: true = char array is a latin square, false otherwise
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
     * Check if an array contains a certain key.
     * @param t char[]: array of characters
     * @param k char: key char to look for
     * @return boolean: true = array contains char, false otherwise
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