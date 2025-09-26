package javacodefromcodeboard;

import java.util.Scanner;
import java.lang.Math;

public class info4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter BMI: ");
        double bmi = scanner.nextDouble();

        System.out.print("Enter weight (in kilograms): ");
        double weight = scanner.nextDouble();

        double height = Math.sqrt(weight / bmi);

        System.out.println("Height: " + String.format("%.2f", height) + " meters");
    }
}
