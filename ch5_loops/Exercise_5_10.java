/**
 * (Find numbers divisible by 5 and 6) Write a program that displays all the numbers 
 * from 100 to 1,000, ten per line, that are divisible by 5 and 6. Numbers are 
 * separated by exactly one space.
 * @author Scott M.
 */

public class Exercise_5_10 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int printCount = 0;
        System.out.println("Numbers from 100 to 1000 that are divisible by 5 & 6.");
        
        for (int count = 100; count <= 1000; count += 5) {        
        //1. Check if the number is divisible by 5 & 6, if true; display the number followed by a space.
        if (count % 6 == 0) {
            System.out.print(count + " ");
            //2. When displaying a number, add 1 to print count.
            printCount++;
        }
        
        //3. if print count reaches 10, to a line break and reset printCount.
        if (printCount == 10) {
            System.out.println("");
            printCount = 0;
        }
        }
    }
}