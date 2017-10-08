public class BankAccount {

    private float balance;

    BankAccount() {
        //blank constructor in case there was no input, so a default value was required to take in place.
        balance = 0;
    }

    BankAccount(float balance) {
        this.balance = balance;
    }

    public void deposit(double cashIn) {
        //cast float because balance is float. That wouldn't be a matter if balance was double too.
        balance = (float) (balance + cashIn);
    }

    public void withdraw(double cashOut) {
        balance = (float) (balance - cashOut);
    }

    public double getBalance() {
        return balance;
    }
}
