package exercises03;

import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      System.out.print("Enter a week number: ");
      int number = s.nextInt();
      for (int i = 1; i < 10; i++) {
        System.out.println(" " + i + " * " + number + " = " + i * number);
      }
      System.out.println("10 * " + number + " = " + (10 * number));
    }
  }
}
