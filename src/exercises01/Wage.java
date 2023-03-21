package exercises01;

import java.util.Scanner;

public class Wage {
  static double MW = 1320.00;

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      System.out.print("Enter your wage: ");
      double wage = s.nextDouble();
      System.out.printf("Well, you earn about %.1f minimum wages.\n", wage / MW);
    }
  }
}
