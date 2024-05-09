import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {

    Scanner lecture = new Scanner(System.in);
    System.out.println("Escriba el límite de la tarjeta: ");
    double limit = lecture.nextDouble();
    CreditCard card = new CreditCard(limit);

    int exit = 1;
    while(exit != 0) {
      System.out.println("Escriba la descripción de la compra:");
      String description = lecture.next();

      System.out.println("Escriba el valor de la compra:");
      double value = Double.valueOf(lecture.next());

      Buys buy = new Buys(value, description);
      boolean buyCompleted = card.checkBalance(buy);

      if (buyCompleted) {
        System.out.println("Compra realizada!");
        System.out.println("Escriba 0 para salir o 1 para continuar");
        exit = lecture.nextInt();
      } else {
        System.out.println("Saldo insuficiente!");
        exit = 0;
      }
    }
    System.out.println("***********************");
    System.out.println("COMPRAS REALIZADAS:\n");
    for (Buys buy : card.getShoppinglist()) {
      System.out.println(buy.getDescription() + " - " +buy.getValue());
    }
    System.out.println("\n***********************");
    System.out.println("\nSaldo de la tarjeta: " +card.getBalance());

  }
}