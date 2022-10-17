/**
 * (The Account class) Design a class named Account that contains:
 *  ■ A private int data field named id for the account (default 0).
 *  ■ A private double data field named balance for the account (default 0).
 *  ■ A private double data field named annualInterestRate that stores the current 
 *    interest rate (default 0). Assume all accounts have the same interest rate.
 *  ■ A private Date data field named dateCreated that stores the date when the 
 *    account was created.
 *  ■ A no-arg constructor that creates a default account.
 *  ■ A constructor that creates an account with the specified id and initial balance.
 *  ■ The accessor and mutator methods for id, balance, and annualInterestRate.
 *  ■ The accessor method for dateCreated.
 *  ■ A method named getMonthlyInterestRate() that returns the monthly 
 *    interest rate.
 *  ■ A method named getMonthlyInterest() that returns the monthly interest.
 *  ■ A method named withdraw that withdraws a specified amount from the 
 *    account.
 *  ■ A method named deposit that deposits a specified amount to the account.
 * Draw the UML diagram for the class and then implement the class. (Hint: The 
 * method getMonthlyInterest() is to return monthly interest, not the interest rate. 
 * Monthly interest is balance * monthlyInterestRate. monthlyInterestRate
 * is annualInterestRate / 12. Note that annualInterestRate is a percentage, 
 * e.g., like 4.5%. You need to divide it by 100.)
 * Write a test program that creates an Account object with an account ID of 1122, 
 * a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
 * method to withdraw $2,500, use the deposit method to deposit $3,000, and print 
 * the balance, the monthly interest, and the date when this account was created.          
 * @author Scott M.
 */

import java.util.Date;
import java.text.DecimalFormat;

public class Exercise_9_7 {
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
}

class Account
{
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date date = new Date();
    
    /**
     * Construct an empty default account object.
     */
    public Account()
    {
    }
    
    /**
     * Construct an account object with a specific ID and initial balance
     * @param enteredId int: account ID
     * @param initBalance int: initial balance of account
     */
    public Account(int enteredId, double initBalance)
    {
        id = enteredId;
        balance = initBalance;
    }
    
    /**
     * Return the ID of the account
     * @return int: account ID
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Return account balance
     * @return double: account balance
     */
    public double getBalance()
    {
        return balance;
    }
    
    /**
     * Return account APR (Annual percentage interest rate)
     * @return double: account annual interest rate
     */
    public static double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    
    /**
     * Return account Monthly percentage interest rate.
     * @return double: monthly account interest rate
     */
    public static double getMonthlyInterestRate()
    {
        return annualInterestRate / 12;
    }
    
    /**
     * Return the interest earned in one month in the account.
     * @return double: interest earned
     */
    public double getMonthlyInterest()
    {
        return getMonthlyInterestRate() / 100 * balance;
    }
    
    /**
     * Set a new account ID.
     * @param newId int: new account ID
     */
    public void setId(int newId)
    {
        id = newId;
    }
    
    /**
     * Set a new account Balance
     * @param newBalance double: new account balance
     */
    public void setBalance(double newBalance)
    {
        balance = newBalance;
    }
    
    /**
     * Set a new annual percent interest rate.
     * @param newInterestRate double: new annual interest rate
     */
    public static void setAnnualInterestRate(double newInterestRate)
    {
        annualInterestRate = newInterestRate;
    }
    
    /**
     * Return the date on which the account was created.
     * @return String: Date on which the account was created
     */
    public String getDateCreated()
    {
        return date.toString();
    }
    
    /**
     * Withdraw a specific amount of cash from the account.
     * @param withdrawal double: withdrawal amount
     */
    public void withdraw(double withdrawal)
    {
        balance -= withdrawal;
    }
    
    /**
     * Deposit a specific amount of cash into the account.
     * @param deposit double: deposit amount
     */
    public void deposit(double deposit)
    {
        balance += deposit;
    }
}
