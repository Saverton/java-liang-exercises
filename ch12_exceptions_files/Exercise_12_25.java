/** 
 * (Process large dataset) A university posts its employees’ salaries at http://
 * cs.armstrong.edu/liang/data/Salary.txt. Each line in the file consists of a faculty 
 * member’s first name, last name, rank, and salary (see Programming Exercise 
 * 12.24). Write a program to display the total salary for assistant professors, 
 * associate professors, full professors, and all faculty, respectively, and display 
 * the average salary for assistant professors, associate professors, full professors, 
 * and all faculty, respectively.
 * @author Scott M.
 */

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise_12_25 {
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
    
    /** 
     * Return the total Salary of all employee entries who contain a specific entry in their data line 
     * (i.e. "associate", would return the total salary of all associate employees).
     * @param employees ArrayList<String>: employee data
     * @param condition String: condition to check for in employee data
     * @return double: total salary
     */
    public static double getTotal(ArrayList<String> employees, String condition) {
        double total = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).contains(condition))
                total += Double.parseDouble(employees.get(i).substring(employees.get(i).indexOf('$') + 1));
        }
        return total;
    }
    
    /** 
     * Return the average Salary of all employees who contain a certain condition in their data line
     * (i.e. "associate", would return the average salary of all associate employees).
     * @param employees ArrayList<String>: employee data
     * @param condition String: condition to check for in employee data
     * @return double: average salary
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