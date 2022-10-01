/**
 * Program to simulate 10,000 games of craps and output the chance of winning.
 * 
 * @author Scott M.
 * CrapsStatistics.java
 */

public class CrapsStatistics {
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
     * Method to simulate a game of Craps (returns true if win, false if lose).
     */
    public static boolean craps() {
        int sum, point;
        sum = roll();
        
        switch (win(sum)) {
            case 0: return false;
            case 1: return true;
            case 2: do {
                        point = roll();
                    } while (point != sum && point != 7);
                    return (sum == point);
            default: return false;
        }
    }
    /**
     * Method to simulate a dice roll.
     */
    public static int roll() {
        
        return ((int)(Math.random() * 6) + 1) + ((int)(Math.random() * 6) + 1);
    }
    /**
     * Method to check if won.
     */
    public static int win(int roll) {
        if (roll == 2 || roll == 3 || roll == 12) {
            return 0;
        }
        else if (roll == 7 || roll == 11) {
            return 1;
        }
        else {
            return 2;
        }
    }
}
