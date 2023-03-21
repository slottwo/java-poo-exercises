package exercises02;

import java.util.Scanner;

public class IMC {
  public static void main(String[] args) {
    try (Scanner scn = new Scanner(System.in)) {
      System.out.print("Weight: ");
      double w = scn.nextDouble();
      
      System.out.print("Height: ");
      double h = scn.nextDouble();

      double imc = w / h / h;

      String sit;

      if (imc < 20) {
        sit = "Under Weight";
      } else if (imc < 25) {
        sit = "Normal Weight";
      } else if (imc < 30) {
        sit = "Overweight";
      } else if (imc < 40) {
        sit = "Obese";
      } else {
        sit = "Morbidly Obese";
      }

      System.out.println("\nSituation: " + sit);
    }
  }
}
