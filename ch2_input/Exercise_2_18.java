/**
 * (Print a table) Write a program that displays the following table. Cast floating point numbers into integers.
 *      a    b   pow(a, b)
 *      1    2   1
 *      2    3   8
 *      3    4   81 
 *      4    5   1024
 *      5    6   1562
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_2_18 {
    /** Main method to run program. */
    public static void main(String[] args) {
        int a = 1;
        System.out.println("a\tb\tpow(a, b)");
        System.out.println(a + "\t" + (a + 1) + "\t" + (int)(Math.pow(a, a + 1)));
        a++;
        System.out.println(a + "\t" + (a + 1) + "\t" + (int)(Math.pow(a, a + 1)));
        a++;
        System.out.println(a + "\t" + (a + 1) + "\t" + (int)(Math.pow(a, a + 1)));
        a++;
        System.out.println(a + "\t" + (a + 1) + "\t" + (int)(Math.pow(a, a + 1)));
        a++;
        System.out.println(a + "\t" + (a + 1) + "\t" + (int)(Math.pow(a, a + 1)));
        a++;
    }
}
