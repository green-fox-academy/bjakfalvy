package com.example.marioclub.models;

import java.util.ArrayList;
import java.util.List;

public class Drink {
    private List<String> drinkList = new ArrayList<>();

    public Drink(){
        this.drinkList.add("Water");
        this.drinkList.add("Coke");
        this.drinkList.add("Apple Juice");
        this.drinkList.add("Whiskey");
        this.drinkList.add("Tequilla");
    }

    public List<String> getDrinkList(){
        return drinkList;
    }
}
