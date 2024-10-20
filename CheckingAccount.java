public class CheckingAccount extends Account{
    private double monthlyFee;

    public CheckingAccount(double balance) {
        super(balance);
    }


    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public void setBalance(double amount) {

    }


    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }
}
