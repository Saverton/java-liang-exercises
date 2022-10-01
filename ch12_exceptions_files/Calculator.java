/**
 * Calculator class that uses the String[] args to perform a basic operation.
 * 
 * @author Scott M.
 * Calculator.java
 */

public class Calculator {
    /** Main method to run program */
    public static void main(String[] args) throws NonNumericOperandException {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }
        
        int result = 0;
        
        try {
            for (int i = 0; i < args.length; i += 2) {
                for (int j = 0; j < args[i].length(); j++) {
                    if (!Character.isDigit(args[i].charAt(j))) {
                        throw new NonNumericOperandException(args[i]);
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
        catch (NonNumericOperandException ex) {
            System.out.print(ex);
        }
        
        
    }
}
