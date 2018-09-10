public class Exercise5 {
    public static void main(String[] args) {
        //Write a Stream Expression to find the uppercase characters in a string!
        String blabla = "This is my text, and my name is Benedek Jakfalvy.";

        blabla.chars()
                .filter(Character::isUpperCase)
                .mapToObj(c -> Character.toString((char)c))
                .forEach(System.out::println);
    }
}
