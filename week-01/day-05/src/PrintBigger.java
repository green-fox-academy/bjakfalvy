import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        // Write a program that asks for two numbers and prints the bigger one
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter two number : ");
        int a = reader.nextInt();
        int b = reader.nextInt();

        if (a > b) {
            System.out.println(a + " is bigger");
        } else {
            System.out.println(b + " is bigger");
        }

    }
}