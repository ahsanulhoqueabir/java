

public class BankManagement {
    public class BankAccount {
        private String accountNumber;
        private String accountHolderName;
        private double balance;
        private String accountType;

        public BankAccount(String accountNumber, String accountHolderName, double balance, String accountType) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
            this.accountType = accountType;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited " + amount + " successfully.");
        }

        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn " + amount + " successfully.");
            } else {
                System.out.println("Insufficient balance.");
            }
        }

        public void checkBalance() {
            System.out.println("Account Balance: " + balance);
        }

        public void transfer(BankAccount destinationAccount, double amount) {
            if (balance >= amount) {
                withdraw(amount);
                destinationAccount.deposit(amount);
                System.out.println("Transferred " + amount + " to account number "
                        + " successfully.");
            } else {
                System.out.println("Insufficient balance for transfer.");
            }
        }

        public void displayAccountDetails() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Balance: " + balance);
            System.out.println("Account Type: " + accountType);
            System.out.println();
        }
    }

   
}
