package com.example.marioclub.controllers;

import com.example.marioclub.models.Drink;
import com.example.marioclub.models.Food;
import com.example.marioclub.models.Mario;
import com.example.marioclub.services.Character;
import com.example.marioclub.services.Nutrition;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NutritionController {
    private Nutrition nutrition;
    private Character character;

    public NutritionController(Nutrition nutrition, Character character) {
        this.nutrition = nutrition;
        this.character = character;
    }

    @GetMapping("/nutritionstore")
    public String nutritionPage(@RequestParam("name") String name, Model model){
        Mario mario = Character.findMario(name);
        model.addAttribute("mario", mario);
        model.addAttribute("foodlist", Nutrition.getFood().getFoodList());
        model.addAttribute("drinklist", Nutrition.getDrink().getDrinkList());
        return "nutritionStore";
    }

    @PostMapping("/nutritionstore")
    public String nutritionPage(String name, String drink, String food){
        Mario mario = Character.findMario(name);
        mario.setFood(food);
        mario.setDrink(drink);
        return "redirect:/?name=" + name;
    }
}
