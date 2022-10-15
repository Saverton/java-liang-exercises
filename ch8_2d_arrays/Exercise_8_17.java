/**
 * (Financial tsunami) Banks lend money to each other. In tough economic times, 
 * if a bank goes bankrupt, it may not be able to pay back the loan. A bank’s 
 * total assets are its current balance plus its loans to other banks. The diagram in 
 * Figure 8.8 shows five banks. The banks’ current balances are 25, 125, 175, 75, 
 * and 181 million dollars, respectively. The directed edge from node 1 to node 2 
 * indicates that bank 1 lends 40 million dollars to bank 2.
 * If a bank’s total assets are under a certain limit, the bank is unsafe. The money it 
 * borrowed cannot be returned to the lender, and the lender cannot count the loan in 
 * its total assets. Consequently, the lender may also be unsafe, if its total assets are 
 * under the limit. Write a program to find all the unsafe banks. Your program reads 
 * the input as follows. It first reads two integers n and limit, where n indicates the 
 * number of banks and limit is the minimum total assets for keeping a bank safe. It 
 * then reads n lines that describe the information for n banks with IDs from 0 to n-1.
 * The first number in the line is the bank’s balance, the second number indicates 
 * the number of banks that borrowed money from the bank, and the rest are pairs 
 * of two numbers. Each pair describes a borrower. The first number in the pair 
 * is the borrower’s ID and the second is the amount borrowed. For example, the 
 * input for the five banks in Figure 8.8 is as follows (note that the limit is 201):
 *      5 201
 *      25 2 1 100.5 4 320.5
 *      125 2 2 40 3 85
 *      175 2 0 125 3 75
 *      75 1 0 125 
 *      181 1 2 125
 * The total assets of bank 3 are (75 + 125), which is under 201, so bank 3 is 
 * unsafe. After bank 3 becomes unsafe, the total assets of bank 1 fall below 
 * (125 + 40). Thus, bank 1 is also unsafe. The output of the program should be
 *      Unsafe banks are 3 1
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_17 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int minBal, banks, numFails;
        double[][] borrowers;
        double[] balances;
        int[] fails;
        
        System.out.print("Enter the number of banks followed by the minimum balance: ");
        banks = kb.nextInt();
        minBal = kb.nextInt();
        borrowers = new double[banks][banks];
        balances = new double[banks];
        fails = new int[banks];
        
        System.out.print("Enter in order for each bank the: bank's balance, number of loans given to other banks," +
                         "\n and pairs for each loan (bank loaned to, loan amount): ");
        for (int i = 0; i < banks; i++) {
            balances[i] += kb.nextDouble();
            int loans = kb.nextInt();
            for (int j = 0; j < loans;  j++) {
                borrowers[i][kb.nextInt()] = kb.nextDouble();
            }
        }
        kb.close();
        
        //add balance from loans
        for (int i = 0; i < banks; i++) {
            balances[i] += sumRow(borrowers, i);
        }
        
        //check bank balances
        do {
            numFails = 0;
            for (int i = 0; i < banks; i++) {
                if (balances[i] < minBal) {
                    if (fails[i] == 0) {
                        numFails++;
                    }
                    fails[i]++;
                }
            }
            
            //check new balance after fails.
            for (int i = 0; i < banks; i++) {
                if (fails[i] == 1) {
                    for (int j = 0; j < banks; j++) {
                        balances[j] -= borrowers[j][i];
                    }
                }
            }
        } while (numFails != 0);
        
        System.out.print("Unsafe banks are: ");
        for (int i = 0; i < banks; i++) {
            if (fails[i] != 0) {
                System.out.print(i + " ");
            }
        }
    }
    /**
     * Return the sum of a specific row in a 2d double array.
     * @param array double[][]: 2d double array
     * @param row int: row index to sum
     * @return double: sum of row
     */
    public static double sumRow(double[][] array, int row) {
        double sum = 0;
        for (int i = 0; i < array[row].length; i++) {
            sum += array[row][i];
        }
        return sum;
    }
}