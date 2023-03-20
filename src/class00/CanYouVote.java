package class00;

import java.util.Scanner;

public class CanYouVote {
    public static void main(String[] args) {
        int age;

        System.out.println("Can you vote?");

        System.out.print("Insert your age: ");
        try (Scanner scanner = new Scanner(System.in)) {
            age = scanner.nextInt();
        }

        if (age < 16) {
            System.out.println("No.");
        } else if (age < 18 || age > 70) {
            System.out.println("Its optional.");
        } else {
            System.out.println("You must vote.");
        }
    }
}
