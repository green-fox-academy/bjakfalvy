import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        // Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = reader.nextInt();

        if (n <= 0)
        {
            System.out.println("Not enough");
        }

        if (n == 1) {
            System.out.println("One");
        }

        if (n == 2) {
            System.out.println("Two");
        }

        if (n > 2) {
            System.out.println("A lot");
        }


    }
}
