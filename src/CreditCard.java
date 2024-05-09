import java.util.ArrayList;
import java.util.List;

public class CreditCard {
  private double limit;
  private double balance;
  private List<Buys> shoppinglist;

  public CreditCard(double limit ) {
    this.limit = limit;
    this.balance = balance;
    this.shoppinglist = new ArrayList<>();
  }
  public boolean checkBalance(Buys buy) {
    if(this.balance >= buy.getValue()) {
      this.balance -= buy.getValue();
      this.shoppinglist.add(buy);
      return true;
    }
    return false;
  }

  public double getLimit() {
    return limit;
  }

  public double getBalance() {
    return balance;
  }

  public List<Buys> getShoppinglist() {
    return shoppinglist;
  }
}
