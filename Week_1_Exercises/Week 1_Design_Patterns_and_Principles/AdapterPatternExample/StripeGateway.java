public class StripeGateway {
    public void chargeWithStripe(String paymentMethod, double amount) {
        System.out.println("Processing payment with Stripe: " + paymentMethod + " - " + amount);
    }
}