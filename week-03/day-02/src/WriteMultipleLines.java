import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args){
        // Create a function that takes 3 parameters: a path, a word and a number,
        // than it should write to a file.
        // The path parameter should be a string, that describes the location of the file.
        // The word parameter should be a string, that will be written to the file as lines
        // The number parameter should describe how many lines the file should have.
        // So if the word is "apple" and the number is 5, than it should write 5 lines
        // to the file and each line should be "apple"
        // The function should not raise any error if it could not write the file.

        writeToFile("my-file.txt", "alma", 21);
    }
    public static void writeToFile(String path, String word, int lines){
        List<String> szoveg = new ArrayList<>();
        for (int i = 0; i < lines; i++){
            szoveg.add(word);
        }
        try {
            Path filePath = Paths.get(path);
            Files.write(filePath, szoveg);
        }catch  (Exception e){
            System.out.println("Can't write the file");
        }
    }
}
