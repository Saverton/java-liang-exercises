/**
 * (Population projection) The U.S. Census Bureau projects population based on the
 * following assumptions:
 *  ■ One birth every 7 seconds
 *  ■ One death every 13 seconds
 *  ■ One new immigrant every 45 seconds
 * Write a program to display the population for each of the next five years. Assume the
 * current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
 * integers perform division, the result is an integer. The fractional part is truncated. For
 * example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
 * the fractional part, one of the values involved in the division must be a number with a
 * decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 * 
 * "I can't believe they make you do this before teaching loops &| variables"
 * @author Scott M.
 */

public class Exercise_1_11 {
    /** Main method to run program. */
    public static void main(String[] args) {
        System.out.println("Population this year : " + (312032486 + ((0 * 60 * 60 * 24 * 365 * 1.0) / 7) + ((1 * 60 * 60 * 24 * 365 * 1.0) / 45) -
             ((1 * 60 * 60 * 24 * 365 * 1.0) / 13)));
        System.out.println("Population next : " + (312032486 + ((1 * 60 * 60 * 24 * 365 * 1.0) / 7) + ((1 * 60 * 60 * 24 * 365 * 1.0) / 45) -
            ((1 * 60 * 60 * 24 * 365 * 1.0) / 13)));
        System.out.println("Population two years from now : " + (312032486 + ((2 * 60 * 60 * 24 * 365 * 1.0) / 7) + ((1 * 60 * 60 * 24 * 365 * 1.0) / 45) -
            ((1 * 60 * 60 * 24 * 365 * 1.0) / 13)));
        System.out.println("Population three years from now : " + (312032486 + ((3 * 60 * 60 * 24 * 365 * 1.0) / 7) + ((1 * 60 * 60 * 24 * 365 * 1.0) / 45) -
            ((1 * 60 * 60 * 24 * 365 * 1.0) / 13)));
        System.out.println("Population four years from now : " + (312032486 + ((4 * 60 * 60 * 24 * 365 * 1.0) / 7) + ((1 * 60 * 60 * 24 * 365 * 1.0) / 45) -
            ((1 * 60 * 60 * 24 * 365 * 1.0) / 13)));
        System.out.println("Population five years from now : " + (312032486 + ((5 * 60 * 60 * 24 * 365 * 1.0) / 7) + ((1 * 60 * 60 * 24 * 365 * 1.0) / 45) -
            ((1 * 60 * 60 * 24 * 365 * 1.0) / 13)));
    }
}
