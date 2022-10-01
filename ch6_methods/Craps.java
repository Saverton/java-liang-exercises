/**
 * Program to simulate a game of Craps.
 * 
 * @author Scott M.
 * Craps.java
 */

public class Craps {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        String r = roll();
        int sum, point;
        
        System.out.println(r);
        sum = Integer.parseInt(r.substring(r.lastIndexOf(" ") + 1));
        
        switch (win(sum)) {
            case 0: System.out.print("You lose");
                    break;
            case 1: System.out.print("You win");
                    break;
            case 2: System.out.println("point is " + sum);
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
     * Method to simulate a dice roll.
     */
    public static String roll() {
        int roll1 = (int)(Math.random() * 6) + 1, roll2 = (int)(Math.random() * 6) + 1;
        return "You rolled " + roll1 + " + " + roll2 + " = " + (roll1 + roll2);
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