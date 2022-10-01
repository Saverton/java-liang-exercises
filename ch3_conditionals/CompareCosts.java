/**
 * Program to caculate which package has a better price to weight ratio.
 * 
 * @author Scott M.
 * CompareCosts.java
 */

import java.util.Scanner;

public class CompareCosts {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create scanner, declare cost1, cost2, weight1, weight2
        Scanner kb = new Scanner (System.in);
        double cost1, cost2, weight1 ,weight2, ratio1, ratio2;
        
        //get vars
        System.out.print("Enter the cost and weight for package 1, followed by the cost and weight of package 2: ");
        cost1 = kb.nextDouble();
        weight1 = kb.nextDouble();
        cost2 = kb.nextDouble();
        weight2 = kb.nextDouble();
        
        //calc and display which is better
        ratio1 = cost1 / weight1;
        ratio2 = cost2 / weight2;
        if (ratio2 > ratio1) {
            System.out.print("Package 1 is cheaper than package 2.");
        }
        else if (ratio1 > ratio2) {
            System.out.print("Package 2 is cheaper than package 1.");
        }
        else {
            System.out.print("Package 1 is the same price as package 2.");
        }
    }
}