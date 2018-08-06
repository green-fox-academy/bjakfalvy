import java.util.Scanner;

public class Summing {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(sum(number));
    }
    public static int sum(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i += 1) {
            sum += i;
        }
        return sum;
    }
}
