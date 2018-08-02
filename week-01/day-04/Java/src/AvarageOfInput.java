import java.util.Scanner;

public class AvarageOfInput {
    public static void main(String[] args) {

        // Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

        Scanner in = new Scanner(System.in);
        System.out.println("First number: ");
        int a = in.nextInt();

        System.out.println("Second number: ");
        int b = in.nextInt();

        System.out.println("Third number: ");
        int c = in.nextInt();

        System.out.println("Fourth number: ");
        int d = in.nextInt();

        System.out.println("Fifth number: ");
        int e = in.nextInt();

        System.out.println("Sum: " + (a+b+c+d+e) + ", Avarage: "+ ((a+b+c+d+e)/5));

    }
}
