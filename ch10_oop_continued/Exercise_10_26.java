/**
 * (Calculator) Revise Listing 7.9, Calculator.java, to accept an expression as 
 * a string in which the operands and operator are separated by zero or more 
 * spaces. For example, 3+4 and 3 + 4 are acceptable expressions. 
 * @author Scott M.
 */

public class Exercise_10_26 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        final int FIRST_NUM = 0, OPERATOR = 1, SECOND_NUM = 2; // improve readability by naming indexes
        String[] expression = args[0].split("\s+"); // get parts of expression
        StringBuilder result = new StringBuilder(32);
        // check for an operator, return an error message if operator is invalid.
        if (expression[OPERATOR].equals("+")) {
            result.append(expression[FIRST_NUM] + ' ' + expression[OPERATOR] + ' ' + expression[SECOND_NUM] + " = " + 
                (Integer.parseInt(expression[FIRST_NUM]) + Integer.parseInt(expression[SECOND_NUM])));
        }
        else if (expression[OPERATOR].equals("-")) {
            result.append(expression[FIRST_NUM] + ' ' + expression[OPERATOR] + ' ' + expression[SECOND_NUM] + " = " + 
                (Integer.parseInt(expression[FIRST_NUM]) - Integer.parseInt(expression[SECOND_NUM])));
        }
        else if (expression[OPERATOR].equals("*")) {
            result.append(expression[FIRST_NUM] + ' ' + expression[OPERATOR] + ' ' + expression[SECOND_NUM] + " = " + 
                (Integer.parseInt(expression[FIRST_NUM]) * Integer.parseInt(expression[SECOND_NUM])));
        }
        else if (expression[OPERATOR].equals("/")) {
            result.append(expression[FIRST_NUM] + ' ' + expression[OPERATOR] + ' ' + expression[SECOND_NUM] + " = " + 
                (Integer.parseInt(expression[FIRST_NUM]) / Integer.parseInt(expression[SECOND_NUM])));
        }
        else {
            result.append(args[0] + " is an invalid input");
        }
        System.out.print(result); // print result
    }
}
