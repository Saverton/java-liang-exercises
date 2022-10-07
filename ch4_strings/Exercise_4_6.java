/**
 * (Random points on a circle) Write a program that generates three random points 
 * on a circle centered at (0, 0) with radius 40 and display three angles in a triangle 
 * formed by these three points, as shown in Figure 4.7a. 
 * @author Scott M.
 * RandomCirclePoints.java
 */

import java.util.Random;
import java.text.DecimalFormat;

public class Exercise_4_6 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        // declare vars
        Random gen = new Random();
        DecimalFormat fmt = new DecimalFormat("0.#");
        double randomAngleA, randomAngleB, randomAngleC, pointAX, pointAY, pointBX, pointBY, pointCX, pointCY, sideAB, sideBC, sideCA, angleA, angleB, angleC;
        final int RADIUS = 40;
        // generate 3 random angles in a circle
        randomAngleA = Math.toRadians(gen.nextInt(359));
        randomAngleB = Math.toRadians(gen.nextInt(359));
        randomAngleC = Math.toRadians(gen.nextInt(359));
        // get the coordinates of points at these 3 angles on the circle
        pointAX = Math.cos(randomAngleA) * RADIUS;
        pointAY = Math.sin(randomAngleA) * RADIUS;
        pointBX = Math.cos(randomAngleB) * RADIUS;
        pointBY = Math.sin(randomAngleB) * RADIUS;
        pointCX = Math.cos(randomAngleC) * RADIUS;
        pointCY = Math.sin(randomAngleC) * RADIUS;
        // find side lengths on the triangle
        sideAB = Math.sqrt(Math.pow(pointAX - pointBX, 2) + Math.pow(pointAY - pointBY, 2));
        sideBC = Math.sqrt(Math.pow(pointBX - pointCX, 2) + Math.pow(pointBY - pointCY, 2));
        sideCA = Math.sqrt(Math.pow(pointCX - pointAX, 2) + Math.pow(pointCY - pointAY, 2));
        // find the angles of the triangle created by these 3 points
        angleA = Math.toDegrees(Math.acos((Math.pow(sideBC, 2) + Math.pow(sideCA, 2) - Math.pow(sideAB, 2)) / (2 * sideBC * sideCA)));
        angleB = Math.toDegrees(Math.acos((Math.pow(sideCA, 2) + Math.pow(sideAB, 2) - Math.pow(sideBC, 2)) / (2 * sideCA * sideAB)));
        angleC = Math.toDegrees(Math.acos((Math.pow(sideAB, 2) + Math.pow(sideBC, 2) - Math.pow(sideCA, 2)) / (2 * sideAB * sideBC)));
        //print angles
        System.out.println("Angle 1 is " + fmt.format(angleA));
        System.out.println("Angle 2 is " + fmt.format(angleB));
        System.out.print("Angle 3 is " + fmt.format(angleC));
    }
}