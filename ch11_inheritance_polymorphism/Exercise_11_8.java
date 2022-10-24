/**
 * (New Account class) An Account class was specified in Programming 
 * Exercise 9.7. Design a new Account class as follows:
 *  ■ Add a new data field name of the String type to store the name of the 
 *    customer.
 *  ■ Add a new constructor that constructs an account with the specified name, id, 
 *    and balance.
 *  ■ Add a new data field named transactions whose type is ArrayList
 *    that stores the transaction for the accounts. Each transaction is an instance 
 *    of the Transaction class. The Transaction class is defined as shown in
 *    Figure 11.6.
 *  ■ Modify the withdraw and deposit methods to add a transaction to the 
 *    transactions array list.
 *  ■ All other properties and methods are the same as in Programming Exercise 9.7.
 * Write a test program that creates an Account with annual interest rate 1.5%,
 * balance 1000, id 1122, and name George. Deposit $30, $40, and $50 to the 
 * account and withdraw $5, $4, and $2 from the account. Print an account summary 
 * that shows account holder name, interest rate, balance, and all transactions.
 * @author Scott M.
 */

import java.util.Date;
import java.text.NumberFormat;
import java.util.ArrayList;

public class Exercise_11_8 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Account a1 = new Account(1122, 1000.0, "George");
        Account.setAnnualInterestRate(0.015);
        
        a1.deposit(30.0, "");
        a1.deposit(40.0, "Paycheck");
        a1.deposit(50.0, "");
        a1.withdraw(5.0, "");
        a1.withdraw(4.0, "cake :)");
        a1.withdraw(3.0, "cookie");
        
        System.out.print(a1);
    }
}

class Account
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
     * Construct a default account with an ID of 0, balance of 0, and name of "John Doe".
     */
    public Account()
    {
        this(0, 0);
    }
    
    /**
     * Construct an account with a specific ID and balance with a name of "John Doe".
     * @param id int: account id
     * @param balance double: account balance
     */
    public Account(int id, double balance)
    {
        this(id, balance, "John Doe");
    }
    
    /**
     * Construct an account with a specific ID, balance, and account holder name
     * @param id int: account id
     * @param balance double: account balance
     * @param name String: account name
     */
    public Account(int id, double balance, String name)
    {
        this.id = id;
        this.balance = balance;
        this.name = name;
        this.date = new Date();
    }
    
    /**
     * Return the Account ID.
     * @return int: account ID
     */
    public int getId()
    {
        return (id);
    }
    
    /**
     * Return the Account's balance.
     * @return double: account balance
     */
    public double getBalance()
    {
        return (balance);
    }
    
    /**
     * Return the annual interest rate of the Account Class.
     * @return double: annual interest rate
     */
    public static double getAnnualInterestRate()
    {
        return (annualInterestRate);
    }
    
    /**
     * Return the monthly interest rate of the Account Class.
     * @return double: monthly interest rate
     */
    public static double getMonthlyInterestRate()
    {
        return (annualInterestRate / 12);
    }
    
    /**
     * Return the amount of interest earned for the next month by this Account.
     * @return double: interest earned
     */
    public double getMonthlyInterest()
    {
        return (getMonthlyInterestRate() / 100 * balance);
    }
    
    /**
     * Return the name of the account holder
     * @return String: account holder's name
     */
    public String getName()
    {
        return (name);
    }
    
    /**
     * Return an ArrayList of transactions made in this account.
     * @return ArrayList<Transaction>: list of transactions
     */
    public ArrayList<Transaction> getTransactions()
    {
        return (transactions);
    }
    
    /**
     * Set a new account ID.
     * @param id int: new account id
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * Set a new account balance.
     * @param balance double: new account balance
     */
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    
    /**
     * Set the annual interest rate of the Account Class.
     * @param newInterestRate double: new annual interest rate
     */
    public static void setAnnualInterestRate(double newInterestRate)
    {
        annualInterestRate = newInterestRate;
    }
    
    /**
     * Return the date on which this account was created.
     * @return java.util.Date: account created date
     */
    public Date getDateCreated()
    {
        return (date);
    }
    
    /**
     * Withdraw a specific amount from the account.
     * @param withdrawal double: withdrawal amount
     * @param description String: transaction description
     */
    public void withdraw(double withdrawal, String description)
    {
        transactions.add(new Transaction('w', withdrawal, balance, description));
        balance = transactions.get(transactions.size() - 1).getBalance();
    }
    
    /**
     * Deposity a specific amount into the account.
     * @param deposit double: deposit amount
     * @param description String: transaction description
     */
    public void deposit(double deposit, String description)
    {
        transactions.add(new Transaction('d', deposit, balance, description));
        balance = transactions.get(transactions.size() - 1).getBalance();
    }
    
    /**
     * Return a String with information about the account in the format:
     *      [Name, Id]: <account holder's name>, <account id>
     *      Balance: $<account balance>
     *      Annual Interest: <annual interest rate>%
     *      Created on: <date created>
     *      Transactions:
     *          <List of transactions>
     * @return String: account info
     */
    public String toString()
    {
        return "[Name, Id]: " + name + ", " + id + "\nBalance: " + money.format(balance) + "\nAnnual Interest: " + percent.format(annualInterestRate) +
               "\nCreated on: " + date.toString() + "\nTransactions:\n" + transactions.toString();
    }
}

class Transaction
{
    private Date date;
    private double amount, balance;
    private String description;
    private static NumberFormat money = NumberFormat.getCurrencyInstance();
    
    /**
     * Construct a new Transaction with a specific transaction amount, balance before transaction, and transaction description.
     * @param amount double: transaction amount
     * @param balance double: account balance (before transaction)
     * @param description: transaction description
     */
    public Transaction(char type, double amount, double balance, String description)
    {
        this.date = new Date();
        if (type == 'w' && amount > balance)
        {
            this.amount = balance;
        }
        else
        {
            this.amount = amount;
        }
        this.description = description;
    }
    
    /**
     * Return the date of this transaction.
     * @return java.util.Date: date of transaction
     */
    public Date getDate()
    {
        return (date);
    }
    
    /**
     * Return the transaction amount.
     * @return double: transaction amount
     */
    public double getAmount()
    {
        return (amount);
    }
    
    /**
     * Return the new balance after the transaction.
     * @return double: account balance (post transaction)
     */
    public double getBalance()
    {
        return (this.balance + this.amount);
    }
    
    /**
     * Return the transaction description.
     * @return String: transaction description
     */
    public String getDescription()
    {
        return (description);
    }
    
    /**
     * Return a String with information about this transaction formatted as:
     *      [<date of transaction>] <deposit/withdrawal>: (-)$<amount of transaction> - New Balance: $<new balance>
     *          <transaction description>
     * @return String: transaction info
     */
    public String toString()
    {
        return "[" + date.toString() + "]\t" + ((amount > 0) ? "deposit: " : "withdrawal: -") + money.format(Math.abs(amount)) + " - New Balance: " + money.format(this.getBalance()) + "\n\t" + description + "\n";
    }
}