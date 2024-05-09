public class Buys {
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
}
