public abstract class Account implements Balanceable, Depositable, Withdrawable{
    private double balance;
    private int transactionCount;

    public Account(double balance) {
        this.balance = balance;
    }

    public abstract double getBalance();

}
