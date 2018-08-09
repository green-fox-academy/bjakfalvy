import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args){
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        String square = "";
        System.out.println("*******");
        for ( int i = 1; i < number; i++){
            square = "* JÓ  *";
            System.out.println(square);
        }
        System.out.println("*******");
    }
}
