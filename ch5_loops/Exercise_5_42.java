/**
 * (Financial application: find the sales amount) Rewrite Programming Exercise 
 * 5.39 as follows:
 *      ■ Use a for loop instead of a do-while loop.
 *      ■ Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_5_42 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        double salary = 5000, sales = 10000;
        final double COMMISSION_SOUGHT;
        
        System.out.print("Enter the ammount of commission sought: ");
        COMMISSION_SOUGHT = kb.nextDouble();
        kb.close();
        
        for ( ; salary < COMMISSION_SOUGHT; sales++) {
            salary = 5000;
            salary += 5000 * 0.08 + 5000 * 0.10 + (sales - 10000) * 0.12;
        }
        
        System.out.printf("$%,4.2f in sales required to earn at least $%,4.2f salary.", sales, COMMISSION_SOUGHT);
    }
}
