/**
 * Program to create an Account class and test it.
 * Account
 * Datafields: -id: int, -balance: double, -annualInterestRate: double(static), -date: java.util.Date
 * Behaviors: +getMonthlyInterestRate(): double(static), +getMonthlyInterest(): double, +withdraw(withdrawal: double): void
 *            +deposit(deposit: double): void
 *            
 * @author Scott M.
 * Account.java
 */

import java.util.Date;
import java.text.DecimalFormat;

public class Account
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        DecimalFormat fmt = new DecimalFormat("0.00");
        Account a1 = new Account(1122, 20000.00);
        Account.setAnnualInterestRate(4.5);
        System.out.println("Balance is $" + fmt.format(a1.getBalance()));
        a1.withdraw(2500);
        a1.deposit(3000);
        System.out.println("Balance is $" + fmt.format(a1.getBalance()));
        System.out.println("Monthly Interest is $" + fmt.format(a1.getMonthlyInterest()));
        System.out.print("Date Created is " + a1.getDateCreated());
    }
    
    /**
     * Class to define Account object
     */
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date date = new Date();
    
    public Account()
    {
        this(0, 0);
    }
    
    public Account(int enteredId, double initBalance)
    {
        id = enteredId;
        balance = initBalance;
    }
    
    public int getId()
    {
        return id;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public static double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    
    public static double getMonthlyInterestRate()
    {
        return annualInterestRate / 12;
    }
    
    public double getMonthlyInterest()
    {
        return getMonthlyInterestRate() / 100 * balance;
    }
    
    public void setId(int newId)
    {
        id = newId;
    }
    
    public void setBalance(double newBalance)
    {
        balance = newBalance;
    }
    
    public static void setAnnualInterestRate(double newInterestRate)
    {
        annualInterestRate = newInterestRate;
    }
    
    public String getDateCreated()
    {
        return date.toString();
    }
    
    public void withdraw(double withdrawal)
    {
        balance -= withdrawal;
    }
    
    public void deposit(double deposit)
    {
        balance += deposit;
    }
}