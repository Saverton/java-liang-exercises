/** Program to simulate a game of hangman, based on the last exercise of Chapter
 * 7, but this time pulling the word bank from a text file called 'hangman.txt'.
 * 
 * @author Scott M.
 * Hangman2.java
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Hangman2 {
    /** Main method to run program. */
    public static void main(String[] args) {
        ArrayList<String> wordBank = new ArrayList<>();
        Scanner kb = new Scanner(System.in);
        String word, display = "";
        int count = 0;
        ArrayList<Character> guessedLetters = new ArrayList<>();
        
        try {
            getWords(wordBank);
        }
        catch (IOException ex) {
            System.out.print("Word bank does not exist or cannot be read: terminating program");
            System.exit(0);
        }
        
        word = wordBank.get((int)(Math.random() * wordBank.size()));
        for (int i = 0; i < word.length(); i++) {
            display += '*';
        }
        
        do {
            System.out.println("Word: " + display);
            System.out.print("Enter a guess: ");
            String entered = kb.nextLine();
            if (entered.equals(word)) {
                count++;
                break;
            }
            try {
                char guess = Character.toLowerCase(entered.charAt(0));
                if (!Character.isLetter(guess))
                    throw new NonLetterGuessException();
                if (guessedLetters.contains(guess)) {
                    System.out.println("Letter already entered");
                }
                else {
                    if (word.contains("" + guess)) {
                        for (int i = 0; i < word.length(); i++) {
                            if (word.charAt(i) == guess) {
                                display = (i != word.length() - 1) ? display.substring(0, i) +
                                          guess + display.substring(i + 1) : display.substring(0, i) +
                                          guess;
                            }
                        }
                    }
                    else {
                        System.out.println(guess + " is not in the word");
                    }
                    guessedLetters.add(guess);
                    count++;
                }
            }
            catch (Exception ex) {
                System.out.println("Invalid guess. Try again.");
            }
        } while (display.contains("*"));
        
        System.out.print("The word was " + word + "\nIt took you " + count + " guesses");
    }
    
    /** Method to insert all words in a text file called hangman.txt into an ArrayList
     * word bank.
     * @params word bank
     */
    public static void getWords(ArrayList<String> bank) throws IOException {
        File wordFile = new File("hangman.txt");
        Scanner input = new Scanner(wordFile);
        
        while (input.hasNext()) {
            bank.add(input.next());
        }
    }
}
