/**
 * Program to simulate a game of hangman.
 * 
 * @author Scott M.
 * Hangman.java
 */

import java.util.Scanner;

public class Hangman {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        char currentGuess;
        int guesses = 0;
        
        //make a string of possible words to guess
        String[] words = {"physics", "programming", "table", "nate", "squares"};
        //"program", "phillips", "coding", "jake", "minecraft",
            
        //pick a random word
        final String WORD = words[(int)(Math.random() * 5)];
        
        //create arrays to check guesses
        char[] answer = new char[WORD.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = WORD.charAt(i);
        }
        char[] guess = new char[WORD.length()];
        for (int i = 0; i < guess.length; i++) {
            guess[i] = '*';
        }
        
        //loop to continue until no letters are unguessed
        while (searchArray(guess, '*') != -1) {
            //input a guess
            System.out.print("(Guess) Enter a letter in word " + arrayToString(guess) + " > ");
            currentGuess = kb.next().charAt(0);
            
            //check guess
            if (searchArray(answer, currentGuess) != -1) {
                if (searchArray(guess, currentGuess) == -1) {
                    //letter is in word, replace all *s with letter in "guess"
                    for (int i = 0; i < answer.length; i++) {
                        if (answer[i] == currentGuess) {
                            guess[i] = currentGuess;
                        }
                    }
                }
                //letter is already guessed
                else {
                    System.out.println(currentGuess + " has already been guessed");
                    guesses++;
                }
            }
            //letter is not in word
            else {
                System.out.println(currentGuess + " is not in the word.");
                guesses++;
            }
        }
        
        System.out.print("\nThe word is " + WORD + "\nIt took you " + guesses + " incorrect guesses");
    }
    /**
     * Method to convert an array to a string of text.
     */
    public static String arrayToString(char[] array) {
        String output = "";
        for (int i = 0; i < array.length; i++) {
            output += array[i];
        }
        return output;
    }
    /**
     * Method to search an array for a specific key.
     */
    public static int searchArray(char[] array, char key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}