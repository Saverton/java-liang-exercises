/**
 * (Game: chance of winning at craps) Revise Exercise 6.30 to run it 10,000 times 
 * and display the number of winning games.
 * @author Scott M.
 */

public class Exercise_6_32 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int wins = 0;
        
        for (int i = 0; i < 10000; i++) {
            wins += (craps()) ? 1 : 0;
        }
        
        System.out.print("The chance of winning a game of craps is around " + ((double)wins / 10000) * 100 + "%");
    }
    /**
     * Simulate a game of Craps (returns true if win, false if lose).
     * @return true = game of craps is won, false otherwise
     */
    public static boolean craps() {
        int sum, point;
        final int LOSE = 0, WIN = 1, ROLL_AGAIN = 2;
        sum = roll();
        
        switch (win(sum)) {
            case LOSE: return false;
            case WIN: return true;
            case ROLL_AGAIN: do {
                        point = roll();
                    } while (point != sum && point != 7);
                    return (sum == point);
            default: return false;
        }
    }
    /**
     * Simulate 2 6-sided dice rolling.
     * @return int: outcome of 2 6-sided dice roll
     */
    public static int roll() {
        return ((int)(Math.random() * 6) + 1) + ((int)(Math.random() * 6) + 1);
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
