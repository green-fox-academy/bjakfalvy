package com.example.marioclub.models;

import java.util.ArrayList;
import java.util.List;

public class Mario {
    private String name;
    private String food;
    private String drink;
    private int trickCounter;
    private List<String> tricks = new ArrayList<>();

    public Mario() {

    }

    public Mario(String name) {
        if (getName() == "Mr. Green") {
            this.name = name;
            this.food = "salad";
            this.drink = "water";
            this.trickCounter = tricks.size();
        } else {
            this.name = name;
            this.trickCounter = tricks.size();
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public int getTrickCounter() {
        return trickCounter;
    }

    public void setTrickCounter(int numberOfTricks) {
        this.trickCounter = numberOfTricks;
    }

    public List<String> getTricks() {
        if (tricks.isEmpty()) {
            List<String> empty = new ArrayList<>();
            empty.add("U dunno no any tricks. Shame on ya!");
            return empty;
        }
        return tricks;
    }
}
