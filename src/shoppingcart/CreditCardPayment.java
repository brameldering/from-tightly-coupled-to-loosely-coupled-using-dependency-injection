package shoppingcart;

public class CreditCardPayment implements PaymentProcessor {

  public void processPayment(double amount) {
    System.out.println("Credit Card Payment for amount " + amount);
  }
}
