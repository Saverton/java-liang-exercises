/**
 * Program to create a Savings Account that inherits from the Account class.
 * 
 * 
 * @author Scott M.
 * SavingsAccount.java
 */

public class SavingsAccount extends Account
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
}