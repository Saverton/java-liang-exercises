/** Program to process Salaries of each employee type, display total salaries, and averages.
 * 
 * @author Scott M.
 * ProcessSalary.java
 */

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class ProcessSalary {
    /** Main method to run program. */
    public static void main(String[] args) {
        File file = new File("Salary.txt");
        ArrayList<String> employees = new ArrayList<>();
        
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext())
                employees.add(input.nextLine());
        }
        catch (java.io.IOException ex) {
            System.out.print("File cannot be read or does not exist.");
            System.exit(0);
        }
        
        System.out.println("Total salary for assistant professors: " + getTotal(employees, "assistant"));
        System.out.println("Total salary for associate professors: " + getTotal(employees, "associate"));
        System.out.println("Total salary for full professors: " + getTotal(employees, "full"));
        System.out.println("Total salary for all faculty: " + getTotal(employees, "$"));
        System.out.println("Average salary for assistant professors: " + getAverage(employees, "assistant"));
        System.out.println("Average salary for associate professors: " + getAverage(employees, "associate"));
        System.out.println("Average salary for full professors: " + getAverage(employees, "full"));
        System.out.println("Average salary for all faculty: " + getAverage(employees, "$"));
    }
    
    /** Method to get the total salary of all employees with a specified condition.
     * @params list of employees, condition
     * @return total salary
     */
    public static double getTotal(ArrayList<String> employees, String condition) {
        double total = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).contains(condition))
                total += Double.parseDouble(employees.get(i).substring(employees.get(i).indexOf('$') + 1));
        }
        return total;
    }
    
    /** Method to get the average salary of all employees with a specified condition.
     * @params list of employees, conditon
     * @return average salary
     */
    public static double getAverage(ArrayList<String> employees, String condition) {
        int count = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).contains(condition))
                count++;
        }
        return (getTotal(employees, condition) / count);
    }
}