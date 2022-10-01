/** Program to generate a text file storing data for 1000 employees.
 * 
 * @author Scott M.
 * Salary.java
 */

import java.io.File;
import java.io.PrintWriter;

public class Salary {
    /** Main method to run program. */
    public static void main(String[] args) throws java.io.IOException {
        File file = new File(args[0]);
        String[] ranks = {"assistant", "associate", "full\t"};
        double[][] salaries = {{50000.00, 80000.00},
                               {60000.00, 110000.00},
                               {75000.00, 130000.00}};
        
        try (PrintWriter output = new PrintWriter(file)) {
            for (int i = 0; i < 1000; i++) {
                String firstName = "FirstName" + i;
                String lastName = "LastName" + i;
                int status = (int)(Math.random() * 3);
                String rank = ranks[status];
                double salary = ((int)(Math.random() * (salaries[status][1] - salaries[status][0])) + salaries[status][0]) + 
                                ((int)(Math.random() * 100) / 100.0);
                output.println(firstName + "\t" + lastName + "\t" + rank + "\t$" + salary);
            }
        }
        
        System.out.print("Operation complete");
    }
}