import sun.nio.ch.sctp.SctpNet;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args){
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        copyFiles("my-files.txt", "my-copy.txt");

    }
    public static boolean copyFiles(String fileName, String copy){
        try {
            Path original = Paths.get(fileName);
            Path copied = Paths.get(copy);
            List<String> lines = Files.readAllLines(original);
            Files.write(copied, lines);

            return true;
        } catch(Exception e) {
            return false;
        }
    }
}
