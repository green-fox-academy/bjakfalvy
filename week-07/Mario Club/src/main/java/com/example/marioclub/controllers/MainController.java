package com.example.marioclub.controllers;

import com.example.marioclub.services.Character;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private Character character;

    public MainController(Character character) {
        this.character = character;
    }

    @RequestMapping("/")
    public String mainPage(@RequestParam("name") String name, Model model) {
        Character.login(name);
        model.addAttribute("status", "This is " + Character.findMario(name).getName()
                + ". Currently living on "
                + Character.findMario(name).getFood()
                + " and " + Character.findMario(name).getDrink()
                + ". He knows " + Character.findMario(name).getTrickCounter() + " tricks.");
        model.addAttribute("tricks", Character.findMario(name).getTricks());
        return "index";
    }

    @GetMapping("/login")
    public String getName() {
        return "login";
    }

    @PostMapping("/")
    public String postLoginPage(String name) {
        return "redirect:/?name=" + name;
    }
}
