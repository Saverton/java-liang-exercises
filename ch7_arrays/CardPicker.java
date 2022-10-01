/**
 * Program to simulate picking cards from a deck of cards (with replacement) and finding how many picks are required to get a card from each suit.
 * 
 * @author Scott M.
 * CardPicker.java
 */

public class CardPicker {
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
        } while (ExecutionTime.linearSearch(pickedSuits, 0) != -1);
        
        //print number of picks
        System.out.print("Number of picks: " + pickCount);
    }
}