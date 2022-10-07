/**
 * (Random point) Write a program that displays a random coordinate in a rectangle. 
 * The rectangle is centered at (0, 0) with width 100 and height 200.
 * @author Scott M.
 * RandomPoint.java
 */

public class Exercise_3_16 {
    /**
     * main method to run program.
     */
    public static void main(String[] args) {
        //declare vars
        int x, y, n;
        
        //choose point x
        x = (int)(Math.random() * 50);
        n = (int)(Math.random() * 2);
        if (n == 1)
            x *= -1;
        
        //choose point y
        y = (int)(Math.random() * 100);
        n = (int)(Math.random() * 2);
        if (n == 1)
            y *= -1;
        
        //display coords
        System.out.print("Coordinates are (" + x + ", " + y + ")");
    }
}