/**
 * (Guess birthday) Rewrite Listing 4.3, GuessBirthday.java, to prompt the user to 
 * enter the character Y for Yes and N for No rather than entering 1 for Yes and 0
 * for No
 * @author Scott M.
 * GuessBirthday.java
 */

import java.util.Scanner;

public class Exercise_4_10 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create scanner, declare vars
        Scanner kb = new Scanner (System.in);
        int answerInt, day = 0;
        
        //create sets 1-5
        String set1 = " 1  3  5  7\n" + " 9 11 13 15\n" + "17 19 21 23\n" + "25 27 29 31\n";
        String set2 = " 2  3  6  7\n" + "10 11 14 15\n" + "18 19 22 23\n" + "26 27 30 31\n";
        String set3 = " 4  5  6  7\n" + "12 13 14 15\n" + "20 21 22 23\n" + "28 29 30 31\n";
        String set4 = " 8  9 10 11\n" + "12 13 14 15\n" + "24 25 26 27\n" + "28 29 30 31\n";
        String set5 = "16 17 18 19\n" + "20 21 22 23\n" + "24 25 26 27\n" + "28 29 30 31\n";
        
        //prompt user for sets 1-5, add dates
        System.out.println("Is your birthday in set 1? (Y/N)");
        System.out.print(set1);
        answerInt = (int)(kb.next().charAt(0));
        if (answerInt == 89)
            day += 1;
            
        System.out.println("Is your birthday in set 2? (Y/N)");
        System.out.print(set2);
        answerInt = (int)(kb.next().charAt(0));
        if (answerInt == 89)
            day += 2;
        
        System.out.println("Is your birthday in set 3? (Y/N)");
        System.out.print(set3);
        answerInt = (int)(kb.next().charAt(0));
        if (answerInt == 89)
            day += 4;
        
        System.out.println("Is your birthday in set 4? (Y/N)");
        System.out.print(set4);
        answerInt = (int)(kb.next().charAt(0));
        if (answerInt == 89)
            day += 8;
            
        System.out.println("Is your birthday in set 5? (Y/N)");
        System.out.print(set5);
        answerInt = (int)(kb.next().charAt(0));
        if (answerInt == 89)
            day += 16;
        kb.close();

        //display birthday
        System.out.print("\nYour Birthday is " + day + "!");
    }
}