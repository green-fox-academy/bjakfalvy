import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }
    private static ArrayList<String> appendA(List<String> a) {
        ArrayList<String> withA = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            withA.add(a.get(i) + "a");
        }
        return withA;
    }

}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"
