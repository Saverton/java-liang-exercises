/**
 * (NumberFormatException) Listing 7.9, Calculator.java, is a simple commandline 
 * calculator. Note that the program terminates if any operand is nonnumeric.
 * Write a program with an exception handler that deals with nonnumeric operands; 
 * then write another program without using an exception handler to achieve the 
 * same objective. Your program should display a message that informs the user of 
 * the wrong operand type before exiting (see Figure 12.12).
 * @author Scott M.
 */

public class Exercise_12_1 {
    /** Main method to run program */
    public static void main(String[] args) throws NumberFormatException {
        if (args.length != 3) {
            System.out.println("Usage: java Exercise_12_1.java operand1 operator operand2");
            System.exit(0);
        }
        
        int result = 0;
        
        try {
            for (int i = 0; i < args.length; i += 2) {
                for (int j = 0; j < args[i].length(); j++) {
                    if (!Character.isDigit(args[i].charAt(j))) {
                        throw new NumberFormatException(args[i]);
                    }
                }
            }
            
            switch (args[1].charAt(0)) {
                case '+': result = (Integer.parseInt(args[0])) +
                                    (Integer.parseInt(args[2]));
                          break;
                case '-': result = (Integer.parseInt(args[0])) -
                                    (Integer.parseInt(args[2]));
                          break;
                case '*': result = (Integer.parseInt(args[0])) *
                                    (Integer.parseInt(args[2]));
                          break;
                case '/': result = (Integer.parseInt(args[0])) /
                                    (Integer.parseInt(args[2]));
            }
            
            System.out.print(args[0] + " " + args[1] + " " + args[2] + " = " + result);
        }
        catch (NumberFormatException ex) {
            System.out.print(ex);
        }
    }
}
