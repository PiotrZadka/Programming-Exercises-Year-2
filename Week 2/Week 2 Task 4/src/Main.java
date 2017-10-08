public class Main {
    public static void main(String[] args) {

        BankAccount bank = new BankAccount(100);

        System.out.println("Current balance is "+bank.getBalance());

        System.out.println("Deposit 200 ");
        bank.deposit(200);
        System.out.println("New Balance = "+bank.getBalance());

        System.out.println("Withdraw 100 ");
        bank.withdraw(100);
        System.out.println("New Balance = "+bank.getBalance());

    }

}

