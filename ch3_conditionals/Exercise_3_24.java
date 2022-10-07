/**
 * (Game: pick a card) Write a program that simulates picking a card from a deck 
 * of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
 * Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card. 
 * @author Scott M.
 * RandomCard.java
 */

public class Exercise_3_24 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //declare suit and card vars as random numbers
        int suit = (int)(Math.random() * 4), card = (int)(Math.random() * 13);
        
        //nested switch case to define suit and cards
        if (suit == 0) {
            switch (card) {
                case 0: System.out.print("The card is an Ace of Clubs");
                break;
                case 1: System.out.print("The card is a 2 of Clubs");
                break;
                case 2: System.out.print("The card is a 3 of Clubs");
                break;
                case 3: System.out.print("The card is a 4 of Clubs");
                break;
                case 4: System.out.print("The card is a 5 of Clubs");
                break;
                case 5: System.out.print("The card is a 6 of Clubs");
                break;
                case 6: System.out.print("The card is a 7 of Clubs");
                break;
                case 7: System.out.print("The card is an 8 of Clubs");
                break;
                case 8: System.out.print("The card is a 9 of Clubs");
                break;
                case 9: System.out.print("The card is a 10 of Clubs");
                break;
                case 10: System.out.print("The card is a Jack of Clubs");
                break;
                case 11: System.out.print("The card is a Queen of Clubs");
                break;
                case 12: System.out.print("The card is a King of Clubs");
                break;
            }
        }
        else if (suit == 1) {
            switch (card) {
                case 0: System.out.print("The card is an Ace of Diamonds");
                break;
                case 1: System.out.print("The card is a 2 of Diamonds");
                break;
                case 2: System.out.print("The card is a 3 of Diamonds");
                break;
                case 3: System.out.print("The card is a 4 of Diamonds");
                break;
                case 4: System.out.print("The card is a 5 of Diamonds");
                break;
                case 5: System.out.print("The card is a 6 of Diamonds");
                break;
                case 6: System.out.print("The card is a 7 of Diamonds");
                break;
                case 7: System.out.print("The card is an 8 of Diamonds");
                break;
                case 8: System.out.print("The card is a 9 of Diamonds");
                break;
                case 9: System.out.print("The card is a 10 of Diamonds");
                break;
                case 10: System.out.print("The card is a Jack of Diamonds");
                break;
                case 11: System.out.print("The card is a Queen of Diamonds");
                break;
                case 12: System.out.print("The card is a King of Diamonds");
                break;
            }
        }
        else if (suit == 2) {
            switch (card) {
                case 0: System.out.print("The card is an Ace of Hearts");
                break;
                case 1: System.out.print("The card is a 2 of Hearts");
                break;
                case 2: System.out.print("The card is a 3 of Hearts");
                break;
                case 3: System.out.print("The card is a 4 of Hearts");
                break;
                case 4: System.out.print("The card is a 5 of Hearts");
                break;
                case 5: System.out.print("The card is a 6 of Hearts");
                break;
                case 6: System.out.print("The card is a 7 of Hearts");
                break;
                case 7: System.out.print("The card is an 8 of Hearts");
                break;
                case 8: System.out.print("The card is a 9 of Hearts");
                break;
                case 9: System.out.print("The card is a 10 of Hearts");
                break;
                case 10: System.out.print("The card is a Jack of Hearts");
                break;
                case 11: System.out.print("The card is a Queen of Hearts");
                break;
                case 12: System.out.print("The card is a King of Hearts");
                break;
            }
        }
        else {
            switch(card) {
                case 0: System.out.print("The card is an Ace of Spades");
                break;
                case 1: System.out.print("The card is a 2 of Spades");
                break;
                case 2: System.out.print("The card is a 3 of Spades");
                break;
                case 3: System.out.print("The card is a 4 of Spades");
                break;
                case 4: System.out.print("The card is a 5 of Spades");
                break;
                case 5: System.out.print("The card is a 6 of Spades");
                break;
                case 6: System.out.print("The card is a 7 of Spades");
                break;
                case 7: System.out.print("The card is an 8 of Spades");
                break;
                case 8: System.out.print("The card is a 9 of Spades");
                break;
                case 9: System.out.print("The card is a 10 of Spades");
                break;
                case 10: System.out.print("The card is a Jack of Spades");
                break;
                case 11: System.out.print("The card is a Queen of Spades");
                break;
                case 12: System.out.print("The card is a King of Spades");
                break;
            }
        }
    }
}