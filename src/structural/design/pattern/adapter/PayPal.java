package structural.design.pattern.adapter;

//Adaptee (PayPal with different interface)
public class PayPal {
 public void makePayment(double amountInDollars) {
     System.out.println("Payment of $" + amountInDollars + " made using PayPal.");
 }
}
