package exercises02;

import java.util.Scanner;

public class WeekDays {
  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      System.out.print("Enter a week number: ");
      int number = s.nextInt();
      switch (number) {
        case 1:
          System.out.println("Sunday");
          break;

        case 2:
          System.out.println("Second");
          break;

        case 3:
          System.out.println("Tuesday");
          break;

        case 4:
          System.out.println("Wednesday");
          break;

        case 5:
          System.out.println("Thursday");
          break;

        case 6:
          System.out.println("Friday");
          break;

        case 7:
          System.out.println("Saturday");
          break;

        default:
          System.out.printf("Has no week day with number %d.", number);
          break;
      }
    }
  }
}
