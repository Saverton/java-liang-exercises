/**
 * Program to simulate an ATM machine's functionality with 10 accounts. The user
 * can open an account and select options for what to do with the account.
 * 
 * @author Scott M.
 * ATMMachine.java
 */

import java.util.Scanner;

public class ATMMachine
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
            System.out.println();
        }
    }
}