import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Your name, Enter the password and initial balance");
        String name= sc.next();
        String password= sc.next();
        int balance= sc.nextInt();

        SBIAccount AbhishekAcc= new SBIAccount(name,balance,password);
        System.out.println("Youe Account has been created with account number: "+AbhishekAcc.getAccountNo());

        //getBalance
        System.out.println("Your current balance is:" +AbhishekAcc.getBalance());

        //deposit
        System.out.println(AbhishekAcc.depositMoney(500));
        System.out.println("New balance is:"+AbhishekAcc.getBalance());

        //withdraw
        System.out.println("Enter amount to be withdraw:");
        int amount= sc.nextInt();
        System.out.println("Enter your password");
        String enteredpassword = sc.next();
        System.out.println(AbhishekAcc.withdraw(amount,enteredpassword));
        System.out.println("Current balance is:" +AbhishekAcc.getBalance());

        //Interest
        System.out.println("Interest for 4years on current balance:"+AbhishekAcc.getBalance() +" is "+ AbhishekAcc.calculateInterest(4));
    }
}