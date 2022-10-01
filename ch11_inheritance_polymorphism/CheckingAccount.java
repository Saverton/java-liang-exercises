/**
 * Checking account class with a 10% overdraft ability based on the current balance.
 * Inherits from Account.java.
 * 
 * @author Scott M.
 * CheckingAccount.java
 */

public class CheckingAccount extends Account
{
    /**
     * Constructer to call the Account constructor.
     * 
     * @params (Accound ID, initial balance)
     */
    public CheckingAccount(int id, double initialBalance)
    {
        super(id, initialBalance);
    }
    
    /**
     * Overridden withdrawal method that allows withdrawal up to a 10% balance
     * overdraft.
     * 
     * @params (Amount withdrawn)
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
}