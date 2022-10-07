/**
 * (Random month) Write a program that randomly generates an integer between 1 
 * and 12 and displays the English month name January, February, …, December for 
 * the number 1, 2, …, 12, accordingly.
 * @author Scott M.
 * RandMonth.java
 */
public class Exercise_3_4 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //declare vars
        switch ((int)(Math.random() * 100000) % 12) {
            case 0: System.out.print("The month is January");
                    break;
            case 1: System.out.print("The month is February");
                    break;
            case 2: System.out.print("The month is March");
                    break;
            case 3: System.out.print("The month is April");
                    break;
            case 4: System.out.print("The month is May");
                    break;
            case 5: System.out.print("The month is June");
                    break;
            case 6: System.out.print("The month is July");
                    break;
            case 7: System.out.print("The month is August");
                    break;
            case 8: System.out.print("The month is September");
                    break;
            case 9: System.out.print("The month is October");
                    break;
            case 10: System.out.print("The month is November");
                    break;
            case 11: System.out.print("The month is December");
                    break;
        }
    }
}