package solid.principle;
//Liskov Substitution Principle (LSP)
//Subtypes should be substitutable for their base types without altering the correctness of the program.
//if we want parent or base type at that time we should able to use any of there sub type without effection the programe 
//Abstract class representing Payment
abstract class Payment {
 abstract void processPayment(double amount);
}

//CreditCardPayment class extending Payment
class CreditCardPayment extends Payment {
 @Override
 void processPayment(double amount) {
     System.out.println("Processing credit card payment of " + amount);
 }
}

//PayPalPayment class extending Payment
class DebitCard extends Payment {
 @Override
 void processPayment(double amount) {
     System.out.println("Processing debitcard payment of " + amount);
 }
}

//Main class to demonstrate Liskov Substitution Principle
public class PaymentProcessor {
 
 // Method that accepts any Payment object and processes payment
 public static void processTransaction(Payment payment, double amount) {
     payment.processPayment(amount);
 }

 public static void main(String[] args) {
	 
	 
     Payment P = new CreditCardPayment();
     
     
	 P.processPayment(200);
     // Create a CreditCardPayment object and process payment
     Payment creditCardPayment = new CreditCardPayment();
     processTransaction(creditCardPayment, 150.00);

     // Create a PayPalPayment object and process payment
     Payment debitcard = new DebitCard();
     processTransaction(debitcard, 250.00);
     
     
     
     
     
 }
}
