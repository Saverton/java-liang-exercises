/**
 * Program to simplify the zodiac animal finder program from ch 3.
 * 
 * @author Scott M.
 * Zodiac.java
 */

import java.util.Scanner;

public class Zodiac {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int year;
        String[] zodiac = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
        
        System.out.print("Enter a year: ");
        year = kb.nextInt();
        
        System.out.print(zodiac[year % 12]);
    }
}