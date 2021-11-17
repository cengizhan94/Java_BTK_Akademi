public class Main {

    public static void main(String[] args) {
	    AccountManager manager = new AccountManager();
        System.out.println("Hesap Bakiyeniz = "+manager.getBallance());
        manager.deposit(100);
        System.out.println("Hesap Bakiyes = "+ manager.getBallance());

        try{
            manager.withdraw(90);
        }catch(BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }

        System.out.println("Hesap Bakiyes = "+ manager.getBallance());
        try{
            manager.withdraw(20);
        }catch(BalanceInsufficentException exception){
           System.out.println(exception.getMessage());
        }
        System.out.println("Hesap Bakiyes = "+ manager.getBallance());
    }
}
