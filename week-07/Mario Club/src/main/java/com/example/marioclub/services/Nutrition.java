package com.example.marioclub.services;

import com.example.marioclub.models.Drink;
import com.example.marioclub.models.Food;
import org.springframework.stereotype.Service;

@Service
public class Nutrition {
    private static Food food = new Food();
    private static Drink drink = new Drink();

    public String findFood(String name){
        for (int i = 0; i < food.getFoodList().size(); i++) {
            if (food.getFoodList().get(i).equals(name)){
                return food.getFoodList().get(i);
            }
        }
        return null;
    }

    public String findDrink(String name){
        for (int i = 0; i < drink.getDrinkList().size(); i++) {
            if (drink.getDrinkList().get(i).equals(name)){
                return drink.getDrinkList().get(i);
            }
        }
        return null;
    }

    public static Food getFood(){
        return food;
    }

    public static Drink getDrink(){
        return drink;
    }
}
