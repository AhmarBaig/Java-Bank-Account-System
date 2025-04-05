import java.util.Random;

public class BankAccount {
    
    private long accountNumber;
    private String accountName;
    private long balance;

    public BankAccount(String accountName) {
        this.accountName = accountName;
        Random rand = new Random();
        accountNumber = Math.abs(rand.nextInt(2147483646) + 1000000000);
        balance = 0;
    }

    public String toString() {
        String account = "Account Holder: " + this.accountName + "\nBank Account: " + Long.toString(accountNumber);
        return account;
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public void depositMoney(long deposit) {
        if (balance + deposit > Long.MAX_VALUE) {
            System.out.println("Bank Account cannot hold a balance this great. Please speak to a manager to increase your limit");
        } else {
            balance += deposit;
        }
    }

    public void withdrawMoney(long withdraw) {
        if (withdraw > balance || balance - withdraw <= 0) { System.out.println("Withdrawal amount greater than account balance. Please check your balance"); }
        else {
            balance -= withdraw;
        }
    }
}

