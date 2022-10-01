/**
 * (Approximate PI) Pi can be approximated by using the following formula:
 *      PI = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - ...)
 * Write a program that displays the result of:
 *      4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
 *      and
 *      4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)
 * Use 1.0 in your program instead of 1.
 * @author Scott M.
 */

public class Exercise_1_7 {
    /** Main method to run program. */
    public static void main(String[] args) {
        System.out.println("         (  1     1     1     1     1     1   )");
        System.out.println("PI = 4 * ( --- - --- + --- - --- + --- - ---- )  =  " + (4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11)));
        System.out.println("         (  1     3     5     7     9     11  )");
        System.out.println();
        System.out.println("         (  1     1     1     1     1     1      1  )");
        System.out.println("PI = 4 * ( --- - --- + --- - --- + --- - ---- + ----)  =  " + (4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13)));
        System.out.println("         (  1     3     5     7     9     11     13 )");
    }
}
