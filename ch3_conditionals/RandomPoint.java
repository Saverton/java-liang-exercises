/**
 * Program to choose a random point in a 100 x 200 rectange and display it.
 * 
 * @author Scott M.
 * RandomPoint.java
 */

public class RandomPoint {
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