import java.util.Scanner;

public class CountFromTo {
    public static void main (String[] args) {

        // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter two number : ");
        int a = reader.nextInt();
        int b = reader.nextInt();

        if (a < b) {
            int c = a;
            while (c < b) {
                System.out.println(c + " ");
                c = c+ 1;
            }
        } else {
            System.out.println("The second number should be bigger");
            }
        }

    }
