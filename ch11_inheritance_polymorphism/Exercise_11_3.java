/**
 * (Subclasses of Account) In Programming Exercise 9.7, the Account class was 
 * defined to model a bank account. An account has the properties account number, 
 * balance, annual interest rate, and date created, and methods to deposit and withdraw 
 * funds. Create two subclasses for checking and saving accounts. A checking 
 * account has an overdraft limit, but a savings account cannot be overdrawn.
 * Draw the UML diagram for the classes and then implement them. Write 
 * a test program that creates objects of Account, SavingsAccount, and 
 * CheckingAccount and invokes their toString() methods.          
 * @author Scott M.
 */

import java.util.Date;
import java.text.DecimalFormat;

public class Exercise_11_3 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Account a1 = new Account(1, 100.00);
        SavingsAccount a2 = new SavingsAccount(2, 200.50);
        CheckingAccount a3 = new CheckingAccount(3, 238.00);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
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
    {}
    
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

    /**
     * Return a String with info about the account formatted as: 
     *      Account
     *      ID      : <account id>
     *      Balance : $<balance>
     * @return String: Account info
     */
    public String toString() {
        return "Account\nID\t: " + this.id + "\nBalance\t: $" + (new DecimalFormat("0.00")).format(this.balance); 
    }
}

class SavingsAccount extends Account
{
    /**
     * Construct a new Savings account with a specific ID and initial balance.
     * @param id int: account id
     * @param initialBalance double: account balance
     */
    public SavingsAccount(int id, double initialBalance)
    {
        super(id, initialBalance);
    }
    
    /**
     * Withdraw a specific amount from the account, print an insufficient funds message if the withdrawal exceeds the balance.
     * @param withdrawal double: withdrawal amount
     */
    @Override
    public void withdraw(double withdrawal)
    {
        if (super.getBalance() > withdrawal)
        {
            super.withdraw(withdrawal);
        }
        else
        {
            System.out.println("Insufficient funds, max withdrawn");
            super.withdraw(super.getBalance());
        }
    }

    /**
     * Return a String with info about the savings account formatted as: 
     *      Savings Account
     *      ID      : <account id>
     *      Balance : $<balance>
     * @return String: Account info
     */
    @Override
    public String toString() {
        return "Savings " + super.toString();
    }
}

class CheckingAccount extends Account
{
    /**
     * Construct a Checking Account with a specific account id and initial balance
     * @param id int: account id
     * @params initialBalance double: account balance
     */
    public CheckingAccount(int id, double initialBalance)
    {
        super(id, initialBalance);
    }
    
    /**
     * Withdraw a specific amount from the Checking Account, if the withdrawal exceeds the balance try overdrafting and print a message with the status of the overdraft.
     * @param withdrawal double: withdrawal amount
     */
    @Override
    public void withdraw(double withdrawal)
    {
        if (super.getBalance() > withdrawal)
        {
            super.withdraw(withdrawal);
        }
        else if (Math.abs(super.getBalance() - withdrawal) < super.getBalance() / 10)
        {
            System.out.println("Insufficient funds, account overdrafted.");
            super.withdraw(withdrawal);
        }
        else
        {
            System.out.println("Insufficient funds, exceeds maximum overdraft.");
            super.withdraw(super.getBalance() + super.getBalance() / 10);
        }
    }

    /**
     * Return a String with info about the checking account formatted as: 
     *      Checking Account
     *      ID      : <account id>
     *      Balance : $<balance>
     * @return String: Account info
     */
    @Override
    public String toString() {
        return "Checking " + super.toString();
    }
}