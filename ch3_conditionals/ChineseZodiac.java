/**
 * Program to calculate the chinese zodiac sign for the year.
 * 
 * @author Scott M. & Nico G.
 * ChineseZodiac.java
 */

import java.util.Scanner;

public class ChineseZodiac {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int year;
        String zodiac;
        Scanner kb = new Scanner (System.in);
        
        System.out.println("Enter a year in CE: ");
        year = kb.nextInt();
        
        switch (year % 12) {
            case 0: zodiac = "Moneke";
                    break;
            case 1: zodiac = "Roaster";
                    break;
            case 2: zodiac = "Doug";
                    break;
            case 3: zodiac = "Pog";
                    break;
            case 4: zodiac = "Rut";
                    break;
            case 5: zodiac = "Ux";
                    break;
            case 6: zodiac = "Tagger";
                    break;
            case 7: zodiac = "Ribbit";
                    break;
            case 8: zodiac = "Dargone";
                    break;
            case 9: zodiac = "Snoke";
                    break;
            case 10: zodiac = "Harse";
                    break;
            case 11: zodiac = "Shep";
                    break;
            default: zodiac = "Oops";
        }
        
        System.out.print(zodiac + "!");
    }
}