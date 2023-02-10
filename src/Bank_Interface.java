public interface Bank_Interface {

    int getBalance();
    String depositMoney(int amount);
    String withdraw(int amount,String Password);
    double calculateInterest(int time);
}
