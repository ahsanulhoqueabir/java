
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("12345", 1000);
        bankAccount.deposit(500);
        bankAccount.withdraw(200);
        System.out.println("BankAccount Balance: " + bankAccount.getBalance());

        System.out.println();

        SavingsAccount savingsAccount = new SavingsAccount("67890", 2000, 0.05);
        savingsAccount.deposit(1000);
        savingsAccount.calculateInterest(1);
        System.out.println("SavingsAccount Balance: " + savingsAccount.getBalance());
        System.out.println();

        CheckingAccount checkingAccount = new CheckingAccount("11223", 1500, 5, 2);
        checkingAccount.deposit(500);
        checkingAccount.deductTransactionFee(7);
        System.out.println("CheckingAccount Balance: " + checkingAccount.getBalance());
        System.out.println();
    }
}
