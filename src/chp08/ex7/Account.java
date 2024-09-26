package chp08.ex7;

public class Account {
    private String num;
    private int balance;

    public Account(String num, int balance) {
        this.num = num;
        this.balance = balance;
    }

    public boolean transfer(Account num, int amount) {
        if (this.balance <= amount) {
            return false;
        }
        else{
            this.balance -= amount;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "num='" + num + '\'' +
                ", balance=" + balance +
                '}';
    }
}
