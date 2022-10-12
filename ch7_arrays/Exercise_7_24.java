/**
 * (Simulation: coupon collector’s problem) Coupon collector is a classic statistics 
 * problem with many practical applications. The problem is to pick objects from 
 * a set of objects repeatedly and find out how many picks are needed for all the
 * objects to be picked at least once. A variation of the problem is to pick cards from 
 * a shuffled deck of 52 cards repeatedly and find out how many picks are needed 
 * before you see one of each suit. Assume a picked card is placed back in the deck 
 * before picking another. Write a program to simulate the number of picks needed 
 * to get four cards from each suit and display the four cards picked (it is possible a 
 * card may be picked twice). 
 * @author Scott M.
 */

public class Exercise_7_24 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        String[] suit = {"Clubs", "Spades", "Diamonds", "Hearts"};
        int[] pickedSuits = new int[4];
        String[] card = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int pickCount = 0, pick;
        
        //Simulate picks until int[] pickedSuits no longer has 0s.
        do {
            pick = (int)(Math.random() * 52);
            if (pickedSuits[pick / 13] == 0) {
                System.out.println(card[pick % 13] + " of " + suit[pick / 13]);
            }
            pickedSuits[pick / 13]++;
            pickCount++;
        } while (linearSearch(pickedSuits, 0) != -1);
        
        //print number of picks
        System.out.print("Number of picks: " + pickCount);
    }
    /**
     * Return the index of a certain element in an array using a linear search.
     * @param array int[]: integer array
     * @param key int: key to search for
     * @return int: first index of key, -1 if not found.
     */
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }
}