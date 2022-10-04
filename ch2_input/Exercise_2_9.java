/**
 * (Physics: acceleration) Average acceleration is defined as the change of velocity 
 * divided by the time taken to make the change, as shown in the following formula:
 *      a = v1 - v0
 *      -----------
 *          t
 * Write a program that prompts the user to enter the starting velocity v0 in meters/
 * second, the ending velocity v1 in meters/second, and the time span t in seconds, 
 * and displays the average acceleration.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_2_9 {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double startVelocity, endVelocity, acceleration, time, avgAcceleration;
        System.out.print("Enter v0, v1, and t: ");
        startVelocity = kb.nextDouble();
        endVelocity = kb.nextDouble();
        time = kb.nextDouble();
        kb.close();
        acceleration = endVelocity - startVelocity;
        avgAcceleration = acceleration / time;
        System.out.print("The average acceleration is " + avgAcceleration);
    }
}
