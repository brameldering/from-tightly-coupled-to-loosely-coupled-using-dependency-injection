package shoppingcart;

public class ShoppingCart {

  private final PaymentProcessor paymentProcessor;

  public ShoppingCart(PaymentProcessor paymentProcessor) {
    this.paymentProcessor = paymentProcessor;
  }

  public void processPayment(double amount) {
    paymentProcessor.processPayment(amount);
  }
}
