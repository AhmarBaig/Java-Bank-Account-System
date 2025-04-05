public class App {
    public static void main(String[] args) throws Exception {
        BankAccount personalAccount = new BankAccount("Ahmar");
        
        System.out.println(personalAccount);
        personalAccount.checkBalance();

        personalAccount.depositMoney(100);
        personalAccount.checkBalance();

        personalAccount.withdrawMoney(50);
        personalAccount.checkBalance();

        personalAccount.withdrawMoney(1000);   
    }
}
