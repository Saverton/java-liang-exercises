/**
 * Class to define a Transaction object, which stores information about transactions made in the Account
 * class to be used for future reference.
 * 
 * @Author Scott M.
 * Transaction.java
 */

import java.util.Date;
import java.text.NumberFormat;

public class Transaction
{
    private Date date;
    private char type;
    private double amount, balance;
    private String description;
    private static NumberFormat money = NumberFormat.getCurrencyInstance();
    
    /**
     * Construct a transaction with a specified transaction type, amount in transaction, initial balance, and description.
     * 
     * @params (transaction type, amount of transaction, initial balance, transaction description)
     */
    public Transaction(char type, double amount, double balance, String description)
    {
        this.date = new Date();
        this.type = type;
        if (type == 'w' && amount > balance)
        {
            this.amount = balance;
        }
        else
        {
            this.amount = amount;
        }
        this.balance = (type == 'w') ? balance - amount : balance + amount;
        this.description = description;
    }
    
    /**
     * Method to get the date of the transaction.
     * 
     * @return (date of transaction)
     */
    public Date getDate()
    {
        return (date);
    }
    
    /**
     * Method to get the type of transaction ('w' or 'd').
     * 
     * @return (transaction type)
     */
    public char getTransaction()
    {
        return (type);
    }
    
    /**
     * Method to get the transaction amount.
     * 
     * @return (transaction amount)
     */
    public double getAmount()
    {
        return (amount);
    }
    
    /**
     * Method to get the new balance after the transaction.
     * 
     * @return (new balance)
     */
    public double getBalance()
    {
        return (balance);
    }
    
    /**
     * Method to get the transaction description.
     * 
     * @return (transaction description)
     */
    public String getDescription()
    {
        return (description);
    }
    
    /**
     * Method to return a string description of the transaction.
     * 
     * @return (transaction string)
     */
    public String toString()
    {
        return "[" + date.toString() + "]\t" + type + " - " + money.format(amount) + " - New Balance: " + money.format(balance) + "\n\t" + description + "\n";
    }
}