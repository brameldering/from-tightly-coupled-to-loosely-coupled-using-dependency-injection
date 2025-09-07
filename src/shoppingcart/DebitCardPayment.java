package shoppingcart;

public class DebitCardPayment implements PaymentProcessor {

  public void processPayment(double amount) {
    System.out.println("Debit Card Payment for amount " + amount);
  }
}
