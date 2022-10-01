/**
 * Program to generate a random license plate number.
 * 
 * @author Scott M.
 * RandomPlate.java
 */

public class RandomPlate {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int number1, number2, number3, number4;
        
        number1 = (int)(Math.random() * 10);
        number2 = (int)(Math.random() * 10);
        number3 = (int)(Math.random() * 10);
        number4 = (int)(Math.random() * 10);
        
        System.out.print("Plate: " + letter() + letter() + letter() + number1 + number2 + number3 + number4);
    }
    /**
     * Method to generate a random letter.
     */
    public static char letter() {
        //declare vars
        char letter;
        
        //generate random number from 1-26, and assign it to a letter
        letter = (char)('A' + (int)(Math.random() * 26));
        
        //display the letter
        return letter;
    }
}