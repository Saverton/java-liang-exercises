/**
 * (Display characters) Write a method that prints characters using the following 
 * header:
 *      public static void printChars(char ch1, char ch2, int numberPerLine)
 * This method prints the characters between ch1 and ch2 with the specified numbers 
 * per line. Write a test program that prints ten characters per line from 1 to Z.
 * Characters are separated by exactly one space
 * @author Scott M.
 */

public class Exercise_6_12 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        char ch1, ch2;
        int charsPerLine;
        ch1 = '1';
        ch2 = 'Z';
        charsPerLine = 10;
        printChars(ch1, ch2, charsPerLine);
    }
    /**
     * Print chars in the ASCII table from a specific start index to a specific end index, with x chars per line
     * @params char: starting char, ending char, int: chars to print per line on the console
     */
    public static void printChars(char ch1, char ch2, int x) {
        char ch = ch1;
        String output = "";
        do {
            for (int i = 0; i < 10 && ch <= ch2; i++) {
                output += ch + " ";
                ch++;
            }
            System.out.println(output);
            output = "";
        } while (ch < ch2);
    }
}