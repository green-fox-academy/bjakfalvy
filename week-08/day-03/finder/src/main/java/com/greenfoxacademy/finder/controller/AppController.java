package com.greenfoxacademy.finder.controller;

import com.greenfoxacademy.finder.model.User;
import com.greenfoxacademy.finder.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller
public class AppController {

    private UserService service;

    public AppController(UserService userService) {
        this.service = userService;
    }

    @GetMapping("/app")
    public String index(Model model) {
        model.addAttribute("new_user", new User());
        model.addAttribute("yolo", service.getAll());
        return "main";
    }

    @PostMapping("/app")
    public String create(User user) {
        service.save(user);
        return "redirect:/";
    }
}