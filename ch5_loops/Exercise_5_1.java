/**
 * (Count positive and negative numbers and compute the average of numbers) Write 
 * a program that reads an unspecified number of integers, determines how many 
 * positive and negative values have been read, and computes the total and average of 
 * the input values (not counting zeros). Your program ends with the input 0. Display 
 * the average as a floating-point number. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_5_1 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //Create Scanner and Declare vars for: number, positives, negatives, sum, count
        Scanner kb = new Scanner (System.in);
        int number, positives = 0, negatives = 0, sum = 0, count = 0;
        
        //Loop:
        do {
            //1. get the user to enter a number
            System.out.print("Enter an Integer (Input ends if 0 is entered):");
            number = kb.nextInt();
            
            //2. find if the number is positive or negative
            if (number > 0) {
                positives++;
            }
            else if (number < 0) {
                negatives++;
            }
            
            //3. add the number to the sum
            sum += number;
            
            //4. add one to the count
            count++;
        } while (number != 0);
        kb.close();
        
        //display positives, negatives, sum, and sum / count (average)
        System.out.println("Positives: " + positives);
        System.out.println("Negatives: " + negatives);
        System.out.println("Total: " + sum);
        System.out.print("Average: " + ((double)sum / count));
    }
}