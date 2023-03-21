package exercises02;

import java.util.Scanner;

public class CalorieCalculator {
  enum Dishes {
    VEGETARIAN(128), 
    FISH(230), 
    CHICKEN(250), 
    MEAT(350);

    private int calory;

    public int getCalory() {
      return this.calory;
    }

    private Dishes(int calory) {
      this.calory = calory;
    }
  }

  enum Desserts {
    PINEAPPLE(75), 
    DIET_ICE_CREAM(110), 
    DIET_MOUSSE(170), 
    CHOCOLATE_MOUSSE(200);

    private int calory;

    public int getCalory() {
      return this.calory;
    }

    private Desserts(int calory) {
      this.calory = calory;
    }
  }

  enum Drinks {
    TEA(20), 
    ORANGE_JUICE(70), 
    MELON_JUICE(100), 
    DIET_SODA(65);

    private int calory;

    public int getCalory() {
      return this.calory;
    }

    private Drinks(int calory) {
      this.calory = calory;
    }
  }

  public static void main(String[] args) {
    Dishes dish;
    Desserts dessert;
    Drinks drink;

    try (Scanner s = new Scanner(System.in)) {
      int i, choice;

      i = 1;
      System.out.println("Dishes: ");
      for (Dishes d : Dishes.values()) {
        System.out.println(i + ". " + d);
        i++;
      }
      System.out.print("Enter your dish: [1-4] ");
      choice = s.nextInt();
      dish = Dishes.values()[choice - 1];

      i = 1;
      System.out.println("Desserts: ");
      for (Desserts d : Desserts.values()) {
        System.out.println(i + ". " + d);
        i++;
      }
      System.out.print("Enter your dish: [1-4] ");
      choice = s.nextInt();
      dessert = Desserts.values()[choice - 1];

      i = 1;
      System.out.println("Drinks: ");
      for (Drinks d : Drinks.values()) {
        System.out.println(i + ". " + d);
        i++;
      }
      System.out.print("Enter your dish: [1-4] ");
      choice = s.nextInt();
      drink = Drinks.values()[choice - 1];
    }

    System.out.println("Calories: " + dish + dessert + drink);
  }
}
