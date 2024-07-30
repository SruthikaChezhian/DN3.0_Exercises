public class AdapterPatternExample {
    public static void main(String[] args) {

        PayPalGateway payPalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();
        BankTransferGateway bankTransferGateway = new BankTransferGateway();

        PaymentProcessor payPalAdapter = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripeGateway);
        PaymentProcessor bankTransferAdapter = new BankTransferAdapter(bankTransferGateway);

        payPalAdapter.processPayment("Credit Card", 100.0);
        stripeAdapter.processPayment("Debit Card", 50.0);
        bankTransferAdapter.processPayment("Bank Account", 200.0);
    }
}