//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

    PaymentProcessor cc = new CreditCardPayment();
    ShoppingCart shoppingCart = new ShoppingCart(cc);
    shoppingCart.processPayment(10);
  }
}