/**
 * (Generate vehicle plate numbers) Assume a vehicle plate number consists of three 
 * uppercase letters followed by four digits. Write a program to generate a plate 
 * number.
 * @author Scott M.
 * RandomPlate.java
 */

public class Exercise_4_25 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int number1, number2, number3, number4;
        char letter1, letter2, letter3;
        
        letter1 = (char)(Math.random() * 26 + 'A');
        letter2 = (char)(Math.random() * 26 + 'A');
        letter3 = (char)(Math.random() * 26 + 'A');
        number1 = (int)(Math.random() * 10);
        number2 = (int)(Math.random() * 10);
        number3 = (int)(Math.random() * 10);
        number4 = (int)(Math.random() * 10);
        
        System.out.print("Plate: " + letter1 + letter2 + letter3 + number1 + number2 + number3 + number4);
    }
}