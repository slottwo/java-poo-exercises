package exercises03;

import exercises03.People.SEX;

public class DemographicAnalysis {
  private static People[] database;

  public static void main(String[] args) {
    double maleSum = 0;
    double femaleNumber = 0;
    double greaterHeight = 0;
    double lesserHeight = database[0].getHeight();
    for (People people : database) {
      if (people.getHeight() > greaterHeight) {
        greaterHeight = people.getHeight();
      }
      if (people.getHeight() < lesserHeight) {
        lesserHeight = people.getHeight();
      }
      if (people.getSex() == SEX.MALE) {
        maleSum += people.getHeight();
      } else {
        femaleNumber++;
      }
    }

    System.out.printf("The greater number is %d.", greaterHeight);
    System.out.printf("And the lesser number is %d.", lesserHeight);
    System.out.printf(
        "The men average height of men in %d.",
        maleSum / (database.length - femaleNumber));
    System.out.printf("The women number is %d.", femaleNumber);
  }
}

class People {
  private int height;
  private SEX sex;

  public enum SEX {
    MALE, FEMALE;
  }

  public People(SEX sex, int height) {
    this.height = height;
    this.sex = sex;
  }

  public int getHeight() {
    return height;
  }

  public SEX getSex() {
    return sex;
  }
}
