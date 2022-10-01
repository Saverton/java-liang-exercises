/**
 * (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40  minutes,
 * and 35 seconds. Write a program that displays the average speed in kilometers per
 * hour. (Note that 1 mile is 1.6 kilometers.)
 * @author Scott M.
 */

public class Exercise_1_12 {
    /** Main method to run program. */
    public static void main(String[] args) {
        System.out.println("Distance : " + (24) + " miles.");
        System.out.println("Time : " + (1) + " hour, " + (40) + " minutes, and " + (35) + " seconds.");
        System.out.println("Average speed : " + ((24 * 1.6) / (1 + (40 / 60) + (35 / (60 * 60)))) + " kmph.");
    }
}