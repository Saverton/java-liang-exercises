/** 
 * (Create large dataset) Create a data file with 1,000 lines. Each line in the file 
 * consists of a faculty member’s first name, last name, rank, and salary. The 
 * faculty member’s first name and last name for the ith line are FirstNamei and 
 * LastNamei. The rank is randomly generated as assistant, associate, and full. 
 * The salary is randomly generated as a number with two digits after the decimal 
 * point. The salary for an assistant professor should be in the range from 50,000 
 * to 80,000, for associate professor from 60,000 to 110,000, and for full professor 
 * from 75,000 to 130,000. Save the file in Salary.txt. Here are some sample data:
 *      FirstName1 LastName1 assistant 60055.95
 *      FirstName2 LastName2 associate 81112.45
 *      . . .
 *      FirstName1000 LastName1000 full 92255.21
 * @author Scott M.
 */

import java.io.File;
import java.io.PrintWriter;

public class Exercise_12_24 {
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