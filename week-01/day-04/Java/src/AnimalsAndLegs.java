import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner in = new Scanner(System.in);
        System.out.println("How many chickens has the farmer?");
        int numOfChick = in.nextInt();
        System.out.println("How many pigs has the farmer?");
        int numOfPig = in.nextInt();

        System.out.println("This is how many legs all the animals have: " + ((numOfChick*2) + (numOfPig*4)));

    }
}
