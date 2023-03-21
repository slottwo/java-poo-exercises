package exercises01;

import java.util.Scanner;

public class ARidiculousExercise {
  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      System.out.print("Enter a integer: ");
      int number = s.nextInt();
      System.out.printf("%d > %d > %d\n", number - 1, number, number + 1);
    }
  }
}
