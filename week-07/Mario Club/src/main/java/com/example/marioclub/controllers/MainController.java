package com.example.marioclub.controllers;

import com.example.marioclub.models.Mario;
import com.example.marioclub.services.Character;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ComponentScan
public class MainController {

    private Character character;

    public MainController(Character character) {
        this.character = character;
    }

    @RequestMapping("/")
    public String mainPage(@RequestParam("name") String name, Model model) {
        Character.login(name);
        Mario mario = Character.findMario(name);
        model.addAttribute("mario", mario);
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
