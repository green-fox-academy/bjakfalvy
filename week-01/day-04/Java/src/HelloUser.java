import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.println("Hello, " + name);

    }
}
