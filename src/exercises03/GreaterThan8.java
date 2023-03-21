package exercises03;

import java.util.Scanner;

public class GreaterThan8 {
  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      int n = 0;
      for (int i = 0; i < 20; i++) {
        if (s.nextInt() > 8) {
          n++;
        }
      }
      System.out.println(n);
    }
  }
}
