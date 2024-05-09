public class Buys implements Comparable<Buys>{
  private double value;
  private String description;

  public Buys(double value, String description) {
    this.value = value;
    this.description = description;
  }

  public double getValue() {
    return value;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    return "Buys: " +
            "value=" + value +
            ", description='" + description;
  }

  @Override
  public int compareTo(Buys anotherBuy) {
    return Double.valueOf(this.value).compareTo(Double.valueOf(anotherBuy.getValue()));
  }
}
