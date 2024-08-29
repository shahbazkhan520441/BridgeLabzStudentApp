package structural.design.pattern.adapter;

public class AdapterPatternExample {
    public static void main(String[] args) {
        // Using Stripe PaymentProcessor
        PaymentProcessor stripe = new StripePaymentProcessor();
        stripe.pay(100.0);

        // Using PayPal with Adapter to fit PaymentProcessor interface
        PayPal payPal = new PayPal();
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPal);
        payPalAdapter.pay(200.0);
    }
}
