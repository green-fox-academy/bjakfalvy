import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args){
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        // Sum: 22, Average: 4.4

        System.out.println("Type your number: ");
        Scanner szam = new Scanner(System.in);
        int number = szam.nextInt();
        int sum = 0;
        for (int i = 0; i < number; i++){
            System.out.println("Enter " + (number - i) + " number(s).");
            sum += szam.nextInt();
        }
        System.out.println("Sum: " + sum + ", Average: " + (double)sum/number);
    }
}
