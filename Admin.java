import java.util.Scanner;

public class Admin {

    public static void main(String[] args) {
        BankManagement bankManagement = new BankManagement();
        Scanner sc = new Scanner(System.in);
        int count = 1;
        BankManagement.BankAccount[] accounts = new BankManagement.BankAccount[count];

        System.out.println("Enter the Details of 4 User in DB");
        System.out.println("--------------------------------");

        for (int i = 0; i < count; i++) {
            String accountNumber;
            String accountHolderName;
            double balance;
            String accountType;

            System.out.println("Enter the details for account " + (i + 1));
            System.out.println("Enter account number: ");
            accountNumber = sc.nextLine();
            System.out.println("Enter account holder name: ");
            accountHolderName = sc.nextLine();
            accountHolderName = "User" + i;
            balance = 500 + Math.random() * 1000;
            if (i % 2 == 0) {
                accountType = "Savings";
            } else {
                accountType = "Current";
            }
            accounts[i] = bankManagement.new BankAccount(accountNumber, accountHolderName, balance, accountType);

        }
        sc.close();

        for (int i = 0; i < 4; i++) {
            accounts[i].deposit(500.0);
            accounts[i].withdraw(200.0);
            accounts[i].checkBalance();
            accounts[i].displayAccountDetails();
        }
        int value;
        System.out.println("Choice Operation You want to do -");
        System.out.println("1. Transfer");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Check Balance");
        System.out.println("5. Display Account Details");
        System.out.print("\nEnter your choice: ");
        value = Integer.parseInt(sc.nextLine());
        switch (value) {
            case 1:
                System.out.println("Enter the account number to transfer from: ");
                int accNoFrom = Integer.parseInt(sc.nextLine());
                System.out.println("Enter the account number to transfer to: ");
                int accNoTo = Integer.parseInt(sc.nextLine());
                double amount = Double.parseDouble(sc.nextLine());
                accounts[accNoFrom - 1].transfer(accounts[accNoTo - 1], amount);

                break;

            default:
                break;
        }

    }

}
