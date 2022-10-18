/**
 * (Game: ATM machine) Use the Account class created in Programming Exercise 9.7 
 * to simulate an ATM machine. Create ten accounts in an array with id 
 * 0, 1, . . . , 9, and initial balance $100. The system prompts the user to enter an 
 * id. If the id is entered incorrectly, ask the user to enter a correct id. Once an id 
 * is accepted, the main menu is displayed as shown in the sample run. You can 
 * enter a choice 1 for viewing the current balance, 2 for withdrawing money, 3 for 
 * depositing money, and 4 for exiting the main menu. Once you exit, the system 
 * will prompt for an id again. Thus, once the system starts, it will not stop.
 * @author Scott M.
 */

import java.util.Scanner;
import java.util.Date;

public class Exercise_10_7
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++)
        {
            accounts[i] = new Account(i + 1, 100.0);
        }
        
        while (true)
        {
            int currentId, currentChoice;
            System.out.print("Enter an id: ");
            currentId = kb.nextInt();
            if (currentId < 0 || currentId > 9)
            {
                continue;
            }
            do 
            {
                System.out.print("\nMain menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\nEnter a choice: ");
                currentChoice = kb.nextInt();
                switch (currentChoice)
                {
                    case 1: System.out.println("The balance is " + accounts[currentId].getBalance());
                            break;
                    case 2: System.out.print("Enter an amount to withdraw: ");
                            double withdraw = kb.nextDouble();
                            accounts[currentId].withdraw(withdraw);
                            break;
                    case 3: System.out.print("Enter an amount to deposit: ");
                            double deposit = kb.nextDouble();
                            accounts[currentId].deposit(deposit);
                            break;
                    case 4: break;
                    default: System.out.print("Invalid input");
                }
            } while (currentChoice != 4);
            kb.close();
            System.out.println();
        }
    }
}

class Account
{
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date date = new Date();
    
    /**
     * Construct a default account object with ID of 0 and intial balance of $0
     */
    public Account()
    {
        this(0, 0);
    }
    
    /**
     * Construct a new account object with a specific ID and initial balance
     * @param enteredId int: account ID
     * @param initBalance double: initial account balance
     */
    public Account(int enteredId, double initBalance)
    {
        id = enteredId;
        balance = initBalance;
    }
    
    /**
     * Return the account ID.
     * @return int: account ID
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Return the account Balance
     * @return double: account Balance
     */
    public double getBalance()
    {
        return balance;
    }
    
    /**
     * Return the annual interest Rate
     * @return double: annual interest rate
     */
    public static double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    
    /**
     * Return the monthly interest Rate
     * @return double: monthly interest rate
     */
    public static double getMonthlyInterestRate()
    {
        return annualInterestRate / 12;
    }
    
    /**
     * Return the earned interest for one month.
     * @return double: monthly interest
     */
    public double getMonthlyInterest()
    {
        return getMonthlyInterestRate() / 100 * balance;
    }
    
    /**
     * set the account ID.
     * @param newId int: new ID
     */
    public void setId(int newId)
    {
        id = newId;
    }
    
    /**
     * set the account balance.
     * @param newBalance double: new account balance
     */
    public void setBalance(double newBalance)
    {
        balance = newBalance;
    }
    
    /**
     * Set the annual interest rate of the account
     * @param newInterestRate double: new annual interest rate
     */
    public static void setAnnualInterestRate(double newInterestRate)
    {
        annualInterestRate = newInterestRate;
    }
    
    /**
     * Return the date on which this account was created.
     * @return String: date when account was created
     */
    public String getDateCreated()
    {
        return date.toString();
    }
    
    /**
     * Withdraw a certain amount from the account
     * @param withdrawal double: withdrawal ammount
     */
    public void withdraw(double withdrawal)
    {
        balance -= withdrawal;
    }
    
    /**
     * Deposit a certain amount from the account
     * @param deposit double: deposit amount
     */
    public void deposit(double deposit)
    {
        balance += deposit;
    }
}