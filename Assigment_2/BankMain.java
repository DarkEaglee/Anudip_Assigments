class BankAccount{
    private int accountNo;
    private double balance;
    private String accountHolderName;


    public void deposit(double amt){
        balance += amt;
    }
    public void withdraw(double amt){
        if(balance>amt){
            balance -= amt;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    public double getBalance(){
        return balance;
    }
}


public class BankMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(5000);
        bankAccount.withdraw(500);
        System.out.println(bankAccount.getBalance());
    }
}
