/**
 * (Average speed in miles) Assume a runner runs 14km in 45 minutes and 30 seconds, Write a program that displays the runner's average speed in mph.
 * *Note: 1mi. = 1.6km
 * @author Scott M.
 */

public class Exercise_1_10 {
    /** Main method to run program. */
    public static void main(String[] args) {
        System.out.println("Distance = " + (45) + "km.");
        System.out.println("Time = " + (45) + "mins and " + (30) + "secs.");
        System.out.println("Average speed = " + ((14 * 1.6) / ((45.0 / 60) + (30.0 / (60 * 60)))) + "mph.");
    }
}
