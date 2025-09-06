public class ShoppingCart {

  private CreditCardPayment cc = new CreditCardPayment();
  private DebitCardPayment debit = new DebitCardPayment();

  public void processPayment(String type, double amount) {
    if (type.equals("CreditCardPayment")) {
      cc.processPayment(amount);
    }
    else if (type.equals("DebitCardPayment")) {
      debit.processPayment(amount);
    }
  }
}
