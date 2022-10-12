/**
 * (Culture: Chinese Zodiac) Simplify Listing 3.9 using an array of strings to store 
 * the animal names.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_33 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int year;
        String[] zodiac = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
        
        System.out.print("Enter a year: ");
        year = kb.nextInt();
        kb.close();
        
        System.out.print(zodiac[year % 12]);
    }
}