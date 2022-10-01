/**
 * Program to print specefied chars with a certain number of chars per line.
 * 
 * @author Scott M.
 * PrintChars.java
 */

public class PrintChars {
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
     * Method to print chars from ch1 to ch2 with x chars per line.
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