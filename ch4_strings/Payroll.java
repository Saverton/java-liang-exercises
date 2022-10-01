/**
 * Program to complete a basic payroll report with user given information.
 * 
 * @author Scott M.
 * Payroll.java
 */

import java.util.Scanner;

public class Payroll {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create scanner and vars
        Scanner kb = new Scanner (System.in);
        String name;
        double hours, wage, fedTax, stateTax, grossPay, fedWithold, stateWithold, deductions, netPay;
        
        //get name, hours, wage, fed tax, state tax
        System.out.print("Enter employee's name: ");
        name = kb.nextLine();
        System.out.print("Enter employee's hours worked: ");
        hours = kb.nextDouble();
        if (hours < 0) {
            System.out.print("Invalid Input.");
            System.exit(1);
        }
        System.out.print("Enter employee's hourly pay rate: ");
        wage = kb.nextDouble();
        if (wage < 0) {
            System.out.print("Invalid Input.");
            System.exit(1);
        }
        System.out.print("Enter employee's Federal income tax rate (e.g. 10%): ");
        fedTax = kb.nextDouble();
        if (fedTax < 0 || fedTax > 100) {
            System.out.print("Invalid Input.");
            System.exit(1);
        }
        System.out.print("Enter employee's State income tax rate (e.g. 10%): ");
        stateTax = kb.nextDouble();
        if (stateTax < 0 || stateTax > 100) {
            System.out.print("Invalid Input.");
            System.exit(1);
        }
        
        //calculate name, hours, wage, gross pay, deductions (Fed witholding, state witholding, total deduction), net pay
        grossPay = hours * wage;
        fedWithold = fedTax / 100 * grossPay;
        stateWithold = stateTax / 100 * grossPay;
        deductions = fedWithold + stateWithold;
        netPay = grossPay - deductions;
        
        // display
        System.out.println("\nEmployee Payroll:");
        System.out.printf("\t%-28s: %10s", "Name", name);
        System.out.printf("\n\t%-28s: %10.1f", "Hours Worked", hours);
        System.out.printf("\n\t%-28s: $%10.2f", "Hourly Pay", wage);
        System.out.printf("\n\t%-28s: $%10.2f", "Gross Pay", grossPay);
        System.out.println("\n\tDeductions");
        System.out.printf("\t\t%-20s: $%10.2f", "Federal Witholding", fedWithold);
        System.out.printf("\n\t\t%-20s: $%10.2f", "State Witholding", stateWithold);
        System.out.printf("\n\t\t%-20s: $%10.2f", "Total Deductions", deductions);
        System.out.printf("\n\t%-28s: $%10.2f", "Net Pay", netPay);
        
    }
}