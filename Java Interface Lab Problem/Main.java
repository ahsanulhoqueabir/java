public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        Payment debitCardPayment = new DebitCardPayment();
        Payment cashPayment = new CashPayment();

        creditCardPayment.makePayment(100.0);
        debitCardPayment.makePayment(50.0);
        cashPayment.makePayment(25.0);
    }
}
