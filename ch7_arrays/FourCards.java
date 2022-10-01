/**
 * Program to simulate picking cards from a deck of cards (with replacement) and finding how many picks are required to get a card from each suit.
 * 
 * @author Scott M.
 * FourCards.java
 */

public class FourCards {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        String[] suit = {"Spades", "Clubs", "Diamonds", "Hearts"};
        String[] card = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int pickCount = 0, pick, sum;
        
        //Simulate picks until int[] pickedSuits no longer has 0s.
        do {
            sum = 0;
            for (int i = 0; i < 4; i++) {
                pick = (int)(Math.random() * 52);
                sum += (pick % 13) + 1;
                System.out.println("picked a " + card[pick % 13] + " of " + suit[pick / 13]);
                pickCount++;
            }
            System.out.println("Sum is " + sum);
        } while (sum != 24);
        
        //print number of picks
        System.out.print("Number of picks: " + pickCount);
    }
}
