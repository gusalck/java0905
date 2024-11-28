package chp12.ex12_9;

public class BankAccount {
    private final String username;
    private final String number;
    private long balance;

    public BankAccount(String username, String number, long balance) {
        this.username = username;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("%s\t%s\t%d", username, number, balance);
    }
}
