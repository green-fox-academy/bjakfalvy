import java.util.Scanner;

public class Factorio {

    public static void main(String[] args) {

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(factorio(number));
    }

    public static int factorio(int number) {
        int factorio = 1;
        for (int i = 1; i <= number; i += 1) {
            factorio = factorio * i;
    }
    return factorio;
}
}
