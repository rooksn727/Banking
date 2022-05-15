package bank;

import java.util.LinkedList;
import java.util.List;

public class TransactionData {

    public static List<Transaction> transactionList = new LinkedList<Transaction>();

    public static void addTransaction(Transaction t){
        transactionList.add(t);
    }

    /**
     * shows the transaction details of each deposit and withdraw
     * @param actNumber
     */
    public static void showMiniStatement(int actNumber){
        System.out.println("Mini statement for account Number : " + actNumber);
        System.out.println();
        for (Transaction t : transactionList) {
            if (t.getActNumber() == actNumber){
                System.out.println(t.getTransactionNumber() + "-" + t.getTranType() +
                        "-" + t.getTranAmount() + "-" + t.getBalanceAfterTransaction());
            }
        }
    }

}
