// import BankApplication.BankAccount;

public class CheckingAccount extends BankAccount {
    private int transactionLimit;
    private int transactionFee;

    public CheckingAccount(String accountNumber, int balance, int transactionLimit, int transactionFee) {
        super(accountNumber, balance);
        this.transactionLimit = transactionLimit;
        this.transactionFee = transactionFee;
    }

    public void deductTransactionFee(int numberOfTransactions) {
        if (numberOfTransactions > transactionLimit) {
            int fee = (numberOfTransactions - transactionLimit) * transactionFee;
            withdraw(fee);
            System.out.println("Deducted transaction fee for " + (numberOfTransactions - transactionLimit)
                    + " transactions: " + fee + ".");
        } else {
            System.out.println("No transaction fee to deduct.");
        }
    }

    public int getTransactionLimit() {
        return transactionLimit;
    }

    public void setTransactionLimit(int transactionLimit) {
        this.transactionLimit = transactionLimit;
    }

    public int getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(int transactionFee) {
        this.transactionFee = transactionFee;
    }
}
