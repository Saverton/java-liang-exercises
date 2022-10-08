/**
 * (Count vowels and consonants) Assume letters A, E, I, O, and U as the vowels. 
 * Write a program that prompts the user to enter a string and displays the number 
 * of vowels and consonants in the string.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_5_49 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String input;
        int vowels = 0, consonants = 0;
        char temp;
        
        //1. Input string.
        System.out.print("Enter a string: ");
        input = kb.nextLine();
        kb.close();
        //2. in a loop, process each letter using if statements as a vowel, consonant, or other. Add to counts accordingly.
        for (int i = 0; i < input.length(); i++) {
            temp = Character.toUpperCase(input.charAt(i));
            if (temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U') {
                vowels++;
            }
            else if (Character.isLetter(temp)) {
                consonants++;
            }
        }
        //3. Display total amounts.
        System.out.println("The number of vowels is " + vowels);
        System.out.print("The number of consonants is " + consonants);
    }
}