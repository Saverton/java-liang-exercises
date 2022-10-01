/** Program to calculate how many moves are required to solve a tower of hanoi with n disks.
 * @author Scott M.
 * Hanoi.java
 */

import java.util.Scanner;

public class Hanoi {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int disks;
        
        System.out.print("Enter number of disks: ");
        disks = kb.nextInt();
        System.out.print("Number of moves: " + moveDisks(disks, 'A', 'B', 'C'));
    }
    
    /** Method to move a disk from one tower to another.
     * @params Disk: int, move from tower: char, move to tower: char, aux tower: char
     */
    public static int moveDisks(int n, char fromTower, char toTower, char auxTower) {
        int moves = 0;
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower + ".");
            moves += 1;
        }
        else {
            moves += moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower + ".");
            moves += 1;
            moves += moveDisks(n - 1, auxTower, toTower, fromTower);
        }
        return (moves);
    }
}