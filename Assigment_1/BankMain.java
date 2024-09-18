import java.util.Scanner;

class BankAccount {
    int accountNo;
    String accountHolderName;
    float balance;

    BankAccount(int accountNo, String accountHolderName, float balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposite(float amt){
        this.balance += amt;
        System.out.println("Deposited " + amt + " to " + this.accountHolderName);
    }
    public void withdraw(float amt){
        if(amt-balance>500) {
            this.balance -= amt;
            System.out.println(this.accountHolderName + " Withdraw: " + amt);
        }
    }
    public void AccountInfo() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: Rs." + balance);
    }
}

public class BankMain{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        BankAccount act1 = new BankAccount(671323, "Prince", 17281);

        System.out.print("\nEnter amount to be deposited: ");
        float depositAmt = scan.nextFloat();
        act1.deposite(depositAmt);

        System.out.print("\nEnter amount to be Withdraw: ");
        float withdrawAmt = scan.nextFloat();
        act1.withdraw(withdrawAmt);

        System.out.println("\nFinal details: ");
        act1.AccountInfo();

    }
}
