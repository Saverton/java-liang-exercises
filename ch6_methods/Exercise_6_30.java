/**
 * (Game: craps) Craps is a popular dice game played in casinos. Write a program 
 * to play a variation of the game, as follows:
 * Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively. 
 * Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you 
 * lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value 
 * (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either 
 * a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
 * Your program acts as a single player. 
 * @author Scott M.
 */

public class Exercise_6_30 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        String r = roll();
        int sum;
        final int LOSE = 0, WIN = 1, ROLL_AGAIN = 2;
        
        System.out.println(r);
        sum = Integer.parseInt(r.substring(r.lastIndexOf(" ") + 1));
        
        switch (win(sum)) {
            case LOSE: System.out.print("You lose");
                    break;
            case WIN: System.out.print("You win");
                    break;
            case ROLL_AGAIN: System.out.println("point is " + sum);
                    do {
                        r = roll();
                        System.out.println(r);
                    } while (sum != Integer.parseInt(r.substring(r.lastIndexOf(" ") + 1)) && Integer.parseInt(r.substring(r.lastIndexOf(" ") + 1)) != 7);
                    if (sum == Integer.parseInt(r.substring(r.lastIndexOf(" ") + 1))) {
                        System.out.print("You win");
                    }
                    else {
                        System.out.print("You lose");
                    }
        }
    }
    /**
     * Simulate 2 6-sided dice rolling, return a string displaying the rolls.
     * @return String: result of rolls
     */
    public static String roll() {
        int roll1 = (int)(Math.random() * 6) + 1, roll2 = (int)(Math.random() * 6) + 1;
        return "You rolled " + roll1 + " + " + roll2 + " = " + (roll1 + roll2);
    }
    /**
     * Check if the game of craps has been won given a roll of the dice.
     * @param int: dice roll
     * @return int: 
     */
    public static int win(int roll) {
        final int LOSE = 0, WIN = 1, ROLL_AGAIN = 2;
        if (roll == 2 || roll == 3 || roll == 12) {
            return LOSE;
        }
        else if (roll == 7 || roll == 11) {
            return WIN;
        }
        else {
            return ROLL_AGAIN;
        }
    }
}