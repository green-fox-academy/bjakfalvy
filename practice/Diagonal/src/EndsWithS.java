import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EndsWithS {

    /**
     * Create a method called `endsWithS` that takes a filename as a string
     * and returns the number of the words, that ends with 's'.
     * <p>
     * Example cases:
     * <p>
     * the correct output for the 'base.txt' is: 26
     * hint: Keep in mind that there may punctuation marks at the end of the words
     */

    public static void main(String[] args) {
        System.out.println(endsWithS("base.txt"));
    }

    public static int endsWithS(String filename) {
        int endingCounter = 0;
        try {
            Path filepath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filepath);
            for (String line : lines) {
                String[] words = line.split(" ");
                for (int i = 0; i < words.length; i++) {
                    if (words[i].charAt(words[i].length() - 1) == 's') {
                        endingCounter++;
                    } else if (words[i].charAt(words[i].length() - 1) == ',' || words[i].charAt(words[i].length() - 1) == ':' || words[i].charAt(words[i].length() - 1) == ';' || words[i].charAt(words[i].length() - 1) == '.') {
                        if (words[i].charAt(words[i].length() - 2) == 's') {
                            endingCounter++;
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Could not read the file.");
        }
        return endingCounter;
    }
}