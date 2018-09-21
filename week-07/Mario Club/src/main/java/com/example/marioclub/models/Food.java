package com.example.marioclub.models;

import java.util.ArrayList;
import java.util.List;

public class Food {
    private List<String> foodList = new ArrayList<>();

    public Food(){
        this.foodList.add("Hamburger");
        this.foodList.add("Spaghetti");
        this.foodList.add("Mushroom");
        this.foodList.add("Steak");
    }

    public List<String> getFoodList() {
        return foodList;
    }
}
