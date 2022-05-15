package bank;

public class Transaction {
    private int transactionNumber;
    private int actNumber;
    private int tranAmount;
    private String tranType;
    private int balanceAfterTransaction;

    public Transaction() {
        super();
    }

    public Transaction(int transactionNumber, int actNumber, int tranAmount,
                       String tranType, int balanceAfterTransaction) {
        this.transactionNumber = transactionNumber;
        this.actNumber = actNumber;
        this.tranAmount = tranAmount;
        this.tranType = tranType;
        this.balanceAfterTransaction = balanceAfterTransaction;
    }

    public int getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public int getActNumber() {
        return actNumber;
    }

    public void setActNumber(int actNumber) {
        this.actNumber = actNumber;
    }

    public int getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(int tranAmount) {
        this.tranAmount = tranAmount;
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    public int getBalanceAfterTransaction() {
        return balanceAfterTransaction;
    }

    public void setBalanceAfterTransaction(int balanceAfterTransaction) {
        this.balanceAfterTransaction = balanceAfterTransaction;
    }
}
