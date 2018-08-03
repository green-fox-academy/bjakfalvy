import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        // Create a program that asks for a number and prints the multiplication table with that number
//
// Example:
// The number 15 should print:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number : ");
        int a = reader.nextInt();

        System.out.println("The multiplication table for your number is: ");
        System.out.println("1 * "+ a + "=" + 1*a);
        System.out.println("2 * "+ a + "=" + 2*a);
        System.out.println("3 * "+ a + "=" + 3*a);
        System.out.println("4 * "+ a + "=" + 4*a);
        System.out.println("5 * "+ a + "=" + 5*a);
        System.out.println("6 * "+ a + "=" + 6*a);
        System.out.println("7 * "+ a + "=" + 7*a);
        System.out.println("8 * "+ a + "=" + 8*a);
        System.out.println("9 * "+ a + "=" + 9*a);
        System.out.println("10 * "+ a + "=" + 10*a);

    }


}
