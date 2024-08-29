package structural.design.pattern.adapter;

//Concrete Implementation (Stripe)
public class StripePaymentProcessor implements PaymentProcessor {
 @Override
 public void pay(double amount) {
     System.out.println("Payment of $" + amount + " made using Stripe.");
 }
}

