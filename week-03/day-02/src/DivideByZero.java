import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args){
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0

        int i = 5;
        number(i);

        try  {
           number(0);
       }catch (ArithmeticException e){
           System.out.println("fail");
       }
    }
    public static void number(int i){
        System.out.println(10 / i);
    }
}
