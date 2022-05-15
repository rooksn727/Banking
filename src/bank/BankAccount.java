package bank;

import java.util.Random;

/**
 * bank account class
 */
public class BankAccount {
    private int actNumber;
    private String customerName;
    private int actBalance;

    /**
     * Bank Account constructor that takes in the following paramters
     * @param actNumber
     * @param customerName
     * @param actBalance
     */
    public BankAccount(int actNumber, String customerName, int actBalance) {
        super();
        this.actNumber = actNumber;
        this.customerName = customerName;
        this.actBalance = actBalance;

    }

    public BankAccount() {
        super();
    }

    public int getActNumber() {
        return actNumber;
    }

    public void setActNumber(int actNumber) {
        this.actNumber = actNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getActBalance() {
        return actBalance;
    }

    public void setActBalance(int actBalance) {
        this.actBalance = actBalance;
    }

    /**
     * deposit
     * adds money to account
     * @param depositAmount
     */
    public void deposit(int depositAmount) {
        actBalance += depositAmount;
        Random r = new Random();
        /**
         * after deposit
         * we need to store details in a transaction class
         * store the object in a data structure
         * for future reference
         */
        Transaction t = new Transaction(r.nextInt(),
                actNumber, depositAmount,"deposit", actBalance);
        TransactionData.addTransaction(t);
        System.out.println("deposit completed and transaction stored");
    }

    /**
     * if there is money withdraw it from account
     * if you are withdrawing more than what is in the account
     * throw an exception
     * @param withdrawAmount
     */
    public void withdraw(int withdrawAmount) {
        if (withdrawAmount > actBalance) {
            try {
                throw new InSufficientBalanceException();
            } catch (InSufficientBalanceException e) {
                e.printStackTrace();
            }
            actBalance -= withdrawAmount;
        }
        Random r = new Random();
        /**
         * after withradawl
         * we need to store details in a transaction class
         * store the object in a data structure
         * for future reference
         */
        Transaction t = new Transaction(r.nextInt(),
                actNumber, withdrawAmount,"withdraw", actBalance);
        TransactionData.addTransaction(t);
        System.out.println("withdraw completed and transaction stored");

    }
}
