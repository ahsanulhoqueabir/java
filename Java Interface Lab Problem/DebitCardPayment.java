public class DebitCardPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made using Debit Card.");
    }
}
