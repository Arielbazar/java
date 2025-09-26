package javacodefromcodeboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class info2 {
    String name;
    long LRN;
    int age;

    // Constructor
    info2(String name, int age, long LRN) {
        this.name = name;
        this.age = age;
        this.LRN = LRN;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("LRN: " + this.LRN);
    }

    // Main method
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = reader.readLine();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(reader.readLine());

        System.out.print("Enter your LRN: ");
        long LRN = Long.parseLong(reader.readLine());

        info2 std = new info2(name, age, LRN);
        std.displayDetails();
    }
}
