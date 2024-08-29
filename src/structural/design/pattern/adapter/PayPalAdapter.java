package structural.design.pattern.adapter;

//Adapter: Adapting PayPal to PaymentProcessor
public class PayPalAdapter implements PaymentProcessor {
 private PayPal payPal;

 public PayPalAdapter(PayPal payPal) {
     this.payPal = payPal;
 }

 @Override
 public void pay(double amount) {
     payPal.makePayment(amount);  // Delegate the call to PayPal's method
 }
}
