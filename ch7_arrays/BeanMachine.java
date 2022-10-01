/**
 * Program to simulate a bean machine.
 * 
 * @author Scott M.
 * BeanMachine.java
 */

import java.util.Scanner;


public class BeanMachine {
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
        int[] slots = new int[numOfSlots];
        
        //for loop to simulate (balls) drops.
        System.out.println();
        for (int i = 0; i < balls; i++) {
            ballDrop(numOfSlots, slots);
        }
        
        //display resulting slots
        System.out.println();
        printSlots(slots);
    }
    /**
     * Method to simulate a single ball drop.
     */
    public static void ballDrop(int numOfSlots, int[] slots) {
        int returnSlot = 0, pin;
        String sequence = "";
        for (int i = 0; i < numOfSlots - 1; i++) {
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
     * Method to print the number of balls in each slot.
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