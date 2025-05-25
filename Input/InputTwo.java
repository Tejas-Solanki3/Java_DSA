import java.util.Scanner;

public class InputTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your age");
        String age = scanner.nextLine();
        
        System.out.println("Hello, "+ name + " " + "you're " + age + "years old");

        System.out.println("Are you a student? (true/false)");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Are you a student? " + isStudent);

        scanner.close();
    }
}
