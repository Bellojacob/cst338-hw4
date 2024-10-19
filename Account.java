public abstract class Account implements Balanceable, Depositable, Withdrawable{
    private double balance;
    private int transactionCount;

    public void account(double balance){

    }

    public abstract double getBalance();

}
