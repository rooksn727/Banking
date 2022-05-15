package bank;

public class BankingMain {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(727, "Rooks", 500);

        b1.deposit(1000);
        b1.deposit(500);
        b1.withdraw(700);
        b1.deposit(200);
        b1.withdraw(300);

        System.out.println("---------------");
        TransactionData.showMiniStatement(727);
    }
}
