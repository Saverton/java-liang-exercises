/**
 * (Game: bean machine) The bean machine, also known as a quincunx or the Galton box, 
 * is a device for statistics experiments named after English scientist Sir 
 * Francis Galton. It consists of an upright board with evenly spaced nails (or pegs) 
 * in a triangular form, as shown in Figure 7.13.
 * Balls are dropped from the opening of the board. Every time a ball hits a nail, it 
 * has a 50% chance of falling to the left or to the right. The piles of balls are accumulated 
 * in the slots at the bottom of the board.
 * Write a program that simulates the bean machine. Your program should prompt 
 * the user to enter the number of the balls and the number of the slots in the machine. 
 * Simulate the falling of each ball by printing its path. For example, the path for 
 * the ball in Figure 7.13b is LLRRLLR and the path for the ball in Figure 7.13c is 
 * RLRRLRR. Display the final buildup of the balls in the slots in a histogram.
 * @author Scott M.
 */

import java.util.Scanner;


public class Exercise_7_21 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int numOfSlots, balls;
        
        //Get slots and number of balls
        System.out.print("Enter the number of balls to drop: ");
        balls = kb.nextInt();
        System.out.print("Enter the number of slots: ");
        numOfSlots = kb.nextInt();
        kb.close();
        int[] slots = new int[numOfSlots];
        
        //for loop to simulate (balls) drops.
        System.out.println();
        for (int i = 0; i < balls; i++) {
            ballDrop(slots);
        }
        
        //display resulting slots
        System.out.println();
        printSlots(slots);
    }
    /**
     * Simulate a single ball drop given an array of slots in the bean machine
     * @param slots int[]: array of slots that balls can end in
     */
    public static void ballDrop(int[] slots) {
        int returnSlot = 0, pin;
        String sequence = "";
        for (int i = 0; i < slots.length - 1; i++) {
            pin = (int)(Math.random() * 2);
            if (pin == 1) {
                sequence += 'R';
                returnSlot += 1;
            }
            else {
                sequence += 'L';
            }
        }
        System.out.println(sequence);
        slots[returnSlot]++;
    }
    /**
     * Print the number of balls in each slot by stacking them vertically on the display.
     * @param slots int[]: array of slots in the bean machine
     */
    public static void printSlots(int[] slots) {
        int maxBalls;
        while (true) {
            //find the maximum amount of balls in a slot.
            maxBalls = slots[0];
            for (int i = 0; i < slots.length; i++) {
                if (slots[i] > maxBalls) {
                    maxBalls = slots[i];
                }
            }
            
            //check if ballsRemain
            if (maxBalls == 0) {
                return;
            }
            
            //print the slots with the max balls.
            System.out.print('|');
            for (int i = 0; i < slots.length; i++) {
                if (slots[i] == maxBalls) {
                    System.out.print("O|");
                    slots[i]--;
                }
                else {
                    System.out.print(" |");
                }
            }
            System.out.println();
        }
    }
}