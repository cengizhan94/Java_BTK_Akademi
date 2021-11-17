public class AccountManager {
    private double balance;

    public void deposit(double amount){

        balance = getBallance() + amount;

    }

    public void withdraw(double amount) throws BalanceInsufficentException {
        if(balance >= amount){
           balance = getBallance() - amount;
        }else{
            throw new BalanceInsufficentException("Bakiye yetersiz");
        }


    }


    public double getBallance() {
        return balance;
    }
}
