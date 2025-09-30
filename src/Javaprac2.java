import java.util.Scanner;
public class Javaprac2 {
    public static void main(String[]ars){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("You are " + age + " " + "years old");

        System.out.print("Are you a Student? (Truel/False): ");
        boolean isStudent = scanner.nextBoolean();

        if (isStudent){
            System.out.print("You are enrooled as a student ");
        }
        else {
            System.out.println("you are not enrolled");
        }

        System.out.print("Enter your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.println("Your gpa is " + gpa);
    }
}