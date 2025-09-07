package shoppingcart;

public class Main {
  public static void main(String[] args) {

    PaymentProcessor cc = new CreditCardPayment();
    ShoppingCart sc = new ShoppingCart(cc);
    sc.checkOut(10);

    PaymentProcessor db = new DebitCardPayment();
    ShoppingCart sc2 = new ShoppingCart(db);
    sc2.checkOut(20);
  }
}