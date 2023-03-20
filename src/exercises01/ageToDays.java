package exercises01;

import java.util.Scanner;

public class ageToDays {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int i = 0, days = 0;
            int[] conversion_rates = { 30, 1, 365 };

            System.out.print("Enter your Age [MM/DD/YYYY]: ");

            for (String age : s.next().split("/")) {
                days += Integer.parseInt(age) * conversion_rates[i];
                i++;
            }

            System.out.printf("You've been alive for %d days.\n", days);
        }
    }
}
