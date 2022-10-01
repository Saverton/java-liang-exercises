/**
 * Program to create an Account2 class and test it.
 * Account2
 * Datafields: -id: int, -balance: double, -annualInterestRate: double(static), -date: java.util.Date -name: String
 * Behaviors: +getMonthlyInterestRate(): double(static), +getMonthlyInterest(): double, +withdraw(withdrawal: double): void
 *            +deposit(deposit: double): void
 *            
 * @author Scott M.
 * Account2.java
 */

import java.util.Date;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class Account2
{
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date date;
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private static NumberFormat money = NumberFormat.getCurrencyInstance();
    private static NumberFormat percent = NumberFormat.getPercentInstance();
    
    /**
     * Default constructor to create a new Account object with default ID of 0, balance of $0.00,
     * and account holder 'John Doe'.
     */
    public Account2()
    {
        this(0, 0);
    }
    
    /**
     * Constructor to make an Account with a specific ID#, starting balance, and account holder 'John Doe'.
     * 
     * @params (account ID, starting balance)
     */
    public Account2(int id, double balance)
    {
        this(id, balance, "John Doe");
    }
    
    /**
     * Constructor to make an Account with a specific ID#, starting balance, and Account holder name.
     * 
     * @params (account ID, starting balance, account holder name)
     */
    public Account2(int id, double balance, String name)
    {
        this.id = id;
        this.balance = balance;
        this.name = name;
        this.date = new Date();
    }
    
    /**
     * Method to return the Acccount's ID#.
     * 
     * @return (account ID#)
     */
    public int getId()
    {
        return (id);
    }
    
    /**
     * Method to return account balance.
     * 
     * @return (account balance)
     */
    public double getBalance()
    {
        return (balance);
    }
    
    /**
     * Method to return annual interest rate of the Account.
     * 
     * @return (annual interest rate)
     */
    public static double getAnnualInterestRate()
    {
        return (annualInterestRate);
    }
    
    /**
     * Method to return Method to return the monthly interest rate of the Account.
     * 
     * @return (monthly interest rate)
     */
    public static double getMonthlyInterestRate()
    {
        return (annualInterestRate / 12);
    }
    
    /**
     * Method to return the amount of interest accrued in one month.
     * 
     * @return (amount of interest in one month)
     */
    public double getMonthlyInterest()
    {
        return (getMonthlyInterestRate() / 100 * balance);
    }
    
    /**
     * Method to return the account holder's name.
     * 
     * @return (account holder name)
     */
    public String getName()
    {
        return (name);
    }
    
    /**
     * Method to return the ArrayList of transactions in the Account.
     * 
     * @return (transaction list)
     */
    public ArrayList<Transaction> getTransactions()
    {
        return (transactions);
    }
    
    /**
     * Method to set the ID# for the account.
     * 
     * @params (new account ID#)
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * Method to set account balance manually.
     * 
     * @params (new account balance)
     */
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    
    /**
     * Method to set a new annual interest rate for the account.
     * 
     * @params (new annual interest rate)
     */
    public static void setAnnualInterestRate(double newInterestRate)
    {
        annualInterestRate = newInterestRate;
    }
    
    /**
     * Method to get the date this account was created on.
     * 
     * @return (date when account was created)
     */
    public Date getDateCreated()
    {
        return (date);
    }
    
    /**
     * Method to withdraw a certain amount from the account (not to let balance go below $0.00)
     * with a description of the transaction.
     * 
     * @params (amount to withdraw, withdrawal description)
     */
    public void withdraw(double withdrawal, String description)
    {
        transactions.add(new Transaction('w', withdrawal, balance, description));
        balance = transactions.get(transactions.size() - 1).getBalance();
    }
    
    /**
     * Method to deposit a certain amount to the account with a description of the transaction.
     * 
     * @params (amount to deposit, deposit description)
     */
    public void deposit(double deposit, String description)
    {
        transactions.add(new Transaction('d', deposit, balance, description));
        balance = transactions.get(transactions.size() - 1).getBalance();
    }
    
    /**
     * Method to return a String representation of the account.
     * 
     * @return (String of account)
     */
    public String toString()
    {
        return "[Name, Id]: " + name + ", " + id + "\nBalance: " + money.format(balance) + "\nAnnual Interest: " + percent.format(annualInterestRate) +
               "\nCreated on: " + date.toString() + "\nTransactions:\n" + transactions.toString();
    }
}
