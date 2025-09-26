package javacodefromcodeboard;

import java.util.Scanner;

public class info3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your grade and section:");
        String gradeSection = scanner.nextLine();

        System.out.println("Enter the current year:");
        int currentYear = scanner.nextInt();

        System.out.println("Enter your birth year:");
        int birthYear = scanner.nextInt();

        System.out.println("Enter your birth month (1-12):");
        int birthMonth = scanner.nextInt();

        System.out.println("Enter your birth day (1-31):");
        int birthDay = scanner.nextInt();

        int estimatedAge = currentYear - birthYear;

        // Get current date
        java.time.LocalDate currentDate = java.time.LocalDate.now();

        // If birthday hasn't occurred yet this year, subtract one year
        if (currentDate.getMonthValue() < birthMonth ||
                (currentDate.getMonthValue() == birthMonth && currentDate.getDayOfMonth() < birthDay)) {
            estimatedAge--;
        }

        System.out.println("I am " + name + " of " + gradeSection
                + ". I am about " + estimatedAge + " years old. Thank you!");

        scanner.close();
    }
}
