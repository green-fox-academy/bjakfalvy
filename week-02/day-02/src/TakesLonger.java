public class TakesLonger {
    public static void main(String[] args) {
        // String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String first = quote.substring(0,20);
        System.out.println(quote.substring(0,20));
        String second = " always takes longer than ";
        String third = quote.substring(21,quote.length());
        quote = first + second + third;

        System.out.println(quote);
    }

}
