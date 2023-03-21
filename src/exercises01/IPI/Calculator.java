package exercises01.IPI;

import java.util.Scanner;

public class Calculator {
  private double taxRate;
  private Piece[] pieces;
  private Scanner s = new Scanner(System.in);

  public void readTax() {
    System.out.print("Tax Rate: ");
    double rate = Double.parseDouble(s.nextLine());

    if (100 >= rate && rate >= 0) {
      this.taxRate = rate;
    } else {
      this.taxRate = 0;
    }
  }

  public void readPieces() {
    this.pieces = new Piece[2];

    for (int i = 0; i < 2; i++) {
      System.out.printf("Piece %d: ", i + 1);
      String pieceRawInfo = s.nextLine();
      String[] args = pieceRawInfo.split(" ");

      Double price = Double.parseDouble(args[2]);
      int quantity = Integer.parseInt(args[1]);

      pieces[i] = new Piece(args[0], price, quantity);
    }
  }

  public double calculate() {
    double priceSum = 0;

    for (Piece piece : pieces) {
      priceSum += piece.getPrice();
    }

    return priceSum * (1.0 + taxRate / 100);
  }

  public static void main(String[] args) {
    Calculator c = new Calculator();

    c.readTax();
    c.readPieces();

    System.out.println("IPI: " + c.calculate());
  }
}
