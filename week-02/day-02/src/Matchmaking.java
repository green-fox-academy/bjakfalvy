import java.util.ArrayList;
import java.util.Arrays;


public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList<String> makingMatches(ArrayList<String> g, ArrayList<String> b) {
        ArrayList<String> matchesList = new ArrayList<>();
        int size = 0;
        if (g.size() > b.size()) size = b.size();
        else size = g.size();
        for (int i = 0; i < size; i++) {
            matchesList.add(g.get(i));
            matchesList.add(b.get(i));
        }
        return matchesList;
    }
}