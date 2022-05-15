package bank;

public class InSufficientBalanceException extends Throwable {

    public String toString() {
        return "Balance not Suffiecient ";
    }
}
