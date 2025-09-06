package shoppingcart;

public class Main {
  public static void main(String[] args) {

    PaymentProcessor cc = new CreditCardPayment();
    ShoppingCart shoppingCart = new ShoppingCart(cc);
    shoppingCart.processPayment(10);
  }
}