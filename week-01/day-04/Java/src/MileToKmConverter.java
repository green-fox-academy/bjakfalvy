import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner distance = new Scanner(System.in);
        System.out.println("Give me a distance in km: ");
        double miles = distance.nextInt() / 1.6;
        System.out.println("This is " + miles + " miles.");

    }
}
