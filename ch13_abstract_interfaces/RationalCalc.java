/** Program to simulate a calculator with string input in the form "num1/den1 operator num2/den2", which
 * returns the appropriate rational solution to the console.
 * 
 * @author Scott M.
 * RationalCalc.java
 */

public class RationalCalc {
    /** Main method to run program */
    public static void main(String[] args) {
        Equation eq = new Equation(args[0]);
        try {
            System.out.println(eq.solve());
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class Equation {
    private Rational operant1, operant2;
    private char operator;
    
    /** Construct an equation with a String
     * @params String form of equation
     */
    public Equation(String equation) {
        String[] ops = equation.split(" ");
        operator = ops[1].charAt(0);
        String[] ops1 = ops[0].split("/");
        String[] ops2 = ops[2].split("/");
        operant1 = new Rational(Long.parseLong(ops1[0]), Long.parseLong(ops1[1]));
        operant2 = new Rational(Long.parseLong(ops2[0]), Long.parseLong(ops2[1]));
    }
    
    /** Return the result of the equation
     * @return Rational solution
     */
    public Rational solve() throws IllegalArgumentException {
        switch(operator) {
            case('+'): return operant1.add(operant2);
            case('-'): return operant1.subtract(operant2);
            case('*'): return operant1.multiply(operant2);
            case('/'): return operant1.divide(operant2);
            default: throw new IllegalArgumentException("Invalid Operant");
        }
    }
}