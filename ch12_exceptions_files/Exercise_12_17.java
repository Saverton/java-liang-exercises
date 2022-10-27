/** 
 * (Game: hangman) Rewrite Programming Exercise 7.35. The program reads the 
 * words stored in a text file named hangman.txt. Words are delimited by spaces.
 * @author Scott M.
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise_12_17 {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word, display = "";
        int count = 0;
        ArrayList<Character> guessedLetters = new ArrayList<>();
        ArrayList<String> wordBank = new ArrayList<>();

        try {
            wordBank = getWords();
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
        kb.close();
        
        System.out.print("The word was " + word + "\nIt took you " + count + " guesses");
    }
    
    /** 
     * Return a word bank (arrayList of Strings) from the text file "hangman.txt" containing all possible words in hangman.
     * @return ArrayList<String>: word bank
     */
    public static ArrayList<String> getWords() throws IOException {
        ArrayList<String> bank = new ArrayList<>();
        File wordFile = new File("hangman.txt");
        Scanner input = new Scanner(wordFile);
        
        while (input.hasNext()) {
            bank.add(input.next());
        }
        input.close();
        return bank;
    }
}

class NonLetterGuessException extends Exception {
    /** Construct a default NonLetterGuessException */
    public NonLetterGuessException() {
        super("Invalid Letter Entered");
    }
}